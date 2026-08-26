package org.telegram.ui.Components.Reactions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.math.MathUtils;
import com.google.firebase.messaging.FirebaseMessaging$AutoInit$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatLoadingCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.SlideIntChooseView;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SectionsScrollView;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda2;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda26;
import org.telegram.ui.SelectAnimatedEmojiDialog;
import org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda27;
import org.telegram.ui.TON.TONIntroActivity;
import org.telegram.ui.web.HistoryFragment;

public final class ChatCustomReactionsEditActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public UpdateReactionsButton actionButton;
    public FrameLayout actionButtonContainer;
    public ImageView actionButtonContainerGradient;
    public final ArrayList allAvailableReactions;
    public BackSpaceButtonView backSpaceButtonView;
    public TL_stories.TL_premium_boostsStatus boostsStatus;
    public TONIntroActivity.AnonymousClass2 bottomDialogLayout;
    public final long chatId;
    public final ChatCustomReactionsEditActivity$$ExternalSyntheticLambda3 checkAfterFastDeleteRunnable;
    public SectionsScrollView.SectionsLinearLayout contentLayout;
    public TLRPC.Chat currentChat;
    public int currentReactionsCount;
    public AnonymousClass3 editText;
    public boolean emojiKeyboardVisible;
    public TextCheckCell enableReactionsCell;
    public final TLRPC.ChatFull info;
    public boolean initialPaid;
    public final LinkedHashMap initialSelectedEmojis;
    public boolean isPaused;
    public final int maxReactionsCount;
    public boolean paid;
    public TextCheckCell paidCheckCell;
    public int reactionsCount;
    public SectionsScrollView scrollView;
    public AnonymousClass5 selectAnimatedEmojiDialog;
    public int selectedCustomReactions;
    public final ArrayList selectedEmojisIds;
    public final LinkedHashMap selectedEmojisMap;
    public int selectedType;
    public SlideIntChooseView slideView;
    public LinearLayout switchLayout;

    public final class AnonymousClass5 extends SelectAnimatedEmojiDialog {
        public boolean firstLayout;

        public AnonymousClass5(ChatCustomReactionsEditActivity chatCustomReactionsEditActivity, Context context, Theme.ResourcesProvider resourcesProvider, int i) {
            super(chatCustomReactionsEditActivity, context, false, null, 6, false, resourcesProvider, 16, i);
            this.firstLayout = true;
            setDrawBackground(false);
        }

        @Override
        public final void onEmojiSelected(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
            ChatCustomReactionsEditActivity chatCustomReactionsEditActivity = ChatCustomReactionsEditActivity.this;
            LinkedHashMap linkedHashMap = chatCustomReactionsEditActivity.selectedEmojisMap;
            boolean zContainsKey = linkedHashMap.containsKey(l);
            ArrayList arrayList = chatCustomReactionsEditActivity.selectedEmojisIds;
            if (zContainsKey) {
                arrayList.remove(l);
                AnimatedEmojiSpan animatedEmojiSpan = (AnimatedEmojiSpan) linkedHashMap.remove(l);
                animatedEmojiSpan.setRemoved(new GiftSheet$$ExternalSyntheticLambda26(12, this, animatedEmojiSpan));
                chatCustomReactionsEditActivity.animateChangesInNextRows(animatedEmojiSpan);
                chatCustomReactionsEditActivity.selectAnimatedEmojiDialog.setMultiSelected(l, true);
                chatCustomReactionsEditActivity.checkMaxCustomReactions(false);
                return;
            }
            int size = linkedHashMap.size() - (linkedHashMap.containsKey(-1L) ? 1 : 0);
            int i = chatCustomReactionsEditActivity.maxReactionsCount;
            if (size >= i) {
                BulletinFactory.of(chatCustomReactionsEditActivity).createErrorBulletin(LocaleController.formatPluralString("ReactionMaxCountError", i, new Object[0])).show();
                return;
            }
            try {
                int editTextSelectionEnd = chatCustomReactionsEditActivity.editText.getEditTextSelectionEnd();
                SpannableString spannableString = new SpannableString("b");
                Paint.FontMetricsInt fontMetricsInt = chatCustomReactionsEditActivity.editText.getFontMetricsInt();
                AnimatedEmojiSpan animatedEmojiSpan2 = document != null ? new AnimatedEmojiSpan(document, 1.0f, fontMetricsInt) : new AnimatedEmojiSpan(l.longValue(), 1.0f, fontMetricsInt);
                animatedEmojiSpan2.cacheType = AnimatedEmojiDrawable.getCacheTypeForEnterView();
                animatedEmojiSpan2.cacheType = AnimatedEmojiDrawable.getCacheTypeForEnterView();
                animatedEmojiSpan2.setAdded();
                arrayList.add(MathUtils.clamp(editTextSelectionEnd, 0, arrayList.size()), l);
                linkedHashMap.put(l, animatedEmojiSpan2);
                spannableString.setSpan(animatedEmojiSpan2, 0, spannableString.length(), 33);
                chatCustomReactionsEditActivity.editText.getText().insert(editTextSelectionEnd, spannableString);
                chatCustomReactionsEditActivity.editText.setSelection(editTextSelectionEnd + spannableString.length());
                chatCustomReactionsEditActivity.selectAnimatedEmojiDialog.setMultiSelected(l, true);
                chatCustomReactionsEditActivity.checkMaxCustomReactions(true);
                chatCustomReactionsEditActivity.animateChangesInNextRows(animatedEmojiSpan2);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.firstLayout) {
                this.firstLayout = false;
                ChatCustomReactionsEditActivity.this.selectAnimatedEmojiDialog.onShow(null);
            }
        }
    }

    public final class AnonymousClass6 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final ChatCustomReactionsEditActivity this$0;

        public AnonymousClass6(ChatCustomReactionsEditActivity chatCustomReactionsEditActivity, int i) {
            this.$r8$classId = i;
            this.this$0 = chatCustomReactionsEditActivity;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            ChatCustomReactionsEditActivity chatCustomReactionsEditActivity = this.this$0;
            switch (this.$r8$classId) {
                case 0:
                    chatCustomReactionsEditActivity.editText.setFocusableInTouchMode(true);
                    break;
                case 1:
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    chatCustomReactionsEditActivity.bottomDialogLayout.setVisibility(4);
                    if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                        chatCustomReactionsEditActivity.switchLayout.setFocusableInTouchMode(false);
                        break;
                    }
                    break;
                case 2:
                    chatCustomReactionsEditActivity.actionButtonContainer.setVisibility(4);
                    break;
                default:
                    chatCustomReactionsEditActivity.editText.setFocusableInTouchMode(false);
                    chatCustomReactionsEditActivity.switchLayout.setVisibility(4);
                    break;
            }
        }
    }

    public final class AnonymousClass9 extends AnimatorListenerAdapter {
        @Override
        public final void onAnimationEnd(Animator animator) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
        }
    }

    public ChatCustomReactionsEditActivity(long j, TLRPC.ChatFull chatFull) {
        super(null);
        this.selectedEmojisMap = new LinkedHashMap();
        this.selectedEmojisIds = new ArrayList();
        this.initialSelectedEmojis = new LinkedHashMap();
        this.allAvailableReactions = new ArrayList();
        this.maxReactionsCount = getMessagesController().boostsChannelLevelMax;
        this.emojiKeyboardVisible = false;
        this.selectedType = -1;
        this.checkAfterFastDeleteRunnable = new ChatCustomReactionsEditActivity$$ExternalSyntheticLambda3(this, 5);
        this.chatId = j;
        this.info = chatFull;
    }

    public final void animateChangesInNextRows(AnimatedEmojiSpan animatedEmojiSpan) {
        Editable text = getText();
        Layout layout = getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(animatedEmojiSpan)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), AnimatedEmojiSpan.class);
            for (AnimatedEmojiSpan animatedEmojiSpan2 : animatedEmojiSpanArr) {
                animatedEmojiSpan2.setAnimateChanges();
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        if (checkChangesBeforeExit(true)) {
            return false;
        }
        return super.canBeginSlide();
    }

    public final boolean checkChangesBeforeExit(boolean z) {
        boolean z2 = !this.selectedEmojisMap.keySet().equals(this.initialSelectedEmojis.keySet());
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.boostsStatus;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < this.selectedCustomReactions) {
            z2 = false;
        }
        boolean z3 = this.initialPaid == this.paid ? z2 : true;
        if (z && z3) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, getResourceProvider());
            builder.setTitle(LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges));
            builder.setMessage(LocaleController.getString("ReactionApplyChangesDialog", R.string.ReactionApplyChangesDialog));
            final int i = 0;
            builder.setPositiveButton(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new AlertDialog.OnButtonClickListener(this) {
                public final ChatCustomReactionsEditActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    switch (i) {
                        case 0:
                            this.f$0.actionButton.performClick();
                            break;
                        default:
                            this.f$0.lambda$checkChangesBeforeExit$15(alertDialog, i2);
                            break;
                    }
                }
            });
            final int i2 = 1;
            builder.setNegativeButton(LocaleController.getString(R.string.Discard), new AlertDialog.OnButtonClickListener(this) {
                public final ChatCustomReactionsEditActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog, int i3) {
                    switch (i2) {
                        case 0:
                            this.f$0.actionButton.performClick();
                            break;
                        default:
                            this.f$0.lambda$checkChangesBeforeExit$15(alertDialog, i3);
                            break;
                    }
                }
            });
            builder.show();
        }
        return z3;
    }

    public final void checkMaxCustomReactions(boolean z) {
        if (this.boostsStatus == null) {
            return;
        }
        if (this.selectedType == 0) {
            this.selectedType = 1;
        }
        int size = grabReactions(true).size();
        this.selectedCustomReactions = size;
        if (this.boostsStatus.level >= size) {
            this.actionButton.setSubText(null, true);
            return;
        }
        if (z) {
            BulletinFactory.of(this).createSimpleBulletin(R.raw.chats_infotip, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ReactionReachLvlForReactionShort", size, Integer.valueOf(size)))).show();
        }
        this.actionButton.setLvlRequiredState(this.selectedCustomReactions);
    }

    public final void closeKeyboard$1() {
        int i = 1;
        if (this.emojiKeyboardVisible) {
            this.emojiKeyboardVisible = false;
            if (!Build.MODEL.toLowerCase().startsWith("zte") || Build.VERSION.SDK_INT > 28) {
                clearFocus();
            } else {
                this.switchLayout.setFocusableInTouchMode(true);
                this.switchLayout.requestFocus();
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.scrollView.getLayoutParams();
            marginLayoutParams.bottomMargin = 0;
            this.scrollView.setLayoutParams(marginLayoutParams);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.bottomDialogLayout.animate().setListener(null).cancel();
            this.bottomDialogLayout.animate().translationY(this.bottomDialogLayout.getMeasuredHeight()).setDuration(350L).withLayer().setInterpolator(CubicBezierInterpolator.DEFAULT).setUpdateListener(new ChatCustomReactionsEditActivity$$ExternalSyntheticLambda1(this, 0)).setListener(new AnonymousClass6(this, i)).start();
        }
    }

    @Override
    public final View createView(Context context) {
        LinkedHashMap linkedHashMap;
        SpannableStringBuilder spannableStringBuilder;
        int i;
        SpannableStringBuilder spannableStringBuilder2;
        ArrayList arrayList;
        boolean z;
        LinkedHashMap linkedHashMap2;
        SpannableStringBuilder spannableStringBuilder3;
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new HistoryFragment.AnonymousClass1(this, 10));
        this.contentLayout = new SectionsScrollView.SectionsLinearLayout(context);
        SectionsScrollView sectionsScrollView = new SectionsScrollView(context, this.contentLayout, this.resourceProvider);
        this.scrollView = sectionsScrollView;
        sectionsScrollView.setFillViewport(true);
        this.actionBar.setAdaptiveBackground(this.scrollView);
        ChatLoadingCell.AnonymousClass1 anonymousClass1 = new ChatLoadingCell.AnonymousClass1(this, context);
        this.contentLayout.setOrientation(1);
        this.scrollView.addView(this.contentLayout);
        TextCheckCell textCheckCell = new TextCheckCell(context);
        this.enableReactionsCell = textCheckCell;
        textCheckCell.setHeight(56);
        TextCheckCell textCheckCell2 = this.enableReactionsCell;
        textCheckCell2.setBackgroundColor(Theme.getColor(null, textCheckCell2.isChecked() ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked, false));
        this.enableReactionsCell.setTypeface(AndroidUtilities.bold());
        this.enableReactionsCell.setColors(Theme.key_windowBackgroundCheckText, Theme.key_switchTrackBlue, Theme.key_switchTrackBlueChecked, Theme.key_switchTrackBlueThumb, Theme.key_switchTrackBlueThumbChecked);
        final int i2 = 0;
        this.enableReactionsCell.setOnClickListener(new View.OnClickListener(this) {
            public final ChatCustomReactionsEditActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                TextCheckCell textCheckCell3;
                switch (i2) {
                    case 0:
                        ChatCustomReactionsEditActivity chatCustomReactionsEditActivity = this.f$0;
                        if (chatCustomReactionsEditActivity.enableReactionsCell.isChecked() && (textCheckCell3 = chatCustomReactionsEditActivity.paidCheckCell) != null && textCheckCell3.isChecked()) {
                            chatCustomReactionsEditActivity.toggleStarsEnabled();
                        }
                        chatCustomReactionsEditActivity.setCheckedEnableReactionCell(chatCustomReactionsEditActivity.enableReactionsCell.isChecked() ? 2 : 1, chatCustomReactionsEditActivity.enableReactionsCell.isChecked() ? false : chatCustomReactionsEditActivity.paid, true);
                        break;
                    case 1:
                        this.f$0.toggleStarsEnabled();
                        break;
                    default:
                        ChatCustomReactionsEditActivity chatCustomReactionsEditActivity2 = this.f$0;
                        if (!chatCustomReactionsEditActivity2.actionButton.isLoading()) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = chatCustomReactionsEditActivity2.boostsStatus;
                            if (tL_premium_boostsStatus != null) {
                                int i3 = tL_premium_boostsStatus.level;
                                int i4 = chatCustomReactionsEditActivity2.selectedCustomReactions;
                                if (i3 < i4) {
                                    ReactionsUtils.showLimitReachedDialogForReactions(-chatCustomReactionsEditActivity2.chatId, i4, tL_premium_boostsStatus);
                                }
                            }
                            TextCheckCell textCheckCell4 = chatCustomReactionsEditActivity2.paidCheckCell;
                            Boolean boolValueOf = (textCheckCell4 == null || !chatCustomReactionsEditActivity2.info.paid_media_allowed) ? null : Boolean.valueOf(textCheckCell4.isChecked());
                            chatCustomReactionsEditActivity2.actionButton.setLoading(true);
                            MessagesController messagesController = chatCustomReactionsEditActivity2.getMessagesController();
                            int i5 = chatCustomReactionsEditActivity2.selectedType;
                            ArrayList arrayListGrabReactions = chatCustomReactionsEditActivity2.grabReactions(false);
                            int i6 = chatCustomReactionsEditActivity2.reactionsCount;
                            chatCustomReactionsEditActivity2.currentReactionsCount = i6;
                            int i7 = 2;
                            messagesController.setCustomChatReactions(chatCustomReactionsEditActivity2.chatId, i5, arrayListGrabReactions, i6, boolValueOf, new ChatCustomReactionsEditActivity$$ExternalSyntheticLambda5(chatCustomReactionsEditActivity2, i7), new ChatCustomReactionsEditActivity$$ExternalSyntheticLambda3(chatCustomReactionsEditActivity2, i7));
                            break;
                        }
                        break;
                }
            }
        });
        this.contentLayout.addView(this.enableReactionsCell, LayoutHelper.createLinear(-1, -2));
        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 12, this.resourceProvider);
        int i3 = Theme.key_windowBackgroundWhiteGrayText4;
        textInfoPrivacyCell.setTextColor(Theme.getColor(null, i3, false));
        textInfoPrivacyCell.setTopPadding(12);
        textInfoPrivacyCell.setBottomPadding(16);
        textInfoPrivacyCell.setText(LocaleController.getString(R.string.ReactionAddEmojiFromAnyPack));
        this.contentLayout.addView(textInfoPrivacyCell, LayoutHelper.createLinear(-1, -2));
        HeaderCell headerCell = new HeaderCell(context);
        headerCell.setText(LocaleController.getString(R.string.AvailableReactions));
        headerCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        headerCell.setTextSize(15.0f);
        headerCell.setTopMargin(14);
        LinearLayout linearLayout = new LinearLayout(context);
        this.switchLayout = linearLayout;
        linearLayout.setOrientation(1);
        this.contentLayout.addView(this.switchLayout, LayoutHelper.createFrame(-1, -2.0f));
        this.switchLayout.addView(headerCell, LayoutHelper.createLinear(-1, -2));
        Theme.ResourcesProvider resourceProvider = getResourceProvider();
        int i4 = this.maxReactionsCount;
        ?? r4 = new CustomReactionEditText(context, resourceProvider, i4) {
            @Override
            public final void onLineCountChanged(int i5, int i6) {
                if (i6 > i5) {
                    ChatCustomReactionsEditActivity.this.scrollView.smoothScrollBy(0, AndroidUtilities.dp(30.0f));
                }
            }

            @Override
            public final boolean onTextContextMenuItem(int i5) {
                if (i5 == R.id.menu_delete || i5 == 16908320) {
                    return ChatCustomReactionsEditActivity.this.deleteSelectedEmojis();
                }
                if (i5 == 16908322 || i5 == 16908321) {
                    return false;
                }
                return super.onTextContextMenuItem(i5);
            }
        };
        this.editText = r4;
        r4.setOnFocused(new ChatCustomReactionsEditActivity$$ExternalSyntheticLambda3(this, 0));
        this.switchLayout.addView(this.editText, LayoutHelper.createLinear(-1, -2));
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(200L);
        layoutTransition.enableTransitionType(4);
        this.switchLayout.setLayoutTransition(layoutTransition);
        TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context, 12, this.resourceProvider);
        textInfoPrivacyCell2.setTextColor(Theme.getColor(null, i3, false));
        textInfoPrivacyCell2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ReactionCreateOwnPack), Theme.key_chat_messageLinkIn, 0, new ChatCustomReactionsEditActivity$$ExternalSyntheticLambda3(this, 3), getResourceProvider()));
        this.switchLayout.addView(textInfoPrivacyCell2, LayoutHelper.createLinear(-1, -2));
        HeaderCell headerCell2 = new HeaderCell(context, this.resourceProvider);
        headerCell2.setText(LocaleController.getString(R.string.MaximumReactionsHeader));
        this.switchLayout.addView(headerCell2, LayoutHelper.createLinear(-1, -2));
        this.slideView = new SlideIntChooseView(context, this.resourceProvider);
        TLRPC.ChatFull chatFull = this.info;
        if (!(chatFull instanceof TLRPC.TL_chatFull) ? (chatFull.flags2 & 8192) != 0 : (chatFull.flags & 1048576) != 0) {
            int i5 = getMessagesController().reactionsUniqMax;
            this.reactionsCount = i5;
            this.currentReactionsCount = i5;
        } else {
            int i6 = chatFull.reactions_limit;
            this.reactionsCount = i6;
            this.currentReactionsCount = i6;
        }
        SlideIntChooseView slideIntChooseView = this.slideView;
        int i7 = this.reactionsCount;
        int i8 = getMessagesController().reactionsUniqMax;
        SlideIntChooseView.Options options = new SlideIntChooseView.Options();
        options.min = 1;
        options.max = i8;
        options.toString = new FirebaseMessaging$AutoInit$$ExternalSyntheticLambda0(18);
        slideIntChooseView.set(i7, options, new ChatCustomReactionsEditActivity$$ExternalSyntheticLambda5(this, 0));
        this.switchLayout.addView(this.slideView, LayoutHelper.createLinear(-1, -2));
        TextInfoPrivacyCell textInfoPrivacyCell3 = new TextInfoPrivacyCell(context, 12, this.resourceProvider);
        textInfoPrivacyCell3.setTopPadding(12);
        textInfoPrivacyCell3.setBottomPadding(16);
        textInfoPrivacyCell3.setText(LocaleController.getString(R.string.MaximumReactionsInfo));
        this.switchLayout.addView(textInfoPrivacyCell3, LayoutHelper.createLinear(-1, -2));
        if (chatFull.paid_media_allowed) {
            TextCheckCell textCheckCell3 = new TextCheckCell(context);
            this.paidCheckCell = textCheckCell3;
            textCheckCell3.setTextAndCheck(LocaleController.getString(R.string.ChannelEnablePaidReactions), false, false);
            this.switchLayout.addView(this.paidCheckCell, LayoutHelper.createLinear(-1, -2));
            final int i9 = 1;
            this.paidCheckCell.setOnClickListener(new View.OnClickListener(this) {
                public final ChatCustomReactionsEditActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    TextCheckCell textCheckCell4;
                    switch (i9) {
                        case 0:
                            ChatCustomReactionsEditActivity chatCustomReactionsEditActivity = this.f$0;
                            if (chatCustomReactionsEditActivity.enableReactionsCell.isChecked() && (textCheckCell4 = chatCustomReactionsEditActivity.paidCheckCell) != null && textCheckCell4.isChecked()) {
                                chatCustomReactionsEditActivity.toggleStarsEnabled();
                            }
                            chatCustomReactionsEditActivity.setCheckedEnableReactionCell(chatCustomReactionsEditActivity.enableReactionsCell.isChecked() ? 2 : 1, chatCustomReactionsEditActivity.enableReactionsCell.isChecked() ? false : chatCustomReactionsEditActivity.paid, true);
                            break;
                        case 1:
                            this.f$0.toggleStarsEnabled();
                            break;
                        default:
                            ChatCustomReactionsEditActivity chatCustomReactionsEditActivity2 = this.f$0;
                            if (!chatCustomReactionsEditActivity2.actionButton.isLoading()) {
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = chatCustomReactionsEditActivity2.boostsStatus;
                                if (tL_premium_boostsStatus != null) {
                                    int i10 = tL_premium_boostsStatus.level;
                                    int i11 = chatCustomReactionsEditActivity2.selectedCustomReactions;
                                    if (i10 < i11) {
                                        ReactionsUtils.showLimitReachedDialogForReactions(-chatCustomReactionsEditActivity2.chatId, i11, tL_premium_boostsStatus);
                                    }
                                }
                                TextCheckCell textCheckCell5 = chatCustomReactionsEditActivity2.paidCheckCell;
                                Boolean boolValueOf = (textCheckCell5 == null || !chatCustomReactionsEditActivity2.info.paid_media_allowed) ? null : Boolean.valueOf(textCheckCell5.isChecked());
                                chatCustomReactionsEditActivity2.actionButton.setLoading(true);
                                MessagesController messagesController = chatCustomReactionsEditActivity2.getMessagesController();
                                int i12 = chatCustomReactionsEditActivity2.selectedType;
                                ArrayList arrayListGrabReactions = chatCustomReactionsEditActivity2.grabReactions(false);
                                int i13 = chatCustomReactionsEditActivity2.reactionsCount;
                                chatCustomReactionsEditActivity2.currentReactionsCount = i13;
                                int i14 = 2;
                                messagesController.setCustomChatReactions(chatCustomReactionsEditActivity2.chatId, i12, arrayListGrabReactions, i13, boolValueOf, new ChatCustomReactionsEditActivity$$ExternalSyntheticLambda5(chatCustomReactionsEditActivity2, i14), new ChatCustomReactionsEditActivity$$ExternalSyntheticLambda3(chatCustomReactionsEditActivity2, i14));
                                break;
                            }
                            break;
                    }
                }
            });
            TextInfoPrivacyCell textInfoPrivacyCell4 = new TextInfoPrivacyCell(context, 12, this.resourceProvider);
            textInfoPrivacyCell4.setTextColor(Theme.getColor(null, i3, false));
            textInfoPrivacyCell4.setTopPadding(12);
            textInfoPrivacyCell4.setBottomPadding(70);
            textInfoPrivacyCell4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.ChannelEnablePaidReactionsInfo), new ChatCustomReactionsEditActivity$$ExternalSyntheticLambda3(this, 4)));
            this.switchLayout.addView(textInfoPrivacyCell4, LayoutHelper.createLinear(-1, -2));
        } else {
            textInfoPrivacyCell3.setBottomPadding(70);
        }
        this.actionButtonContainer = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        this.actionButtonContainerGradient = imageView;
        imageView.setImageResource(R.drawable.gradient_bottom);
        this.actionButtonContainerGradient.setScaleType(ImageView.ScaleType.FIT_XY);
        ImageView imageView2 = this.actionButtonContainerGradient;
        int i10 = Theme.key_windowBackgroundGray;
        imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i10, this.resourceProvider), PorterDuff.Mode.SRC_ATOP));
        this.actionButtonContainer.addView(this.actionButtonContainerGradient, LayoutHelper.createFrame(-1, -1, 119));
        UpdateReactionsButton updateReactionsButton = new UpdateReactionsButton(context, true, getResourceProvider());
        this.actionButton = updateReactionsButton;
        updateReactionsButton.setRound();
        UpdateReactionsButton updateReactionsButton2 = this.actionButton;
        updateReactionsButton2.getClass();
        updateReactionsButton2.setText(new SpannableStringBuilder(LocaleController.getString(R.string.ReactionUpdateReactionsBtn)), false);
        updateReactionsButton2.lock = new SpannableStringBuilder("l");
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_switch_lock);
        coloredImageSpan.setTopOffset(1);
        updateReactionsButton2.lock.setSpan(coloredImageSpan, 0, 1, 33);
        final int i11 = 2;
        this.actionButton.setOnClickListener(new View.OnClickListener(this) {
            public final ChatCustomReactionsEditActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                TextCheckCell textCheckCell4;
                switch (i11) {
                    case 0:
                        ChatCustomReactionsEditActivity chatCustomReactionsEditActivity = this.f$0;
                        if (chatCustomReactionsEditActivity.enableReactionsCell.isChecked() && (textCheckCell4 = chatCustomReactionsEditActivity.paidCheckCell) != null && textCheckCell4.isChecked()) {
                            chatCustomReactionsEditActivity.toggleStarsEnabled();
                        }
                        chatCustomReactionsEditActivity.setCheckedEnableReactionCell(chatCustomReactionsEditActivity.enableReactionsCell.isChecked() ? 2 : 1, chatCustomReactionsEditActivity.enableReactionsCell.isChecked() ? false : chatCustomReactionsEditActivity.paid, true);
                        break;
                    case 1:
                        this.f$0.toggleStarsEnabled();
                        break;
                    default:
                        ChatCustomReactionsEditActivity chatCustomReactionsEditActivity2 = this.f$0;
                        if (!chatCustomReactionsEditActivity2.actionButton.isLoading()) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = chatCustomReactionsEditActivity2.boostsStatus;
                            if (tL_premium_boostsStatus != null) {
                                int i12 = tL_premium_boostsStatus.level;
                                int i13 = chatCustomReactionsEditActivity2.selectedCustomReactions;
                                if (i12 < i13) {
                                    ReactionsUtils.showLimitReachedDialogForReactions(-chatCustomReactionsEditActivity2.chatId, i13, tL_premium_boostsStatus);
                                }
                            }
                            TextCheckCell textCheckCell5 = chatCustomReactionsEditActivity2.paidCheckCell;
                            Boolean boolValueOf = (textCheckCell5 == null || !chatCustomReactionsEditActivity2.info.paid_media_allowed) ? null : Boolean.valueOf(textCheckCell5.isChecked());
                            chatCustomReactionsEditActivity2.actionButton.setLoading(true);
                            MessagesController messagesController = chatCustomReactionsEditActivity2.getMessagesController();
                            int i14 = chatCustomReactionsEditActivity2.selectedType;
                            ArrayList arrayListGrabReactions = chatCustomReactionsEditActivity2.grabReactions(false);
                            int i15 = chatCustomReactionsEditActivity2.reactionsCount;
                            chatCustomReactionsEditActivity2.currentReactionsCount = i15;
                            int i16 = 2;
                            messagesController.setCustomChatReactions(chatCustomReactionsEditActivity2.chatId, i14, arrayListGrabReactions, i15, boolValueOf, new ChatCustomReactionsEditActivity$$ExternalSyntheticLambda5(chatCustomReactionsEditActivity2, i16), new ChatCustomReactionsEditActivity$$ExternalSyntheticLambda3(chatCustomReactionsEditActivity2, i16));
                            break;
                        }
                        break;
                }
            }
        });
        anonymousClass1.addView(this.scrollView);
        anonymousClass1.addView(this.actionButtonContainer, LayoutHelper.createFrame(-1, 74.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        this.actionButtonContainer.addView(this.actionButton, LayoutHelper.createFrame(-1, 48.0f, 80, 13.0f, 13.0f, 13.0f, 13.0f));
        anonymousClass1.setBackgroundColor(Theme.getColor(null, i10, false));
        TONIntroActivity.AnonymousClass2 anonymousClass2 = new TONIntroActivity.AnonymousClass2(this, context, 7);
        this.bottomDialogLayout = anonymousClass2;
        anonymousClass2.setVisibility(4);
        anonymousClass1.addView(this.bottomDialogLayout, LayoutHelper.createFrame(-1, -2, 80));
        TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
        boolean z2 = chatReactions instanceof TLRPC.TL_chatReactionsAll;
        ArrayList arrayList2 = this.allAvailableReactions;
        ArrayList arrayList3 = this.selectedEmojisIds;
        LinkedHashMap linkedHashMap3 = this.selectedEmojisMap;
        if (z2) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
            int size = arrayList2.size();
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (i12 >= size) {
                    linkedHashMap2 = linkedHashMap3;
                    spannableStringBuilder3 = spannableStringBuilder4;
                    break;
                }
                Object obj = arrayList2.get(i12);
                i12++;
                ArrayList arrayList4 = arrayList3;
                linkedHashMap2 = linkedHashMap3;
                ReactionsUtils.addReactionToEditText((TLRPC.TL_availableReaction) obj, linkedHashMap2, arrayList4, spannableStringBuilder4, this.selectAnimatedEmojiDialog, getFontMetricsInt());
                spannableStringBuilder3 = spannableStringBuilder4;
                i13++;
                if (i13 >= i4) {
                    break;
                }
                spannableStringBuilder4 = spannableStringBuilder3;
                linkedHashMap3 = linkedHashMap2;
                arrayList3 = arrayList4;
            }
            append(spannableStringBuilder3);
            setCheckedEnableReactionCell(0, this.paid, false);
            linkedHashMap = linkedHashMap2;
        } else {
            ArrayList arrayList5 = arrayList3;
            LinkedHashMap linkedHashMap4 = linkedHashMap3;
            if (!(chatReactions instanceof TLRPC.TL_chatReactionsSome)) {
                linkedHashMap = linkedHashMap4;
                ArrayList arrayList6 = arrayList5;
                boolean z3 = chatReactions instanceof TLRPC.TL_chatReactionsNone;
                if (z3 && chatFull.paid_media_allowed && chatFull.paid_reactions_available) {
                    i = 2;
                    setCheckedEnableReactionCell(2, this.paid, false);
                } else if (z3) {
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    int size2 = arrayList2.size();
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        if (i14 >= size2) {
                            spannableStringBuilder = spannableStringBuilder5;
                            break;
                        }
                        Object obj2 = arrayList2.get(i14);
                        i14++;
                        ArrayList arrayList7 = arrayList6;
                        ReactionsUtils.addReactionToEditText((TLRPC.TL_availableReaction) obj2, linkedHashMap, arrayList7, spannableStringBuilder5, this.selectAnimatedEmojiDialog, getFontMetricsInt());
                        spannableStringBuilder = spannableStringBuilder5;
                        i15++;
                        if (i15 >= i4) {
                            break;
                        }
                        spannableStringBuilder5 = spannableStringBuilder;
                        arrayList6 = arrayList7;
                    }
                    append(spannableStringBuilder);
                    i = 2;
                    setCheckedEnableReactionCell(2, this.paid, false);
                }
                TextCheckCell textCheckCell4 = this.enableReactionsCell;
                String string = LocaleController.getString(R.string.EnableReactions);
                if (this.selectedType == i || this.paid) {
                    z = true;
                } else {
                    z = false;
                }
                textCheckCell4.setTextAndCheck(string, z, false);
                addReactionsSpan();
                if (chatFull.paid_media_allowed && chatFull.paid_reactions_available) {
                    toggleStarsEnabled();
                }
                this.initialSelectedEmojis.putAll(linkedHashMap);
                this.initialPaid = this.paid;
                this.fragmentView = anonymousClass1;
                return anonymousClass1;
            }
            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
            ArrayList<TLRPC.Reaction> arrayList8 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
            int size3 = arrayList8.size();
            int i16 = 0;
            int i17 = 0;
            while (true) {
                if (i16 >= size3) {
                    linkedHashMap = linkedHashMap4;
                    spannableStringBuilder2 = spannableStringBuilder6;
                    break;
                }
                TLRPC.Reaction reaction = arrayList8.get(i16);
                i16++;
                TLRPC.Reaction reaction2 = reaction;
                if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                    TLRPC.TL_availableReaction tL_availableReaction = getMediaDataController().getReactionsMap().get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                    if (tL_availableReaction == null) {
                        continue;
                    } else {
                        ReactionsUtils.addReactionToEditText(tL_availableReaction, linkedHashMap4, arrayList5, spannableStringBuilder6, this.selectAnimatedEmojiDialog, getFontMetricsInt());
                        linkedHashMap = linkedHashMap4;
                        arrayList = arrayList5;
                        spannableStringBuilder2 = spannableStringBuilder6;
                        i17++;
                    }
                } else {
                    linkedHashMap = linkedHashMap4;
                    arrayList = arrayList5;
                    spannableStringBuilder2 = spannableStringBuilder6;
                    if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = (TLRPC.TL_reactionCustomEmoji) reaction2;
                        AnonymousClass5 anonymousClass5 = this.selectAnimatedEmojiDialog;
                        arrayList8 = arrayList8;
                        AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(tL_reactionCustomEmoji.document_id, 1.0f, getFontMetricsInt());
                        animatedEmojiSpan.cacheType = AnimatedEmojiDrawable.getCacheTypeForEnterView();
                        linkedHashMap.put(Long.valueOf(tL_reactionCustomEmoji.document_id), animatedEmojiSpan);
                        int i18 = i17;
                        arrayList.add(Long.valueOf(tL_reactionCustomEmoji.document_id));
                        SpannableString spannableString = new SpannableString("e");
                        i16 = i16;
                        spannableString.setSpan(animatedEmojiSpan, 0, spannableString.length(), 33);
                        spannableStringBuilder2.append((CharSequence) spannableString);
                        if (anonymousClass5 != null) {
                            linkedHashMap = linkedHashMap;
                            anonymousClass5.setMultiSelected(Long.valueOf(tL_reactionCustomEmoji.document_id), false);
                        }
                        linkedHashMap = linkedHashMap;
                        i17 = i18 + 1;
                    }
                    if (i17 >= i4) {
                        break;
                    }
                    arrayList5 = arrayList;
                    linkedHashMap4 = linkedHashMap;
                    spannableStringBuilder6 = spannableStringBuilder2;
                    i16 = i16;
                    arrayList8 = arrayList8;
                }
                if (i17 >= i4) {
                    break;
                    break;
                }
                arrayList5 = arrayList;
                linkedHashMap4 = linkedHashMap;
                spannableStringBuilder6 = spannableStringBuilder2;
                i16 = i16;
                arrayList8 = arrayList8;
            }
            append(spannableStringBuilder2);
            setCheckedEnableReactionCell(1, this.paid, false);
        }
        i = 2;
        TextCheckCell textCheckCell5 = this.enableReactionsCell;
        String string2 = LocaleController.getString(R.string.EnableReactions);
        if (this.selectedType == i) {
            z = true;
        } else {
            z = true;
        }
        textCheckCell5.setTextAndCheck(string2, z, false);
        addReactionsSpan();
        if (chatFull.paid_media_allowed) {
            toggleStarsEnabled();
        }
        this.initialSelectedEmojis.putAll(linkedHashMap);
        this.initialPaid = this.paid;
        this.fragmentView = anonymousClass1;
        return anonymousClass1;
    }

    public final boolean deleteSelectedEmojis() {
        int editTextSelectionEnd = getEditTextSelectionEnd();
        int editTextSelectionStart = getEditTextSelectionStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        if (!hasSelection()) {
            return false;
        }
        AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, AnimatedEmojiSpan.class);
        for (AnimatedEmojiSpan animatedEmojiSpan : animatedEmojiSpanArr) {
            this.selectedEmojisMap.remove(Long.valueOf(animatedEmojiSpan.documentId));
            this.selectedEmojisIds.remove(Long.valueOf(animatedEmojiSpan.documentId));
            this.selectAnimatedEmojiDialog.unselect(Long.valueOf(animatedEmojiSpan.documentId));
        }
        dispatchKeyEvent(new KeyEvent(0, 67));
        checkMaxCustomReactions(false);
        return true;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.chatId)) {
            INavigationLayout iNavigationLayout = this.parentLayout;
            if (iNavigationLayout == null || ((ActionBarLayout) iNavigationLayout).getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    public final ArrayList grabReactions(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.selectedEmojisIds;
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            Long l = (Long) obj;
            if (l.longValue() != -1) {
                ArrayList arrayList4 = this.allAvailableReactions;
                int size2 = arrayList4.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                        tL_reactionCustomEmoji.document_id = l.longValue();
                        arrayList.add(tL_reactionCustomEmoji);
                        arrayList2.add(tL_reactionCustomEmoji);
                        break;
                    }
                    Object obj2 = arrayList4.get(i2);
                    i2++;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj2;
                    if (l.longValue() == tL_availableReaction.activate_animation.id) {
                        TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                        tL_reactionEmoji.emoticon = tL_availableReaction.reaction;
                        arrayList.add(tL_reactionEmoji);
                        break;
                    }
                }
            }
        }
        return z ? arrayList2 : arrayList;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (this.emojiKeyboardVisible) {
            if (z) {
                closeKeyboard$1();
                return false;
            }
        } else if (!checkChangesBeforeExit(z)) {
            return super.onBackPressed(z);
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        int i = 1;
        MessagesController messagesController = getMessagesController();
        long j = this.chatId;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j));
        this.currentChat = chat;
        if (chat == null) {
            TLRPC.Chat chatSync = MessagesStorage.getInstance(this.currentAccount).getChatSync(j);
            this.currentChat = chatSync;
            if (chatSync != null) {
                getMessagesController().putChat(this.currentChat, true);
                if (this.info != null) {
                    getMessagesController().getBoostsController().getBoostsStats(-j, new PeerStoriesView$$ExternalSyntheticLambda27(this, i));
                    getNotificationCenter().addObserver(this, NotificationCenter.reactionsDidLoad);
                    this.allAvailableReactions.addAll(getMediaDataController().getEnabledReactionsList());
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                    getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
                    return super.onFragmentCreate();
                }
            }
        } else if (this.info != null) {
            getMessagesController().getBoostsController().getBoostsStats(-j, new PeerStoriesView$$ExternalSyntheticLambda27(this, i));
            getNotificationCenter().addObserver(this, NotificationCenter.reactionsDidLoad);
            this.allAvailableReactions.addAll(getMediaDataController().getEnabledReactionsList());
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
            return super.onFragmentCreate();
        }
        return false;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        AndroidUtilities.cancelRunOnUIThread(this.checkAfterFastDeleteRunnable);
        if (this.selectedType == 2 && this.reactionsCount != this.currentReactionsCount) {
            getMessagesController().setCustomChatReactions(this.chatId, this.selectedType, grabReactions(false), this.reactionsCount, null, null, null);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override
    public final void onPause() {
        this.isPaused = true;
        setFocusable(false);
        super.onPause();
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.isPaused) {
            this.isPaused = false;
            setFocusable(true);
            setFocusableInTouchMode(true);
            if (this.emojiKeyboardVisible) {
                removeReactionsSpan(false);
                AndroidUtilities.runOnUIThread(new ChatCustomReactionsEditActivity$$ExternalSyntheticLambda3(this, 1), 250L);
            }
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (z && this.selectedType != 2) {
            setFocusableInTouchMode(true);
        }
        if (!z || z2) {
            return;
        }
        if (this.selectAnimatedEmojiDialog == null) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this, getContext(), getResourceProvider(), Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, getResourceProvider()));
            this.selectAnimatedEmojiDialog = anonymousClass5;
            anonymousClass5.setAnimationsEnabled(false);
            this.selectAnimatedEmojiDialog.setClipChildren(false);
            this.selectAnimatedEmojiDialog.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            this.bottomDialogLayout.addView(this.selectAnimatedEmojiDialog, LayoutHelper.createFrame(-1, -2, 80));
            BackSpaceButtonView backSpaceButtonView = new BackSpaceButtonView(getContext(), getResourceProvider());
            this.backSpaceButtonView = backSpaceButtonView;
            backSpaceButtonView.setOnBackspace(new ChatCustomReactionsEditActivity$$ExternalSyntheticLambda5(this, 1));
            this.bottomDialogLayout.addView(this.backSpaceButtonView, LayoutHelper.createFrame(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
            ArrayList arrayList = this.selectedEmojisIds;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                this.selectAnimatedEmojiDialog.setMultiSelected((Long) obj, false);
            }
        }
        AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda2(14), 200L);
    }

    public final void setCheckedEnableReactionCell(int i, boolean z, boolean z2) {
        if (this.selectedType == i && this.paid == z) {
            return;
        }
        this.paid = z;
        boolean z3 = i == 1 || i == 0 || z;
        this.enableReactionsCell.setChecked(z3);
        int color = Theme.getColor(null, z3 ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked, false);
        if (!z2) {
            this.enableReactionsCell.setBackgroundColor(color);
        } else if (z3) {
            this.enableReactionsCell.setBackgroundColorAnimated(true, color);
        } else {
            this.enableReactionsCell.setBackgroundColorAnimatedReverse(color);
        }
        this.selectedType = i;
        if (i != 1 && i != 0 && !z) {
            if (!z2) {
                this.switchLayout.setVisibility(4);
                this.actionButtonContainer.setVisibility(4);
                return;
            }
            closeKeyboard$1();
            this.actionButtonContainer.animate().setListener(null).cancel();
            this.switchLayout.animate().setListener(null).cancel();
            ViewPropertyAnimator duration = this.actionButtonContainer.animate().alpha(0.0f).setDuration(350L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            duration.setInterpolator(cubicBezierInterpolator).setListener(new AnonymousClass6(this, 2)).start();
            this.switchLayout.animate().alpha(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).setListener(new AnonymousClass6(this, 3)).start();
            return;
        }
        this.switchLayout.setVisibility(0);
        this.actionButtonContainer.setVisibility(0);
        if (z2) {
            this.actionButtonContainer.animate().setListener(null).cancel();
            this.switchLayout.animate().setListener(null).cancel();
            ViewPropertyAnimator duration2 = this.switchLayout.animate().alpha(1.0f).setDuration(350L);
            CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.DEFAULT;
            duration2.setInterpolator(cubicBezierInterpolator2).setListener(new AnonymousClass6(this, 0)).start();
            this.actionButtonContainer.animate().alpha(1.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator2).start();
            LinkedHashMap linkedHashMap = this.selectedEmojisMap;
            if (linkedHashMap.isEmpty()) {
                this.selectAnimatedEmojiDialog.clearSelectedDocuments();
                setText("");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ArrayList arrayList = this.allAvailableReactions;
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ReactionsUtils.addReactionToEditText((TLRPC.TL_availableReaction) obj, linkedHashMap, this.selectedEmojisIds, spannableStringBuilder, this.selectAnimatedEmojiDialog, getFontMetricsInt());
                    i3++;
                    if (i3 >= this.maxReactionsCount) {
                        break;
                    }
                }
                append(spannableStringBuilder);
                addReactionsSpan();
                this.selectAnimatedEmojiDialog.notifyDataSetChanged();
                checkMaxCustomReactions(false);
            }
        }
    }

    public final void toggleStarsEnabled() {
        boolean zIsChecked = this.paidCheckCell.isChecked();
        LinkedHashMap linkedHashMap = this.selectedEmojisMap;
        ArrayList arrayList = this.selectedEmojisIds;
        int i = this.maxReactionsCount;
        if (zIsChecked) {
            this.paidCheckCell.setChecked(false);
            arrayList.remove((Object) (-1L));
            AnimatedEmojiSpan animatedEmojiSpan = (AnimatedEmojiSpan) linkedHashMap.remove(-1L);
            if (animatedEmojiSpan != null) {
                animatedEmojiSpan.setRemoved(new GiftSheet$$ExternalSyntheticLambda26(10, this, animatedEmojiSpan));
            }
            animateChangesInNextRows(animatedEmojiSpan);
            this.selectAnimatedEmojiDialog.setMultiSelected(-1L, true);
            checkMaxCustomReactions(false);
            setMaxLength(i);
            setCheckedEnableReactionCell(this.selectedType, this.paid, true);
        } else {
            this.paidCheckCell.setChecked(true);
            try {
                setMaxLength(i + 1);
                SpannableString spannableString = new SpannableString("b");
                AnimatedEmojiSpan animatedEmojiSpan2 = new AnimatedEmojiSpan(this) {
                    public final Bitmap bitmap;

                    {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), Bitmap.Config.ARGB_8888);
                        this.bitmap = bitmapCreateBitmap;
                        Drawable drawableMutate = this.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate();
                        drawableMutate.setBounds(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                        drawableMutate.draw(new Canvas(bitmapCreateBitmap));
                    }

                    @Override
                    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f, int i4, int i5, int i6, Paint paint) {
                        super.draw(canvas, charSequence, i2, i3, f, i4, i5, i6, paint);
                        canvas.save();
                        canvas.translate(f, ((i4 + i6) / 2.0f) - AndroidUtilities.dp(12.0f));
                        float f2 = this.extraScale;
                        canvas.scale(f2, f2, f + AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                        canvas.drawBitmap(this.bitmap, 0.0f, 0.0f, (Paint) null);
                        canvas.restore();
                    }

                    @Override
                    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
                        return AndroidUtilities.dp(5.0f) + super.getSize(paint, charSequence, i2, i3, fontMetricsInt);
                    }
                };
                animatedEmojiSpan2.cacheType = AnimatedEmojiDrawable.getCacheTypeForEnterView();
                animatedEmojiSpan2.setAdded();
                arrayList.add(0, -1L);
                linkedHashMap.put(-1L, animatedEmojiSpan2);
                spannableString.setSpan(animatedEmojiSpan2, 0, spannableString.length(), 33);
                getText().insert(0, spannableString);
                this.selectAnimatedEmojiDialog.setMultiSelected(-1L, true);
                checkMaxCustomReactions(true);
                animateChangesInNextRows(animatedEmojiSpan2);
            } catch (Exception e) {
                FileLog.e(e);
            }
            setCheckedEnableReactionCell(this.selectedType, true, true);
        }
        updateAnimatedEmoji(true);
    }
}
