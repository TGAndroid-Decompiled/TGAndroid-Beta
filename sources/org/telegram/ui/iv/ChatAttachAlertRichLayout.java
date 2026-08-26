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
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.TooltipPopup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzlp;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Cells.EditTextCell$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.StickerEmojiCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda6;
import org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda7;
import org.telegram.ui.Components.ChatAttachAlertDocumentLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.TrendingStickersLayout;
import org.telegram.ui.MessageSendPreview;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda17;
import org.telegram.ui.UserInfoActivity$$ExternalSyntheticLambda7;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda35;

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

    public final class AnonymousClass2 {
        public AnonymousClass2() {
        }
    }

    public ChatAttachAlertRichLayout(int i, Context context, Theme.ResourcesProvider resourcesProvider, ChatAttachAlert chatAttachAlert) {
        super(context, resourcesProvider, chatAttachAlert);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        this.attachButtonsShown = true;
        this.limitCheckRunnable = new ChatAttachAlertRichLayout$$ExternalSyntheticLambda2(this, 4);
        this.currentAccount = i;
        this.occupyStatusBar = true;
        this.occupyNavigationBar = true;
        RichEditorListView richEditorListView = new RichEditorListView(context, i, resourcesProvider, new PhotoViewer.AnonymousClass14(12, this, resourcesProvider), new RichEditorListView[1]);
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
        getViewTreeObserver().addOnGlobalFocusChangeListener(new RichEditor$$ExternalSyntheticLambda14(this, 2));
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
            chatAttachAlertRichLayout.hideEmojiPopup$3(true);
            return;
        }
        if (chatAttachAlertRichLayout.emojiView == null) {
            ChatAttachAlert chatAttachAlert = chatAttachAlertRichLayout.parentAlert;
            EmojiView emojiView = new EmojiView(chatAttachAlert.baseFragment, true, false, false, chatAttachAlertRichLayout.getContext(), true, null, chatAttachAlert.sizeNotifierFrameLayout, true, chatAttachAlertRichLayout.resourcesProvider, false, false);
            chatAttachAlertRichLayout.emojiView = emojiView;
            emojiView.setVisibility(8);
            EmojiView emojiView2 = chatAttachAlertRichLayout.emojiView;
            emojiView2.fixBottomTabContainerTranslation = false;
            emojiView2.setBottomInset(AndroidUtilities.navigationBarHeight);
            View view = chatAttachAlertRichLayout.emojiView.bottomTabContainerBackground;
            if (view != null) {
                view.setVisibility(8);
            }
            chatAttachAlertRichLayout.emojiView.setDelegate(new EmojiView.EmojiViewDelegate() {
                @Override
                public final boolean canAddCaptionToGif() {
                    return false;
                }

                @Override
                public final boolean canSchedule() {
                    return false;
                }

                @Override
                public final long getDialogId() {
                    return 0L;
                }

                @Override
                public final float getProgressToSearchOpened() {
                    return 0.0f;
                }

                @Override
                public final int getThreadId() {
                    return 0;
                }

                @Override
                public final void invalidateEnterView() {
                }

                @Override
                public final boolean isExpanded() {
                    return false;
                }

                @Override
                public final boolean isInScheduleMode() {
                    return false;
                }

                @Override
                public final boolean isSearchOpened() {
                    return ChatAttachAlertRichLayout.this.emojiSearchOpened;
                }

                @Override
                public final boolean isUserSelf() {
                    return false;
                }

                @Override
                public final void onAnimatedEmojiUnlockClick() {
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
                }

                @Override
                public final void onCustomEmojiSelected(long j, TLRPC.Document document, String str, boolean z2) {
                    AnimatedEmojiSpan animatedEmojiSpan;
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
                        if (document != null) {
                            animatedEmojiSpan = new AnimatedEmojiSpan(document.id, 1.2f, focusedEditTextOrNull.getPaint().getFontMetricsInt());
                            animatedEmojiSpan.document = document;
                        } else {
                            animatedEmojiSpan = new AnimatedEmojiSpan(j, 1.2f, focusedEditTextOrNull.getPaint().getFontMetricsInt());
                        }
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
                }

                @Override
                public final void onGifSelected(View view2, Object obj, String str, Object obj2, boolean z2, int i, int i2) {
                }

                @Override
                public final void onGifSelectedForAddCaption(TLObject tLObject, Object obj) {
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
                }

                @Override
                public final void onStickerSelected(StickerEmojiCell stickerEmojiCell, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z2, int i) {
                }

                @Override
                public final void onStickerSetAdd(TLRPC.StickerSetCovered stickerSetCovered) {
                }

                @Override
                public final void onStickerSetRemove(TLRPC.StickerSetCovered stickerSetCovered) {
                }

                @Override
                public final void onStickersGroupClick(long j) {
                }

                @Override
                public final void onStickersSettingsClick() {
                }

                @Override
                public final void onTabOpened(int i) {
                }

                @Override
                public final void showTrendingStickersAlert(TrendingStickersLayout trendingStickersLayout) {
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
        int i = 1;
        BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, resourcesProvider, true, false);
        LinearLayout linearLayoutM = zzkf.m(context, 1);
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
        ButtonWithCounterView buttonWithCounterViewM = zzlp.m(context, resourcesProvider, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        final UserInfoActivity$$ExternalSyntheticLambda7 userInfoActivity$$ExternalSyntheticLambda7 = new UserInfoActivity$$ExternalSyntheticLambda7(strArr, horizontalScrollView, buttonWithCounterViewM, zArr2, new TodoItemMenu$$ExternalSyntheticLambda17(strArr, 18), imageView, resourcesProvider, new int[]{6});
        final EditTextCell editTextCell = new EditTextCell(context, LocaleController.getString(R.string.ArticleLatexEquation), true, false, -1, resourcesProvider);
        EditTextCell.AnonymousClass2 anonymousClass2 = editTextCell.editText;
        anonymousClass2.setImeOptions(6);
        anonymousClass2.setMaxLines(5);
        editTextCell.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(24.0f), Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider)));
        editTextCell.setText(strArr[0]);
        anonymousClass2.addTextChangedListener(new TextWatcher() {
            @Override
            public final void afterTextChanged(Editable editable) {
                strArr[0] = editable.toString();
                userInfoActivity$$ExternalSyntheticLambda7.run();
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
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
        int i2 = Theme.key_windowBackgroundGray;
        bottomSheetM.setBackgroundColor(Theme.getColor(i2, resourcesProvider));
        bottomSheetM.fixNavigationBar(Theme.getColor(i2, resourcesProvider));
        buttonWithCounterViewM.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda6((Object) buttonWithCounterViewM, (Object) zArr, (Object) callback, (Object) strArr, bottomSheetM, 15));
        AndroidUtilities.runOnUIThread(new EditTextCell$$ExternalSyntheticLambda0(editTextCell, i), 200L);
    }

    public final void addHeadingItem(ItemOptions itemOptions, BlockRow blockRow, TL_iv.PageBlock pageBlock, int i, String str, int i2, ItemOptions itemOptions2) {
        itemOptions.addChecked(blockRow != null && blockRow.block.getClass() == pageBlock.getClass(), i, null, str, new BotWebViewContainer$$ExternalSyntheticLambda35(this, blockRow, pageBlock, itemOptions2, 2));
        itemOptions.getLast().textView.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        itemOptions.getLast().textView.setTextSize(1, i2);
    }

    public final boolean checkDiscard$1() {
        RichEditorListView richEditorListView = this.listView;
        if (richEditorListView == null || !richEditorListView.hasAnyText()) {
            return true;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, this.resourcesProvider);
        String string = LocaleController.getString(R.string.ArticleSaveDraftTitle);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = LocaleController.getString(R.string.ArticleSaveDraftMessage);
        final int i = 0;
        builder.setNegativeButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener(this) {
            public final ChatAttachAlertRichLayout f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(AlertDialog alertDialog2, int i2) {
                switch (i) {
                    case 0:
                        this.f$0.parentAlert.lambda$showGiftOfferSheet$15();
                        break;
                    default:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout = this.f$0;
                        chatAttachAlertRichLayout.persistDraft();
                        chatAttachAlertRichLayout.parentAlert.lambda$showGiftOfferSheet$15();
                        break;
                }
            }
        });
        final int i2 = 1;
        builder.setPositiveButton(LocaleController.getString(R.string.Save), new AlertDialog.OnButtonClickListener(this) {
            public final ChatAttachAlertRichLayout f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(AlertDialog alertDialog2, int i3) {
                switch (i2) {
                    case 0:
                        this.f$0.parentAlert.lambda$showGiftOfferSheet$15();
                        break;
                    default:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout = this.f$0;
                        chatAttachAlertRichLayout.persistDraft();
                        chatAttachAlertRichLayout.parentAlert.lambda$showGiftOfferSheet$15();
                        break;
                }
            }
        });
        builder.makeRed(-2);
        builder.show();
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.currentUserPremiumStatusChanged) {
            updateSendButtonLocked();
        }
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
            FactCheckController$$ExternalSyntheticOutline0.m(R.string.RichEditorDraftSaved, new BulletinFactory(this.toolbar, this.resourcesProvider), R.raw.contact_check, 36);
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
            hideEmojiPopup$3(false);
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
            richEditorListView.getClass();
            int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
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

    public final void hideEmojiPopup$3(boolean z) {
        if (this.emojiSearchOpened) {
            this.emojiSearchOpened = false;
            EmojiView emojiView = this.emojiView;
            if (emojiView != null) {
                emojiView.closeSearch(-1L, false);
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

    public final void layoutBottomPanels() {
        float f;
        float f2;
        int iDp = this.emojiSearchOpened ? AndroidUtilities.dp(245.0f) : this.emojiPadding;
        EmojiView emojiView = this.emojiView;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (emojiView != null) {
            if (this.emojiViewVisible) {
                f2 = (this.emojiPadding - iDp) + (this.emojiSearchOpened ? -chatAttachAlert.currentPanTranslationY : 0.0f);
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
                f += chatAttachAlert.currentPanTranslationY;
            }
            richEditorToolbar.getBottomContainer().animate().cancel();
            richEditorToolbar.getBottomContainer().setTranslationY(-f);
            boolean z2 = this.emojiViewVisible;
            float f3 = z2 ? iDp : 0.0f;
            if (!z2 || this.emojiSearchOpened) {
                f3 += chatAttachAlert.currentPanTranslationY;
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
                    emojiView.closeSearch(-1L, false);
                    this.emojiView.hideSearchKeyboard();
                }
                layoutBottomPanels();
                return false;
            }
        } else {
            if (this.emojiViewVisible) {
                hideEmojiPopup$3(false);
                return false;
            }
            if (!this.listView.deselectIfAny() && !checkDiscard$1()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onContainerTranslationUpdated(float f) {
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
        return false;
    }

    @Override
    public final boolean onDismissWithTouchOutside() {
        return checkDiscard$1();
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
            hideEmojiPopup$3(false);
        }
    }

    @Override
    public final void onPanTransitionEnd() {
        this.keyboardVisible = this.parentAlert.sizeNotifierFrameLayout.measureKeyboardHeight() > AndroidUtilities.dp(20.0f);
        layoutBottomPanels();
        updateToolbarTopOffset();
    }

    @Override
    public final void onPanTransitionStart(int i, boolean z) {
        this.keyboardVisible = z;
        layoutBottomPanels();
        if (z && this.emojiViewVisible && !this.emojiSearchOpened) {
            hideEmojiPopup$3(false);
        }
        updateToolbarTopOffset();
    }

    @Override
    public final void onPreMeasure(int i, int i2) {
        int iDp;
        int i3;
        ItemOptions itemOptions;
        boolean z = this.keyboardVisible;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        boolean z2 = chatAttachAlert.sizeNotifierFrameLayout.measureKeyboardHeight() > AndroidUtilities.dp(20.0f);
        this.keyboardVisible = z2;
        if (!z2 && z && (itemOptions = this.menu) != null) {
            itemOptions.dismiss();
            this.menu = null;
        }
        if (this.keyboardVisible || this.emojiPadding > AndroidUtilities.dp(20.0f)) {
            iDp = AndroidUtilities.dp(52.0f);
            chatAttachAlert.setAllowNestedScroll(false);
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
            chatAttachAlert.setAllowNestedScroll(true);
        }
        int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + iDp;
        RichEditorListView richEditorListView = this.listView;
        int iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m((this.keyboardVisible || this.emojiPadding > 0) ? 0 : AndroidUtilities.navigationBarHeight, 110.0f, (richEditorListView.hasAnyText() || this.emojiViewVisible || !chatAttachAlert.typeButtonsAvailable) ? 0 : AndroidUtilities.dp(62.0f)) + this.emojiPadding;
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
        post(new ChatAttachAlertRichLayout$$ExternalSyntheticLambda2(this, 3));
    }

    public final void openAttach(int i, int i2) {
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (chatAttachAlert.baseFragment == null) {
            return;
        }
        final ChatAttachAlert chatAttachAlert2 = new ChatAttachAlert(getContext(), chatAttachAlert.baseFragment, false, false, true, this.resourcesProvider);
        chatAttachAlert2.delegate = new ChatAttachAlert.ChatAttachViewDelegate() {
            @Override
            public final void didPressedButton(int i3, boolean z, boolean z2, int i4, int i5, long j, boolean z3, boolean z4, long j2) {
                ChatAttachAlert chatAttachAlert3 = chatAttachAlert2;
                ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
                if (i3 == 7 || i3 == 8) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = chatAttachAlert3.photoLayout;
                    HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
                    ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                    RichEditorListView richEditorListView = chatAttachAlertRichLayout.listView;
                    BlockRow blockRow = richEditorListView.pendingMediaRow;
                    richEditorListView.pendingMediaRow = null;
                    for (int i6 = 0; i6 < selectedPhotosOrder.size(); i6++) {
                        Object obj = selectedPhotos.get(selectedPhotosOrder.get(i6));
                        if (obj instanceof MediaController.PhotoEntry) {
                            RichEditorListView richEditorListView2 = chatAttachAlertRichLayout.listView;
                            if (blockRow != null) {
                                richEditorListView2.addMediaToRow(blockRow, (MediaController.PhotoEntry) obj);
                                break;
                            } else {
                                richEditorListView2.attachMedia((MediaController.PhotoEntry) obj);
                                break;
                            }
                        }
                    }
                }
                chatAttachAlertRichLayout.listView.pendingMediaRow = null;
                chatAttachAlert3.dismiss(true);
            }

            @Override
            public final void didSelectBot(TLRPC.User user) {
            }

            @Override
            public final void doOnIdle(ChatAttachAlert$$ExternalSyntheticLambda7 chatAttachAlert$$ExternalSyntheticLambda7) {
                NotificationCenter.getInstance(ChatAttachAlertRichLayout.this.currentAccount).doOnIdle(chatAttachAlert$$ExternalSyntheticLambda7);
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
            }

            @Override
            public final void openAvatarsSearch() {
            }

            @Override
            public final boolean selectItemOnClicking() {
                return false;
            }

            @Override
            public final void sendAudio(ArrayList arrayList, Editable editable, boolean z, int i3, int i4, long j, boolean z2, long j2) {
            }
        };
        chatAttachAlert2.photoLayout.loadGalleryPhotos();
        chatAttachAlert2.setMaxSelectedPhotos(1, true);
        chatAttachAlert2.enablePollAttachMode(i);
        chatAttachAlert2.locationActivityDelegate = new ChatAttachAlertRichLayout$$ExternalSyntheticLambda20(this, chatAttachAlert2);
        chatAttachAlert2.audioSelectDelegate = new ChatAttachAlertRichLayout$$ExternalSyntheticLambda20(this, chatAttachAlert2);
        chatAttachAlert2.documentsDelegate = new ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate() {
            @Override
            public final void didSelectFiles(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i3, long j, boolean z2, long j2) {
                boolean zIsEmpty = arrayList.isEmpty();
                ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
                if (!zIsEmpty) {
                    chatAttachAlertRichLayout.listView.attachDocument((String) arrayList.get(0));
                } else if (!arrayList3.isEmpty()) {
                    RichEditorListView richEditorListView = chatAttachAlertRichLayout.listView;
                    MessageObject messageObject = (MessageObject) arrayList3.get(0);
                    richEditorListView.getClass();
                    if (messageObject != null && messageObject.getDocument() != null) {
                        TLRPC.Document document = messageObject.getDocument();
                        TLRPC.Message message = messageObject.messageOwner;
                        richEditorListView.attachDocument(document, message != null ? message.attachPath : null);
                    }
                }
                chatAttachAlert2.dismiss(true);
            }

            @Override
            public final void didSelectPhotos(long j, ArrayList arrayList, boolean z, int i3) {
            }

            @Override
            public final void startDocumentSelectActivity() {
                try {
                    Intent intent = new Intent("android.intent.action.GET_CONTENT");
                    intent.setType("*/*");
                    ChatAttachAlertRichLayout.this.parentAlert.baseFragment.startActivityForResult(intent, 21);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }

            @Override
            public final void startMusicSelectActivity() {
            }
        };
        chatAttachAlert2.init();
        if (i2 != 0) {
            chatAttachAlert2.openAttachLayoutForType(i2);
        }
        chatAttachAlert2.setFocusable(true);
        chatAttachAlert2.show();
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
        AccountInstance.getInstance(this.currentAccount).getMediaDataController().saveDraft(chatActivity.getDialogId(), chatActivity.computeDraftThreadId(chatActivity.replyingMessageObject), "", null, null, null, null, 0L, false, false, richMessage);
        TL_iv.RichMessage richMessage3 = richMessage;
        ChatActivity.AnonymousClass39 anonymousClass39 = chatActivity.chatActivityEnterView;
        if (anonymousClass39 == null) {
            return true;
        }
        anonymousClass39.setRichDraftPreview(richMessage3);
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
    public final boolean sendSelectedItems(int i, boolean z, int i2, boolean z2, long j) {
        long sendMonoForumPeerId;
        MessageObject messageObject;
        MessageObject messageObject2;
        SendMessageChatArguments messageChatSendParams;
        ChatActivity.AnonymousClass39 anonymousClass39;
        int i3 = this.currentAccount;
        boolean zRichEditorAllowed = MessagesController.getInstance(i3).richEditorAllowed();
        RichEditorListView richEditorListView = this.listView;
        if (!zRichEditorAllowed && !UserConfig.getInstance(i3).isPremium() && RichMessageConvert.isLossy(richEditorListView.rows, richEditorListView.quoteAuthors)) {
            RichEditor.openConversionSheet(getContext(), new RichEditorListView$$ExternalSyntheticLambda4(richEditorListView, 1), new ChatAttachAlertRichLayout$$ExternalSyntheticLambda2(this, 0), this.resourcesProvider);
            return false;
        }
        if (richEditorListView.hasAnyText() && !richEditorListView.hasPendingUploads()) {
            if (richEditorListView.isWithinLimits()) {
                boolean zRichEditorAllowed2 = MessagesController.getInstance(i3).richEditorAllowed();
                ChatAttachAlert chatAttachAlert = this.parentAlert;
                if (zRichEditorAllowed2) {
                    ArrayList arrayListFlattenRowsToBlocks = richEditorListView.flattenRowsToBlocks();
                    if (!arrayListFlattenRowsToBlocks.isEmpty()) {
                        ArrayList arrayListCollectPhotos = richEditorListView.collectPhotos();
                        ArrayList arrayListCollectDocuments = richEditorListView.collectDocuments();
                        ArrayList arrayListCollect = RichMessageButtonUsers.collect(i3, arrayListFlattenRowsToBlocks);
                        BaseFragment baseFragment = chatAttachAlert.baseFragment;
                        if (baseFragment instanceof ChatActivity) {
                            ChatActivity chatActivity = (ChatActivity) baseFragment;
                            MessageObject messageObject3 = chatActivity.replyingMessageObject;
                            MessageObject messageObject4 = chatActivity.threadMessageObject;
                            sendMonoForumPeerId = chatActivity.getSendMonoForumPeerId();
                            messageChatSendParams = chatActivity.getMessageChatSendParams();
                            messageObject = messageObject3;
                            messageObject2 = messageObject4;
                        } else {
                            sendMonoForumPeerId = 0;
                            messageObject = null;
                            messageObject2 = null;
                            messageChatSendParams = null;
                        }
                        SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(chatAttachAlert.currentAccount), arrayListFlattenRowsToBlocks, arrayListCollectPhotos, arrayListCollectDocuments, arrayListCollect, false, chatAttachAlert.getDialogId(), messageObject, messageObject2, z, i, i2, messageChatSendParams, j, sendMonoForumPeerId, 0L);
                        chatAttachAlert.dismiss(true);
                        return true;
                    }
                } else {
                    BaseFragment baseFragment2 = chatAttachAlert.baseFragment;
                    if ((baseFragment2 instanceof ChatActivity) && (anonymousClass39 = ((ChatActivity) baseFragment2).chatActivityEnterView) != null) {
                        anonymousClass39.sendConvertedRichAsSimple(RichMessageConvert.rowsToSimpleMessage(richEditorListView.rows), z, i, i2);
                        chatAttachAlert.dismiss(true);
                        return true;
                    }
                }
            } else {
                RichEditorToolbar richEditorToolbar = this.toolbar;
                if (richEditorToolbar != null) {
                    richEditorToolbar.setSendEnabled(richEditorListView.isWithinLimits());
                    return false;
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

    public final void updateAttachButtons(boolean z) {
        int iDp = 0;
        boolean z2 = this.listView.hasAnyText() || this.emojiViewVisible;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (chatAttachAlert.typeButtonsHidden != z2) {
            chatAttachAlert.typeButtonsHidden = z2;
            if (chatAttachAlert.typeButtonsAvailable) {
                ChatAttachAlert.AnonymousClass14 anonymousClass14 = chatAttachAlert.buttonsRecyclerViewWrapper;
                anonymousClass14.animate().cancel();
                if (!z2) {
                    anonymousClass14.setVisibility(0);
                }
                if (z) {
                    anonymousClass14.animate().alpha(z2 ? 0.0f : 1.0f).translationY(z2 ? AndroidUtilities.dp(48.0f) : 0.0f).setDuration(180L).withEndAction(new ChatAttachAlert$$ExternalSyntheticLambda6(chatAttachAlert, z2, 3)).start();
                } else {
                    anonymousClass14.setAlpha(z2 ? 0.0f : 1.0f);
                    anonymousClass14.setTranslationY(z2 ? AndroidUtilities.dp(48.0f) : 0.0f);
                    anonymousClass14.setVisibility(z2 ? 4 : 0);
                }
            }
        }
        if (!z2 && !chatAttachAlert.pinnedToTop && chatAttachAlert.typeButtonsAvailable) {
            iDp = AndroidUtilities.dp(62.0f);
        }
        this.attachRaise = iDp;
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
                richEditorListView.getClass();
                if (RecyclerView.getChildAdapterPosition(childAt) >= 0 && childAt.getTop() < top) {
                    top = childAt.getTop();
                }
            }
            paddingTop = top == Integer.MAX_VALUE ? richEditorListView.getPaddingTop() : top;
        }
        richEditorToolbar.setTopButtonsOffset(Math.max(currentActionBarHeight, paddingTop));
    }
}
