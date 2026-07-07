package org.telegram.ui.iv;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AIEditorAlert;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertAudioLayout;
import org.telegram.ui.Components.ChatAttachAlertLocationLayout;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.TrendingStickersLayout;
import org.telegram.ui.MessageSendPreview;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.iv.RichCommandSuggestions;
import org.telegram.ui.iv.RichEditorListView;
import org.telegram.ui.iv.RichEditorToolbar;
import ru.noties.jlatexmath.JLatexMathDrawable;

public class ChatAttachAlertRichLayout extends ChatAttachAlert.AttachAlertLayout implements NotificationCenter.NotificationCenterDelegate {
    private static final int[] STYLE_FLAGS = {1, 2, 16, 8, 256, 4, 16384, 32768};
    private boolean attachButtonsShown;
    private int attachRaise;
    private RichCommandSuggestions commandSuggestions;
    private final int currentAccount;
    private int currentItemTop;
    private int emojiPadding;
    private boolean emojiSearchOpened;
    private RichEditText emojiTargetEditText;
    private int emojiTargetSelection;
    private EmojiView emojiView;
    private boolean emojiViewVisible;
    private boolean ignoreLayout;
    private boolean keyboardVisible;
    private int lastAttachRise;
    private final Runnable limitCheckRunnable;
    private final RichEditorListView listView;
    private ItemOptions menu;
    private MessageSendPreview messageSendPreview;
    private boolean sendButtonShown;
    private RichEditorToolbar toolbar;
    private final RichEditorToolbar.Delegate toolbarDelegate;

    @Override
    public boolean disableBottomFade() {
        return true;
    }

    @Override
    public int needsActionBar() {
        return 0;
    }

    @Override
    public void onHidden() {
    }

    public ChatAttachAlertRichLayout(ChatAttachAlert chatAttachAlert, Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(chatAttachAlert, context, resourcesProvider);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        this.toolbarDelegate = anonymousClass2;
        this.attachButtonsShown = true;
        this.limitCheckRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.updateSendButtonEnabled();
            }
        };
        this.currentAccount = i;
        this.occupyStatusBar = true;
        this.occupyNavigationBar = true;
        RichEditorListView richEditorListView = new RichEditorListView(context, i, resourcesProvider, new AnonymousClass1(resourcesProvider));
        this.listView = richEditorListView;
        richEditorListView.setAllowTapAboveContent(false);
        addView(richEditorListView, LayoutHelper.createFrame(-1, -1, 119));
        addView(richEditorListView.getOverlayView(), LayoutHelper.createFrame(-1, -1, 119));
        richEditorListView.seedEmptyArticle();
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
        this.toolbar.setTopGradientVisible(false);
        updateSendButtonLocked();
        addView(this.toolbar, LayoutHelper.createFrame(-1, -1, 119));
        updateHistoryButtons();
        updateToolbarBlockType();
        updateAttachButtons(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                this.f$0.lambda$new$0(view, view2);
            }
        });
    }

    class AnonymousClass1 implements RichEditorListView.Delegate {
        final Theme.ResourcesProvider val$resourcesProvider;

        AnonymousClass1(Theme.ResourcesProvider resourcesProvider) {
            this.val$resourcesProvider = resourcesProvider;
        }

        @Override
        public ItemOptions makeMenu(View view) {
            ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
            return chatAttachAlertRichLayout.menu = ItemOptions.makeOptions(chatAttachAlertRichLayout, this.val$resourcesProvider, view, false, false, true);
        }

        @Override
        public void onSelectionChanged() {
            ChatAttachAlertRichLayout.this.updateFormattingPanel();
            ChatAttachAlertRichLayout.this.updateToolbarBlockType();
        }

        @Override
        public void onContentChanged() {
            ChatAttachAlertRichLayout.this.updateSendButtonLoading();
            ChatAttachAlertRichLayout.this.scheduleLimitCheck();
        }

        @Override
        public void onHistoryChanged() {
            ChatAttachAlertRichLayout.this.updateHistoryButtons();
        }

        @Override
        public void onOpenAttachRequest(int i, int i2) {
            ChatAttachAlertRichLayout.this.openAttach(i, i2);
        }

        @Override
        public void onOpenLocationRequest(BlockRow blockRow) {
            ChatAttachAlertRichLayout.this.openLocationPicker(blockRow);
        }

        @Override
        public void onSlashSuggest(RichTextCell richTextCell, String str) {
            if (ChatAttachAlertRichLayout.this.commandSuggestions == null) {
                ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
                final Theme.ResourcesProvider resourcesProvider = this.val$resourcesProvider;
                chatAttachAlertRichLayout.commandSuggestions = new RichCommandSuggestions(new RichCommandSuggestions.MenuFactory() {
                    @Override
                    public final ItemOptions make(View view) {
                        return this.f$0.lambda$onSlashSuggest$0(resourcesProvider, view);
                    }
                }, this.val$resourcesProvider);
            }
            ChatAttachAlertRichLayout.this.commandSuggestions.update(richTextCell, str);
        }

        public ItemOptions lambda$onSlashSuggest$0(Theme.ResourcesProvider resourcesProvider, View view) {
            ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
            return chatAttachAlertRichLayout.menu = ItemOptions.makeOptions(chatAttachAlertRichLayout, resourcesProvider, view, false, false, true);
        }

        @Override
        public void onListScrolled(int i) {
            ((ChatAttachAlert.AttachAlertLayout) ChatAttachAlertRichLayout.this).parentAlert.updateLayout(ChatAttachAlertRichLayout.this, true, i);
            ChatAttachAlertRichLayout.this.updateToolbarTopOffset();
            ChatAttachAlertRichLayout.this.updateAttachRaise();
        }

        @Override
        public void onListLayoutUpdated() {
            if (ChatAttachAlertRichLayout.this.getCurrentItemTop() != ChatAttachAlertRichLayout.this.currentItemTop) {
                ((ChatAttachAlert.AttachAlertLayout) ChatAttachAlertRichLayout.this).parentAlert.updateLayout(ChatAttachAlertRichLayout.this, true, 0);
            }
            ChatAttachAlertRichLayout.this.updateToolbarTopOffset();
            ChatAttachAlertRichLayout.this.updateAttachRaise();
        }

        @Override
        public void makeEditTextFocusable(RichEditText richEditText, boolean z) {
            ((ChatAttachAlert.AttachAlertLayout) ChatAttachAlertRichLayout.this).parentAlert.makeFocusable(richEditText, z);
        }

        @Override
        public void onReorderStart() {
            if (ChatAttachAlertRichLayout.this.toolbar != null) {
                ChatAttachAlertRichLayout.this.toolbar.onReorderStart();
            }
        }

        @Override
        public boolean onReorderMove(float f, float f2) {
            return ChatAttachAlertRichLayout.this.toolbar != null && ChatAttachAlertRichLayout.this.toolbar.onReorderMove(f, f2);
        }

        @Override
        public void onReorderEnd() {
            if (ChatAttachAlertRichLayout.this.toolbar != null) {
                ChatAttachAlertRichLayout.this.toolbar.onReorderEnd();
            }
        }
    }

    public void lambda$new$0(View view, View view2) {
        updateToolbarBlockType();
    }

    class AnonymousClass2 implements RichEditorToolbar.Delegate {
        @Override
        public void onBack() {
        }

        AnonymousClass2() {
        }

        @Override
        public Theme.ResourcesProvider getResourcesProvider() {
            return ((ChatAttachAlert.AttachAlertLayout) ChatAttachAlertRichLayout.this).resourcesProvider;
        }

        @Override
        public void onUndo() {
            ChatAttachAlertRichLayout.this.listView.undo();
        }

        @Override
        public void onRedo() {
            ChatAttachAlertRichLayout.this.listView.redo();
        }

        @Override
        public void onEmoji() {
            ChatAttachAlertRichLayout.this.toggleEmojiPopup();
        }

        public void lambda$onAi$0(TL_iv.RichMessage richMessage) {
            ChatAttachAlertRichLayout.this.listView.addRichMessage(richMessage);
        }

        @Override
        public void onAi() {
            new RichAIComposeSheet(ChatAttachAlertRichLayout.this.getContext(), ChatAttachAlertRichLayout.this.currentAccount, ((ChatAttachAlert.AttachAlertLayout) ChatAttachAlertRichLayout.this).resourcesProvider, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$onAi$0((TL_iv.RichMessage) obj);
                }
            }).show();
        }

        @Override
        public void onAttach() {
            ChatAttachAlertRichLayout.this.listView.pendingMediaRow = null;
            ChatAttachAlertRichLayout.this.openAttach(74, 0);
        }

        @Override
        public void onSend() {
            ChatAttachAlertRichLayout.this.sendSelectedItems(true, 0, 0, 0L, false);
        }

        @Override
        public boolean onSendLongClick(View view) {
            return ChatAttachAlertRichLayout.this.showSendPreview(view);
        }

        @Override
        public void onBlockButton(int i, View view) {
            ChatAttachAlertRichLayout.this.onBlockButtonClicked(i, view);
        }

        @Override
        public void onFormatting(int i) {
            ChatAttachAlertRichLayout.this.listView.onFormattingClicked(i);
        }

        @Override
        public void onLink() {
            ChatAttachAlertRichLayout.this.listView.onLinkClicked();
        }

        @Override
        public void onDate() {
            ChatAttachAlertRichLayout.this.listView.onDateClicked();
        }

        @Override
        public void onMath() {
            ChatAttachAlertRichLayout.this.listView.onMathClicked();
        }

        @Override
        public void onQuote() {
            ChatAttachAlertRichLayout.this.listView.toggleQuoteOnSelection();
            ChatAttachAlertRichLayout.this.updateFormattingButtons();
        }

        @Override
        public void onAiStyle() {
            TL_iv.RichMessage richMessageExtractRichMessage;
            RichEditorListView.SelectionEdit selectionEditBeginSelectionEdit = ChatAttachAlertRichLayout.this.listView.beginSelectionEdit();
            if (selectionEditBeginSelectionEdit == null || (richMessageExtractRichMessage = selectionEditBeginSelectionEdit.extractRichMessage()) == null || richMessageExtractRichMessage.blocks.isEmpty()) {
                return;
            }
            new AIEditorAlert(ChatAttachAlertRichLayout.this.getContext(), ((ChatAttachAlert.AttachAlertLayout) ChatAttachAlertRichLayout.this).resourcesProvider).setText(richMessageExtractRichMessage).setOnUseRich(new ChatAttachAlertRichLayout$2$$ExternalSyntheticLambda0(selectionEditBeginSelectionEdit)).show();
        }
    }

    public void updateToolbarTopOffset() {
        if (this.toolbar == null) {
            return;
        }
        this.toolbar.setTopButtonsOffset(Math.max((AndroidUtilities.statusBarHeight + ((ActionBar.getCurrentActionBarHeight() - AndroidUtilities.dp(44.0f)) / 2)) - AndroidUtilities.dp(8.0f), firstItemTopRaw()));
    }

    private int firstItemTopRaw() {
        if (this.listView.getChildCount() <= 0) {
            return this.listView.getPaddingTop();
        }
        int y = Integer.MAX_VALUE;
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            View childAt = this.listView.getChildAt(i);
            if (this.listView.getChildAdapterPosition(childAt) >= 0 && childAt.getY() < y) {
                y = (int) childAt.getY();
            }
        }
        return y == Integer.MAX_VALUE ? this.listView.getPaddingTop() : y;
    }

    public void updateHistoryButtons() {
        RichEditorToolbar richEditorToolbar = this.toolbar;
        if (richEditorToolbar != null) {
            richEditorToolbar.setHistoryEnabled(this.listView.canUndo(), this.listView.canRedo());
        }
    }

    private boolean checkDiscard() {
        RichEditorListView richEditorListView = this.listView;
        if (richEditorListView == null || !richEditorListView.hasAnyText()) {
            return true;
        }
        new AlertDialog.Builder(getContext(), this.resourcesProvider).setTitle(LocaleController.getString(R.string.ArticleSaveDraftTitle)).setMessage(LocaleController.getString(R.string.ArticleSaveDraftMessage)).setNegativeButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                this.f$0.lambda$checkDiscard$1(alertDialog, i);
            }
        }).setPositiveButton(LocaleController.getString(R.string.Save), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) throws Resources.NotFoundException {
                this.f$0.lambda$checkDiscard$2(alertDialog, i);
            }
        }).makeRed(-2).show();
        return false;
    }

    public void lambda$checkDiscard$1(AlertDialog alertDialog, int i) {
        this.parentAlert.lambda$new$0();
    }

    public void lambda$checkDiscard$2(AlertDialog alertDialog, int i) throws Resources.NotFoundException {
        persistDraft();
        this.parentAlert.lambda$new$0();
    }

    private boolean persistDraft() throws Resources.NotFoundException {
        BaseFragment baseFragment = this.parentAlert.baseFragment;
        if (!(baseFragment instanceof ChatActivity)) {
            return false;
        }
        ChatActivity chatActivity = (ChatActivity) baseFragment;
        if (!this.listView.canUndo()) {
            return false;
        }
        TL_iv.RichMessage richMessageBuildDraftRichMessage = this.listView.buildDraftRichMessage();
        AccountInstance.getInstance(this.currentAccount).getMediaDataController().saveDraft(chatActivity.getDialogId(), chatActivity.getDraftThreadId(), "", null, null, null, null, 0L, false, false, richMessageBuildDraftRichMessage);
        if (chatActivity.getChatActivityEnterView() == null) {
            return true;
        }
        chatActivity.getChatActivityEnterView().setRichDraftPreview(richMessageBuildDraftRichMessage);
        return true;
    }

    @Override
    public boolean onDismissWithTouchOutside() {
        if (checkDiscard()) {
            return super.onDismissWithTouchOutside();
        }
        return false;
    }

    @Override
    public boolean onDismiss() {
        RichEditorListView richEditorListView = this.listView;
        if (richEditorListView != null) {
            richEditorListView.clearContent();
        }
        return super.onDismiss();
    }

    public void onBlockButtonClicked(int r3, android.view.View r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iv.ChatAttachAlertRichLayout.onBlockButtonClicked(int, android.view.View):void");
    }

    public void lambda$onBlockButtonClicked$3(TL_iv.pageBlockMath pageblockmath, String str) {
        if (pageblockmath != null) {
            pageblockmath.source = str;
            this.listView.adapter.update(false);
        } else {
            TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
            pageblockmath2.source = str;
            this.listView.addBlock(pageblockmath2);
        }
    }

    private void showTextTypeMenu(final BlockRow blockRow, View view) {
        ItemOptions itemOptions = this.menu;
        if (itemOptions != null) {
            itemOptions.dismiss();
        }
        final ItemOptions itemOptionsDontFocus = ItemOptions.makeOptions((ViewGroup) this, this.resourcesProvider, view, true).dontFocus();
        final ItemOptions itemOptionsMakeSwipeback = itemOptionsDontFocus.makeSwipeback();
        itemOptionsMakeSwipeback.add(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new Runnable() {
            @Override
            public final void run() {
                itemOptionsDontFocus.closeSwipeback();
            }
        });
        itemOptionsMakeSwipeback.addGap();
        TL_iv.pageBlockHeading1 pageblockheading1 = new TL_iv.pageBlockHeading1();
        int i = R.drawable.iv_h1;
        addHeadingItem(itemOptionsMakeSwipeback, blockRow, pageblockheading1, i, LocaleController.getString(R.string.ArticleHeading1), SharedConfig.fontSize + 2, itemOptionsDontFocus);
        addHeadingItem(itemOptionsMakeSwipeback, blockRow, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, LocaleController.getString(R.string.ArticleHeading2), SharedConfig.fontSize + 1, itemOptionsDontFocus);
        addHeadingItem(itemOptionsMakeSwipeback, blockRow, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, LocaleController.getString(R.string.ArticleHeading3), SharedConfig.fontSize, itemOptionsDontFocus);
        addHeadingItem(itemOptionsMakeSwipeback, blockRow, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, LocaleController.getString(R.string.ArticleHeading4), SharedConfig.fontSize - 1, itemOptionsDontFocus);
        addHeadingItem(itemOptionsMakeSwipeback, blockRow, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, LocaleController.getString(R.string.ArticleHeading5), SharedConfig.fontSize - 2, itemOptionsDontFocus);
        addHeadingItem(itemOptionsMakeSwipeback, blockRow, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, LocaleController.getString(R.string.ArticleHeading6), SharedConfig.fontSize - 3, itemOptionsDontFocus);
        itemOptionsDontFocus.addChecked(blockRow != null && RichEditorListView.isHeading(blockRow.block), i, LocaleController.getString(R.string.ArticleHeading), new Runnable() {
            @Override
            public final void run() {
                itemOptionsDontFocus.openSwipeback(itemOptionsMakeSwipeback);
            }
        });
        itemOptionsDontFocus.addChecked(blockRow != null && (blockRow.block instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text, LocaleController.getString(R.string.ArticleText), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showTextTypeMenu$6(blockRow);
            }
        });
        itemOptionsDontFocus.addChecked(blockRow != null && (blockRow.block instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, LocaleController.getString(R.string.ArticleQuote), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showTextTypeMenu$7(blockRow);
            }
        });
        itemOptionsDontFocus.addChecked(blockRow != null && (blockRow.block instanceof TL_iv.pageBlockPullquote), R.drawable.iv_pullquote, LocaleController.getString(R.string.ArticlePullquote), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showTextTypeMenu$8(blockRow);
            }
        });
        itemOptionsDontFocus.addChecked(blockRow != null && (blockRow.block instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, LocaleController.getString(R.string.ArticleCode), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showTextTypeMenu$9(blockRow);
            }
        });
        itemOptionsDontFocus.addChecked(blockRow != null && (blockRow.block instanceof TL_iv.pageBlockFooter), R.drawable.iv_footer, LocaleController.getString(R.string.ArticleFooter), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showTextTypeMenu$10(blockRow);
            }
        });
        this.menu = itemOptionsDontFocus.show();
    }

    public void lambda$showTextTypeMenu$6(BlockRow blockRow) {
        this.listView.turnIntoKeepList(blockRow, new TL_iv.pageBlockParagraph());
    }

    public void lambda$showTextTypeMenu$7(BlockRow blockRow) {
        this.listView.turnInto(blockRow, RichEditorListView.newBlockquote(), 0, 0, false, false);
    }

    public void lambda$showTextTypeMenu$8(BlockRow blockRow) {
        this.listView.turnInto(blockRow, RichEditorListView.newPullquote(), 0, 0, false, false);
    }

    public void lambda$showTextTypeMenu$9(BlockRow blockRow) {
        this.listView.turnIntoKeepList(blockRow, new TL_iv.pageBlockPreformatted());
    }

    public void lambda$showTextTypeMenu$10(BlockRow blockRow) {
        this.listView.turnIntoKeepList(blockRow, new TL_iv.pageBlockFooter());
    }

    private void addHeadingItem(ItemOptions itemOptions, final BlockRow blockRow, final TL_iv.PageBlock pageBlock, int i, String str, int i2, final ItemOptions itemOptions2) {
        itemOptions.addChecked(blockRow != null && blockRow.block.getClass() == pageBlock.getClass(), i, str, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$addHeadingItem$11(blockRow, pageBlock, itemOptions2);
            }
        });
        itemOptions.getLast().textView.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        itemOptions.getLast().textView.setTextSize(1, i2);
    }

    public void lambda$addHeadingItem$11(BlockRow blockRow, TL_iv.PageBlock pageBlock, ItemOptions itemOptions) {
        this.listView.turnIntoKeepList(blockRow, pageBlock);
        itemOptions.dismiss();
    }

    private void showListMenu(final BlockRow blockRow, View view) {
        ItemOptions itemOptions = this.menu;
        if (itemOptions != null) {
            itemOptions.dismiss();
        }
        final ItemOptions itemOptionsDontFocus = ItemOptions.makeOptions(this, this.resourcesProvider, view).dontFocus();
        boolean z = false;
        ItemOptions itemOptionsAddChecked = itemOptionsDontFocus.addChecked(blockRow == null || !blockRow.isInList(), R.drawable.field_carret_empty, LocaleController.getString(R.string.ArticleNone), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showListMenu$12(blockRow);
            }
        }).addChecked((blockRow == null || !blockRow.isInList() || blockRow.isChecklist() || blockRow.isOrdered()) ? false : true, R.drawable.iv_list, LocaleController.getString(R.string.ArticleListBulleted), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showListMenu$13(blockRow);
            }
        }).addChecked(blockRow != null && blockRow.isInList() && !blockRow.isChecklist() && blockRow.isOrdered(), R.drawable.iv_ordered_list, LocaleController.getString(R.string.ArticleListNumbered), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showListMenu$14(blockRow);
            }
        }).addChecked(blockRow != null && blockRow.isInList() && blockRow.isChecklist() && !blockRow.isOrdered(), R.drawable.iv_todo, LocaleController.getString(R.string.ArticleListTodo), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showListMenu$15(blockRow);
            }
        });
        if (blockRow != null && (blockRow.block instanceof TL_iv.pageBlockDetails)) {
            z = true;
        }
        int i = R.drawable.iv_details;
        String string = LocaleController.getString(R.string.ArticleToggleBlock);
        RichEditorListView richEditorListView = this.listView;
        Objects.requireNonNull(richEditorListView);
        itemOptionsAddChecked.addChecked(z, i, string, new ChatAttachAlertRichLayout$$ExternalSyntheticLambda28(richEditorListView));
        boolean zCanIndentSelection = this.listView.canIndentSelection();
        boolean zCanOutdentSelection = this.listView.canOutdentSelection();
        if (zCanIndentSelection || zCanOutdentSelection) {
            itemOptionsDontFocus.addGap();
            if (zCanIndentSelection) {
                itemOptionsDontFocus.add(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$showListMenu$16(itemOptionsDontFocus);
                    }
                });
            }
            if (zCanOutdentSelection) {
                itemOptionsDontFocus.add(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$showListMenu$17(itemOptionsDontFocus);
                    }
                });
            }
        }
        this.menu = itemOptionsDontFocus.forceTop(true).show();
    }

    public void lambda$showListMenu$12(BlockRow blockRow) {
        this.listView.turnIntoList(blockRow, 0);
    }

    public void lambda$showListMenu$13(BlockRow blockRow) {
        this.listView.turnIntoList(blockRow, 1);
    }

    public void lambda$showListMenu$14(BlockRow blockRow) {
        this.listView.turnIntoList(blockRow, 2);
    }

    public void lambda$showListMenu$15(BlockRow blockRow) {
        this.listView.turnIntoList(blockRow, 3);
    }

    public void lambda$showListMenu$16(ItemOptions itemOptions) {
        this.listView.indentSelection(false);
        itemOptions.dismiss();
    }

    public void lambda$showListMenu$17(ItemOptions itemOptions) {
        this.listView.indentSelection(true);
        itemOptions.dismiss();
    }

    public void updateFormattingPanel() {
        if (this.toolbar == null) {
            return;
        }
        boolean z = this.listView.isInSelectionMode() && this.listView.selectionHasInlineFormattable();
        this.toolbar.showFormattingPanel(z, true);
        if (z) {
            updateFormattingButtons();
        }
    }

    public void updateFormattingButtons() {
        int i;
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper = this.listView.getTextSelectionHelper();
        if (this.toolbar == null || textSelectionHelper == null || !textSelectionHelper.isInSelectionMode()) {
            return;
        }
        this.toolbar.setQuoteState(this.listView.isSelectionQuoted());
        if (this.listView.isTableSelection()) {
            updateFormattingButtonsTable();
            return;
        }
        if (this.listView.isCaptionSelection()) {
            updateFormattingButtonsCaption();
            return;
        }
        int startCell = textSelectionHelper.getStartCell();
        int endCell = textSelectionHelper.getEndCell();
        int startOffset = textSelectionHelper.getStartOffset();
        int endOffset = textSelectionHelper.getEndOffset();
        boolean z = startCell >= 0 && endCell >= 0 && endCell >= startCell && endCell < this.listView.itemRows.size();
        if (z) {
            int[] iArr = STYLE_FLAGS;
            int length = iArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                int i4 = iArr[i2];
                int i5 = i2;
                if (this.listView.isStyleFullyApplied(i4, startCell, startOffset, endCell, endOffset)) {
                    i3 |= i4;
                }
                i2 = i5 + 1;
            }
            i = i3;
        } else {
            i = 0;
        }
        this.toolbar.setFormattingState(i, z && this.listView.isLinkApplied(startCell, startOffset, endCell, endOffset), z && this.listView.isDateApplied(startCell, startOffset, endCell, endOffset), z && startCell == endCell, !this.listView.isSelectionAllHeadings());
    }

    private void updateFormattingButtonsTable() {
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper = this.listView.getTextSelectionHelper();
        int startCell = textSelectionHelper.getStartCell();
        int startChildPosition = textSelectionHelper.getStartChildPosition();
        int endChildPosition = textSelectionHelper.getEndChildPosition();
        int startOffset = textSelectionHelper.getStartOffset();
        int endOffset = textSelectionHelper.getEndOffset();
        int[] iArr = STYLE_FLAGS;
        int length = iArr.length;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            int i4 = i;
            if (this.listView.isStyleFullyAppliedTable(i3, startCell, startChildPosition, startOffset, endChildPosition, endOffset)) {
                i2 |= i3;
            }
            i = i4 + 1;
        }
        boolean z2 = startChildPosition == endChildPosition;
        RichEditText richEditTextTableEditText = z2 ? this.listView.tableEditText(startCell, startChildPosition) : null;
        int iMax = Math.max(0, Math.min(startOffset, endOffset));
        int iMax2 = richEditTextTableEditText == null ? 0 : Math.max(0, Math.min(Math.max(startOffset, endOffset), richEditTextTableEditText.length()));
        RichEditorToolbar richEditorToolbar = this.toolbar;
        boolean z3 = richEditTextTableEditText != null && iMax < iMax2 && RichTextStyle.hasLink(richEditTextTableEditText.getText(), iMax, iMax2);
        if (richEditTextTableEditText != null && iMax < iMax2 && RichTextStyle.hasDate(richEditTextTableEditText.getText(), iMax, iMax2)) {
            z = true;
        }
        richEditorToolbar.setFormattingState(i2, z3, z, z2, true);
    }

    private void updateFormattingButtonsCaption() {
        int i;
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper = this.listView.getTextSelectionHelper();
        RichEditText richEditTextCaptionEditText = this.listView.captionEditText(textSelectionHelper.getStartCell());
        int startOffset = textSelectionHelper.getStartOffset();
        int endOffset = textSelectionHelper.getEndOffset();
        int iMax = richEditTextCaptionEditText == null ? 0 : Math.max(0, Math.min(Math.min(startOffset, endOffset), richEditTextCaptionEditText.length()));
        int iMax2 = richEditTextCaptionEditText == null ? 0 : Math.max(0, Math.min(Math.max(startOffset, endOffset), richEditTextCaptionEditText.length()));
        if (richEditTextCaptionEditText == null || iMax >= iMax2) {
            i = 0;
        } else {
            int i2 = 0;
            for (int i3 : STYLE_FLAGS) {
                if ((richEditTextCaptionEditText.getCurrentStyle(iMax, iMax2) & i3) != 0) {
                    i2 |= i3;
                }
            }
            i = i2;
        }
        this.toolbar.setFormattingState(i, richEditTextCaptionEditText != null && iMax < iMax2 && RichTextStyle.hasLink(richEditTextCaptionEditText.getText(), iMax, iMax2), richEditTextCaptionEditText != null && iMax < iMax2 && RichTextStyle.hasDate(richEditTextCaptionEditText.getText(), iMax, iMax2), true, true);
    }

    public void updateToolbarBlockType() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iv.ChatAttachAlertRichLayout.updateToolbarBlockType():void");
    }

    public TextSelectionHelper.ArticleTextSelectionHelper getTextSelectionHelper() {
        return this.listView.getTextSelectionHelper();
    }

    private void updateSendButton(boolean z) {
        updateAttachButtons(z);
    }

    private void updateAttachButtons(boolean z) {
        boolean z2 = this.listView.hasAnyText() || this.emojiViewVisible;
        this.parentAlert.setTypeButtonsHidden(z2, z);
        this.attachRaise = attachRaiseTarget(z2);
        layoutBottomPanels();
        if (this.attachButtonsShown == z2) {
            this.attachButtonsShown = !z2;
            requestLayout();
        }
    }

    private int attachRaiseTarget(boolean z) {
        if (!z) {
            ChatAttachAlert chatAttachAlert = this.parentAlert;
            if (!chatAttachAlert.pinnedToTop) {
                return chatAttachAlert.getTypeButtonsHeight();
            }
        }
        return 0;
    }

    public void updateAttachRaise() {
        int iAttachRaiseTarget = attachRaiseTarget(this.listView.hasAnyText() || this.emojiViewVisible);
        if (this.attachRaise != iAttachRaiseTarget) {
            this.attachRaise = iAttachRaiseTarget;
            layoutBottomPanels();
        }
    }

    private int bottomNavInset() {
        if (this.keyboardVisible || this.emojiPadding > 0) {
            return 0;
        }
        return AndroidUtilities.navigationBarHeight;
    }

    private int emojiVisibleHeight() {
        return this.emojiSearchOpened ? AndroidUtilities.dp(245.0f) : this.emojiPadding;
    }

    public void layoutBottomPanels() {
        int iEmojiVisibleHeight = emojiVisibleHeight();
        EmojiView emojiView = this.emojiView;
        if (emojiView != null) {
            if (this.emojiViewVisible) {
                f = (this.emojiSearchOpened ? -this.parentAlert.currentPanTranslationY : 0.0f) + (this.emojiPadding - iEmojiVisibleHeight);
            }
            emojiView.setTranslationY(f);
        }
        if (this.toolbar != null) {
            if (!this.emojiViewVisible) {
                iEmojiVisibleHeight = bottomNavInset();
            }
            float f = iEmojiVisibleHeight;
            if (!this.emojiViewVisible || this.emojiSearchOpened) {
                f += this.parentAlert.currentPanTranslationY;
            }
            this.toolbar.getBottomContainer().animate().cancel();
            this.toolbar.getBottomContainer().setTranslationY(-f);
            if (this.lastAttachRise != this.attachRaise) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate = this.toolbar.getBottomInnerContainer().animate();
                this.lastAttachRise = this.attachRaise;
                viewPropertyAnimatorAnimate.translationY(-r1).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
            }
        }
    }

    @Override
    public boolean onBackPressed() {
        if (this.emojiSearchOpened) {
            closeEmojiSearch();
            return false;
        }
        if (this.emojiViewVisible) {
            hideEmojiPopup();
            return false;
        }
        if (this.listView.deselectIfAny()) {
            return false;
        }
        if (checkDiscard()) {
            return super.onBackPressed();
        }
        return true;
    }

    @Override
    public boolean shouldHideBottomButtons() {
        return !this.listView.hasAnyText();
    }

    @Override
    public int getListTopPadding() {
        return (this.listView.getPaddingTop() - AndroidUtilities.statusBarHeight) - ActionBar.getCurrentActionBarHeight();
    }

    @Override
    public int getCurrentItemTop() {
        if (this.listView.getChildCount() <= 0) {
            RichEditorListView richEditorListView = this.listView;
            int paddingTop = richEditorListView.getPaddingTop();
            this.currentItemTop = paddingTop;
            richEditorListView.setTopGlowOffset(paddingTop);
            return Integer.MAX_VALUE;
        }
        int y = Integer.MAX_VALUE;
        boolean z = false;
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            View childAt = this.listView.getChildAt(i);
            int childAdapterPosition = this.listView.getChildAdapterPosition(childAt);
            if (childAdapterPosition == 0) {
                z = true;
            }
            if (childAdapterPosition >= 0 && childAt.getTop() < y) {
                y = (int) childAt.getY();
            }
        }
        if (y == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        this.listView.setTopGlowOffset(Math.max(0, y));
        int i2 = y - AndroidUtilities.statusBarHeight;
        int iDp = AndroidUtilities.dp(7.0f);
        if (i2 < AndroidUtilities.dp(7.0f) || !z) {
            i2 = iDp;
        }
        this.currentItemTop = i2;
        return i2;
    }

    @Override
    public int getFirstOffset() {
        return getListTopPadding() + AndroidUtilities.dp(56.0f);
    }

    @Override
    public void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void onPreMeasure(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iv.ChatAttachAlertRichLayout.onPreMeasure(int, int):void");
    }

    @Override
    public void scrollToTop() {
        this.listView.smoothScrollToPosition(0);
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.parentAlert.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public void onPanTransitionStart(boolean z, int i) {
        super.onPanTransitionStart(z, i);
        this.keyboardVisible = z;
        layoutBottomPanels();
        if (z && this.emojiViewVisible && !this.emojiSearchOpened) {
            hideEmojiPopup();
        }
        updateToolbarTopOffset();
    }

    @Override
    public void onContainerTranslationUpdated(float f) {
        super.onContainerTranslationUpdated(f);
        layoutBottomPanels();
    }

    @Override
    public void onPanTransitionEnd() {
        super.onPanTransitionEnd();
        this.keyboardVisible = this.parentAlert.sizeNotifierFrameLayout.measureKeyboardHeight() > AndroidUtilities.dp(20.0f);
        layoutBottomPanels();
        updateToolbarTopOffset();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        EmojiView emojiView;
        if (this.listView.textSelectionHelper.isInSelectionMode() && this.listView.textSelectionOverlay.onTouchEvent(motionEvent)) {
            return true;
        }
        int height = (((!this.emojiSearchOpened || (emojiView = this.emojiView) == null) ? getHeight() - this.emojiPadding : (int) emojiView.getY()) - AndroidUtilities.dp(60.0f)) - this.attachRaise;
        if (motionEvent.getAction() == 0 && this.emojiViewVisible && motionEvent.getY() < height) {
            hideEmojiPopup();
        }
        if ((motionEvent.getAction() != 0 || (motionEvent.getY() > AndroidUtilities.dp(60.0f) && motionEvent.getY() < height)) && this.listView.textSelectionOverlay.checkOnTap(motionEvent)) {
            motionEvent.setAction(3);
        }
        if (motionEvent.getY() >= height || !this.listView.handleSelectionTouch(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            saveDraftWithBulletin();
            return true;
        }
        if (this.listView.handleKeyEvent(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    private void saveDraftWithBulletin() {
        if ((this.parentAlert.baseFragment instanceof ChatActivity) && this.listView.canUndo() && persistDraft()) {
            BulletinFactory.of(this.toolbar, this.resourcesProvider).createSimpleBulletin(R.raw.contact_check, LocaleController.getString(R.string.RichEditorDraftSaved)).show();
        }
    }

    @Override
    public void onShow(ChatAttachAlert.AttachAlertLayout attachAlertLayout) {
        this.parentAlert.actionBar.setTitle("");
        this.listView.adapter.update(false);
        updateAttachButtons(false);
        post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.updateToolbarTopOffset();
            }
        });
    }

    @Override
    public void onHide() {
        RichCommandSuggestions richCommandSuggestions = this.commandSuggestions;
        if (richCommandSuggestions != null) {
            richCommandSuggestions.hide();
        }
        if (this.emojiViewVisible) {
            hideEmojiPopup();
        }
        if (this.sendButtonShown) {
            this.sendButtonShown = false;
            this.parentAlert.showSendButtonOnly(false, true);
        }
    }

    @Override
    public boolean sendSelectedItems(boolean z, int i, int i2, long j, boolean z2) {
        MessageObject messageObject;
        MessageObject messageObject2;
        long j2;
        int quickReplyId;
        if (!MessagesController.getInstance(this.currentAccount).richEditorAllowed()) {
            if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
                new PremiumFeatureBottomSheet(this.parentAlert.baseFragment, getContext(), this.currentAccount, 43, true).show();
            }
            return false;
        }
        if (!this.listView.hasAnyText() || this.listView.hasPendingUploads()) {
            return false;
        }
        if (!this.listView.isWithinLimits()) {
            updateSendButtonEnabled();
            return false;
        }
        ArrayList arrayListFlattenRowsToBlocks = this.listView.flattenRowsToBlocks();
        if (arrayListFlattenRowsToBlocks.isEmpty()) {
            return false;
        }
        ArrayList arrayListCollectPhotos = this.listView.collectPhotos();
        ArrayList arrayListCollectDocuments = this.listView.collectDocuments();
        BaseFragment baseFragment = this.parentAlert.baseFragment;
        if (baseFragment instanceof ChatActivity) {
            ChatActivity chatActivity = (ChatActivity) baseFragment;
            MessageObject replyMessage = chatActivity.getReplyMessage();
            MessageObject threadMessage = chatActivity.getThreadMessage();
            long sendMonoForumPeerId = chatActivity.getSendMonoForumPeerId();
            quickReplyId = chatActivity.getQuickReplyId();
            messageObject = replyMessage;
            messageObject2 = threadMessage;
            j2 = sendMonoForumPeerId;
        } else {
            messageObject = null;
            messageObject2 = null;
            j2 = 0;
            quickReplyId = 0;
        }
        SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(this.parentAlert.currentAccount), arrayListFlattenRowsToBlocks, arrayListCollectPhotos, arrayListCollectDocuments, null, false, this.parentAlert.getDialogId(), messageObject, messageObject2, z, i, i2, null, quickReplyId, j, j2, 0L);
        this.parentAlert.dismiss(true);
        return true;
    }

    public boolean showSendPreview(View view) {
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            new PremiumFeatureBottomSheet(this.parentAlert.baseFragment, getContext(), this.currentAccount, 43, true).show();
            return true;
        }
        boolean z = false;
        if (!this.listView.hasAnyText() || this.listView.hasPendingUploads()) {
            return false;
        }
        if (!this.listView.isWithinLimits()) {
            updateSendButtonEnabled();
            return false;
        }
        ArrayList<TL_iv.PageBlock> arrayListFlattenRowsToBlocks = this.listView.flattenRowsToBlocks();
        if (arrayListFlattenRowsToBlocks.isEmpty()) {
            return false;
        }
        BaseFragment baseFragment = this.parentAlert.baseFragment;
        ChatActivity chatActivity = baseFragment instanceof ChatActivity ? (ChatActivity) baseFragment : null;
        MessageSendPreview messageSendPreview = this.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.dismiss(false);
            this.messageSendPreview = null;
        }
        MessageSendPreview messageSendPreview2 = new MessageSendPreview(getContext(), this.resourcesProvider);
        this.messageSendPreview = messageSendPreview2;
        messageSendPreview2.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f$0.lambda$showSendPreview$18(dialogInterface);
            }
        });
        final long dialogId = this.parentAlert.getDialogId();
        MessageObject replyMessage = chatActivity != null ? chatActivity.getReplyMessage() : null;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = 0;
        tL_message.out = true;
        tL_message.peer_id = MessagesController.getInstance(this.currentAccount).getPeer(dialogId);
        tL_message.from_id = MessagesController.getInstance(this.currentAccount).getPeer(UserConfig.getInstance(this.currentAccount).getClientUserId());
        tL_message.flags2 |= 8192;
        TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
        tL_message.rich_message = richMessage;
        richMessage.blocks = arrayListFlattenRowsToBlocks;
        richMessage.photos = this.listView.collectPhotos();
        tL_message.rich_message.documents = this.listView.collectDocuments();
        if (replyMessage != null && !replyMessage.isTopicMainMessage) {
            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
            tL_messageReplyHeader.flags |= 16;
            tL_messageReplyHeader.reply_to_msg_id = replyMessage.getId();
            tL_message.reply_to = tL_messageReplyHeader;
        }
        MessageObject messageObject = new MessageObject(this.currentAccount, tL_message, false, false);
        if (replyMessage != null && !replyMessage.isTopicMainMessage) {
            messageObject.replyMessageObject = replyMessage;
        }
        messageObject.sendPreview = true;
        messageObject.isOutOwnerCached = Boolean.TRUE;
        messageObject.generateLayout(null);
        messageObject.notime = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(messageObject);
        this.messageSendPreview.setMessageObjects(arrayList);
        ChatActivityEnterView.SendButton sendButton = this.toolbar.getSendButton();
        sendButton.setScaleX(1.0f);
        sendButton.setScaleY(1.0f);
        ChatActivityEnterView.SendButton sendButton2 = this.messageSendPreview.setSendButton(sendButton, true, new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.lambda$showSendPreview$19(view2);
            }
        });
        if (sendButton2 != null) {
            sendButton2.setBackground(RichEditor.withShadow(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), getThemedColor(Theme.key_featuredStickers_addButton))));
            this.messageSendPreview.setSendButtonWidth(AndroidUtilities.dp(44.0f));
        }
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this, this.resourcesProvider, sendButton);
        if (chatActivity != null && UserObject.isUserSelf(chatActivity.getCurrentUser())) {
            z = true;
        }
        if (chatActivity != null && chatActivity.canScheduleMessage()) {
            itemOptionsMakeOptions.add(R.drawable.msg_calendar2, LocaleController.getString(z ? R.string.SetReminder : R.string.ScheduleMessage), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$showSendPreview$20(dialogId);
                }
            });
            if (!z && dialogId > 0) {
                itemOptionsMakeOptions.add(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$showSendPreview$21();
                    }
                });
            }
        }
        if (!z) {
            itemOptionsMakeOptions.add(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$showSendPreview$22();
                }
            });
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

    public void lambda$showSendPreview$18(DialogInterface dialogInterface) {
        this.messageSendPreview = null;
    }

    public void lambda$showSendPreview$19(View view) {
        sendSelectedItems(true, 0, 0, 0L, false);
        MessageSendPreview messageSendPreview = this.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.dismiss(true);
            this.messageSendPreview = null;
        }
    }

    public void lambda$showSendPreview$20(long j) {
        AlertsCreator.createScheduleDatePickerDialog(this.parentAlert.baseFragment.getParentActivity(), j, new AlertsCreator.ScheduleDatePickerDelegate() {
            @Override
            public void didSelectDate(boolean z, int i, int i2) {
                ChatAttachAlertRichLayout.this.sendSelectedItems(z, i, i2, 0L, false);
                if (ChatAttachAlertRichLayout.this.messageSendPreview != null) {
                    ChatAttachAlertRichLayout.this.messageSendPreview.dismissInstant();
                    ChatAttachAlertRichLayout.this.messageSendPreview = null;
                }
            }
        }, this.resourcesProvider);
    }

    public void lambda$showSendPreview$21() {
        sendSelectedItems(true, 2147483646, 0, 0L, false);
        MessageSendPreview messageSendPreview = this.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.dismiss(false);
            this.messageSendPreview = null;
        }
    }

    public void lambda$showSendPreview$22() {
        sendSelectedItems(false, 0, 0, 0L, false);
        MessageSendPreview messageSendPreview = this.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.dismiss(true);
            this.messageSendPreview = null;
        }
    }

    public void openLocationPicker(final BlockRow blockRow) {
        BaseFragment baseFragment = this.parentAlert.baseFragment;
        if (baseFragment != null && blockRow != null && (blockRow.block instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(baseFragment)) {
            final ChatAttachAlert chatAttachAlert = new ChatAttachAlert(getContext(), this.parentAlert.baseFragment, false, false, false, null);
            chatAttachAlert.setDelegate(new ChatAttachAlert.ChatAttachViewDelegate() {
                @Override
                public void didPressedButton(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
                }

                @Override
                public void didSelectBot(TLRPC.User user) {
                    ChatAttachAlert.ChatAttachViewDelegate.CC.$default$didSelectBot(this, user);
                }

                @Override
                public void doOnIdle(Runnable runnable) {
                    runnable.run();
                }

                @Override
                public boolean needEnterComment() {
                    return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$needEnterComment(this);
                }

                @Override
                public void onCameraOpened() {
                    ChatAttachAlert.ChatAttachViewDelegate.CC.$default$onCameraOpened(this);
                }

                @Override
                public void onWallpaperSelected(Object obj) {
                    ChatAttachAlert.ChatAttachViewDelegate.CC.$default$onWallpaperSelected(this, obj);
                }

                @Override
                public void openAvatarsSearch() {
                    ChatAttachAlert.ChatAttachViewDelegate.CC.$default$openAvatarsSearch(this);
                }

                @Override
                public boolean selectItemOnClicking() {
                    return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$selectItemOnClicking(this);
                }

                @Override
                public void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
                    ChatAttachAlert.ChatAttachViewDelegate.CC.$default$sendAudio(this, arrayList, charSequence, z, i, i2, j, z2, j2);
                }
            });
            chatAttachAlert.setLocationPicker();
            chatAttachAlert.setLocationActivityDelegate(new ChatAttachAlertLocationLayout.LocationActivityDelegate() {
                @Override
                public final void didSelectLocation(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
                    this.f$0.lambda$openLocationPicker$24(blockRow, chatAttachAlert, messageMedia, i, z, i2, j);
                }
            });
            chatAttachAlert.init();
            chatAttachAlert.show();
        }
    }

    public void lambda$openLocationPicker$24(final BlockRow blockRow, ChatAttachAlert chatAttachAlert, TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        if (messageMedia == null || messageMedia.geo == null) {
            return;
        }
        RichEditorHistory richEditorHistory = this.listView.history;
        if (richEditorHistory != null) {
            richEditorHistory.flush();
        }
        TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) blockRow.block;
        pageblockmap.geo = messageMedia.geo;
        pageblockmap.zoom = 15;
        if (pageblockmap.w <= 0 || pageblockmap.h <= 0) {
            pageblockmap.w = 600;
            pageblockmap.h = 400;
        }
        RichEditorHistory richEditorHistory2 = this.listView.history;
        if (richEditorHistory2 != null) {
            richEditorHistory2.record();
        }
        updateSendButton(true);
        chatAttachAlert.dismiss(true);
        this.listView.post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$openLocationPicker$23(blockRow);
            }
        });
    }

    public void lambda$openLocationPicker$23(BlockRow blockRow) {
        View viewFindViewByItemObject = this.listView.findViewByItemObject(blockRow);
        if (viewFindViewByItemObject instanceof RichMapCell) {
            ((RichMapCell) viewFindViewByItemObject).bind(blockRow, this.listView.getMapDelegate());
        } else {
            this.listView.adapter.update(false);
        }
    }

    public void openAttach(int i, int i2) {
        if (this.parentAlert.baseFragment == null) {
            return;
        }
        final ChatAttachAlert chatAttachAlert = new ChatAttachAlert(getContext(), this.parentAlert.baseFragment, false, false, true, this.resourcesProvider);
        chatAttachAlert.setDelegate(new ChatAttachAlert.ChatAttachViewDelegate() {
            @Override
            public void didSelectBot(TLRPC.User user) {
            }

            @Override
            public boolean needEnterComment() {
                return false;
            }

            @Override
            public void onCameraOpened() {
            }

            @Override
            public void onWallpaperSelected(Object obj) {
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$onWallpaperSelected(this, obj);
            }

            @Override
            public void openAvatarsSearch() {
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$openAvatarsSearch(this);
            }

            @Override
            public boolean selectItemOnClicking() {
                return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$selectItemOnClicking(this);
            }

            @Override
            public void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i3, int i4, long j, boolean z2, long j2) {
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$sendAudio(this, arrayList, charSequence, z, i3, i4, j, z2, j2);
            }

            @Override
            public void didPressedButton(int i3, boolean z, boolean z2, int i4, int i5, long j, boolean z3, boolean z4, long j2) {
                if (i3 == 7 || i3 == 8) {
                    HashMap<Object, Object> selectedPhotos = chatAttachAlert.getPhotoLayout().getSelectedPhotos();
                    ArrayList<Object> selectedPhotosOrder = chatAttachAlert.getPhotoLayout().getSelectedPhotosOrder();
                    BlockRow blockRow = ChatAttachAlertRichLayout.this.listView.pendingMediaRow;
                    ChatAttachAlertRichLayout.this.listView.pendingMediaRow = null;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= selectedPhotosOrder.size()) {
                            break;
                        }
                        Object obj = selectedPhotos.get(selectedPhotosOrder.get(i6));
                        if (!(obj instanceof MediaController.PhotoEntry)) {
                            i6++;
                        } else if (blockRow != null) {
                            ChatAttachAlertRichLayout.this.listView.addMediaToRow(blockRow, (MediaController.PhotoEntry) obj);
                        } else {
                            ChatAttachAlertRichLayout.this.listView.attachMedia((MediaController.PhotoEntry) obj);
                        }
                    }
                }
                ChatAttachAlertRichLayout.this.listView.pendingMediaRow = null;
                chatAttachAlert.dismiss(true);
            }

            @Override
            public void doOnIdle(Runnable runnable) {
                NotificationCenter.getInstance(ChatAttachAlertRichLayout.this.currentAccount).doOnIdle(runnable);
            }
        });
        chatAttachAlert.getPhotoLayout().loadGalleryPhotos();
        chatAttachAlert.setMaxSelectedPhotos(1, true);
        chatAttachAlert.enablePollAttachMode(i);
        chatAttachAlert.setLocationActivityDelegate(new ChatAttachAlertLocationLayout.LocationActivityDelegate() {
            @Override
            public final void didSelectLocation(TLRPC.MessageMedia messageMedia, int i3, boolean z, int i4, long j) {
                this.f$0.lambda$openAttach$25(chatAttachAlert, messageMedia, i3, z, i4, j);
            }
        });
        chatAttachAlert.setAudioSelectDelegate(new ChatAttachAlertAudioLayout.AudioSelectDelegate() {
            @Override
            public final void didSelectAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i3, int i4, long j, boolean z2, long j2) {
                this.f$0.lambda$openAttach$26(chatAttachAlert, arrayList, charSequence, z, i3, i4, j, z2, j2);
            }
        });
        chatAttachAlert.init();
        if (i2 != 0) {
            chatAttachAlert.openAttachLayoutForType(i2);
        }
        chatAttachAlert.setFocusable(true);
        chatAttachAlert.show();
    }

    public void lambda$openAttach$25(ChatAttachAlert chatAttachAlert, TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        if (messageMedia == null || messageMedia.geo == null) {
            chatAttachAlert.dismiss(true);
            return;
        }
        TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
        pageblockmap.geo = messageMedia.geo;
        pageblockmap.zoom = 15;
        pageblockmap.w = 600;
        pageblockmap.h = 400;
        this.listView.addBlock(pageblockmap);
        updateSendButton(true);
        chatAttachAlert.dismiss(true);
    }

    public void lambda$openAttach$26(ChatAttachAlert chatAttachAlert, ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            this.listView.attachAudio((MessageObject) arrayList.get(0));
        }
        chatAttachAlert.dismiss(true);
    }

    public void onExternalMediaPicked(Intent intent) {
        if (intent == null || intent.getData() == null) {
            return;
        }
        this.listView.attachExternalMedia(intent.getData());
    }

    public void updateSendButtonLoading() {
        RichEditorToolbar richEditorToolbar = this.toolbar;
        if (richEditorToolbar != null) {
            richEditorToolbar.setSendLoading(this.listView.hasPendingUploads());
        }
        updateSendButton(true);
    }

    public void scheduleLimitCheck() {
        AndroidUtilities.cancelRunOnUIThread(this.limitCheckRunnable);
        AndroidUtilities.runOnUIThread(this.limitCheckRunnable, 1000L);
    }

    public void updateSendButtonEnabled() {
        RichEditorToolbar richEditorToolbar = this.toolbar;
        if (richEditorToolbar != null) {
            richEditorToolbar.setSendEnabled(this.listView.isWithinLimits());
        }
    }

    private void updateSendButtonLocked() {
        RichEditorToolbar richEditorToolbar = this.toolbar;
        if (richEditorToolbar != null) {
            richEditorToolbar.getSendButton().setLocked(!MessagesController.getInstance(this.currentAccount).richEditorAllowed());
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        updateSendButtonLocked();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.currentUserPremiumStatusChanged) {
            updateSendButtonLocked();
        }
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

    private void createEmojiView() {
        if (this.emojiView != null) {
            return;
        }
        EmojiView emojiView = new EmojiView(this.parentAlert.baseFragment, true, false, false, getContext(), true, null, this.parentAlert.sizeNotifierFrameLayout, true, this.resourcesProvider, false);
        this.emojiView = emojiView;
        emojiView.setVisibility(8);
        EmojiView emojiView2 = this.emojiView;
        emojiView2.fixBottomTabContainerTranslation = false;
        emojiView2.setBottomInset(AndroidUtilities.navigationBarHeight);
        this.emojiView.hideBottomTabContainerBackground();
        this.emojiView.setDelegate(new EmojiView.EmojiViewDelegate() {
            @Override
            public boolean canAddCaptionToGif(TLRPC.Document document) {
                return EmojiView.EmojiViewDelegate.CC.$default$canAddCaptionToGif(this, document);
            }

            @Override
            public boolean canSchedule() {
                return EmojiView.EmojiViewDelegate.CC.$default$canSchedule(this);
            }

            @Override
            public long getDialogId() {
                return EmojiView.EmojiViewDelegate.CC.$default$getDialogId(this);
            }

            @Override
            public float getProgressToSearchOpened() {
                return EmojiView.EmojiViewDelegate.CC.$default$getProgressToSearchOpened(this);
            }

            @Override
            public int getThreadId() {
                return EmojiView.EmojiViewDelegate.CC.$default$getThreadId(this);
            }

            @Override
            public void invalidateEnterView() {
                EmojiView.EmojiViewDelegate.CC.$default$invalidateEnterView(this);
            }

            @Override
            public boolean isExpanded() {
                return EmojiView.EmojiViewDelegate.CC.$default$isExpanded(this);
            }

            @Override
            public boolean isInScheduleMode() {
                return EmojiView.EmojiViewDelegate.CC.$default$isInScheduleMode(this);
            }

            @Override
            public boolean isUserSelf() {
                return EmojiView.EmojiViewDelegate.CC.$default$isUserSelf(this);
            }

            @Override
            public void onAnimatedEmojiUnlockClick() {
                EmojiView.EmojiViewDelegate.CC.$default$onAnimatedEmojiUnlockClick(this);
            }

            @Override
            public void onClearEmojiRecent() {
                EmojiView.EmojiViewDelegate.CC.$default$onClearEmojiRecent(this);
            }

            @Override
            public void onEmojiSettingsClick(ArrayList arrayList) {
                EmojiView.EmojiViewDelegate.CC.$default$onEmojiSettingsClick(this, arrayList);
            }

            @Override
            public void onGifSelected(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
                EmojiView.EmojiViewDelegate.CC.$default$onGifSelected(this, view, obj, str, obj2, z, i, i2);
            }

            @Override
            public void onGifSelectedForAddCaption(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
                EmojiView.EmojiViewDelegate.CC.$default$onGifSelectedForAddCaption(this, view, obj, str, obj2, z, i, i2);
            }

            @Override
            public void onShowStickerSet(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z) {
                EmojiView.EmojiViewDelegate.CC.$default$onShowStickerSet(this, stickerSet, inputStickerSet, z);
            }

            @Override
            public void onStickerSelected(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z, int i, int i2) {
                EmojiView.EmojiViewDelegate.CC.$default$onStickerSelected(this, view, document, str, obj, sendAnimationData, z, i, i2);
            }

            @Override
            public void onStickerSetAdd(TLRPC.StickerSetCovered stickerSetCovered) {
                EmojiView.EmojiViewDelegate.CC.$default$onStickerSetAdd(this, stickerSetCovered);
            }

            @Override
            public void onStickerSetRemove(TLRPC.StickerSetCovered stickerSetCovered) {
                EmojiView.EmojiViewDelegate.CC.$default$onStickerSetRemove(this, stickerSetCovered);
            }

            @Override
            public void onStickersGroupClick(long j) {
                EmojiView.EmojiViewDelegate.CC.$default$onStickersGroupClick(this, j);
            }

            @Override
            public void onStickersSettingsClick() {
                EmojiView.EmojiViewDelegate.CC.$default$onStickersSettingsClick(this);
            }

            @Override
            public void onTabOpened(int i) {
                EmojiView.EmojiViewDelegate.CC.$default$onTabOpened(this, i);
            }

            @Override
            public void showTrendingStickersAlert(TrendingStickersLayout trendingStickersLayout) {
                EmojiView.EmojiViewDelegate.CC.$default$showTrendingStickersAlert(this, trendingStickersLayout);
            }

            @Override
            public void onSearchOpenClose(int i) {
                RichEditText focusedEditTextOrNull;
                if (i != 0 && (focusedEditTextOrNull = ChatAttachAlertRichLayout.this.listView.getFocusedEditTextOrNull()) != null) {
                    ChatAttachAlertRichLayout.this.emojiTargetEditText = focusedEditTextOrNull;
                    ChatAttachAlertRichLayout.this.emojiTargetSelection = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
                }
                ChatAttachAlertRichLayout.this.emojiSearchOpened = i != 0;
                ChatAttachAlertRichLayout.this.layoutBottomPanels();
            }

            @Override
            public boolean isSearchOpened() {
                return ChatAttachAlertRichLayout.this.emojiSearchOpened;
            }

            @Override
            public boolean onBackspace() {
                RichEditText richEditTextResolveEmojiTarget = ChatAttachAlertRichLayout.this.resolveEmojiTarget();
                if (richEditTextResolveEmojiTarget == null || richEditTextResolveEmojiTarget.length() == 0) {
                    return false;
                }
                richEditTextResolveEmojiTarget.dispatchKeyEvent(new KeyEvent(0, 67));
                return true;
            }

            @Override
            public void onEmojiSelected(String str) {
                RichEditText richEditTextResolveEmojiTarget = ChatAttachAlertRichLayout.this.resolveEmojiTarget();
                if (richEditTextResolveEmojiTarget == null) {
                    return;
                }
                int iResolveEmojiTargetOffset = ChatAttachAlertRichLayout.this.resolveEmojiTargetOffset(richEditTextResolveEmojiTarget);
                try {
                    CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji((CharSequence) str, richEditTextResolveEmojiTarget.getPaint().getFontMetricsInt(), false, (int[]) null);
                    richEditTextResolveEmojiTarget.setText(richEditTextResolveEmojiTarget.getText().insert(iResolveEmojiTargetOffset, charSequenceReplaceEmoji));
                    int length = iResolveEmojiTargetOffset + charSequenceReplaceEmoji.length();
                    richEditTextResolveEmojiTarget.setSelection(length, length);
                    if (richEditTextResolveEmojiTarget == ChatAttachAlertRichLayout.this.emojiTargetEditText) {
                        ChatAttachAlertRichLayout.this.emojiTargetSelection = length;
                    }
                } catch (Exception unused) {
                }
            }

            @Override
            public void onCustomEmojiSelected(long j, TLRPC.Document document, String str, boolean z) {
                AnimatedEmojiSpan animatedEmojiSpan;
                RichEditText richEditTextResolveEmojiTarget = ChatAttachAlertRichLayout.this.resolveEmojiTarget();
                if (richEditTextResolveEmojiTarget == null) {
                    return;
                }
                int iResolveEmojiTargetOffset = ChatAttachAlertRichLayout.this.resolveEmojiTargetOffset(richEditTextResolveEmojiTarget);
                try {
                    if (str == null) {
                        str = "😀";
                    }
                    SpannableString spannableString = new SpannableString(str);
                    if (document != null) {
                        animatedEmojiSpan = new AnimatedEmojiSpan(document, richEditTextResolveEmojiTarget.getPaint().getFontMetricsInt());
                    } else {
                        animatedEmojiSpan = new AnimatedEmojiSpan(j, richEditTextResolveEmojiTarget.getPaint().getFontMetricsInt());
                    }
                    animatedEmojiSpan.cacheType = AnimatedEmojiDrawable.getCacheTypeForEnterView();
                    spannableString.setSpan(animatedEmojiSpan, 0, spannableString.length(), 33);
                    richEditTextResolveEmojiTarget.setText(richEditTextResolveEmojiTarget.getText().insert(iResolveEmojiTargetOffset, spannableString));
                    int length = iResolveEmojiTargetOffset + spannableString.length();
                    richEditTextResolveEmojiTarget.setSelection(length, length);
                    if (richEditTextResolveEmojiTarget == ChatAttachAlertRichLayout.this.emojiTargetEditText) {
                        ChatAttachAlertRichLayout.this.emojiTargetSelection = length;
                    }
                } catch (Exception unused) {
                }
            }
        });
        addView(this.emojiView, LayoutHelper.createFrame(-1, getEmojiPanelHeight(), 87));
    }

    public RichEditText resolveEmojiTarget() {
        RichEditText focusedEditTextOrNull = this.listView.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            this.emojiTargetEditText = focusedEditTextOrNull;
            this.emojiTargetSelection = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        RichEditText richEditText = this.emojiTargetEditText;
        return richEditText != null ? richEditText : this.listView.findFocusedEditText();
    }

    public int resolveEmojiTargetOffset(RichEditText richEditText) {
        if (richEditText == this.emojiTargetEditText && this.listView.getFocusedEditTextOrNull() != richEditText) {
            return Math.min(this.emojiTargetSelection, richEditText.length());
        }
        return Math.max(0, richEditText.getSelectionEnd());
    }

    public void toggleEmojiPopup() {
        if (this.emojiViewVisible) {
            RichEditText richEditTextFindFocusedEditText = this.listView.findFocusedEditText();
            if (richEditTextFindFocusedEditText != null) {
                richEditTextFindFocusedEditText.requestEditFocus();
                AndroidUtilities.showKeyboard(richEditTextFindFocusedEditText);
            }
            hideEmojiPopup(true);
            return;
        }
        showEmojiPopup();
    }

    private void showEmojiPopup() {
        createEmojiView();
        int emojiPanelHeight = getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.emojiView.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        this.emojiView.setLayoutParams(layoutParams);
        this.emojiView.setTranslationY(0.0f);
        this.emojiView.setVisibility(0);
        this.emojiViewVisible = true;
        this.emojiPadding = emojiPanelHeight;
        RichEditText richEditTextFindFocusedEditText = this.listView.findFocusedEditText();
        if (richEditTextFindFocusedEditText != null) {
            AndroidUtilities.hideKeyboard(richEditTextFindFocusedEditText);
        }
        RichEditorToolbar richEditorToolbar = this.toolbar;
        if (richEditorToolbar != null) {
            richEditorToolbar.setEmojiOpened(true);
        }
        updateAttachButtons(false);
        requestLayout();
    }

    private void hideEmojiPopup() {
        hideEmojiPopup(false);
    }

    private void hideEmojiPopup(boolean z) {
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
        requestLayout();
    }

    private void closeEmojiSearch() {
        if (this.emojiSearchOpened) {
            this.emojiSearchOpened = false;
            EmojiView emojiView = this.emojiView;
            if (emojiView != null) {
                emojiView.closeSearch(false);
                this.emojiView.hideSearchKeyboard();
            }
            layoutBottomPanels();
        }
    }

    @Override
    public void onDestroy() {
        MessageSendPreview messageSendPreview = this.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.dismissInstant();
            this.messageSendPreview = null;
        }
        RichCommandSuggestions richCommandSuggestions = this.commandSuggestions;
        if (richCommandSuggestions != null) {
            richCommandSuggestions.hide();
        }
        RichEditorListView richEditorListView = this.listView;
        if (richEditorListView != null) {
            richEditorListView.clearContent();
        }
        EmojiView emojiView = this.emojiView;
        if (emojiView != null) {
            emojiView.onDestroy();
        }
    }

    public static void showEditLatexSheet(Context context, final String str, final Utilities.Callback callback, final Theme.ResourcesProvider resourcesProvider) {
        BottomSheet.Builder builder = new BottomSheet.Builder(context, true, resourcesProvider);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        final String[] strArr = {str == null ? "" : str};
        final ImageView imageView = new ImageView(context);
        imageView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(8.0f), Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider), 0.05f)));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        final HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        linearLayout.addView(horizontalScrollView, LayoutHelper.createLinear(-1, -2, 49, 12, 2, 12, 0));
        final ButtonWithCounterView round = new ButtonWithCounterView(context, resourcesProvider).setRound();
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        final int[] iArr = {6};
        final Utilities.Callback2 callback2 = new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                ChatAttachAlertRichLayout.lambda$showEditLatexSheet$29(strArr, (String) obj, (Utilities.Callback2) obj2);
            }
        };
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlertRichLayout.lambda$showEditLatexSheet$31(strArr, horizontalScrollView, round, zArr2, callback2, imageView, resourcesProvider, iArr);
            }
        };
        final EditTextCell editTextCell = new EditTextCell(context, LocaleController.getString(R.string.ArticleLatexEquation), true, false, -1, resourcesProvider);
        editTextCell.editText.setImeOptions(6);
        editTextCell.editText.setMaxLines(5);
        editTextCell.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(24.0f), Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider)));
        editTextCell.setText(strArr[0]);
        editTextCell.editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                strArr[0] = editable.toString();
                runnable.run();
            }
        });
        linearLayout.addView(editTextCell, LayoutHelper.createLinear(-1, -2, 55, 12, 8, 12, 0));
        round.setText(LocaleController.getString(R.string.Done));
        linearLayout.addView(round, LayoutHelper.createLinear(-1, 48, 55, 12, 12, 12, 12));
        runnable.run();
        builder.setCustomView(linearLayout);
        builder.setOnPreDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                ChatAttachAlertRichLayout.lambda$showEditLatexSheet$32(editTextCell, zArr, zArr2, str, strArr, callback, dialogInterface);
            }
        });
        final BottomSheet bottomSheetShow = builder.show();
        int i = Theme.key_windowBackgroundGray;
        bottomSheetShow.setBackgroundColor(Theme.getColor(i, resourcesProvider));
        bottomSheetShow.fixNavigationBar(Theme.getColor(i, resourcesProvider));
        round.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatAttachAlertRichLayout.lambda$showEditLatexSheet$33(round, zArr, callback, strArr, bottomSheetShow, view);
            }
        });
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlertRichLayout.lambda$showEditLatexSheet$34(editTextCell);
            }
        }, 200L);
    }

    public static void lambda$showEditLatexSheet$29(final String[] strArr, String str, final Utilities.Callback2 callback2) {
        Utilities.themeQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlertRichLayout.lambda$showEditLatexSheet$28(strArr, callback2);
            }
        });
    }

    public static void lambda$showEditLatexSheet$28(String[] strArr, final Utilities.Callback2 callback2) {
        final boolean z = true;
        final Bitmap bitmap = null;
        try {
            JLatexMathDrawable jLatexMathDrawableBuild = JLatexMathDrawable.builder(strArr[0]).textSize(AndroidUtilities.dp(26.0f)).build();
            int intrinsicWidth = jLatexMathDrawableBuild.getIntrinsicWidth();
            int intrinsicHeight = jLatexMathDrawableBuild.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ALPHA_8);
                jLatexMathDrawableBuild.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                jLatexMathDrawableBuild.draw(new Canvas(bitmapCreateBitmap));
                bitmap = bitmapCreateBitmap;
                z = false;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (z) {
            try {
                JLatexMathDrawable jLatexMathDrawableBuild2 = JLatexMathDrawable.builder(LocaleController.getString(R.string.ArticleLatexError)).textSize(AndroidUtilities.dp(26.0f)).build();
                int intrinsicWidth2 = jLatexMathDrawableBuild2.getIntrinsicWidth();
                int intrinsicHeight2 = jLatexMathDrawableBuild2.getIntrinsicHeight();
                if (intrinsicWidth2 > 0 && intrinsicHeight2 > 0) {
                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(intrinsicWidth2, intrinsicHeight2, Bitmap.Config.ALPHA_8);
                    jLatexMathDrawableBuild2.setBounds(0, 0, intrinsicWidth2, intrinsicHeight2);
                    jLatexMathDrawableBuild2.draw(new Canvas(bitmapCreateBitmap2));
                    bitmap = bitmapCreateBitmap2;
                }
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlertRichLayout.lambda$showEditLatexSheet$27(callback2, bitmap, z);
            }
        });
    }

    public static void lambda$showEditLatexSheet$27(Utilities.Callback2 callback2, Bitmap bitmap, boolean z) {
        callback2.run(bitmap, Boolean.valueOf(z));
    }

    public static void lambda$showEditLatexSheet$31(final String[] strArr, final HorizontalScrollView horizontalScrollView, final ButtonWithCounterView buttonWithCounterView, final boolean[] zArr, Utilities.Callback2 callback2, final ImageView imageView, final Theme.ResourcesProvider resourcesProvider, final int[] iArr) {
        if (TextUtils.isEmpty(strArr[0].trim())) {
            horizontalScrollView.setVisibility(8);
            buttonWithCounterView.setEnabled(false);
        } else {
            final boolean z = zArr[0];
            final String str = strArr[0];
            callback2.run(str, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    ChatAttachAlertRichLayout.lambda$showEditLatexSheet$30(str, strArr, imageView, resourcesProvider, z, iArr, buttonWithCounterView, horizontalScrollView, zArr, (Bitmap) obj, (Boolean) obj2);
                }
            });
        }
    }

    public static void lambda$showEditLatexSheet$30(String str, String[] strArr, ImageView imageView, Theme.ResourcesProvider resourcesProvider, boolean z, int[] iArr, ButtonWithCounterView buttonWithCounterView, HorizontalScrollView horizontalScrollView, boolean[] zArr, Bitmap bitmap, Boolean bool) {
        if (TextUtils.equals(str, strArr[0])) {
            if (bool.booleanValue()) {
                imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_text_RedBold, resourcesProvider), PorterDuff.Mode.SRC_IN));
                if (!z) {
                    int i = -iArr[0];
                    iArr[0] = i;
                    AndroidUtilities.shakeViewSpring(imageView, i);
                }
            } else {
                imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider), PorterDuff.Mode.SRC_IN));
            }
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
            }
            buttonWithCounterView.setEnabled(!bool.booleanValue());
            horizontalScrollView.setVisibility(bitmap != null ? 0 : 8);
            zArr[0] = bool.booleanValue();
        }
    }

    public static void lambda$showEditLatexSheet$32(EditTextCell editTextCell, boolean[] zArr, boolean[] zArr2, String str, String[] strArr, Utilities.Callback callback, DialogInterface dialogInterface) {
        editTextCell.editText.clearFocus();
        AndroidUtilities.hideKeyboard(editTextCell.editText);
        if (zArr[0] || zArr2[0] || TextUtils.equals(str, strArr[0])) {
            return;
        }
        zArr[0] = true;
        callback.run(strArr[0]);
    }

    public static void lambda$showEditLatexSheet$33(ButtonWithCounterView buttonWithCounterView, boolean[] zArr, Utilities.Callback callback, String[] strArr, BottomSheet bottomSheet, View view) {
        if (buttonWithCounterView.isEnabled()) {
            if (!zArr[0]) {
                zArr[0] = true;
                callback.run(strArr[0]);
            }
            bottomSheet.lambda$new$0();
        }
    }

    public static void lambda$showEditLatexSheet$34(EditTextCell editTextCell) {
        editTextCell.editText.requestFocus();
        AndroidUtilities.showKeyboard(editTextCell.editText);
    }
}
