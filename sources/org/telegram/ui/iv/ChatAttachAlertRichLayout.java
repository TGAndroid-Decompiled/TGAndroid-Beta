package org.telegram.ui.iv;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.TooltipPopup;
import com.google.android.gms.internal.mlkit_vision_common.zzkg;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaController$$ExternalSyntheticOutline1;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Cells.EditTextCell$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertDocumentLayout;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.TrendingStickersLayout;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.MessageSendPreview;
import org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda18;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.UserInfoActivity$$ExternalSyntheticLambda7;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda2;
import org.telegram.ui.bots.BotDownloads$$ExternalSyntheticLambda0;
import org.telegram.ui.bots.BotVerifySheet$$ExternalSyntheticLambda7;

public final class ChatAttachAlertRichLayout extends ChatAttachAlert.AttachAlertLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] STYLE_FLAGS = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public boolean attachButtonsShown;
    public int attachRaise;
    public TooltipPopup commandSuggestions;
    public final int currentAccount;
    public int currentItemTop;
    public int emojiPadding;
    public boolean emojiSearchOpened;
    public RichEditText emojiTargetEditText;
    public int emojiTargetSelection;
    public EmojiView emojiView;
    public boolean emojiViewVisible;
    public boolean ignoreLayout;
    public boolean keyboardVisible;
    public int lastAttachRise;
    public final ChatAttachAlertRichLayout$$ExternalSyntheticLambda2 limitCheckRunnable;
    public final RichEditorListView listView;
    public ItemOptions menu;
    public MessageSendPreview messageSendPreview;
    public final RichEditorToolbar toolbar;

    public final class AnonymousClass1 implements RichEditorListView.Delegate {
        public final Theme.ResourcesProvider val$resourcesProvider;

        public AnonymousClass1(Theme.ResourcesProvider resourcesProvider) {
            this.val$resourcesProvider = resourcesProvider;
        }

        @Override
        public final void makeEditTextFocusable(RichEditText richEditText) {
            ((ChatAttachAlert.AttachAlertLayout) ChatAttachAlertRichLayout.this).parentAlert.makeFocusable(richEditText, true);
        }

        @Override
        public final ItemOptions makeMenu(View view) {
            ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
            ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(chatAttachAlertRichLayout, this.val$resourcesProvider, view, false, false, true);
            chatAttachAlertRichLayout.menu = itemOptionsMakeOptions;
            return itemOptionsMakeOptions;
        }

        @Override
        public final void onBlockButtonEditRequested(RichEditorListView.BlockButtonEdit blockButtonEdit, View view) {
            ItemOptions itemOptionsDontFocus = ItemOptions.makeOptions(ChatAttachAlertRichLayout.this, this.val$resourcesProvider, view, false, false, true).dontFocus();
            ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
            chatAttachAlertRichLayout.menu = RichInlineButtonEditor.showBlock(itemOptionsDontFocus, ((ChatAttachAlert.AttachAlertLayout) chatAttachAlertRichLayout).parentAlert.getBaseFragment(), chatAttachAlertRichLayout.getContext(), this.val$resourcesProvider, blockButtonEdit, true);
        }

        @Override
        public final void onContentChanged() {
            ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
            RichEditorToolbar richEditorToolbar = chatAttachAlertRichLayout.toolbar;
            if (richEditorToolbar != null) {
                richEditorToolbar.setSendLoading(chatAttachAlertRichLayout.listView.hasPendingUploads());
            }
            chatAttachAlertRichLayout.updateAttachButtons(true);
            chatAttachAlertRichLayout.updateSendButtonLocked();
            ChatAttachAlertRichLayout$$ExternalSyntheticLambda2 chatAttachAlertRichLayout$$ExternalSyntheticLambda2 = chatAttachAlertRichLayout.limitCheckRunnable;
            AndroidUtilities.cancelRunOnUIThread(chatAttachAlertRichLayout$$ExternalSyntheticLambda2);
            AndroidUtilities.runOnUIThread(chatAttachAlertRichLayout$$ExternalSyntheticLambda2, 1000L);
        }

        @Override
        public final void onHistoryChanged() {
            ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
            RichEditorToolbar richEditorToolbar = chatAttachAlertRichLayout.toolbar;
            if (richEditorToolbar != null) {
                RichEditorListView richEditorListView = chatAttachAlertRichLayout.listView;
                RichEditorHistory richEditorHistory = richEditorListView.history;
                boolean z = false;
                boolean z2 = richEditorHistory != null && richEditorHistory.canUndo();
                RichEditorHistory richEditorHistory2 = richEditorListView.history;
                if (richEditorHistory2 != null && !richEditorHistory2.redoStack.isEmpty()) {
                    z = true;
                }
                richEditorToolbar.setHistoryEnabled(z2, z);
            }
            chatAttachAlertRichLayout.updateSendButtonLocked();
        }

        @Override
        public final void onInlineButtonEditRequested(RichEditorListView.InlineButtonEdit inlineButtonEdit, View view) {
            ItemOptions itemOptionsDontFocus = ItemOptions.makeOptions(ChatAttachAlertRichLayout.this, this.val$resourcesProvider, view, false, false, true).dontFocus();
            ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
            BaseFragment baseFragment = ((ChatAttachAlert.AttachAlertLayout) chatAttachAlertRichLayout).parentAlert.getBaseFragment();
            chatAttachAlertRichLayout.getContext();
            chatAttachAlertRichLayout.menu = RichInlineButtonEditor.show(itemOptionsDontFocus, baseFragment, inlineButtonEdit, true);
        }

        @Override
        public final void onListLayoutUpdated() {
            ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
            if (chatAttachAlertRichLayout.getCurrentItemTop() != chatAttachAlertRichLayout.currentItemTop) {
                ((ChatAttachAlert.AttachAlertLayout) chatAttachAlertRichLayout).parentAlert.updateLayout(chatAttachAlertRichLayout, true, 0);
            }
            chatAttachAlertRichLayout.updateToolbarTopOffset();
            ChatAttachAlertRichLayout.access$1200(chatAttachAlertRichLayout);
        }

        @Override
        public final void onListScrolled(int i) {
            ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
            ((ChatAttachAlert.AttachAlertLayout) chatAttachAlertRichLayout).parentAlert.updateLayout(chatAttachAlertRichLayout, true, i);
            chatAttachAlertRichLayout.updateToolbarTopOffset();
            ChatAttachAlertRichLayout.access$1200(chatAttachAlertRichLayout);
        }

        @Override
        public final void onOpenAttachRequest(int i) {
            ChatAttachAlertRichLayout.this.openAttach(74, i);
        }

        @Override
        public final void onOpenLocationRequest(BlockRow blockRow) {
            ChatAttachAlertRichLayout.this.openLocationPicker(blockRow);
        }

        @Override
        public final void onReorderEnd() {
            RichEditorToolbar richEditorToolbar = ChatAttachAlertRichLayout.this.toolbar;
            if (richEditorToolbar != null) {
                richEditorToolbar.setTrashHovered(false, true);
                int i = richEditorToolbar.reorderSavedPanelType;
                richEditorToolbar.updatePanel(i != 2 ? i : 0, true);
            }
        }

        @Override
        public final boolean onReorderMove(float f) {
            boolean z;
            RichEditorToolbar richEditorToolbar = ChatAttachAlertRichLayout.this.toolbar;
            if (richEditorToolbar != null) {
                FrameLayout frameLayout = richEditorToolbar.trashPanel;
                if (frameLayout == null) {
                    z = false;
                } else {
                    int[] iArr = new int[2];
                    frameLayout.getLocationOnScreen(iArr);
                    if (f >= iArr[1]) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                richEditorToolbar.setTrashHovered(z, true);
                if (z) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public final void onReorderStart() {
            RichEditorToolbar richEditorToolbar = ChatAttachAlertRichLayout.this.toolbar;
            if (richEditorToolbar != null) {
                int i = richEditorToolbar.panelType;
                if (i == 2) {
                    i = 0;
                }
                richEditorToolbar.reorderSavedPanelType = i;
                richEditorToolbar.setTrashHovered(false, false);
                richEditorToolbar.updatePanel(2, true);
            }
        }

        @Override
        public final void onSelectionChanged() {
            ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
            if (chatAttachAlertRichLayout.toolbar != null) {
                RichEditorListView richEditorListView = chatAttachAlertRichLayout.listView;
                RichEditorListView.AnonymousClass1 anonymousClass1 = richEditorListView.textSelectionHelper;
                int i = (anonymousClass1 != null && anonymousClass1.isInSelectionMode() && richEditorListView.selectionHasInlineFormattable()) ? 1 : 0;
                RichEditorToolbar richEditorToolbar = chatAttachAlertRichLayout.toolbar;
                if (richEditorToolbar.panelType == 2) {
                    richEditorToolbar.reorderSavedPanelType = i;
                } else {
                    richEditorToolbar.updatePanel(i, true);
                }
                if (i != 0) {
                    chatAttachAlertRichLayout.updateFormattingButtons();
                }
            }
            chatAttachAlertRichLayout.updateToolbarBlockType();
        }

        @Override
        public final void onSlashSuggest(RichTextCell richTextCell, String str) {
            ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
            if (chatAttachAlertRichLayout.commandSuggestions == null) {
                Theme.ResourcesProvider resourcesProvider = this.val$resourcesProvider;
                chatAttachAlertRichLayout.commandSuggestions = new TooltipPopup(new RateCallLayout$$ExternalSyntheticLambda1(25, this, resourcesProvider), resourcesProvider);
            }
            chatAttachAlertRichLayout.commandSuggestions.update(richTextCell, str);
        }
    }

    public final class AnonymousClass2 {
        public AnonymousClass2() {
        }
    }

    public final class AnonymousClass4 implements ChatAttachAlert.ChatAttachViewDelegate {
        @Override
        public final void didPressedButton(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        }

        @Override
        public final void didSelectBot(TLRPC.User user) {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$didSelectBot(this, user);
        }

        @Override
        public final void doOnIdle(Runnable runnable) {
            runnable.run();
        }

        @Override
        public final View getRevealView() {
            return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$getRevealView(this);
        }

        @Override
        public final boolean needEnterComment() {
            return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$needEnterComment(this);
        }

        @Override
        public final void onCameraOpened() {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$onCameraOpened(this);
        }

        @Override
        public final void onWallpaperSelected(Object obj) {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$onWallpaperSelected(this, obj);
        }

        @Override
        public final void openAvatarsSearch() {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$openAvatarsSearch(this);
        }

        @Override
        public final boolean selectItemOnClicking() {
            return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$selectItemOnClicking(this);
        }

        @Override
        public final void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$sendAudio(this, arrayList, charSequence, z, i, i2, j, z2, j2);
        }
    }

    public ChatAttachAlertRichLayout(ChatAttachAlert chatAttachAlert, Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(chatAttachAlert, context, resourcesProvider);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        this.attachButtonsShown = true;
        this.limitCheckRunnable = new ChatAttachAlertRichLayout$$ExternalSyntheticLambda2(this, 3);
        this.currentAccount = i;
        this.occupyStatusBar = true;
        this.occupyNavigationBar = true;
        RichEditorListView richEditorListView = new RichEditorListView(context, i, resourcesProvider, new AnonymousClass1(resourcesProvider), new RichEditorListView[1]);
        this.listView = richEditorListView;
        richEditorListView.setAdaptiveLinkDialogs(false);
        richEditorListView.setAllowTapAboveContent(false);
        addView(richEditorListView, LayoutHelper.createFrame(-1, -1, 119));
        addView(richEditorListView.getOverlayView(), LayoutHelper.createFrame(-1, -1, 119));
        ArrayList arrayList = richEditorListView.rows;
        arrayList.clear();
        arrayList.add(new BlockRow(new TL_iv.pageBlockHeading1(), 0, 0));
        arrayList.add(new BlockRow(new TL_iv.pageBlockParagraph(), 0, 0));
        richEditorListView.adapter.update(false);
        RichEditorHistory richEditorHistory = richEditorListView.history;
        if (richEditorHistory != null) {
            richEditorHistory.resetBaseline();
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setBackground(null);
        setForeground(null);
        RichEditorToolbar richEditorToolbar = new RichEditorToolbar(context, anonymousClass2);
        this.toolbar = richEditorToolbar;
        richEditorToolbar.setBackVisible(false);
        richEditorToolbar.setTopGradientVisible(false);
        updateSendButtonLocked();
        addView(richEditorToolbar, LayoutHelper.createFrame(-1, -1, 119));
        RichEditorHistory richEditorHistory2 = richEditorListView.history;
        boolean z = richEditorHistory2 != null && richEditorHistory2.canUndo();
        RichEditorHistory richEditorHistory3 = richEditorListView.history;
        richEditorToolbar.setHistoryEnabled(z, (richEditorHistory3 == null || richEditorHistory3.redoStack.isEmpty()) ? false : true);
        updateToolbarBlockType();
        updateAttachButtons(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new RichEditor$$ExternalSyntheticLambda14(this, 1));
    }

    public static void access$1200(ChatAttachAlertRichLayout chatAttachAlertRichLayout) {
        int typeButtonsHeight;
        if (chatAttachAlertRichLayout.listView.hasAnyText() || chatAttachAlertRichLayout.emojiViewVisible) {
            typeButtonsHeight = 0;
        } else {
            ChatAttachAlert chatAttachAlert = chatAttachAlertRichLayout.parentAlert;
            if (chatAttachAlert.pinnedToTop) {
                typeButtonsHeight = 0;
            } else {
                typeButtonsHeight = chatAttachAlert.getTypeButtonsHeight();
            }
        }
        if (chatAttachAlertRichLayout.attachRaise != typeButtonsHeight) {
            chatAttachAlertRichLayout.attachRaise = typeButtonsHeight;
            chatAttachAlertRichLayout.layoutBottomPanels();
        }
    }

    public static void access$2100(ChatAttachAlertRichLayout chatAttachAlertRichLayout) {
        boolean z = chatAttachAlertRichLayout.emojiViewVisible;
        RichEditorListView richEditorListView = chatAttachAlertRichLayout.listView;
        if (z) {
            RichEditText richEditTextFindFocusedEditText = richEditorListView.findFocusedEditText();
            if (richEditTextFindFocusedEditText != null) {
                richEditTextFindFocusedEditText.requestEditFocus();
                AndroidUtilities.showKeyboard(richEditTextFindFocusedEditText);
            }
            chatAttachAlertRichLayout.hideEmojiPopup$1(true);
            return;
        }
        if (chatAttachAlertRichLayout.emojiView == null) {
            EmojiView emojiView = new EmojiView(chatAttachAlertRichLayout.parentAlert.baseFragment, true, false, false, chatAttachAlertRichLayout.getContext(), true, null, chatAttachAlertRichLayout.parentAlert.sizeNotifierFrameLayout, true, chatAttachAlertRichLayout.resourcesProvider, false);
            chatAttachAlertRichLayout.emojiView = emojiView;
            emojiView.setVisibility(8);
            EmojiView emojiView2 = chatAttachAlertRichLayout.emojiView;
            emojiView2.fixBottomTabContainerTranslation = false;
            emojiView2.setBottomInset(AndroidUtilities.navigationBarHeight);
            chatAttachAlertRichLayout.emojiView.hideBottomTabContainerBackground();
            chatAttachAlertRichLayout.emojiView.setDelegate(new EmojiView.EmojiViewDelegate() {
                @Override
                public final boolean canAddCaptionToGif(TLRPC.Document document) {
                    return EmojiView.EmojiViewDelegate.CC.$default$canAddCaptionToGif(this, document);
                }

                @Override
                public final boolean canSchedule() {
                    return EmojiView.EmojiViewDelegate.CC.$default$canSchedule(this);
                }

                @Override
                public final long getDialogId() {
                    return EmojiView.EmojiViewDelegate.CC.$default$getDialogId(this);
                }

                @Override
                public final float getProgressToSearchOpened() {
                    return EmojiView.EmojiViewDelegate.CC.$default$getProgressToSearchOpened(this);
                }

                @Override
                public final int getThreadId() {
                    return EmojiView.EmojiViewDelegate.CC.$default$getThreadId(this);
                }

                @Override
                public final void invalidateEnterView() {
                    EmojiView.EmojiViewDelegate.CC.$default$invalidateEnterView(this);
                }

                @Override
                public final boolean isExpanded() {
                    return EmojiView.EmojiViewDelegate.CC.$default$isExpanded(this);
                }

                @Override
                public final boolean isInScheduleMode() {
                    return EmojiView.EmojiViewDelegate.CC.$default$isInScheduleMode(this);
                }

                @Override
                public final boolean isSearchOpened() {
                    return ChatAttachAlertRichLayout.this.emojiSearchOpened;
                }

                @Override
                public final boolean isUserSelf() {
                    return EmojiView.EmojiViewDelegate.CC.$default$isUserSelf(this);
                }

                @Override
                public final void onAnimatedEmojiUnlockClick() {
                    EmojiView.EmojiViewDelegate.CC.$default$onAnimatedEmojiUnlockClick(this);
                }

                @Override
                public final boolean onBackspace() {
                    ChatAttachAlertRichLayout chatAttachAlertRichLayout2 = ChatAttachAlertRichLayout.this;
                    RichEditText focusedEditTextOrNull = chatAttachAlertRichLayout2.listView.getFocusedEditTextOrNull();
                    if (focusedEditTextOrNull != null) {
                        chatAttachAlertRichLayout2.emojiTargetEditText = focusedEditTextOrNull;
                        chatAttachAlertRichLayout2.emojiTargetSelection = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
                    } else {
                        focusedEditTextOrNull = chatAttachAlertRichLayout2.emojiTargetEditText;
                        if (focusedEditTextOrNull == null) {
                            focusedEditTextOrNull = chatAttachAlertRichLayout2.listView.findFocusedEditText();
                        }
                    }
                    if (focusedEditTextOrNull == null || focusedEditTextOrNull.length() == 0) {
                        return false;
                    }
                    focusedEditTextOrNull.dispatchKeyEvent(new KeyEvent(0, 67));
                    return true;
                }

                @Override
                public final void onClearEmojiRecent() {
                    EmojiView.EmojiViewDelegate.CC.$default$onClearEmojiRecent(this);
                }

                @Override
                public final void onCustomEmojiSelected(long j, TLRPC.Document document, String str, boolean z2) {
                    ChatAttachAlertRichLayout chatAttachAlertRichLayout2 = ChatAttachAlertRichLayout.this;
                    RichEditText focusedEditTextOrNull = chatAttachAlertRichLayout2.listView.getFocusedEditTextOrNull();
                    if (focusedEditTextOrNull != null) {
                        chatAttachAlertRichLayout2.emojiTargetEditText = focusedEditTextOrNull;
                        chatAttachAlertRichLayout2.emojiTargetSelection = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
                    } else {
                        focusedEditTextOrNull = chatAttachAlertRichLayout2.emojiTargetEditText;
                        if (focusedEditTextOrNull == null) {
                            focusedEditTextOrNull = chatAttachAlertRichLayout2.listView.findFocusedEditText();
                        }
                    }
                    if (focusedEditTextOrNull == null) {
                        return;
                    }
                    int iMax = (focusedEditTextOrNull != chatAttachAlertRichLayout2.emojiTargetEditText || chatAttachAlertRichLayout2.listView.getFocusedEditTextOrNull() == focusedEditTextOrNull) ? Math.max(0, focusedEditTextOrNull.getSelectionEnd()) : Math.min(chatAttachAlertRichLayout2.emojiTargetSelection, focusedEditTextOrNull.length());
                    try {
                        if (str == null) {
                            str = "😀";
                        }
                        SpannableString spannableString = new SpannableString(str);
                        AnimatedEmojiSpan animatedEmojiSpan = document != null ? new AnimatedEmojiSpan(document, focusedEditTextOrNull.getPaint().getFontMetricsInt()) : new AnimatedEmojiSpan(j, focusedEditTextOrNull.getPaint().getFontMetricsInt());
                        animatedEmojiSpan.cacheType = AnimatedEmojiDrawable.getCacheTypeForEnterView();
                        spannableString.setSpan(animatedEmojiSpan, 0, spannableString.length(), 33);
                        focusedEditTextOrNull.setText(focusedEditTextOrNull.getText().insert(iMax, spannableString));
                        int length = iMax + spannableString.length();
                        focusedEditTextOrNull.setSelection(length, length);
                        if (focusedEditTextOrNull == chatAttachAlertRichLayout2.emojiTargetEditText) {
                            chatAttachAlertRichLayout2.emojiTargetSelection = length;
                        }
                    } catch (Exception unused) {
                    }
                }

                @Override
                public final void onEmojiSelected(String str) {
                    ChatAttachAlertRichLayout chatAttachAlertRichLayout2 = ChatAttachAlertRichLayout.this;
                    RichEditText focusedEditTextOrNull = chatAttachAlertRichLayout2.listView.getFocusedEditTextOrNull();
                    if (focusedEditTextOrNull != null) {
                        chatAttachAlertRichLayout2.emojiTargetEditText = focusedEditTextOrNull;
                        chatAttachAlertRichLayout2.emojiTargetSelection = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
                    } else {
                        focusedEditTextOrNull = chatAttachAlertRichLayout2.emojiTargetEditText;
                        if (focusedEditTextOrNull == null) {
                            focusedEditTextOrNull = chatAttachAlertRichLayout2.listView.findFocusedEditText();
                        }
                    }
                    if (focusedEditTextOrNull == null) {
                        return;
                    }
                    int iMax = (focusedEditTextOrNull != chatAttachAlertRichLayout2.emojiTargetEditText || chatAttachAlertRichLayout2.listView.getFocusedEditTextOrNull() == focusedEditTextOrNull) ? Math.max(0, focusedEditTextOrNull.getSelectionEnd()) : Math.min(chatAttachAlertRichLayout2.emojiTargetSelection, focusedEditTextOrNull.length());
                    try {
                        CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji((CharSequence) str, focusedEditTextOrNull.getPaint().getFontMetricsInt(), false, (int[]) null);
                        focusedEditTextOrNull.setText(focusedEditTextOrNull.getText().insert(iMax, charSequenceReplaceEmoji));
                        int length = iMax + charSequenceReplaceEmoji.length();
                        focusedEditTextOrNull.setSelection(length, length);
                        if (focusedEditTextOrNull == chatAttachAlertRichLayout2.emojiTargetEditText) {
                            chatAttachAlertRichLayout2.emojiTargetSelection = length;
                        }
                    } catch (Exception unused) {
                    }
                }

                @Override
                public final void onEmojiSettingsClick(ArrayList arrayList) {
                    EmojiView.EmojiViewDelegate.CC.$default$onEmojiSettingsClick(this, arrayList);
                }

                @Override
                public final void onGifSelected(View view, Object obj, String str, Object obj2, boolean z2, int i, int i2) {
                    EmojiView.EmojiViewDelegate.CC.$default$onGifSelected(this, view, obj, str, obj2, z2, i, i2);
                }

                @Override
                public final void onGifSelectedForAddCaption(View view, Object obj, String str, Object obj2, boolean z2, int i, int i2) {
                    EmojiView.EmojiViewDelegate.CC.$default$onGifSelectedForAddCaption(this, view, obj, str, obj2, z2, i, i2);
                }

                @Override
                public final void onSearchOpenClose(int i) {
                    RichEditText focusedEditTextOrNull;
                    ChatAttachAlertRichLayout chatAttachAlertRichLayout2 = ChatAttachAlertRichLayout.this;
                    if (i != 0 && (focusedEditTextOrNull = chatAttachAlertRichLayout2.listView.getFocusedEditTextOrNull()) != null) {
                        chatAttachAlertRichLayout2.emojiTargetEditText = focusedEditTextOrNull;
                        chatAttachAlertRichLayout2.emojiTargetSelection = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
                    }
                    chatAttachAlertRichLayout2.emojiSearchOpened = i != 0;
                    chatAttachAlertRichLayout2.layoutBottomPanels();
                }

                @Override
                public final void onShowStickerSet(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z2) {
                    EmojiView.EmojiViewDelegate.CC.$default$onShowStickerSet(this, stickerSet, inputStickerSet, z2);
                }

                @Override
                public final void onStickerSelected(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z2, int i, int i2) {
                    EmojiView.EmojiViewDelegate.CC.$default$onStickerSelected(this, view, document, str, obj, sendAnimationData, z2, i, i2);
                }

                @Override
                public final void onStickerSetAdd(TLRPC.StickerSetCovered stickerSetCovered) {
                    EmojiView.EmojiViewDelegate.CC.$default$onStickerSetAdd(this, stickerSetCovered);
                }

                @Override
                public final void onStickerSetRemove(TLRPC.StickerSetCovered stickerSetCovered) {
                    EmojiView.EmojiViewDelegate.CC.$default$onStickerSetRemove(this, stickerSetCovered);
                }

                @Override
                public final void onStickersGroupClick(long j) {
                    EmojiView.EmojiViewDelegate.CC.$default$onStickersGroupClick(this, j);
                }

                @Override
                public final void onStickersSettingsClick() {
                    EmojiView.EmojiViewDelegate.CC.$default$onStickersSettingsClick(this);
                }

                @Override
                public final void onTabOpened(int i) {
                    EmojiView.EmojiViewDelegate.CC.$default$onTabOpened(this, i);
                }

                @Override
                public final void showTrendingStickersAlert(TrendingStickersLayout trendingStickersLayout) {
                    EmojiView.EmojiViewDelegate.CC.$default$showTrendingStickersAlert(this, trendingStickersLayout);
                }
            });
            chatAttachAlertRichLayout.addView(chatAttachAlertRichLayout.emojiView, LayoutHelper.createFrame(-1, chatAttachAlertRichLayout.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = chatAttachAlertRichLayout.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) chatAttachAlertRichLayout.emojiView.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        chatAttachAlertRichLayout.emojiView.setLayoutParams(layoutParams);
        chatAttachAlertRichLayout.emojiView.setTranslationY(0.0f);
        chatAttachAlertRichLayout.emojiView.setVisibility(0);
        chatAttachAlertRichLayout.emojiViewVisible = true;
        chatAttachAlertRichLayout.emojiPadding = emojiPanelHeight;
        RichEditText richEditTextFindFocusedEditText2 = richEditorListView.findFocusedEditText();
        if (richEditTextFindFocusedEditText2 != null) {
            AndroidUtilities.hideKeyboard(richEditTextFindFocusedEditText2);
        }
        RichEditorToolbar richEditorToolbar = chatAttachAlertRichLayout.toolbar;
        if (richEditorToolbar != null) {
            richEditorToolbar.setEmojiOpened(true);
        }
        chatAttachAlertRichLayout.updateAttachButtons(false);
        if (chatAttachAlertRichLayout.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    private int getEmojiPanelHeight() {
        int iMeasureKeyboardHeight = this.parentAlert.sizeNotifierFrameLayout.measureKeyboardHeight();
        if (iMeasureKeyboardHeight <= 0) {
            SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
            Point point = AndroidUtilities.displaySize;
            iMeasureKeyboardHeight = globalEmojiSettings.getInt(point.x > point.y ? "kbd_height_land3" : "kbd_height", AndroidUtilities.dp(200.0f));
        }
        if (iMeasureKeyboardHeight <= 0) {
            iMeasureKeyboardHeight = AndroidUtilities.dp(200.0f);
        }
        return iMeasureKeyboardHeight + AndroidUtilities.navigationBarHeight;
    }

    public static void showEditLatexSheet(Context context, final String str, final Utilities.Callback callback, Theme.ResourcesProvider resourcesProvider) {
        int i = 17;
        int i2 = 1;
        BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, true, false, resourcesProvider);
        LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
        final String[] strArr = {str == null ? "" : str};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(8.0f), Theme.multAlpha(0.05f, Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider))));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        linearLayoutM.addView(horizontalScrollView, LayoutHelper.createLinear(-1, -2, 49, 12, 2, 12, 0));
        ButtonWithCounterView buttonWithCounterViewM = zzkg.m(context, resourcesProvider, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        final UserInfoActivity$$ExternalSyntheticLambda7 userInfoActivity$$ExternalSyntheticLambda7 = new UserInfoActivity$$ExternalSyntheticLambda7(strArr, horizontalScrollView, buttonWithCounterViewM, zArr2, new BotDownloads$$ExternalSyntheticLambda0(strArr, i), imageView, resourcesProvider, new int[]{6});
        final EditTextCell editTextCell = new EditTextCell(context, LocaleController.getString(R.string.ArticleLatexEquation), true, false, -1, resourcesProvider);
        editTextCell.editText.setImeOptions(6);
        editTextCell.editText.setMaxLines(5);
        editTextCell.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(24.0f), Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider)));
        editTextCell.setText(strArr[0]);
        editTextCell.editText.addTextChangedListener(new TextWatcher() {
            @Override
            public final void afterTextChanged(Editable editable) {
                strArr[0] = editable.toString();
                userInfoActivity$$ExternalSyntheticLambda7.run();
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }
        });
        linearLayoutM.addView(editTextCell, LayoutHelper.createLinear(-1, -2, 55, 12, 8, 12, 0));
        buttonWithCounterViewM.setText(LocaleController.getString(R.string.Done));
        linearLayoutM.addView(buttonWithCounterViewM, LayoutHelper.createLinear(-1, 48, 55, 12, 12, 12, 12));
        userInfoActivity$$ExternalSyntheticLambda7.run();
        bottomSheetM.customView = linearLayoutM;
        bottomSheetM.setOnHideListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                EditTextCell editTextCell2 = editTextCell;
                editTextCell2.editText.clearFocus();
                AndroidUtilities.hideKeyboard(editTextCell2.editText);
                boolean[] zArr3 = zArr;
                if (zArr3[0] || zArr2[0]) {
                    return;
                }
                String[] strArr2 = strArr;
                if (TextUtils.equals(str, strArr2[0])) {
                    return;
                }
                zArr3[0] = true;
                callback.run(strArr2[0]);
            }
        });
        bottomSheetM.show();
        int i3 = Theme.key_windowBackgroundGray;
        bottomSheetM.setBackgroundColor(Theme.getColor(i3, resourcesProvider));
        bottomSheetM.fixNavigationBar(Theme.getColor(i3, resourcesProvider));
        buttonWithCounterViewM.setOnClickListener(new PeerStoriesView$$ExternalSyntheticLambda18(buttonWithCounterViewM, zArr, callback, strArr, bottomSheetM, 4));
        AndroidUtilities.runOnUIThread(new EditTextCell$$ExternalSyntheticLambda0(editTextCell, i2), 200L);
    }

    public final void addHeadingItem(ItemOptions itemOptions, BlockRow blockRow, TL_iv.PageBlock pageBlock, int i, String str, int i2, ItemOptions itemOptions2) {
        itemOptions.addChecked(blockRow != null && blockRow.block.getClass() == pageBlock.getClass(), i, str, new BotVerifySheet$$ExternalSyntheticLambda7(7, this, blockRow, pageBlock, itemOptions2));
        itemOptions.getLast().textView.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        itemOptions.getLast().textView.setTextSize(1, i2);
    }

    public final boolean checkDiscard() {
        RichEditorListView richEditorListView = this.listView;
        if (richEditorListView == null || !richEditorListView.hasAnyText()) {
            return true;
        }
        final int i = 0;
        final int i2 = 1;
        new AlertDialog.Builder(getContext(), 0, this.resourcesProvider).setTitle(LocaleController.getString(R.string.ArticleSaveDraftTitle)).setMessage(LocaleController.getString(R.string.ArticleSaveDraftMessage)).setNegativeButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener(this) {
            public final ChatAttachAlertRichLayout f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(AlertDialog alertDialog, int i3) {
                switch (i) {
                    case 0:
                        this.f$0.lambda$checkDiscard$1();
                        break;
                    default:
                        this.f$0.lambda$checkDiscard$2();
                        break;
                }
            }
        }).setPositiveButton(LocaleController.getString(R.string.Save), new AlertDialog.OnButtonClickListener(this) {
            public final ChatAttachAlertRichLayout f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(AlertDialog alertDialog, int i3) {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$checkDiscard$1();
                        break;
                    default:
                        this.f$0.lambda$checkDiscard$2();
                        break;
                }
            }
        }).makeRed(-2).show();
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.currentUserPremiumStatusChanged) {
            updateSendButtonLocked();
        }
    }

    @Override
    public final boolean disableBottomFade() {
        return true;
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        RichEditorHistory richEditorHistory;
        int action = keyEvent.getAction();
        RichEditorListView richEditorListView = this.listView;
        if (action != 0 || keyEvent.getKeyCode() != 47 || !keyEvent.isCtrlPressed()) {
            if (richEditorListView.handleKeyEvent(keyEvent)) {
                return true;
            }
            return super.dispatchKeyEvent(keyEvent);
        }
        if ((this.parentAlert.baseFragment instanceof ChatActivity) && (richEditorHistory = richEditorListView.history) != null && richEditorHistory.canUndo() && persistDraft()) {
            FactCheckController$$ExternalSyntheticOutline0.m(R.string.RichEditorDraftSaved, BulletinFactory.of(this.toolbar, this.resourcesProvider), R.raw.contact_check);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        EmojiView emojiView;
        RichEditorListView richEditorListView = this.listView;
        boolean zIsInSelectionMode = richEditorListView.textSelectionHelper.isInSelectionMode();
        TextSelectionHelper.TextSelectionOverlay textSelectionOverlay = richEditorListView.textSelectionOverlay;
        if (zIsInSelectionMode && textSelectionOverlay.onTouchEvent(motionEvent)) {
            return true;
        }
        int height = (((!this.emojiSearchOpened || (emojiView = this.emojiView) == null) ? getHeight() - this.emojiPadding : (int) emojiView.getY()) - AndroidUtilities.dp(60.0f)) - this.attachRaise;
        if (motionEvent.getAction() == 0 && this.emojiViewVisible && motionEvent.getY() < height) {
            hideEmojiPopup$1(false);
        }
        if ((motionEvent.getAction() != 0 || (motionEvent.getY() > AndroidUtilities.dp(60.0f) && motionEvent.getY() < height)) && textSelectionOverlay.checkOnTap(motionEvent)) {
            motionEvent.setAction(3);
        }
        if (motionEvent.getY() >= height || !richEditorListView.handleSelectionTouch(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override
    public int getCurrentItemTop() {
        RichEditorListView richEditorListView = this.listView;
        if (richEditorListView.getChildCount() <= 0) {
            int paddingTop = richEditorListView.getPaddingTop();
            this.currentItemTop = paddingTop;
            richEditorListView.setTopGlowOffset(paddingTop);
            return Integer.MAX_VALUE;
        }
        int top = Integer.MAX_VALUE;
        boolean z = false;
        for (int i = 0; i < richEditorListView.getChildCount(); i++) {
            View childAt = richEditorListView.getChildAt(i);
            int childAdapterPosition = richEditorListView.getChildAdapterPosition(childAt);
            if (childAdapterPosition == 0) {
                z = true;
            }
            if (childAdapterPosition >= 0 && childAt.getTop() < top) {
                top = childAt.getTop();
            }
        }
        if (top == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        richEditorListView.setTopGlowOffset(Math.max(0, top));
        int i2 = top - AndroidUtilities.statusBarHeight;
        int iDp = AndroidUtilities.dp(7.0f);
        if (i2 < AndroidUtilities.dp(7.0f) || !z) {
            i2 = iDp;
        }
        this.currentItemTop = i2;
        return i2;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return (this.listView.getPaddingTop() - AndroidUtilities.statusBarHeight) - ActionBar.getCurrentActionBarHeight();
    }

    public TextSelectionHelper.ArticleTextSelectionHelper getTextSelectionHelper() {
        return this.listView.getTextSelectionHelper();
    }

    public final void hideEmojiPopup$1(boolean z) {
        if (this.emojiSearchOpened) {
            this.emojiSearchOpened = false;
            EmojiView emojiView = this.emojiView;
            if (emojiView != null) {
                emojiView.closeSearch(false);
                if (!z) {
                    this.emojiView.hideSearchKeyboard();
                }
            }
        }
        this.emojiTargetEditText = null;
        EmojiView emojiView2 = this.emojiView;
        if (emojiView2 != null) {
            emojiView2.setTranslationY(0.0f);
            this.emojiView.setVisibility(8);
        }
        this.emojiViewVisible = false;
        this.emojiPadding = 0;
        RichEditorToolbar richEditorToolbar = this.toolbar;
        if (richEditorToolbar != null) {
            richEditorToolbar.setEmojiOpened(false);
        }
        updateAttachButtons(false);
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    public final void lambda$checkDiscard$1() {
        this.parentAlert.lambda$showGiftOfferSheet$15();
    }

    public final void lambda$checkDiscard$2() {
        persistDraft();
        this.parentAlert.lambda$showGiftOfferSheet$15();
    }

    public final void lambda$showConversionSheet$27() {
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            return;
        }
        new PremiumFeatureBottomSheet(this.parentAlert.baseFragment, getContext(), this.currentAccount, false, 43, true, null).show();
    }

    public final void lambda$showSendPreview$20(long j) {
        AlertsCreator.createScheduleDatePickerDialog(this.parentAlert.baseFragment.getParentActivity(), j, new AlertsCreator.ScheduleDatePickerDelegate() {
            @Override
            public final void didSelectDate(boolean z, int i, int i2) {
                ChatAttachAlertRichLayout.this.sendSelectedItems(z, i, i2, 0L, false);
                ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
                MessageSendPreview messageSendPreview = chatAttachAlertRichLayout.messageSendPreview;
                if (messageSendPreview != null) {
                    messageSendPreview.dismissInstant();
                    chatAttachAlertRichLayout.messageSendPreview = null;
                }
            }
        }, this.resourcesProvider);
    }

    public final void layoutBottomPanels() {
        float f;
        float f2;
        int iDp = this.emojiSearchOpened ? AndroidUtilities.dp(245.0f) : this.emojiPadding;
        EmojiView emojiView = this.emojiView;
        if (emojiView != null) {
            if (this.emojiViewVisible) {
                f2 = (this.emojiPadding - iDp) + (this.emojiSearchOpened ? -this.parentAlert.currentPanTranslationY : 0.0f);
            } else {
                f2 = 0.0f;
            }
            emojiView.setTranslationY(f2);
        }
        RichEditorToolbar richEditorToolbar = this.toolbar;
        if (richEditorToolbar != null) {
            boolean z = this.emojiViewVisible;
            if (z) {
                f = iDp;
            } else {
                f = (this.keyboardVisible || this.emojiPadding > 0) ? 0 : AndroidUtilities.navigationBarHeight;
            }
            if (!z || this.emojiSearchOpened) {
                f += this.parentAlert.currentPanTranslationY;
            }
            richEditorToolbar.getBottomContainer().animate().cancel();
            richEditorToolbar.getBottomContainer().setTranslationY(-f);
            boolean z2 = this.emojiViewVisible;
            float f3 = z2 ? iDp : 0.0f;
            if (!z2 || this.emojiSearchOpened) {
                f3 += this.parentAlert.currentPanTranslationY;
            }
            richEditorToolbar.setBottomGradientTranslationY(-f3);
            if (this.lastAttachRise != this.attachRaise) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate = richEditorToolbar.getBottomInnerContainer().animate();
                int i = this.attachRaise;
                this.lastAttachRise = i;
                viewPropertyAnimatorAnimate.translationY(-i).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
            }
        }
    }

    @Override
    public final int needsActionBar() {
        return 0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        updateSendButtonLocked();
    }

    @Override
    public final boolean onBackPressed() {
        boolean z = this.emojiSearchOpened;
        if (z) {
            if (z) {
                this.emojiSearchOpened = false;
                EmojiView emojiView = this.emojiView;
                if (emojiView != null) {
                    emojiView.closeSearch(false);
                    this.emojiView.hideSearchKeyboard();
                }
                layoutBottomPanels();
                return false;
            }
        } else {
            if (this.emojiViewVisible) {
                hideEmojiPopup$1(false);
                return false;
            }
            if (!this.listView.deselectIfAny()) {
                if (checkDiscard()) {
                    return super.onBackPressed();
                }
                return true;
            }
        }
        return false;
    }

    public final void onBlockButtonClicked(int i, View view) {
        boolean zCanIndentTarget;
        int iIndexOf;
        int i2;
        BlockRow blockRowRowForCell;
        int iIndexOf2;
        int i3;
        RichTableCellHost richTableCellHostFindHostContaining;
        RichEditorListView richEditorListView = this.listView;
        BlockRow blockRowFindFocusedRow = richEditorListView.findFocusedRow();
        boolean z = false;
        if (i == 1) {
            ItemOptions itemOptions = this.menu;
            if (itemOptions != null) {
                itemOptions.dismiss();
            }
            ItemOptions itemOptionsDontFocus = ItemOptions.makeOptions((ViewGroup) this, this.resourcesProvider, view, true).dontFocus();
            ItemOptions itemOptionsMakeSwipeback = itemOptionsDontFocus.makeSwipeback();
            int i4 = this.currentAccount;
            boolean z2 = (MessagesController.getInstance(i4).richEditorAllowed() || UserConfig.getInstance(i4).isPremium()) ? false : true;
            itemOptionsMakeSwipeback.add(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new RichEditor$$ExternalSyntheticLambda30(8, itemOptionsDontFocus));
            itemOptionsMakeSwipeback.addGap();
            TL_iv.PageBlock pageblockheading1 = new TL_iv.pageBlockHeading1();
            int i5 = R.drawable.iv_h1;
            addHeadingItem(itemOptionsMakeSwipeback, blockRowFindFocusedRow, pageblockheading1, i5, LocaleController.getString(R.string.ArticleHeading1), SharedConfig.fontSize + 2, itemOptionsDontFocus);
            addHeadingItem(itemOptionsMakeSwipeback, blockRowFindFocusedRow, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, LocaleController.getString(R.string.ArticleHeading2), SharedConfig.fontSize + 1, itemOptionsDontFocus);
            addHeadingItem(itemOptionsMakeSwipeback, blockRowFindFocusedRow, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, LocaleController.getString(R.string.ArticleHeading3), SharedConfig.fontSize, itemOptionsDontFocus);
            addHeadingItem(itemOptionsMakeSwipeback, blockRowFindFocusedRow, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, LocaleController.getString(R.string.ArticleHeading4), SharedConfig.fontSize - 1, itemOptionsDontFocus);
            addHeadingItem(itemOptionsMakeSwipeback, blockRowFindFocusedRow, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, LocaleController.getString(R.string.ArticleHeading5), SharedConfig.fontSize - 2, itemOptionsDontFocus);
            addHeadingItem(itemOptionsMakeSwipeback, blockRowFindFocusedRow, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, LocaleController.getString(R.string.ArticleHeading6), SharedConfig.fontSize - 3, itemOptionsDontFocus);
            boolean z3 = blockRowFindFocusedRow != null && RichEditorListView.isHeading(blockRowFindFocusedRow.block);
            RichEditor.RequiresPremiumDrawable requiresPremiumDrawable = new RichEditor.RequiresPremiumDrawable(getContext(), i5);
            requiresPremiumDrawable.setPremium(z2);
            itemOptionsDontFocus.addChecked(z3, requiresPremiumDrawable, LocaleController.getString(R.string.ArticleHeading), new RichEditor$$ExternalSyntheticLambda40(itemOptionsDontFocus, itemOptionsMakeSwipeback, 4));
            itemOptionsDontFocus.addChecked(blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text, LocaleController.getString(R.string.ArticleText), new ChatAttachAlertRichLayout$$ExternalSyntheticLambda25(this, blockRowFindFocusedRow, 4));
            itemOptionsDontFocus.addChecked(blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, LocaleController.getString(R.string.ArticleQuote), new ChatAttachAlertRichLayout$$ExternalSyntheticLambda25(this, blockRowFindFocusedRow, 5));
            boolean z4 = blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockPullquote);
            RichEditor.RequiresPremiumDrawable requiresPremiumDrawable2 = new RichEditor.RequiresPremiumDrawable(getContext(), R.drawable.iv_pullquote);
            requiresPremiumDrawable2.setPremium(z2);
            itemOptionsDontFocus.addChecked(z4, requiresPremiumDrawable2, LocaleController.getString(R.string.ArticlePullquote), new ChatAttachAlertRichLayout$$ExternalSyntheticLambda25(this, blockRowFindFocusedRow, 6));
            itemOptionsDontFocus.addChecked(blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, LocaleController.getString(R.string.ArticleCode), new ChatAttachAlertRichLayout$$ExternalSyntheticLambda25(this, blockRowFindFocusedRow, 7));
            if (blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockFooter)) {
                z = true;
            }
            RichEditor.RequiresPremiumDrawable requiresPremiumDrawable3 = new RichEditor.RequiresPremiumDrawable(getContext(), R.drawable.iv_footer);
            requiresPremiumDrawable3.setPremium(z2);
            itemOptionsDontFocus.addChecked(z, requiresPremiumDrawable3, LocaleController.getString(R.string.ArticleFooter), new ChatAttachAlertRichLayout$$ExternalSyntheticLambda25(this, blockRowFindFocusedRow, 8));
            this.menu = itemOptionsDontFocus.show();
            return;
        }
        BlockRow blockRow = null;
        pageblockmath = null;
        TL_iv.pageBlockMath pageblockmath = null;
        pagetablecell = null;
        TL_iv.pageTableCell pagetablecell = null;
        blockRow = null;
        blockRow = null;
        if (i != 2) {
            if (i != 4) {
                if (i != 7) {
                    if (i != 9) {
                        return;
                    }
                    richEditorListView.insertDetails();
                    return;
                } else {
                    if (blockRowFindFocusedRow != null) {
                        TL_iv.PageBlock pageBlock = blockRowFindFocusedRow.block;
                        if (pageBlock instanceof TL_iv.pageBlockMath) {
                            pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                        }
                    }
                    showEditLatexSheet(getContext(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new RichEditor$$ExternalSyntheticLambda51(2, this, pageblockmath), this.resourcesProvider);
                    return;
                }
            }
            RichTableCell richTableCell = richEditorListView.activeCellSelectionTable;
            if (richTableCell == null) {
                View viewFindFocus = richEditorListView.findFocus();
                RichTableCell richTableCellFindTableCellAncestor = viewFindFocus instanceof RichEditText ? RichEditorListView.findTableCellAncestor((RichEditText) viewFindFocus) : null;
                if (richTableCellFindTableCellAncestor != null && richTableCellFindTableCellAncestor.getModel() != null) {
                    View viewFindFocus2 = richEditorListView.findFocus();
                    if ((viewFindFocus2 instanceof RichEditText) && (richTableCellHostFindHostContaining = richTableCellFindTableCellAncestor.findHostContaining((RichEditText) viewFindFocus2)) != null) {
                        pagetablecell = richTableCellHostFindHostContaining.cell;
                    }
                    if (pagetablecell != null) {
                        richEditorListView.beginCellSelection(richTableCellFindTableCellAncestor);
                        if (richTableCellFindTableCellAncestor.selectedCells.add(pagetablecell)) {
                            richTableCellFindTableCellAncestor.grid.invalidate();
                            richTableCellFindTableCellAncestor.notifyCellSelectionChanged();
                        }
                        richTableCell = richTableCellFindTableCellAncestor;
                    }
                }
            }
            if (richTableCell == null || richTableCell.getModel() == null || richTableCell.selectedCells.isEmpty()) {
                richEditorListView.addBlock(RichTextCell.newEmptyTable(2, 2));
                return;
            } else {
                richEditorListView.showTableCellMenu(richTableCell);
                return;
            }
        }
        ItemOptions itemOptions2 = this.menu;
        if (itemOptions2 != null) {
            itemOptions2.dismiss();
        }
        final ItemOptions itemOptionsDontFocus2 = ItemOptions.makeOptions(this, this.resourcesProvider, view).dontFocus();
        itemOptionsDontFocus2.addChecked(blockRowFindFocusedRow == null || !blockRowFindFocusedRow.isInList(), R.drawable.field_carret_empty, LocaleController.getString(R.string.ArticleNone), new ChatAttachAlertRichLayout$$ExternalSyntheticLambda25(this, blockRowFindFocusedRow, 0)).addChecked((blockRowFindFocusedRow == null || !blockRowFindFocusedRow.isInList() || blockRowFindFocusedRow.isChecklist() || blockRowFindFocusedRow.isOrdered()) ? false : true, R.drawable.iv_list, LocaleController.getString(R.string.ArticleListBulleted), new ChatAttachAlertRichLayout$$ExternalSyntheticLambda25(this, blockRowFindFocusedRow, 1)).addChecked(blockRowFindFocusedRow != null && blockRowFindFocusedRow.isInList() && !blockRowFindFocusedRow.isChecklist() && blockRowFindFocusedRow.isOrdered(), R.drawable.iv_ordered_list, LocaleController.getString(R.string.ArticleListNumbered), new ChatAttachAlertRichLayout$$ExternalSyntheticLambda25(this, blockRowFindFocusedRow, 2)).addChecked(blockRowFindFocusedRow != null && blockRowFindFocusedRow.isInList() && blockRowFindFocusedRow.isChecklist() && !blockRowFindFocusedRow.isOrdered(), R.drawable.iv_todo, LocaleController.getString(R.string.ArticleListTodo), new ChatAttachAlertRichLayout$$ExternalSyntheticLambda25(this, blockRowFindFocusedRow, 3)).addChecked(blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockDetails), R.drawable.iv_details, LocaleController.getString(R.string.ArticleToggleBlock), new RichEditorListView$$ExternalSyntheticLambda4(richEditorListView, 2));
        int[] iArrSelectionRowRange = richEditorListView.selectionRowRange();
        ArrayList arrayList = richEditorListView.rows;
        RichEditorListView.AnonymousClass1 anonymousClass1 = richEditorListView.textSelectionHelper;
        if (iArrSelectionRowRange != null) {
            int i6 = iArrSelectionRowRange[0];
            while (true) {
                if (i6 > iArrSelectionRowRange[1]) {
                    zCanIndentTarget = false;
                    break;
                } else {
                    if (richEditorListView.canIndentTarget((BlockRow) arrayList.get(i6))) {
                        zCanIndentTarget = true;
                        break;
                    }
                    i6++;
                }
            }
        } else {
            BlockRow blockRowFindFocusedRow2 = richEditorListView.findFocusedRow();
            if (blockRowFindFocusedRow2 == null && (anonymousClass1 == null || (i3 = anonymousClass1.startViewPosition) < 0 || (blockRowFindFocusedRow2 = richEditorListView.rowForCell(i3)) == null)) {
                blockRowFindFocusedRow2 = null;
            }
            zCanIndentTarget = richEditorListView.canIndentTarget(blockRowFindFocusedRow2);
        }
        int[] iArrSelectionRowRange2 = richEditorListView.selectionRowRange();
        if (iArrSelectionRowRange2 == null) {
            BlockRow blockRowFindFocusedRow3 = richEditorListView.findFocusedRow();
            if (blockRowFindFocusedRow3 != null) {
                blockRow = blockRowFindFocusedRow3;
            } else if (anonymousClass1 != null && (i2 = anonymousClass1.startViewPosition) >= 0 && (blockRowRowForCell = richEditorListView.rowForCell(i2)) != null) {
                blockRow = blockRowRowForCell;
            }
            if (blockRow != null && (iIndexOf2 = arrayList.indexOf(blockRow)) >= 0 && blockRow.level > 0 && iIndexOf2 >= 0 && iIndexOf2 < arrayList.size() && ((BlockRow) arrayList.get(iIndexOf2)).level > 0) {
                z = true;
                break;
            }
        } else {
            for (int i7 = iArrSelectionRowRange2[0]; i7 <= iArrSelectionRowRange2[1]; i7++) {
                BlockRow blockRow2 = (BlockRow) arrayList.get(i7);
                if (blockRow2 != null && (iIndexOf = arrayList.indexOf(blockRow2)) >= 0 && blockRow2.level > 0 && iIndexOf >= 0 && iIndexOf < arrayList.size() && ((BlockRow) arrayList.get(iIndexOf)).level > 0) {
                    z = true;
                    break;
                }
            }
        }
        if (zCanIndentTarget || z) {
            itemOptionsDontFocus2.addGap();
            if (zCanIndentTarget) {
                final int i8 = 0;
                itemOptionsDontFocus2.add(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable(this) {
                    public final ChatAttachAlertRichLayout f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i8) {
                            case 0:
                                this.f$0.listView.indentSelection(false);
                                itemOptionsDontFocus2.dismiss();
                                break;
                            default:
                                this.f$0.listView.indentSelection(true);
                                itemOptionsDontFocus2.dismiss();
                                break;
                        }
                    }
                });
            }
            if (z) {
                final int i9 = 1;
                itemOptionsDontFocus2.add(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable(this) {
                    public final ChatAttachAlertRichLayout f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i9) {
                            case 0:
                                this.f$0.listView.indentSelection(false);
                                itemOptionsDontFocus2.dismiss();
                                break;
                            default:
                                this.f$0.listView.indentSelection(true);
                                itemOptionsDontFocus2.dismiss();
                                break;
                        }
                    }
                });
            }
        }
        this.menu = itemOptionsDontFocus2.forceTop(true).show();
    }

    @Override
    public final void onContainerTranslationUpdated(float f) {
        super.onContainerTranslationUpdated(f);
        layoutBottomPanels();
    }

    @Override
    public final void onDestroy() {
        MessageSendPreview messageSendPreview = this.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.dismissInstant();
            this.messageSendPreview = null;
        }
        TooltipPopup tooltipPopup = this.commandSuggestions;
        if (tooltipPopup != null) {
            tooltipPopup.hide();
        }
        RichEditorListView richEditorListView = this.listView;
        if (richEditorListView != null) {
            richEditorListView.destroy();
            richEditorListView.loadedRichMessage = null;
            richEditorListView.pendingMediaRow = null;
            richEditorListView.pendingInsertRow = null;
            richEditorListView.history = new RichEditorHistory(richEditorListView.historyDelegate);
            ArrayList arrayList = richEditorListView.rows;
            arrayList.clear();
            arrayList.add(new BlockRow(new TL_iv.pageBlockHeading1(), 0, 0));
            arrayList.add(new BlockRow(new TL_iv.pageBlockParagraph(), 0, 0));
            richEditorListView.adapter.update(false);
            richEditorListView.history.resetBaseline();
            RichEditorListView.Delegate delegate = richEditorListView.delegate;
            if (delegate != null) {
                delegate.onHistoryChanged();
            }
        }
        EmojiView emojiView = this.emojiView;
        if (emojiView != null) {
            emojiView.onDestroy();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public final boolean onDismiss() {
        RichEditorListView richEditorListView = this.listView;
        if (richEditorListView != null) {
            richEditorListView.destroy();
            richEditorListView.loadedRichMessage = null;
            richEditorListView.pendingMediaRow = null;
            richEditorListView.pendingInsertRow = null;
            richEditorListView.history = new RichEditorHistory(richEditorListView.historyDelegate);
            ArrayList arrayList = richEditorListView.rows;
            arrayList.clear();
            arrayList.add(new BlockRow(new TL_iv.pageBlockHeading1(), 0, 0));
            arrayList.add(new BlockRow(new TL_iv.pageBlockParagraph(), 0, 0));
            richEditorListView.adapter.update(false);
            richEditorListView.history.resetBaseline();
            RichEditorListView.Delegate delegate = richEditorListView.delegate;
            if (delegate != null) {
                delegate.onHistoryChanged();
            }
        }
        return super.onDismiss();
    }

    @Override
    public final boolean onDismissWithTouchOutside() {
        if (checkDiscard()) {
            return super.onDismissWithTouchOutside();
        }
        return false;
    }

    @Override
    public final void onHidden() {
    }

    @Override
    public final void onHide() {
        TooltipPopup tooltipPopup = this.commandSuggestions;
        if (tooltipPopup != null) {
            tooltipPopup.hide();
        }
        if (this.emojiViewVisible) {
            hideEmojiPopup$1(false);
        }
    }

    @Override
    public final void onPanTransitionEnd() {
        super.onPanTransitionEnd();
        this.keyboardVisible = this.parentAlert.sizeNotifierFrameLayout.measureKeyboardHeight() > AndroidUtilities.dp(20.0f);
        layoutBottomPanels();
        updateToolbarTopOffset();
    }

    @Override
    public final void onPanTransitionStart(boolean z, int i) {
        super.onPanTransitionStart(z, i);
        this.keyboardVisible = z;
        layoutBottomPanels();
        if (z && this.emojiViewVisible && !this.emojiSearchOpened) {
            hideEmojiPopup$1(false);
        }
        updateToolbarTopOffset();
    }

    @Override
    public final void onPreMeasure(int i, int i2) {
        int iDp;
        int i3;
        ItemOptions itemOptions;
        boolean z = this.keyboardVisible;
        boolean z2 = this.parentAlert.sizeNotifierFrameLayout.measureKeyboardHeight() > AndroidUtilities.dp(20.0f);
        this.keyboardVisible = z2;
        if (!z2 && z && (itemOptions = this.menu) != null) {
            itemOptions.dismiss();
            this.menu = null;
        }
        if (this.keyboardVisible || this.emojiPadding > AndroidUtilities.dp(20.0f)) {
            iDp = AndroidUtilities.dp(52.0f);
            this.parentAlert.setAllowNestedScroll(false);
        } else {
            if (AndroidUtilities.isTablet()) {
                i3 = (i2 / 5) * 2;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i3 = (int) (i2 / 3.5f);
                } else {
                    i3 = (i2 / 5) * 2;
                }
            }
            iDp = i3 - AndroidUtilities.dp(52.0f);
            if (iDp < 0) {
                iDp = 0;
            }
            this.parentAlert.setAllowNestedScroll(true);
        }
        int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + iDp;
        RichEditorListView richEditorListView = this.listView;
        int iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(110.0f, (this.keyboardVisible || this.emojiPadding > 0) ? 0 : AndroidUtilities.navigationBarHeight, (richEditorListView.hasAnyText() || this.emojiViewVisible) ? 0 : this.parentAlert.getTypeButtonsHeight()) + this.emojiPadding;
        if (richEditorListView.getPaddingTop() != currentActionBarHeight || richEditorListView.getPaddingBottom() != iM) {
            this.ignoreLayout = true;
            richEditorListView.setPaddingWithoutRequestLayout(0, currentActionBarHeight, 0, iM);
            this.ignoreLayout = false;
        }
        updateToolbarTopOffset();
    }

    @Override
    public final void onShow(ChatAttachAlert.AttachAlertLayout attachAlertLayout) {
        this.parentAlert.actionBar.setTitle("");
        this.listView.adapter.update(false);
        updateAttachButtons(false);
        post(new ChatAttachAlertRichLayout$$ExternalSyntheticLambda2(this, 4));
    }

    public final void openAttach(int i, int i2) {
        if (this.parentAlert.baseFragment == null) {
            return;
        }
        final ChatAttachAlert chatAttachAlert = new ChatAttachAlert(getContext(), this.parentAlert.baseFragment, false, false, true, this.resourcesProvider);
        chatAttachAlert.setDelegate(new ChatAttachAlert.ChatAttachViewDelegate() {
            @Override
            public final void didPressedButton(int i3, boolean z, boolean z2, int i4, int i5, long j, boolean z3, boolean z4, long j2) {
                ChatAttachAlert chatAttachAlert2 = chatAttachAlert;
                ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
                if (i3 == 7 || i3 == 8) {
                    HashMap<Object, Object> selectedPhotos = chatAttachAlert2.getPhotoLayout().getSelectedPhotos();
                    ArrayList<Object> selectedPhotosOrder = chatAttachAlert2.getPhotoLayout().getSelectedPhotosOrder();
                    RichEditorListView richEditorListView = chatAttachAlertRichLayout.listView;
                    BlockRow blockRow = richEditorListView.pendingMediaRow;
                    richEditorListView.pendingMediaRow = null;
                    for (int i6 = 0; i6 < selectedPhotosOrder.size(); i6++) {
                        Object obj = selectedPhotos.get(selectedPhotosOrder.get(i6));
                        if (obj instanceof MediaController.PhotoEntry) {
                            if (blockRow != null) {
                                chatAttachAlertRichLayout.listView.addMediaToRow(blockRow, (MediaController.PhotoEntry) obj);
                                break;
                            } else {
                                chatAttachAlertRichLayout.listView.attachMedia((MediaController.PhotoEntry) obj);
                                break;
                            }
                        }
                    }
                }
                chatAttachAlertRichLayout.listView.pendingMediaRow = null;
                chatAttachAlert2.dismiss(true);
            }

            @Override
            public final void didSelectBot(TLRPC.User user) {
            }

            @Override
            public final void doOnIdle(Runnable runnable) {
                NotificationCenter.getInstance(ChatAttachAlertRichLayout.this.currentAccount).doOnIdle(runnable);
            }

            @Override
            public final View getRevealView() {
                return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$getRevealView(this);
            }

            @Override
            public final boolean needEnterComment() {
                return false;
            }

            @Override
            public final void onCameraOpened() {
            }

            @Override
            public final void onWallpaperSelected(Object obj) {
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$onWallpaperSelected(this, obj);
            }

            @Override
            public final void openAvatarsSearch() {
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$openAvatarsSearch(this);
            }

            @Override
            public final boolean selectItemOnClicking() {
                return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$selectItemOnClicking(this);
            }

            @Override
            public final void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i3, int i4, long j, boolean z2, long j2) {
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$sendAudio(this, arrayList, charSequence, z, i3, i4, j, z2, j2);
            }
        });
        chatAttachAlert.getPhotoLayout().loadGalleryPhotos();
        chatAttachAlert.setMaxSelectedPhotos(1, true);
        chatAttachAlert.enablePollAttachMode(i);
        chatAttachAlert.setLocationActivityDelegate(new ChatAttachAlertRichLayout$$ExternalSyntheticLambda18(this, chatAttachAlert));
        chatAttachAlert.setAudioSelectDelegate(new ChatAttachAlertRichLayout$$ExternalSyntheticLambda18(this, chatAttachAlert));
        chatAttachAlert.setDocumentsDelegate(new ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate() {
            @Override
            public final void didSelectFiles(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i3, int i4, long j, boolean z2, long j2) {
                ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
                if (arrayList != null && !arrayList.isEmpty()) {
                    chatAttachAlertRichLayout.listView.attachDocument((String) arrayList.get(0));
                } else if (arrayList3 != null && !arrayList3.isEmpty()) {
                    RichEditorListView richEditorListView = chatAttachAlertRichLayout.listView;
                    MessageObject messageObject = (MessageObject) arrayList3.get(0);
                    richEditorListView.getClass();
                    if (messageObject != null && messageObject.getDocument() != null) {
                        TLRPC.Document document = messageObject.getDocument();
                        TLRPC.Message message = messageObject.messageOwner;
                        richEditorListView.attachDocument(document, message != null ? message.attachPath : null);
                    }
                }
                chatAttachAlert.dismiss(true);
            }

            @Override
            public final void didSelectPhotos(ArrayList arrayList, boolean z, int i3, int i4, long j) {
                ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate.CC.$default$didSelectPhotos(this, arrayList, z, i3, i4, j);
            }

            @Override
            public final void startDocumentSelectActivity() {
                try {
                    Intent intent = new Intent("android.intent.action.GET_CONTENT");
                    intent.setType("*/*");
                    ((ChatAttachAlert.AttachAlertLayout) ChatAttachAlertRichLayout.this).parentAlert.baseFragment.startActivityForResult(intent, 21);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }

            @Override
            public final void startMusicSelectActivity() {
                ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate.CC.$default$startMusicSelectActivity(this);
            }
        });
        chatAttachAlert.init();
        if (i2 != 0) {
            chatAttachAlert.openAttachLayoutForType(i2);
        }
        chatAttachAlert.setFocusable(true);
        chatAttachAlert.show();
    }

    public final void openLocationPicker(BlockRow blockRow) {
        BaseFragment baseFragment = this.parentAlert.baseFragment;
        if (baseFragment != null && blockRow != null && (blockRow.block instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(baseFragment)) {
            ChatAttachAlert chatAttachAlert = new ChatAttachAlert(getContext(), this.parentAlert.baseFragment, false, false, false, null);
            chatAttachAlert.setDelegate(new AnonymousClass4());
            chatAttachAlert.setLocationPicker();
            chatAttachAlert.setLocationActivityDelegate(new RichEditor$$ExternalSyntheticLambda60(this, blockRow, chatAttachAlert, 16));
            chatAttachAlert.init();
            chatAttachAlert.show();
        }
    }

    public final boolean persistDraft() {
        TL_iv.RichMessage richMessage;
        BaseFragment baseFragment = this.parentAlert.baseFragment;
        if (!(baseFragment instanceof ChatActivity)) {
            return false;
        }
        ChatActivity chatActivity = (ChatActivity) baseFragment;
        RichEditorListView richEditorListView = this.listView;
        RichEditorHistory richEditorHistory = richEditorListView.history;
        if (richEditorHistory == null || !richEditorHistory.canUndo()) {
            return false;
        }
        if (richEditorListView.hasAnyText()) {
            ArrayList<TL_iv.PageBlock> arrayListFlattenRowsToBlocks = richEditorListView.flattenRowsToBlocks();
            if (arrayListFlattenRowsToBlocks.isEmpty()) {
                richMessage = null;
            } else {
                TL_iv.RichMessage richMessage2 = new TL_iv.RichMessage();
                richMessage2.blocks = arrayListFlattenRowsToBlocks;
                richMessage2.photos = richEditorListView.collectPhotos();
                richMessage2.documents = richEditorListView.collectDocuments();
                richMessage = richMessage2;
            }
        } else {
            richMessage = null;
        }
        AccountInstance.getInstance(this.currentAccount).getMediaDataController().saveDraft(chatActivity.getDialogId(), chatActivity.getDraftThreadId(), "", null, null, null, null, 0L, false, false, richMessage);
        TL_iv.RichMessage richMessage3 = richMessage;
        if (chatActivity.getChatActivityEnterView() == null) {
            return true;
        }
        chatActivity.getChatActivityEnterView().setRichDraftPreview(richMessage3);
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void scrollToTop() {
        this.listView.smoothScrollToPosition(0);
    }

    @Override
    public final boolean sendSelectedItems(boolean z, int i, int i2, long j, boolean z2) {
        long sendMonoForumPeerId;
        MessageObject messageObject;
        MessageObject messageObject2;
        SendMessageChatArguments messageChatSendParams;
        ChatActivityEnterView chatActivityEnterView;
        int i3 = this.currentAccount;
        boolean zRichEditorAllowed = MessagesController.getInstance(i3).richEditorAllowed();
        RichEditorListView richEditorListView = this.listView;
        if (!zRichEditorAllowed && !UserConfig.getInstance(i3).isPremium() && RichMessageConvert.isLossy(richEditorListView.rows, richEditorListView.quoteAuthors)) {
            RichEditor.openConversionSheet(getContext(), new RichEditorListView$$ExternalSyntheticLambda4(richEditorListView, 1), new ChatAttachAlertRichLayout$$ExternalSyntheticLambda2(this, 0), this.resourcesProvider);
            return false;
        }
        if (richEditorListView.hasAnyText() && !richEditorListView.hasPendingUploads()) {
            if (!richEditorListView.isWithinLimits()) {
                RichEditorToolbar richEditorToolbar = this.toolbar;
                if (richEditorToolbar != null) {
                    richEditorToolbar.setSendEnabled(richEditorListView.isWithinLimits());
                    return false;
                }
            } else if (MessagesController.getInstance(i3).richEditorAllowed()) {
                ArrayList arrayListFlattenRowsToBlocks = richEditorListView.flattenRowsToBlocks();
                if (!arrayListFlattenRowsToBlocks.isEmpty()) {
                    ArrayList arrayListCollectPhotos = richEditorListView.collectPhotos();
                    ArrayList arrayListCollectDocuments = richEditorListView.collectDocuments();
                    ArrayList arrayListCollect = RichMessageButtonUsers.collect(i3, arrayListFlattenRowsToBlocks);
                    BaseFragment baseFragment = this.parentAlert.baseFragment;
                    if (baseFragment instanceof ChatActivity) {
                        ChatActivity chatActivity = (ChatActivity) baseFragment;
                        MessageObject replyMessage = chatActivity.getReplyMessage();
                        MessageObject threadMessage = chatActivity.getThreadMessage();
                        sendMonoForumPeerId = chatActivity.getSendMonoForumPeerId();
                        messageChatSendParams = chatActivity.getMessageChatSendParams();
                        messageObject = replyMessage;
                        messageObject2 = threadMessage;
                    } else {
                        sendMonoForumPeerId = 0;
                        messageObject = null;
                        messageObject2 = null;
                        messageChatSendParams = null;
                    }
                    SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(this.parentAlert.currentAccount), arrayListFlattenRowsToBlocks, arrayListCollectPhotos, arrayListCollectDocuments, arrayListCollect, false, this.parentAlert.getDialogId(), messageObject, messageObject2, z, i, i2, messageChatSendParams, j, sendMonoForumPeerId, 0L);
                    this.parentAlert.dismiss(true);
                    return true;
                }
            } else {
                BaseFragment baseFragment2 = this.parentAlert.baseFragment;
                if ((baseFragment2 instanceof ChatActivity) && (chatActivityEnterView = ((ChatActivity) baseFragment2).getChatActivityEnterView()) != null) {
                    chatActivityEnterView.sendConvertedRichAsSimple(RichMessageConvert.rowsToSimpleMessage(richEditorListView.rows), z, i, i2);
                    this.parentAlert.dismiss(true);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.parentAlert.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final boolean shouldHideBottomButtons() {
        return !this.listView.hasAnyText();
    }

    public final boolean showSendPreview(View view) {
        int i = this.currentAccount;
        if (!UserConfig.getInstance(i).isPremium()) {
            new PremiumFeatureBottomSheet(this.parentAlert.baseFragment, getContext(), this.currentAccount, false, 43, true, null).show();
            return true;
        }
        RichEditorListView richEditorListView = this.listView;
        boolean z = false;
        if (richEditorListView.hasAnyText() && !richEditorListView.hasPendingUploads()) {
            boolean zIsWithinLimits = richEditorListView.isWithinLimits();
            RichEditorToolbar richEditorToolbar = this.toolbar;
            if (zIsWithinLimits) {
                ArrayList<TL_iv.PageBlock> arrayListFlattenRowsToBlocks = richEditorListView.flattenRowsToBlocks();
                if (!arrayListFlattenRowsToBlocks.isEmpty()) {
                    BaseFragment baseFragment = this.parentAlert.baseFragment;
                    ChatActivity chatActivity = baseFragment instanceof ChatActivity ? (ChatActivity) baseFragment : null;
                    MessageSendPreview messageSendPreview = this.messageSendPreview;
                    if (messageSendPreview != null) {
                        messageSendPreview.dismiss(false);
                        this.messageSendPreview = null;
                    }
                    MessageSendPreview messageSendPreview2 = new MessageSendPreview(getContext(), this.resourcesProvider);
                    this.messageSendPreview = messageSendPreview2;
                    messageSendPreview2.setOnDismissListener(new RichEditor$$ExternalSyntheticLambda46(this, 12));
                    long dialogId = this.parentAlert.getDialogId();
                    MessageObject replyMessage = chatActivity != null ? chatActivity.getReplyMessage() : null;
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.id = 0;
                    tL_message.out = true;
                    tL_message.peer_id = MessagesController.getInstance(i).getPeer(dialogId);
                    tL_message.from_id = MessagesController.getInstance(i).getPeer(UserConfig.getInstance(i).getClientUserId());
                    tL_message.flags2 |= 8192;
                    TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                    tL_message.rich_message = richMessage;
                    richMessage.blocks = arrayListFlattenRowsToBlocks;
                    richMessage.photos = richEditorListView.collectPhotos();
                    tL_message.rich_message.documents = richEditorListView.collectDocuments();
                    if (replyMessage != null && !replyMessage.isTopicMainMessage) {
                        TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                        tL_messageReplyHeader.flags |= 16;
                        tL_messageReplyHeader.reply_to_msg_id = replyMessage.getId();
                        tL_message.reply_to = tL_messageReplyHeader;
                    }
                    MessageObject messageObject = new MessageObject(i, tL_message, false, false);
                    if (replyMessage != null && !replyMessage.isTopicMainMessage) {
                        messageObject.replyMessageObject = replyMessage;
                    }
                    messageObject.sendPreview = true;
                    messageObject.isOutOwnerCached = Boolean.TRUE;
                    messageObject.generateLayout(null);
                    messageObject.notime = true;
                    this.messageSendPreview.setMessageObjects(MediaController$$ExternalSyntheticOutline1.m(messageObject));
                    ChatActivityEnterView.SendButton sendButton = richEditorToolbar.getSendButton();
                    sendButton.setScaleX(1.0f);
                    sendButton.setScaleY(1.0f);
                    ChatActivityEnterView.SendButton sendButton2 = this.messageSendPreview.setSendButton(sendButton, true, new BotAdView$$ExternalSyntheticLambda2(this, 28));
                    if (sendButton2 != null) {
                        sendButton2.setBackground(new RichEditor.ShadowWrapperDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), getThemedColor(Theme.key_featuredStickers_addButton))));
                        this.messageSendPreview.setSendButtonWidth(AndroidUtilities.dp(44.0f));
                    }
                    ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this, this.resourcesProvider, sendButton);
                    if (chatActivity != null && UserObject.isUserSelf(chatActivity.getCurrentUser())) {
                        z = true;
                    }
                    if (chatActivity != null && chatActivity.canScheduleMessage()) {
                        itemOptionsMakeOptions.add(R.drawable.msg_calendar2, LocaleController.getString(z ? R.string.SetReminder : R.string.ScheduleMessage), new RichEditor$$ExternalSyntheticLambda48(this, dialogId, 22));
                        if (!z && dialogId > 0) {
                            itemOptionsMakeOptions.add(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new ChatAttachAlertRichLayout$$ExternalSyntheticLambda2(this, 1));
                        }
                    }
                    if (!z) {
                        itemOptionsMakeOptions.add(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ChatAttachAlertRichLayout$$ExternalSyntheticLambda2(this, 2));
                    }
                    itemOptionsMakeOptions.setupSelectors();
                    this.messageSendPreview.setItemOptions(itemOptionsMakeOptions);
                    this.messageSendPreview.show();
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    return true;
                }
            } else if (richEditorToolbar != null) {
                richEditorToolbar.setSendEnabled(richEditorListView.isWithinLimits());
                return false;
            }
        }
        return false;
    }

    public final void updateAttachButtons(boolean z) {
        int typeButtonsHeight = 0;
        boolean z2 = this.listView.hasAnyText() || this.emojiViewVisible;
        this.parentAlert.setTypeButtonsHidden(z2, z);
        if (!z2) {
            ChatAttachAlert chatAttachAlert = this.parentAlert;
            if (!chatAttachAlert.pinnedToTop) {
                typeButtonsHeight = chatAttachAlert.getTypeButtonsHeight();
            }
        }
        this.attachRaise = typeButtonsHeight;
        layoutBottomPanels();
        if (this.attachButtonsShown == z2) {
            this.attachButtonsShown = !z2;
            if (this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }
    }

    public final void updateFormattingButtons() {
        int i;
        boolean z;
        boolean z2;
        int i2;
        RichEditorListView richEditorListView = this.listView;
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper = richEditorListView.getTextSelectionHelper();
        RichEditorToolbar richEditorToolbar = this.toolbar;
        if (richEditorToolbar == null || textSelectionHelper == null || !textSelectionHelper.isInSelectionMode()) {
            return;
        }
        int[] iArrSelectedRowRange = richEditorListView.selectedRowRange();
        richEditorToolbar.setQuoteState(iArrSelectedRowRange != null && richEditorListView.isRangeQuoted(iArrSelectedRowRange[0], iArrSelectedRowRange[1]));
        boolean zIsTableSelection = richEditorListView.isTableSelection();
        int[] iArr = STYLE_FLAGS;
        if (zIsTableSelection) {
            TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper2 = richEditorListView.getTextSelectionHelper();
            int i3 = textSelectionHelper2.startViewPosition;
            int i4 = textSelectionHelper2.startViewChildPosition;
            int i5 = textSelectionHelper2.endViewChildPosition;
            int i6 = textSelectionHelper2.startViewOffset;
            int i7 = textSelectionHelper2.endViewOffset;
            int i8 = 0;
            for (int i9 = 0; i9 < 8; i9++) {
                int i10 = iArr[i9];
                if (this.listView.isStyleFullyAppliedTable(i10, i3, i4, i6, i5, i7)) {
                    i8 |= i10;
                }
            }
            boolean z3 = i4 == i5;
            RichEditText richEditTextTableEditText = z3 ? richEditorListView.tableEditText(i3, i4) : null;
            int iMax = Math.max(0, Math.min(i6, i7));
            int iMax2 = richEditTextTableEditText == null ? 0 : Math.max(0, Math.min(Math.max(i6, i7), richEditTextTableEditText.length()));
            this.toolbar.setFormattingState(i8, richEditTextTableEditText != null && iMax < iMax2 && RichTextStyle.hasLink(richEditTextTableEditText.getText(), iMax, iMax2), richEditTextTableEditText != null && iMax < iMax2 && RichTextStyle.hasDate(richEditTextTableEditText.getText(), iMax, iMax2), z3, richEditorListView.canCreateInlineButtonOnSelection(), true);
            return;
        }
        if (richEditorListView.isCaptionSelection()) {
            TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper3 = richEditorListView.getTextSelectionHelper();
            RichEditText richEditTextCaptionEditText = richEditorListView.captionEditText(textSelectionHelper3.startViewPosition);
            int i11 = textSelectionHelper3.startViewOffset;
            int i12 = textSelectionHelper3.endViewOffset;
            int iMax3 = richEditTextCaptionEditText == null ? 0 : Math.max(0, Math.min(Math.min(i11, i12), richEditTextCaptionEditText.length()));
            int iMax4 = richEditTextCaptionEditText == null ? 0 : Math.max(0, Math.min(Math.max(i11, i12), richEditTextCaptionEditText.length()));
            if (richEditTextCaptionEditText == null || iMax3 >= iMax4) {
                i2 = 0;
            } else {
                int i13 = 0;
                for (int i14 = 0; i14 < 8; i14++) {
                    int i15 = iArr[i14];
                    if ((richEditTextCaptionEditText.getCurrentStyle(iMax3, iMax4) & i15) != 0) {
                        i13 |= i15;
                    }
                }
                i2 = i13;
            }
            this.toolbar.setFormattingState(i2, richEditTextCaptionEditText != null && iMax3 < iMax4 && RichTextStyle.hasLink(richEditTextCaptionEditText.getText(), iMax3, iMax4), richEditTextCaptionEditText != null && iMax3 < iMax4 && RichTextStyle.hasDate(richEditTextCaptionEditText.getText(), iMax3, iMax4), true, richEditorListView.canCreateInlineButtonOnSelection(), true);
            return;
        }
        int i16 = textSelectionHelper.startViewPosition;
        int i17 = textSelectionHelper.endViewPosition;
        int i18 = textSelectionHelper.startViewOffset;
        int i19 = textSelectionHelper.endViewOffset;
        boolean z4 = i16 >= 0 && i17 >= 0 && i17 >= i16 && i17 < richEditorListView.itemRows.size();
        if (z4) {
            int i20 = 0;
            int i21 = 0;
            while (i20 < 8) {
                int i22 = iArr[i20];
                int i23 = i19;
                if (this.listView.isStyleFullyApplied(i22, i16, i18, i17, i23)) {
                    i21 |= i22;
                }
                i20++;
                i19 = i23;
            }
            i = i21;
        } else {
            i = 0;
        }
        int i24 = i19;
        if (z4) {
            Editable editableSingleSelectionText = richEditorListView.singleSelectionText(i16, i18, i17, i24);
            if (editableSingleSelectionText == null ? false : RichTextStyle.hasLink(editableSingleSelectionText, Math.max(0, Math.min(i18, i24)), Math.max(i18, i24))) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (z4) {
            Editable editableSingleSelectionText2 = richEditorListView.singleSelectionText(i16, i18, i17, i24);
            if (editableSingleSelectionText2 == null ? false : RichTextStyle.hasDate(editableSingleSelectionText2, Math.max(0, Math.min(i18, i24)), Math.max(i18, i24))) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        this.toolbar.setFormattingState(i, z, z2, z4 && i16 == i17, richEditorListView.canCreateInlineButtonOnSelection(), !richEditorListView.isSelectionAllHeadings());
    }

    public final void updateSendButtonLocked() {
        RichEditorToolbar richEditorToolbar = this.toolbar;
        if (richEditorToolbar != null) {
            int i = this.currentAccount;
            boolean z = false;
            boolean z2 = (MessagesController.getInstance(i).richEditorAllowed() || UserConfig.getInstance(i).isPremium()) ? false : true;
            ChatActivityEnterView.SendButton sendButton = richEditorToolbar.getSendButton();
            if (z2) {
                RichEditorListView richEditorListView = this.listView;
                if (RichMessageConvert.isLossy(richEditorListView.rows, richEditorListView.quoteAuthors)) {
                    z = true;
                }
            }
            sendButton.setLocked(z);
            richEditorToolbar.setPremiumLocked(z2);
        }
    }

    public final void updateToolbarBlockType() {
        BlockRow blockRowFindFocusedRow;
        int i;
        RichEditorToolbar richEditorToolbar = this.toolbar;
        if (richEditorToolbar == null) {
            return;
        }
        RichEditorListView richEditorListView = this.listView;
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper = richEditorListView.getTextSelectionHelper();
        if (textSelectionHelper == null || !textSelectionHelper.isInSelectionMode()) {
            blockRowFindFocusedRow = richEditorListView.findFocusedRow();
        } else {
            int i2 = textSelectionHelper.startViewPosition;
            blockRowFindFocusedRow = i2 == textSelectionHelper.endViewPosition ? richEditorListView.rowForCell(i2) : null;
        }
        View viewFindFocus = richEditorListView.findFocus();
        int i3 = 0;
        if ((viewFindFocus instanceof RichEditText ? RichEditorListView.findTableCellAncestor((RichEditText) viewFindFocus) : null) != null) {
            i = 4;
        } else if (blockRowFindFocusedRow == null) {
            i = 0;
        } else if (blockRowFindFocusedRow.isChecklist() || blockRowFindFocusedRow.isInList() || blockRowFindFocusedRow.isOrdered()) {
            i = 2;
        } else {
            TL_iv.PageBlock pageBlock = blockRowFindFocusedRow.block;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                i = 2;
            } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                i = 4;
            } else if (pageBlock instanceof TL_iv.pageBlockMath) {
                i = 7;
            } else {
                if (!RichEditorListView.isHeading(pageBlock)) {
                    TL_iv.PageBlock pageBlock2 = blockRowFindFocusedRow.block;
                    if (!(pageBlock2 instanceof TL_iv.pageBlockParagraph) && !(pageBlock2 instanceof TL_iv.pageBlockPreformatted) && !(pageBlock2 instanceof TL_iv.pageBlockBlockquote) && !(pageBlock2 instanceof TL_iv.pageBlockPullquote)) {
                        i = 0;
                    }
                }
                i = 1;
            }
        }
        if (blockRowFindFocusedRow != null) {
            if (i == 1) {
                TL_iv.PageBlock pageBlock3 = blockRowFindFocusedRow.block;
                if (pageBlock3 instanceof TL_iv.pageBlockHeading1) {
                    i3 = R.drawable.iv_h1;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading2) {
                    i3 = R.drawable.iv_h2;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading3) {
                    i3 = R.drawable.iv_h3;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading4) {
                    i3 = R.drawable.iv_h4;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading5) {
                    i3 = R.drawable.iv_h5;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading6) {
                    i3 = R.drawable.iv_h6;
                } else if (pageBlock3 instanceof TL_iv.pageBlockPreformatted) {
                    i3 = R.drawable.iv_code;
                } else if (pageBlock3 instanceof TL_iv.pageBlockBlockquote) {
                    i3 = R.drawable.iv_quote;
                } else if (pageBlock3 instanceof TL_iv.pageBlockPullquote) {
                    i3 = R.drawable.iv_pullquote;
                } else if (pageBlock3 instanceof TL_iv.pageBlockFooter) {
                    i3 = R.drawable.iv_footer;
                }
            } else if (i == 2) {
                if (blockRowFindFocusedRow.isChecklist()) {
                    i3 = R.drawable.iv_todo;
                } else if (blockRowFindFocusedRow.isOrdered()) {
                    i3 = R.drawable.iv_ordered_list;
                }
            }
        }
        richEditorToolbar.setSelectedBlockType(i, i3);
    }

    public final void updateToolbarTopOffset() {
        int paddingTop;
        RichEditorToolbar richEditorToolbar = this.toolbar;
        if (richEditorToolbar == null) {
            return;
        }
        int currentActionBarHeight = (((ActionBar.getCurrentActionBarHeight() - AndroidUtilities.dp(44.0f)) / 2) + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        RichEditorListView richEditorListView = this.listView;
        if (richEditorListView.getChildCount() <= 0) {
            paddingTop = richEditorListView.getPaddingTop();
        } else {
            int top = Integer.MAX_VALUE;
            for (int i = 0; i < richEditorListView.getChildCount(); i++) {
                View childAt = richEditorListView.getChildAt(i);
                if (richEditorListView.getChildAdapterPosition(childAt) >= 0 && childAt.getTop() < top) {
                    top = childAt.getTop();
                }
            }
            paddingTop = top == Integer.MAX_VALUE ? richEditorListView.getPaddingTop() : top;
        }
        richEditorToolbar.setTopButtonsOffset(Math.max(currentActionBarHeight, paddingTop));
    }
}
