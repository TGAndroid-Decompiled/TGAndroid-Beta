package org.telegram.ui.Components.Reactions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$Reaction;
import org.telegram.tgnet.TLRPC$TL_availableReaction;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_reactionCustomEmoji;
import org.telegram.tgnet.TLRPC$TL_reactionEmoji;
import org.telegram.tgnet.tl.TL_stories$TL_premium_boostsStatus;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity;
import org.telegram.ui.SelectAnimatedEmojiDialog;
public class ChatCustomReactionsEditActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private UpdateReactionsButton actionButton;
    private BackSpaceButtonView backSpaceButtonView;
    private TL_stories$TL_premium_boostsStatus boostsStatus;
    private FrameLayout bottomDialogLayout;
    private final long chatId;
    private LinearLayout contentLayout;
    private TLRPC$Chat currentChat;
    private CustomReactionEditText editText;
    private TextCheckCell enableReactionsCell;
    private final TLRPC$ChatFull info;
    private boolean isPaused;
    private ScrollView scrollView;
    private SelectAnimatedEmojiDialog selectAnimatedEmojiDialog;
    private int selectedCustomReactions;
    private LinearLayout switchLayout;
    private final HashMap<Long, AnimatedEmojiSpan> selectedEmojisMap = new LinkedHashMap();
    private final List<Long> selectedEmojisIds = new ArrayList();
    private final HashMap<Long, AnimatedEmojiSpan> initialSelectedEmojis = new LinkedHashMap();
    private final List<TLRPC$TL_availableReaction> allAvailableReactions = new ArrayList();
    private final int maxReactionsCount = getMessagesController().boostsChannelLevelMax;
    private boolean emojiKeyboardVisible = false;
    private int selectedType = -1;
    private final Runnable checkAfterFastDeleteRunnable = new Runnable() {
        @Override
        public final void run() {
            ChatCustomReactionsEditActivity.this.lambda$new$0();
        }
    };

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
    }

    public void lambda$new$0() {
        checkMaxCustomReactions(false);
    }

    public ChatCustomReactionsEditActivity(long j, TLRPC$ChatFull tLRPC$ChatFull) {
        this.chatId = j;
        this.info = tLRPC$ChatFull;
    }

    @Override
    public boolean onFragmentCreate() {
        TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
        this.currentChat = chat;
        if (chat == null) {
            TLRPC$Chat chatSync = MessagesStorage.getInstance(this.currentAccount).getChatSync(this.chatId);
            this.currentChat = chatSync;
            if (chatSync == null) {
                return false;
            }
            getMessagesController().putChat(this.currentChat, true);
        }
        if (this.info == null) {
            return false;
        }
        getMessagesController().getBoostsController().getBoostsStats(-this.chatId, new Consumer() {
            @Override
            public final void accept(Object obj) {
                ChatCustomReactionsEditActivity.this.lambda$onFragmentCreate$1((TL_stories$TL_premium_boostsStatus) obj);
            }
        });
        getNotificationCenter().addObserver(this, NotificationCenter.reactionsDidLoad);
        this.allAvailableReactions.addAll(getMediaDataController().getEnabledReactionsList());
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, Integer.valueOf((int) LiteMode.FLAG_CALLS_ANIMATIONS));
        return super.onFragmentCreate();
    }

    public void lambda$onFragmentCreate$1(TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus) {
        this.boostsStatus = tL_stories$TL_premium_boostsStatus;
        if (!this.selectedEmojisMap.keySet().equals(this.initialSelectedEmojis.keySet())) {
            checkMaxCustomReactions(false);
        }
    }

    @Override
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public android.view.View createView(android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity.createView(android.content.Context):android.view.View");
    }

    public void lambda$createView$2(View view) {
        setCheckedEnableReactionCell(this.enableReactionsCell.isChecked() ? 2 : 1, true);
    }

    public void lambda$createView$3() {
        presentFragment(ChatActivity.of(429000L));
    }

    public void lambda$createView$6(View view) {
        if (this.actionButton.isLoading()) {
            return;
        }
        TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus = this.boostsStatus;
        if (tL_stories$TL_premium_boostsStatus != null) {
            int i = tL_stories$TL_premium_boostsStatus.level;
            int i2 = this.selectedCustomReactions;
            if (i < i2) {
                ReactionsUtils.showLimitReachedDialogForReactions(-this.chatId, i2, tL_stories$TL_premium_boostsStatus);
                return;
            }
        }
        this.actionButton.setLoading(true);
        getMessagesController().setCustomChatReactions(this.chatId, this.selectedType, grabReactions(false), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ChatCustomReactionsEditActivity.this.lambda$createView$5((TLRPC$TL_error) obj);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                ChatCustomReactionsEditActivity.this.finishFragment();
            }
        });
    }

    public void lambda$createView$5(final TLRPC$TL_error tLRPC$TL_error) {
        if (isFinishing()) {
            return;
        }
        this.actionButton.setLoading(false);
        if (tLRPC$TL_error.text.equals("CHAT_NOT_MODIFIED")) {
            finishFragment();
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatCustomReactionsEditActivity.this.lambda$createView$4(tLRPC$TL_error);
                }
            }, this.boostsStatus == null ? 200L : 0L);
        }
    }

    public void lambda$createView$4(TLRPC$TL_error tLRPC$TL_error) {
        if (this.boostsStatus != null && tLRPC$TL_error.text.equals("BOOSTS_REQUIRED")) {
            ReactionsUtils.showLimitReachedDialogForReactions(-this.chatId, this.selectedCustomReactions, this.boostsStatus);
            return;
        }
        String str = tLRPC$TL_error.text;
        if (str.equals("REACTIONS_TOO_MANY")) {
            str = LocaleController.formatPluralString("ReactionMaxCountError", this.maxReactionsCount, new Object[0]);
        }
        BulletinFactory.of(this).createErrorBulletin(str).show();
    }

    private void initSelectAnimatedEmojiDialog() {
        if (this.selectAnimatedEmojiDialog != null) {
            return;
        }
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(this, getContext(), false, null, 6, false, getResourceProvider(), 16, Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, getResourceProvider()));
        this.selectAnimatedEmojiDialog = anonymousClass4;
        anonymousClass4.setAnimationsEnabled(false);
        this.selectAnimatedEmojiDialog.setClipChildren(false);
        this.selectAnimatedEmojiDialog.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        this.bottomDialogLayout.addView(this.selectAnimatedEmojiDialog, LayoutHelper.createFrame(-1, -2, 80));
        BackSpaceButtonView backSpaceButtonView = new BackSpaceButtonView(getContext(), getResourceProvider());
        this.backSpaceButtonView = backSpaceButtonView;
        backSpaceButtonView.setOnBackspace(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ChatCustomReactionsEditActivity.this.lambda$initSelectAnimatedEmojiDialog$8((Boolean) obj);
            }
        });
        this.bottomDialogLayout.addView(this.backSpaceButtonView, LayoutHelper.createFrame(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        for (Long l : this.selectedEmojisIds) {
            this.selectAnimatedEmojiDialog.setMultiSelected(l, false);
        }
    }

    public class AnonymousClass4 extends SelectAnimatedEmojiDialog {
        private boolean firstLayout;

        AnonymousClass4(BaseFragment baseFragment, Context context, boolean z, Integer num, int i, boolean z2, Theme.ResourcesProvider resourcesProvider, int i2, int i3) {
            super(baseFragment, context, z, num, i, z2, resourcesProvider, i2, i3);
            this.firstLayout = true;
            setDrawBackground(false);
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.firstLayout) {
                this.firstLayout = false;
                ChatCustomReactionsEditActivity.this.selectAnimatedEmojiDialog.onShow(null);
            }
        }

        @Override
        protected void onEmojiSelected(View view, Long l, TLRPC$Document tLRPC$Document, Integer num) {
            if (ChatCustomReactionsEditActivity.this.selectedEmojisMap.containsKey(l)) {
                ChatCustomReactionsEditActivity.this.selectedEmojisIds.remove(l);
                final AnimatedEmojiSpan animatedEmojiSpan = (AnimatedEmojiSpan) ChatCustomReactionsEditActivity.this.selectedEmojisMap.remove(l);
                animatedEmojiSpan.setRemoved(new Runnable() {
                    @Override
                    public final void run() {
                        ChatCustomReactionsEditActivity.AnonymousClass4.this.lambda$onEmojiSelected$0(animatedEmojiSpan);
                    }
                });
                ChatCustomReactionsEditActivity.this.animateChangesInNextRows(animatedEmojiSpan);
                ChatCustomReactionsEditActivity.this.selectAnimatedEmojiDialog.setMultiSelected(l, true);
                ChatCustomReactionsEditActivity.this.checkMaxCustomReactions(false);
            } else if (ChatCustomReactionsEditActivity.this.selectedEmojisMap.size() >= ChatCustomReactionsEditActivity.this.maxReactionsCount) {
                BulletinFactory.of(ChatCustomReactionsEditActivity.this).createErrorBulletin(LocaleController.formatPluralString("ReactionMaxCountError", ChatCustomReactionsEditActivity.this.maxReactionsCount, new Object[0])).show();
            } else {
                try {
                    int editTextSelectionEnd = ChatCustomReactionsEditActivity.this.editText.getEditTextSelectionEnd();
                    SpannableString spannableString = new SpannableString("b");
                    AnimatedEmojiSpan createAnimatedEmojiSpan = ReactionsUtils.createAnimatedEmojiSpan(tLRPC$Document, l, ChatCustomReactionsEditActivity.this.editText.getFontMetricsInt());
                    createAnimatedEmojiSpan.cacheType = AnimatedEmojiDrawable.getCacheTypeForEnterView();
                    createAnimatedEmojiSpan.setAdded();
                    ChatCustomReactionsEditActivity.this.selectedEmojisIds.add(editTextSelectionEnd, l);
                    ChatCustomReactionsEditActivity.this.selectedEmojisMap.put(l, createAnimatedEmojiSpan);
                    spannableString.setSpan(createAnimatedEmojiSpan, 0, spannableString.length(), 33);
                    ChatCustomReactionsEditActivity.this.editText.getText().insert(editTextSelectionEnd, spannableString);
                    ChatCustomReactionsEditActivity.this.editText.setSelection(editTextSelectionEnd + spannableString.length());
                    ChatCustomReactionsEditActivity.this.selectAnimatedEmojiDialog.setMultiSelected(l, true);
                    ChatCustomReactionsEditActivity.this.checkMaxCustomReactions(true);
                    ChatCustomReactionsEditActivity.this.animateChangesInNextRows(createAnimatedEmojiSpan);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }

        public void lambda$onEmojiSelected$0(AnimatedEmojiSpan animatedEmojiSpan) {
            AnimatedEmojiSpan[] animatedEmojiSpanArr;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ChatCustomReactionsEditActivity.this.editText.getText());
            for (AnimatedEmojiSpan animatedEmojiSpan2 : (AnimatedEmojiSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), AnimatedEmojiSpan.class)) {
                if (animatedEmojiSpan2 == animatedEmojiSpan) {
                    int editTextSelectionEnd = ChatCustomReactionsEditActivity.this.editText.getEditTextSelectionEnd();
                    int spanEnd = spannableStringBuilder.getSpanEnd(animatedEmojiSpan2);
                    int spanStart = spannableStringBuilder.getSpanStart(animatedEmojiSpan2);
                    ChatCustomReactionsEditActivity.this.editText.getText().delete(spanStart, spanEnd);
                    int i = spanEnd - spanStart;
                    CustomReactionEditText customReactionEditText = ChatCustomReactionsEditActivity.this.editText;
                    if (spanEnd <= editTextSelectionEnd) {
                        editTextSelectionEnd -= i;
                    }
                    customReactionEditText.setSelection(editTextSelectionEnd);
                    return;
                }
            }
        }
    }

    public void lambda$initSelectAnimatedEmojiDialog$8(Boolean bool) {
        AnimatedEmojiSpan[] animatedEmojiSpanArr;
        if (deleteSelectedEmojis()) {
            return;
        }
        final int editTextSelectionEnd = this.editText.getEditTextSelectionEnd();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.editText.getText());
        for (final AnimatedEmojiSpan animatedEmojiSpan : (AnimatedEmojiSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), AnimatedEmojiSpan.class)) {
            if (spannableStringBuilder.getSpanEnd(animatedEmojiSpan) == editTextSelectionEnd) {
                this.selectedEmojisMap.remove(Long.valueOf(animatedEmojiSpan.documentId));
                this.selectedEmojisIds.remove(Long.valueOf(animatedEmojiSpan.documentId));
                this.selectAnimatedEmojiDialog.unselect(Long.valueOf(animatedEmojiSpan.documentId));
                if (bool.booleanValue()) {
                    this.editText.dispatchKeyEvent(new KeyEvent(0, 67));
                    AndroidUtilities.cancelRunOnUIThread(this.checkAfterFastDeleteRunnable);
                    AndroidUtilities.runOnUIThread(this.checkAfterFastDeleteRunnable, 350L);
                    return;
                }
                animatedEmojiSpan.setRemoved(new Runnable() {
                    @Override
                    public final void run() {
                        ChatCustomReactionsEditActivity.this.lambda$initSelectAnimatedEmojiDialog$7(animatedEmojiSpan, editTextSelectionEnd);
                    }
                });
                animateChangesInNextRows(animatedEmojiSpan);
                checkMaxCustomReactions(false);
                return;
            }
        }
    }

    public void lambda$initSelectAnimatedEmojiDialog$7(AnimatedEmojiSpan animatedEmojiSpan, int i) {
        Editable text = this.editText.getText();
        int spanStart = text.getSpanStart(animatedEmojiSpan);
        int spanEnd = text.getSpanEnd(animatedEmojiSpan);
        int i2 = spanEnd - spanStart;
        if (spanStart == -1 || spanEnd == -1) {
            return;
        }
        this.editText.getText().delete(spanStart, spanEnd);
        CustomReactionEditText customReactionEditText = this.editText;
        customReactionEditText.setSelection(Math.min(i - i2, customReactionEditText.getText().length()));
    }

    public void animateChangesInNextRows(AnimatedEmojiSpan animatedEmojiSpan) {
        Editable text = this.editText.getText();
        Layout layout = this.editText.getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(animatedEmojiSpan)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), AnimatedEmojiSpan.class);
            for (AnimatedEmojiSpan animatedEmojiSpan2 : animatedEmojiSpanArr) {
                animatedEmojiSpan2.setAnimateChanges();
            }
        }
    }

    public boolean deleteSelectedEmojis() {
        int editTextSelectionEnd = this.editText.getEditTextSelectionEnd();
        int editTextSelectionStart = this.editText.getEditTextSelectionStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.editText.getText());
        if (this.editText.hasSelection()) {
            AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, AnimatedEmojiSpan.class);
            for (AnimatedEmojiSpan animatedEmojiSpan : animatedEmojiSpanArr) {
                this.selectedEmojisMap.remove(Long.valueOf(animatedEmojiSpan.documentId));
                this.selectedEmojisIds.remove(Long.valueOf(animatedEmojiSpan.documentId));
                this.selectAnimatedEmojiDialog.unselect(Long.valueOf(animatedEmojiSpan.documentId));
            }
            this.editText.dispatchKeyEvent(new KeyEvent(0, 67));
            checkMaxCustomReactions(false);
            return true;
        }
        return false;
    }

    @Override
    public boolean canBeginSlide() {
        if (checkChangesBeforeExit()) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (z && this.selectedType != 2) {
            this.editText.setFocusableInTouchMode(true);
        }
        if (!z || z2) {
            return;
        }
        initSelectAnimatedEmojiDialog();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatCustomReactionsEditActivity.lambda$onTransitionAnimationEnd$9();
            }
        }, 200L);
    }

    public static void lambda$onTransitionAnimationEnd$9() {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, Integer.valueOf((int) LiteMode.FLAG_CALLS_ANIMATIONS));
    }

    private void setCheckedEnableReactionCell(int i, boolean z) {
        if (this.selectedType == i) {
            return;
        }
        boolean z2 = i == 1 || i == 0;
        this.enableReactionsCell.setChecked(z2);
        int color = Theme.getColor(z2 ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked);
        if (!z) {
            this.enableReactionsCell.setBackgroundColor(color);
        } else if (z2) {
            this.enableReactionsCell.setBackgroundColorAnimated(true, color);
        } else {
            this.enableReactionsCell.setBackgroundColorAnimatedReverse(color);
        }
        this.selectedType = i;
        if (i != 1 && i != 0) {
            if (z) {
                closeKeyboard();
                this.actionButton.animate().setListener(null).cancel();
                this.switchLayout.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.actionButton.animate().alpha(0.0f).setDuration(350L);
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
                duration.setInterpolator(cubicBezierInterpolator).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        ChatCustomReactionsEditActivity.this.actionButton.setVisibility(4);
                    }
                }).start();
                this.switchLayout.animate().alpha(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        ChatCustomReactionsEditActivity.this.editText.setFocusableInTouchMode(false);
                        ChatCustomReactionsEditActivity.this.switchLayout.setVisibility(4);
                    }
                }).start();
                return;
            }
            this.switchLayout.setVisibility(4);
            this.actionButton.setVisibility(4);
            return;
        }
        this.switchLayout.setVisibility(0);
        this.actionButton.setVisibility(0);
        if (z) {
            this.actionButton.animate().setListener(null).cancel();
            this.switchLayout.animate().setListener(null).cancel();
            ViewPropertyAnimator duration2 = this.switchLayout.animate().alpha(1.0f).setDuration(350L);
            CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.DEFAULT;
            duration2.setInterpolator(cubicBezierInterpolator2).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    ChatCustomReactionsEditActivity.this.editText.setFocusableInTouchMode(true);
                }
            }).start();
            this.actionButton.animate().alpha(1.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator2).start();
            if (this.selectedEmojisMap.isEmpty()) {
                this.selectAnimatedEmojiDialog.clearSelectedDocuments();
                this.editText.setText("");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i2 = 0;
                for (TLRPC$TL_availableReaction tLRPC$TL_availableReaction : this.allAvailableReactions) {
                    ReactionsUtils.addReactionToEditText(tLRPC$TL_availableReaction, this.selectedEmojisMap, this.selectedEmojisIds, spannableStringBuilder, this.selectAnimatedEmojiDialog, this.editText.getFontMetricsInt());
                    i2++;
                    if (i2 >= this.maxReactionsCount) {
                        break;
                    }
                }
                this.editText.append(spannableStringBuilder);
                this.editText.addReactionsSpan();
                this.selectAnimatedEmojiDialog.notifyDataSetChanged();
                checkMaxCustomReactions(false);
            }
        }
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        AndroidUtilities.cancelRunOnUIThread(this.checkAfterFastDeleteRunnable);
        if (this.selectedType == 2) {
            getMessagesController().setCustomChatReactions(this.chatId, this.selectedType, new ArrayList(), null, null);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (this.isPaused) {
            this.isPaused = false;
            this.editText.setFocusable(true);
            this.editText.setFocusableInTouchMode(true);
            if (this.emojiKeyboardVisible) {
                this.editText.removeReactionsSpan(false);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ChatCustomReactionsEditActivity.this.lambda$onResume$10();
                    }
                }, 250L);
            }
        }
    }

    public void lambda$onResume$10() {
        this.editText.requestFocus();
    }

    @Override
    public void onPause() {
        this.isPaused = true;
        this.editText.setFocusable(false);
        super.onPause();
    }

    @Override
    public boolean onBackPressed() {
        if (closeKeyboard() || checkChangesBeforeExit()) {
            return false;
        }
        return super.onBackPressed();
    }

    public boolean checkChangesBeforeExit() {
        boolean z = !this.selectedEmojisMap.keySet().equals(this.initialSelectedEmojis.keySet());
        TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus = this.boostsStatus;
        if (tL_stories$TL_premium_boostsStatus != null && tL_stories$TL_premium_boostsStatus.level < this.selectedCustomReactions) {
            z = false;
        }
        boolean z2 = this.selectedType != 2 ? z : false;
        if (z2) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), getResourceProvider());
            builder.setTitle(LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges));
            builder.setMessage(LocaleController.getString("ReactionApplyChangesDialog", R.string.ReactionApplyChangesDialog));
            builder.setPositiveButton(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ChatCustomReactionsEditActivity.this.lambda$checkChangesBeforeExit$11(dialogInterface, i);
                }
            });
            builder.setNegativeButton(LocaleController.getString("Discard", R.string.Discard), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ChatCustomReactionsEditActivity.this.lambda$checkChangesBeforeExit$12(dialogInterface, i);
                }
            });
            builder.show();
        }
        return z2;
    }

    public void lambda$checkChangesBeforeExit$11(DialogInterface dialogInterface, int i) {
        this.actionButton.performClick();
    }

    public void lambda$checkChangesBeforeExit$12(DialogInterface dialogInterface, int i) {
        finishFragment();
    }

    public void checkMaxCustomReactions(boolean z) {
        if (this.boostsStatus == null) {
            return;
        }
        if (this.selectedType == 0) {
            this.selectedType = 1;
        }
        int size = grabReactions(true).size();
        this.selectedCustomReactions = size;
        if (this.boostsStatus.level < size) {
            if (z) {
                BulletinFactory.of(this).createSimpleBulletin(R.raw.chats_infotip, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ReactionReachLvlForReactionShort", size, Integer.valueOf(size)))).show();
            }
            this.actionButton.setLvlRequiredState(this.selectedCustomReactions);
            return;
        }
        this.actionButton.removeLvlRequiredState();
    }

    private List<TLRPC$Reaction> grabReactions(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Long l : this.selectedEmojisIds) {
            boolean z2 = false;
            Iterator<TLRPC$TL_availableReaction> it = this.allAvailableReactions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                TLRPC$TL_availableReaction next = it.next();
                if (l.longValue() == next.activate_animation.id) {
                    TLRPC$TL_reactionEmoji tLRPC$TL_reactionEmoji = new TLRPC$TL_reactionEmoji();
                    tLRPC$TL_reactionEmoji.emoticon = next.reaction;
                    arrayList.add(tLRPC$TL_reactionEmoji);
                    z2 = true;
                    break;
                }
            }
            if (!z2) {
                TLRPC$TL_reactionCustomEmoji tLRPC$TL_reactionCustomEmoji = new TLRPC$TL_reactionCustomEmoji();
                tLRPC$TL_reactionCustomEmoji.document_id = l.longValue();
                arrayList.add(tLRPC$TL_reactionCustomEmoji);
                arrayList2.add(tLRPC$TL_reactionCustomEmoji);
            }
        }
        return z ? arrayList2 : arrayList;
    }

    public void showKeyboard() {
        if (this.emojiKeyboardVisible) {
            return;
        }
        this.emojiKeyboardVisible = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, Integer.valueOf((int) LiteMode.FLAG_CALLS_ANIMATIONS));
        updateScrollViewMarginBottom(this.bottomDialogLayout.getMeasuredHeight());
        this.bottomDialogLayout.setVisibility(0);
        FrameLayout frameLayout = this.bottomDialogLayout;
        frameLayout.setTranslationY(frameLayout.getMeasuredHeight());
        this.bottomDialogLayout.animate().setListener(null).cancel();
        this.bottomDialogLayout.animate().translationY(0.0f).withLayer().setDuration(350L).setInterpolator(CubicBezierInterpolator.DEFAULT).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ChatCustomReactionsEditActivity.this.lambda$showKeyboard$13(valueAnimator);
            }
        }).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, Integer.valueOf((int) LiteMode.FLAG_CALLS_ANIMATIONS));
                ChatCustomReactionsEditActivity.this.scrollView.fullScroll(130);
            }
        }).start();
    }

    public void lambda$showKeyboard$13(ValueAnimator valueAnimator) {
        this.actionButton.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * this.bottomDialogLayout.getMeasuredHeight());
    }

    private boolean closeKeyboard() {
        if (this.emojiKeyboardVisible) {
            this.emojiKeyboardVisible = false;
            this.editText.clearFocus();
            updateScrollViewMarginBottom(0);
            this.bottomDialogLayout.animate().setListener(null).cancel();
            this.bottomDialogLayout.animate().translationY(this.bottomDialogLayout.getMeasuredHeight()).setDuration(350L).withLayer().setInterpolator(CubicBezierInterpolator.DEFAULT).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ChatCustomReactionsEditActivity.this.lambda$closeKeyboard$14(valueAnimator);
                }
            }).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    ChatCustomReactionsEditActivity.this.bottomDialogLayout.setVisibility(4);
                }
            }).start();
            return true;
        }
        return false;
    }

    public void lambda$closeKeyboard$14(ValueAnimator valueAnimator) {
        this.actionButton.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * this.bottomDialogLayout.getMeasuredHeight());
    }

    public void updateScrollViewMarginBottom(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.scrollView.getLayoutParams();
        marginLayoutParams.bottomMargin = i;
        this.scrollView.setLayoutParams(marginLayoutParams);
    }
}