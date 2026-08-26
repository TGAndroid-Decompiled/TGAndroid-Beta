package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda267;
import org.telegram.ui.Components.AIEditorAlert;
import org.telegram.ui.Components.AiButtonDrawable;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatActivityEnterViewAnimatedIconView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda44;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda7;

public final class RichEditorToolbar extends FrameLayout {
    public final ImageView addButton;
    public final ImageView backButton;
    public final ArrayList blockButtons;
    public final LinearLayout blocksLayout;
    public final FrameLayout bottomContainer;
    public final View bottomGradient;
    public final FrameLayout bottomInnerContainer;
    public final LinearLayout bottomPanel;
    public final RichEditor.Button dateButton;
    public final ChatAttachAlertRichLayout.AnonymousClass2 delegate;
    public final ChatActivityEnterViewAnimatedIconView emojiButton;
    public final ArrayList formattingButtons;
    public final LinearLayout formattingLayout1;
    public final LinearLayout formattingLayout2;
    public final LinearLayout formattingLayout3;
    public final PhotoViewer.AnonymousClass35 formattingPanel;
    public final LinearLayout formattingPanelLayout;
    public int formattingScrollMaxWidth;
    public final LinearLayout historyButtons;
    public final RichEditor.Button inlineButton;
    public final RichEditor.Button linkButton;
    public final RichEditor.Button mathButton;
    public int panelType;
    public final ArrayList premiumButtons;
    public final RichEditor.Button quoteButton;
    public final ImageView redoButton;
    public int reorderSavedPanelType;
    public final Theme.ResourcesProvider resourcesProvider;
    public final RichEditor.AnonymousClass9 sendButton;
    public boolean sendLoading;
    public final View topGradient;
    public final FrameLayout topPanel;
    public boolean trashHovered;
    public final FrameLayout trashPanel;
    public final RLottieImageView trashPanelIcon;
    public final ImageView undoButton;

    public RichEditorToolbar(Context context, final ChatAttachAlertRichLayout.AnonymousClass2 anonymousClass2) {
        super(context);
        this.formattingScrollMaxWidth = Integer.MAX_VALUE;
        this.blockButtons = new ArrayList();
        this.formattingButtons = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.premiumButtons = arrayList;
        this.panelType = -1;
        this.reorderSavedPanelType = 0;
        this.delegate = anonymousClass2;
        Theme.ResourcesProvider resourcesProvider = ChatAttachAlertRichLayout.this.resourcesProvider;
        this.resourcesProvider = resourcesProvider;
        setClipChildren(false);
        setClipToPadding(false);
        View view = new View(context);
        this.topGradient = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i = Theme.key_windowBackgroundWhite;
        view.setBackground(new GradientDrawable(orientation, new int[]{Theme.getColor(i, resourcesProvider), Theme.multAlpha(0.0f, Theme.getColor(i, resourcesProvider))}));
        addView(view, LayoutHelper.createFrame(-1, 68, 55));
        View view2 = new View(context);
        this.bottomGradient = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{Theme.multAlpha(0.0f, Theme.getColor(i, resourcesProvider)), Theme.getColor(i, resourcesProvider)}));
        addView(view2, LayoutHelper.createFrame(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.topPanel = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, LayoutHelper.createFrame(-1, -1, 55));
        ImageView imageView = new ImageView(context);
        this.backButton = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i2 = Theme.key_glass_targetMainTabs;
        int color = Theme.getColor(i2, resourcesProvider);
        int color2 = Theme.getColor(i2, resourcesProvider);
        int i3 = Theme.key_listSelector;
        imageView.setBackground(new RichEditor.ShadowWrapperDrawable(Theme.createRadSelectorDrawable(color, Theme.blendOver(color2, Theme.getColor(i3, resourcesProvider)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        int i4 = Theme.key_windowBackgroundWhiteBlackText;
        int color3 = Theme.getColor(i4, resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(color3, mode));
        ScaleStateListAnimator.apply(imageView, 0.1f, 1.5f);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        imageView.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda267(anonymousClass2));
        frameLayout.addView(imageView, LayoutHelper.createFrame(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.historyButtons = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(new RichEditor.ShadowWrapperDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), Theme.getColor(i2, resourcesProvider))));
        frameLayout.addView(linearLayout, LayoutHelper.createFrame(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView2 = new ImageView(context);
        this.undoButton = imageView2;
        imageView2.setImageResource(R.drawable.iv_undo);
        imageView2.setScaleType(scaleType);
        imageView2.setBackground(Theme.createSelectorDrawable(Theme.getColor(i3, resourcesProvider), 1, -1));
        imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i4, resourcesProvider), mode));
        ScaleStateListAnimator.apply(imageView2, 0.1f, 1.5f);
        imageView2.setContentDescription("Undo");
        final int i5 = 7;
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (i5) {
                    case 0:
                        ChatAttachAlertRichLayout.this.listView.onMathClicked();
                        break;
                    case 1:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
                        chatAttachAlertRichLayout.listView.toggleQuoteOnSelection();
                        chatAttachAlertRichLayout.updateFormattingButtons();
                        break;
                    case 2:
                        ChatAttachAlertRichLayout.this.listView.onInlineButtonClicked(view3);
                        break;
                    case 3:
                        ChatAttachAlertRichLayout.this.listView.onLinkClicked();
                        break;
                    case 4:
                        ChatAttachAlertRichLayout.this.listView.onDateClicked();
                        break;
                    case 5:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout2 = ChatAttachAlertRichLayout.this;
                        RichEditorListView.AnonymousClass4 anonymousClass4BeginSelectionEdit = chatAttachAlertRichLayout2.listView.beginSelectionEdit();
                        if (anonymousClass4BeginSelectionEdit != null) {
                            TL_iv.RichMessage richMessageExtractRichMessage = anonymousClass4BeginSelectionEdit.extractRichMessage();
                            if (!richMessageExtractRichMessage.blocks.isEmpty()) {
                                AIEditorAlert aIEditorAlert = new AIEditorAlert(chatAttachAlertRichLayout2.getContext(), chatAttachAlertRichLayout2.resourcesProvider);
                                aIEditorAlert.setText(richMessageExtractRichMessage);
                                aIEditorAlert.onUseRichListener = new VoIPFragment$$ExternalSyntheticLambda7(anonymousClass4BeginSelectionEdit, 26);
                                aIEditorAlert.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        ChatAttachAlertRichLayout.this.sendSelectedItems(0, true, 0, false, 0L);
                        break;
                    case 7:
                        RichEditorHistory richEditorHistory = ChatAttachAlertRichLayout.this.listView.history;
                        if (richEditorHistory != null) {
                            richEditorHistory.undo();
                        }
                        break;
                    case 8:
                        RichEditorHistory richEditorHistory2 = ChatAttachAlertRichLayout.this.listView.history;
                        if (richEditorHistory2 != null) {
                            richEditorHistory2.redo();
                        }
                        break;
                    case 9:
                        ChatAttachAlertRichLayout.AnonymousClass2 anonymousClass3 = anonymousClass2;
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout3 = ChatAttachAlertRichLayout.this;
                        new RichAIComposeSheet(chatAttachAlertRichLayout3.currentAccount, chatAttachAlertRichLayout3.getContext(), new VoIPFragment$$ExternalSyntheticLambda7(anonymousClass3, 27), chatAttachAlertRichLayout3.resourcesProvider).show();
                        break;
                    case 10:
                        ChatAttachAlertRichLayout.access$2100(ChatAttachAlertRichLayout.this);
                        break;
                    default:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout4 = ChatAttachAlertRichLayout.this;
                        chatAttachAlertRichLayout4.listView.pendingMediaRow = null;
                        chatAttachAlertRichLayout4.openAttach(90, 0);
                        break;
                }
            }
        });
        linearLayout.addView(imageView2, LayoutHelper.createLinear(41, 41, 16));
        ImageView imageView3 = new ImageView(context);
        this.redoButton = imageView3;
        imageView3.setImageResource(R.drawable.iv_redo);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(Theme.createSelectorDrawable(Theme.getColor(i3, resourcesProvider), 1, -1));
        imageView3.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i4, resourcesProvider), mode));
        ScaleStateListAnimator.apply(imageView3, 0.1f, 1.5f);
        imageView3.setContentDescription("Redo");
        final int i6 = 8;
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (i6) {
                    case 0:
                        ChatAttachAlertRichLayout.this.listView.onMathClicked();
                        break;
                    case 1:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
                        chatAttachAlertRichLayout.listView.toggleQuoteOnSelection();
                        chatAttachAlertRichLayout.updateFormattingButtons();
                        break;
                    case 2:
                        ChatAttachAlertRichLayout.this.listView.onInlineButtonClicked(view3);
                        break;
                    case 3:
                        ChatAttachAlertRichLayout.this.listView.onLinkClicked();
                        break;
                    case 4:
                        ChatAttachAlertRichLayout.this.listView.onDateClicked();
                        break;
                    case 5:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout2 = ChatAttachAlertRichLayout.this;
                        RichEditorListView.AnonymousClass4 anonymousClass4BeginSelectionEdit = chatAttachAlertRichLayout2.listView.beginSelectionEdit();
                        if (anonymousClass4BeginSelectionEdit != null) {
                            TL_iv.RichMessage richMessageExtractRichMessage = anonymousClass4BeginSelectionEdit.extractRichMessage();
                            if (!richMessageExtractRichMessage.blocks.isEmpty()) {
                                AIEditorAlert aIEditorAlert = new AIEditorAlert(chatAttachAlertRichLayout2.getContext(), chatAttachAlertRichLayout2.resourcesProvider);
                                aIEditorAlert.setText(richMessageExtractRichMessage);
                                aIEditorAlert.onUseRichListener = new VoIPFragment$$ExternalSyntheticLambda7(anonymousClass4BeginSelectionEdit, 26);
                                aIEditorAlert.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        ChatAttachAlertRichLayout.this.sendSelectedItems(0, true, 0, false, 0L);
                        break;
                    case 7:
                        RichEditorHistory richEditorHistory = ChatAttachAlertRichLayout.this.listView.history;
                        if (richEditorHistory != null) {
                            richEditorHistory.undo();
                        }
                        break;
                    case 8:
                        RichEditorHistory richEditorHistory2 = ChatAttachAlertRichLayout.this.listView.history;
                        if (richEditorHistory2 != null) {
                            richEditorHistory2.redo();
                        }
                        break;
                    case 9:
                        ChatAttachAlertRichLayout.AnonymousClass2 anonymousClass3 = anonymousClass2;
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout3 = ChatAttachAlertRichLayout.this;
                        new RichAIComposeSheet(chatAttachAlertRichLayout3.currentAccount, chatAttachAlertRichLayout3.getContext(), new VoIPFragment$$ExternalSyntheticLambda7(anonymousClass3, 27), chatAttachAlertRichLayout3.resourcesProvider).show();
                        break;
                    case 10:
                        ChatAttachAlertRichLayout.access$2100(ChatAttachAlertRichLayout.this);
                        break;
                    default:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout4 = ChatAttachAlertRichLayout.this;
                        chatAttachAlertRichLayout4.listView.pendingMediaRow = null;
                        chatAttachAlertRichLayout4.openAttach(90, 0);
                        break;
                }
            }
        });
        linearLayout.addView(imageView3, LayoutHelper.createLinear(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.bottomContainer = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        addView(frameLayout2, LayoutHelper.createFrame(-1, -1, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.bottomInnerContainer = frameLayout3;
        frameLayout3.setClipChildren(false);
        frameLayout3.setClipToPadding(false);
        frameLayout2.addView(frameLayout3, LayoutHelper.createFrame(-1, 60, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.bottomPanel = linearLayout2;
        linearLayout2.setClipToPadding(false);
        linearLayout2.setClipChildren(false);
        linearLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout3.addView(linearLayout2, LayoutHelper.createFrame(-1, 60, 87));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageDrawable(new AiButtonDrawable(context));
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i4, resourcesProvider), mode));
        imageView4.setBackground(new RichEditor.ShadowWrapperDrawable(Theme.createRadSelectorDrawable(Theme.getColor(i2, resourcesProvider), Theme.blendOver(Theme.getColor(i2, resourcesProvider), Theme.getColor(i3, resourcesProvider)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        linearLayout2.addView(imageView4, LayoutHelper.createLinear(44, 44, 0.0f, 19, 0, 0, 8, 0));
        ScaleStateListAnimator.apply(imageView4, 0.1f, 1.5f);
        imageView4.setContentDescription("AI");
        final int i7 = 9;
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (i7) {
                    case 0:
                        ChatAttachAlertRichLayout.this.listView.onMathClicked();
                        break;
                    case 1:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
                        chatAttachAlertRichLayout.listView.toggleQuoteOnSelection();
                        chatAttachAlertRichLayout.updateFormattingButtons();
                        break;
                    case 2:
                        ChatAttachAlertRichLayout.this.listView.onInlineButtonClicked(view3);
                        break;
                    case 3:
                        ChatAttachAlertRichLayout.this.listView.onLinkClicked();
                        break;
                    case 4:
                        ChatAttachAlertRichLayout.this.listView.onDateClicked();
                        break;
                    case 5:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout2 = ChatAttachAlertRichLayout.this;
                        RichEditorListView.AnonymousClass4 anonymousClass4BeginSelectionEdit = chatAttachAlertRichLayout2.listView.beginSelectionEdit();
                        if (anonymousClass4BeginSelectionEdit != null) {
                            TL_iv.RichMessage richMessageExtractRichMessage = anonymousClass4BeginSelectionEdit.extractRichMessage();
                            if (!richMessageExtractRichMessage.blocks.isEmpty()) {
                                AIEditorAlert aIEditorAlert = new AIEditorAlert(chatAttachAlertRichLayout2.getContext(), chatAttachAlertRichLayout2.resourcesProvider);
                                aIEditorAlert.setText(richMessageExtractRichMessage);
                                aIEditorAlert.onUseRichListener = new VoIPFragment$$ExternalSyntheticLambda7(anonymousClass4BeginSelectionEdit, 26);
                                aIEditorAlert.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        ChatAttachAlertRichLayout.this.sendSelectedItems(0, true, 0, false, 0L);
                        break;
                    case 7:
                        RichEditorHistory richEditorHistory = ChatAttachAlertRichLayout.this.listView.history;
                        if (richEditorHistory != null) {
                            richEditorHistory.undo();
                        }
                        break;
                    case 8:
                        RichEditorHistory richEditorHistory2 = ChatAttachAlertRichLayout.this.listView.history;
                        if (richEditorHistory2 != null) {
                            richEditorHistory2.redo();
                        }
                        break;
                    case 9:
                        ChatAttachAlertRichLayout.AnonymousClass2 anonymousClass3 = anonymousClass2;
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout3 = ChatAttachAlertRichLayout.this;
                        new RichAIComposeSheet(chatAttachAlertRichLayout3.currentAccount, chatAttachAlertRichLayout3.getContext(), new VoIPFragment$$ExternalSyntheticLambda7(anonymousClass3, 27), chatAttachAlertRichLayout3.resourcesProvider).show();
                        break;
                    case 10:
                        ChatAttachAlertRichLayout.access$2100(ChatAttachAlertRichLayout.this);
                        break;
                    default:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout4 = ChatAttachAlertRichLayout.this;
                        chatAttachAlertRichLayout4.listView.pendingMediaRow = null;
                        chatAttachAlertRichLayout4.openAttach(90, 0);
                        break;
                }
            }
        });
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setBackground(new RichEditor.ShadowWrapperDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), Theme.getColor(i, resourcesProvider))));
        frameLayout4.addView(frameLayout5, LayoutHelper.createFrame(-2, 44, 81));
        RichEditor.AnonymousClass4 anonymousClass4 = new RichEditor.AnonymousClass4(context, 1);
        anonymousClass4.setClipToOutline(true);
        anonymousClass4.setOutlineProvider(new RichEditor.AnonymousClass5(21));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.blocksLayout = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout3.setOrientation(0);
        anonymousClass4.addView(linearLayout3);
        frameLayout5.addView(anonymousClass4, LayoutHelper.createFrame(-1.0f, -1));
        ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView = new ChatActivityEnterViewAnimatedIconView(context, 24);
        this.emojiButton = chatActivityEnterViewAnimatedIconView;
        chatActivityEnterViewAnimatedIconView.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        chatActivityEnterViewAnimatedIconView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i4, resourcesProvider), mode));
        chatActivityEnterViewAnimatedIconView.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(i, resourcesProvider), Theme.getColor(i3, resourcesProvider), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        chatActivityEnterViewAnimatedIconView.setState(ChatActivityEnterViewAnimatedIconView.State.SMILE, false);
        linearLayout3.addView(chatActivityEnterViewAnimatedIconView, LayoutHelper.createLinear(38, 38, 16));
        ScaleStateListAnimator.apply(chatActivityEnterViewAnimatedIconView, 0.1f, 1.5f);
        chatActivityEnterViewAnimatedIconView.setContentDescription("Emoji");
        final int i8 = 10;
        chatActivityEnterViewAnimatedIconView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (i8) {
                    case 0:
                        ChatAttachAlertRichLayout.this.listView.onMathClicked();
                        break;
                    case 1:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
                        chatAttachAlertRichLayout.listView.toggleQuoteOnSelection();
                        chatAttachAlertRichLayout.updateFormattingButtons();
                        break;
                    case 2:
                        ChatAttachAlertRichLayout.this.listView.onInlineButtonClicked(view3);
                        break;
                    case 3:
                        ChatAttachAlertRichLayout.this.listView.onLinkClicked();
                        break;
                    case 4:
                        ChatAttachAlertRichLayout.this.listView.onDateClicked();
                        break;
                    case 5:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout2 = ChatAttachAlertRichLayout.this;
                        RichEditorListView.AnonymousClass4 anonymousClass4BeginSelectionEdit = chatAttachAlertRichLayout2.listView.beginSelectionEdit();
                        if (anonymousClass4BeginSelectionEdit != null) {
                            TL_iv.RichMessage richMessageExtractRichMessage = anonymousClass4BeginSelectionEdit.extractRichMessage();
                            if (!richMessageExtractRichMessage.blocks.isEmpty()) {
                                AIEditorAlert aIEditorAlert = new AIEditorAlert(chatAttachAlertRichLayout2.getContext(), chatAttachAlertRichLayout2.resourcesProvider);
                                aIEditorAlert.setText(richMessageExtractRichMessage);
                                aIEditorAlert.onUseRichListener = new VoIPFragment$$ExternalSyntheticLambda7(anonymousClass4BeginSelectionEdit, 26);
                                aIEditorAlert.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        ChatAttachAlertRichLayout.this.sendSelectedItems(0, true, 0, false, 0L);
                        break;
                    case 7:
                        RichEditorHistory richEditorHistory = ChatAttachAlertRichLayout.this.listView.history;
                        if (richEditorHistory != null) {
                            richEditorHistory.undo();
                        }
                        break;
                    case 8:
                        RichEditorHistory richEditorHistory2 = ChatAttachAlertRichLayout.this.listView.history;
                        if (richEditorHistory2 != null) {
                            richEditorHistory2.redo();
                        }
                        break;
                    case 9:
                        ChatAttachAlertRichLayout.AnonymousClass2 anonymousClass3 = anonymousClass2;
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout3 = ChatAttachAlertRichLayout.this;
                        new RichAIComposeSheet(chatAttachAlertRichLayout3.currentAccount, chatAttachAlertRichLayout3.getContext(), new VoIPFragment$$ExternalSyntheticLambda7(anonymousClass3, 27), chatAttachAlertRichLayout3.resourcesProvider).show();
                        break;
                    case 10:
                        ChatAttachAlertRichLayout.access$2100(ChatAttachAlertRichLayout.this);
                        break;
                    default:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout4 = ChatAttachAlertRichLayout.this;
                        chatAttachAlertRichLayout4.listView.pendingMediaRow = null;
                        chatAttachAlertRichLayout4.openAttach(90, 0);
                        break;
                }
            }
        });
        addBlockButton(R.drawable.iv_text, 1, false);
        addBlockButton(R.drawable.iv_lists, 2, true);
        addBlockButton(R.drawable.iv_table, 4, true);
        int i9 = R.drawable.iv_math;
        addBlockButton(i9, 7, true);
        ImageView imageView5 = new ImageView(context);
        this.addButton = imageView5;
        imageView5.setImageResource(R.drawable.outline_poll_attach_24);
        imageView5.setScaleType(scaleType);
        imageView5.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i4, resourcesProvider), mode));
        imageView5.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(i, resourcesProvider), Theme.getColor(i3, resourcesProvider), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        linearLayout3.addView(imageView5, LayoutHelper.createLinear(38, 38, 16, 2, 0, 0, 0));
        ScaleStateListAnimator.apply(imageView5, 0.1f, 1.5f);
        imageView5.setContentDescription("Attach");
        final int i10 = 11;
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (i10) {
                    case 0:
                        ChatAttachAlertRichLayout.this.listView.onMathClicked();
                        break;
                    case 1:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
                        chatAttachAlertRichLayout.listView.toggleQuoteOnSelection();
                        chatAttachAlertRichLayout.updateFormattingButtons();
                        break;
                    case 2:
                        ChatAttachAlertRichLayout.this.listView.onInlineButtonClicked(view3);
                        break;
                    case 3:
                        ChatAttachAlertRichLayout.this.listView.onLinkClicked();
                        break;
                    case 4:
                        ChatAttachAlertRichLayout.this.listView.onDateClicked();
                        break;
                    case 5:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout2 = ChatAttachAlertRichLayout.this;
                        RichEditorListView.AnonymousClass4 anonymousClass4BeginSelectionEdit = chatAttachAlertRichLayout2.listView.beginSelectionEdit();
                        if (anonymousClass4BeginSelectionEdit != null) {
                            TL_iv.RichMessage richMessageExtractRichMessage = anonymousClass4BeginSelectionEdit.extractRichMessage();
                            if (!richMessageExtractRichMessage.blocks.isEmpty()) {
                                AIEditorAlert aIEditorAlert = new AIEditorAlert(chatAttachAlertRichLayout2.getContext(), chatAttachAlertRichLayout2.resourcesProvider);
                                aIEditorAlert.setText(richMessageExtractRichMessage);
                                aIEditorAlert.onUseRichListener = new VoIPFragment$$ExternalSyntheticLambda7(anonymousClass4BeginSelectionEdit, 26);
                                aIEditorAlert.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        ChatAttachAlertRichLayout.this.sendSelectedItems(0, true, 0, false, 0L);
                        break;
                    case 7:
                        RichEditorHistory richEditorHistory = ChatAttachAlertRichLayout.this.listView.history;
                        if (richEditorHistory != null) {
                            richEditorHistory.undo();
                        }
                        break;
                    case 8:
                        RichEditorHistory richEditorHistory2 = ChatAttachAlertRichLayout.this.listView.history;
                        if (richEditorHistory2 != null) {
                            richEditorHistory2.redo();
                        }
                        break;
                    case 9:
                        ChatAttachAlertRichLayout.AnonymousClass2 anonymousClass3 = anonymousClass2;
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout3 = ChatAttachAlertRichLayout.this;
                        new RichAIComposeSheet(chatAttachAlertRichLayout3.currentAccount, chatAttachAlertRichLayout3.getContext(), new VoIPFragment$$ExternalSyntheticLambda7(anonymousClass3, 27), chatAttachAlertRichLayout3.resourcesProvider).show();
                        break;
                    case 10:
                        ChatAttachAlertRichLayout.access$2100(ChatAttachAlertRichLayout.this);
                        break;
                    default:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout4 = ChatAttachAlertRichLayout.this;
                        chatAttachAlertRichLayout4.listView.pendingMediaRow = null;
                        chatAttachAlertRichLayout4.openAttach(90, 0);
                        break;
                }
            }
        });
        linearLayout2.addView(frameLayout4, LayoutHelper.createLinear(1.0f, 0, 44));
        PhotoViewer.AnonymousClass35 anonymousClass35 = new PhotoViewer.AnonymousClass35(this, context, 18);
        this.formattingPanel = anonymousClass35;
        anonymousClass35.setOrientation(0);
        anonymousClass35.setClipToPadding(false);
        anonymousClass35.setClipChildren(false);
        anonymousClass35.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout2.addView(anonymousClass35, LayoutHelper.createFrame(-2, 60, 81));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.trashPanel = frameLayout6;
        frameLayout6.setClipChildren(false);
        frameLayout6.setClipToPadding(false);
        frameLayout6.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout2.addView(frameLayout6, LayoutHelper.createFrame(80, 60, 81));
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.trashPanelIcon = rLottieImageView;
        rLottieImageView.setAnimation(R.raw.group_pip_delete_icon, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), null);
        RLottieDrawable animatedDrawable = rLottieImageView.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.playInDirectionOfCustomEndFrame = true;
            animatedDrawable.setAutoRepeat(0);
            animatedDrawable.setCustomEndFrame(0);
        }
        rLottieImageView.setScaleType(scaleType);
        rLottieImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i4, resourcesProvider), mode));
        rLottieImageView.setBackground(new RichEditor.ShadowWrapperDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), Theme.getColor(i2, resourcesProvider))));
        frameLayout6.addView(rLottieImageView, LayoutHelper.createFrame(-1, -1, 119));
        FrameLayout frameLayout7 = new FrameLayout(context);
        frameLayout7.setBackground(new RichEditor.ShadowWrapperDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), Theme.getColor(i2, resourcesProvider))));
        anonymousClass35.addView(frameLayout7, LayoutHelper.createFrame(44.0f, -2));
        RichTableCell.AnonymousClass2 anonymousClass3 = new RichTableCell.AnonymousClass2(this, context, 2);
        anonymousClass3.setHorizontalScrollBarEnabled(false);
        anonymousClass3.setClipToOutline(true);
        anonymousClass3.setOutlineProvider(new RichEditor.AnonymousClass5(22));
        frameLayout7.addView(anonymousClass3, LayoutHelper.createFrame(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.formattingPanelLayout = linearLayout4;
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        anonymousClass3.addView(linearLayout4, new FrameLayout.LayoutParams(-2, -1));
        addFormattingButton(R.drawable.formatting_bold, 1, false);
        addFormattingButton(R.drawable.formatting_italic, 2, false);
        addFormattingButton(R.drawable.formatting_underline, 16, false);
        addFormattingButton(R.drawable.formatting_strikethrough, 8, false);
        addFormattingButton(R.drawable.formatting_spoiler, 256, false);
        addFormattingButton(R.drawable.iv_code, 4, false);
        addFormattingButton(R.drawable.iv_sub, 16384, true);
        addFormattingButton(R.drawable.iv_super, 32768, true);
        RichEditor.Button button = new RichEditor.Button(context, R.drawable.iv_quote, resourcesProvider);
        this.quoteButton = button;
        button.setBackgroundColorKey(i2);
        button.setContentDescription(LocaleController.getString(R.string.Quote));
        final int i11 = 1;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (i11) {
                    case 0:
                        ChatAttachAlertRichLayout.this.listView.onMathClicked();
                        break;
                    case 1:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
                        chatAttachAlertRichLayout.listView.toggleQuoteOnSelection();
                        chatAttachAlertRichLayout.updateFormattingButtons();
                        break;
                    case 2:
                        ChatAttachAlertRichLayout.this.listView.onInlineButtonClicked(view3);
                        break;
                    case 3:
                        ChatAttachAlertRichLayout.this.listView.onLinkClicked();
                        break;
                    case 4:
                        ChatAttachAlertRichLayout.this.listView.onDateClicked();
                        break;
                    case 5:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout2 = ChatAttachAlertRichLayout.this;
                        RichEditorListView.AnonymousClass4 anonymousClass4BeginSelectionEdit = chatAttachAlertRichLayout2.listView.beginSelectionEdit();
                        if (anonymousClass4BeginSelectionEdit != null) {
                            TL_iv.RichMessage richMessageExtractRichMessage = anonymousClass4BeginSelectionEdit.extractRichMessage();
                            if (!richMessageExtractRichMessage.blocks.isEmpty()) {
                                AIEditorAlert aIEditorAlert = new AIEditorAlert(chatAttachAlertRichLayout2.getContext(), chatAttachAlertRichLayout2.resourcesProvider);
                                aIEditorAlert.setText(richMessageExtractRichMessage);
                                aIEditorAlert.onUseRichListener = new VoIPFragment$$ExternalSyntheticLambda7(anonymousClass4BeginSelectionEdit, 26);
                                aIEditorAlert.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        ChatAttachAlertRichLayout.this.sendSelectedItems(0, true, 0, false, 0L);
                        break;
                    case 7:
                        RichEditorHistory richEditorHistory = ChatAttachAlertRichLayout.this.listView.history;
                        if (richEditorHistory != null) {
                            richEditorHistory.undo();
                        }
                        break;
                    case 8:
                        RichEditorHistory richEditorHistory2 = ChatAttachAlertRichLayout.this.listView.history;
                        if (richEditorHistory2 != null) {
                            richEditorHistory2.redo();
                        }
                        break;
                    case 9:
                        ChatAttachAlertRichLayout.AnonymousClass2 anonymousClass5 = anonymousClass2;
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout3 = ChatAttachAlertRichLayout.this;
                        new RichAIComposeSheet(chatAttachAlertRichLayout3.currentAccount, chatAttachAlertRichLayout3.getContext(), new VoIPFragment$$ExternalSyntheticLambda7(anonymousClass5, 27), chatAttachAlertRichLayout3.resourcesProvider).show();
                        break;
                    case 10:
                        ChatAttachAlertRichLayout.access$2100(ChatAttachAlertRichLayout.this);
                        break;
                    default:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout4 = ChatAttachAlertRichLayout.this;
                        chatAttachAlertRichLayout4.listView.pendingMediaRow = null;
                        chatAttachAlertRichLayout4.openAttach(90, 0);
                        break;
                }
            }
        });
        linearLayout4.addView(button, LayoutHelper.createLinear(38, 38, 16, linearLayout4.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        RichEditor.Button button2 = new RichEditor.Button(context, R.drawable.iv_button, resourcesProvider);
        this.inlineButton = button2;
        button2.setBackgroundColorKey(i2);
        button2.setContentDescription(LocaleController.getString(R.string.RichEditorButton));
        final int i12 = 2;
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (i12) {
                    case 0:
                        ChatAttachAlertRichLayout.this.listView.onMathClicked();
                        break;
                    case 1:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
                        chatAttachAlertRichLayout.listView.toggleQuoteOnSelection();
                        chatAttachAlertRichLayout.updateFormattingButtons();
                        break;
                    case 2:
                        ChatAttachAlertRichLayout.this.listView.onInlineButtonClicked(view3);
                        break;
                    case 3:
                        ChatAttachAlertRichLayout.this.listView.onLinkClicked();
                        break;
                    case 4:
                        ChatAttachAlertRichLayout.this.listView.onDateClicked();
                        break;
                    case 5:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout2 = ChatAttachAlertRichLayout.this;
                        RichEditorListView.AnonymousClass4 anonymousClass4BeginSelectionEdit = chatAttachAlertRichLayout2.listView.beginSelectionEdit();
                        if (anonymousClass4BeginSelectionEdit != null) {
                            TL_iv.RichMessage richMessageExtractRichMessage = anonymousClass4BeginSelectionEdit.extractRichMessage();
                            if (!richMessageExtractRichMessage.blocks.isEmpty()) {
                                AIEditorAlert aIEditorAlert = new AIEditorAlert(chatAttachAlertRichLayout2.getContext(), chatAttachAlertRichLayout2.resourcesProvider);
                                aIEditorAlert.setText(richMessageExtractRichMessage);
                                aIEditorAlert.onUseRichListener = new VoIPFragment$$ExternalSyntheticLambda7(anonymousClass4BeginSelectionEdit, 26);
                                aIEditorAlert.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        ChatAttachAlertRichLayout.this.sendSelectedItems(0, true, 0, false, 0L);
                        break;
                    case 7:
                        RichEditorHistory richEditorHistory = ChatAttachAlertRichLayout.this.listView.history;
                        if (richEditorHistory != null) {
                            richEditorHistory.undo();
                        }
                        break;
                    case 8:
                        RichEditorHistory richEditorHistory2 = ChatAttachAlertRichLayout.this.listView.history;
                        if (richEditorHistory2 != null) {
                            richEditorHistory2.redo();
                        }
                        break;
                    case 9:
                        ChatAttachAlertRichLayout.AnonymousClass2 anonymousClass5 = anonymousClass2;
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout3 = ChatAttachAlertRichLayout.this;
                        new RichAIComposeSheet(chatAttachAlertRichLayout3.currentAccount, chatAttachAlertRichLayout3.getContext(), new VoIPFragment$$ExternalSyntheticLambda7(anonymousClass5, 27), chatAttachAlertRichLayout3.resourcesProvider).show();
                        break;
                    case 10:
                        ChatAttachAlertRichLayout.access$2100(ChatAttachAlertRichLayout.this);
                        break;
                    default:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout4 = ChatAttachAlertRichLayout.this;
                        chatAttachAlertRichLayout4.listView.pendingMediaRow = null;
                        chatAttachAlertRichLayout4.openAttach(90, 0);
                        break;
                }
            }
        });
        linearLayout4.addView(button2, LayoutHelper.createLinear(38, 38, 16, linearLayout4.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.formattingLayout2 = linearLayout5;
        linearLayout5.setOrientation(0);
        linearLayout5.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout5.setBackground(new RichEditor.ShadowWrapperDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), Theme.getColor(i2, resourcesProvider))));
        anonymousClass35.addView(linearLayout5, LayoutHelper.createFrame(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        RichEditor.Button button3 = new RichEditor.Button(context, R.drawable.media_link_24, resourcesProvider);
        this.linkButton = button3;
        button3.setBackgroundColorKey(i2);
        button3.setContentDescription(LocaleController.getString(R.string.CreateLink));
        final int i13 = 3;
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (i13) {
                    case 0:
                        ChatAttachAlertRichLayout.this.listView.onMathClicked();
                        break;
                    case 1:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
                        chatAttachAlertRichLayout.listView.toggleQuoteOnSelection();
                        chatAttachAlertRichLayout.updateFormattingButtons();
                        break;
                    case 2:
                        ChatAttachAlertRichLayout.this.listView.onInlineButtonClicked(view3);
                        break;
                    case 3:
                        ChatAttachAlertRichLayout.this.listView.onLinkClicked();
                        break;
                    case 4:
                        ChatAttachAlertRichLayout.this.listView.onDateClicked();
                        break;
                    case 5:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout2 = ChatAttachAlertRichLayout.this;
                        RichEditorListView.AnonymousClass4 anonymousClass4BeginSelectionEdit = chatAttachAlertRichLayout2.listView.beginSelectionEdit();
                        if (anonymousClass4BeginSelectionEdit != null) {
                            TL_iv.RichMessage richMessageExtractRichMessage = anonymousClass4BeginSelectionEdit.extractRichMessage();
                            if (!richMessageExtractRichMessage.blocks.isEmpty()) {
                                AIEditorAlert aIEditorAlert = new AIEditorAlert(chatAttachAlertRichLayout2.getContext(), chatAttachAlertRichLayout2.resourcesProvider);
                                aIEditorAlert.setText(richMessageExtractRichMessage);
                                aIEditorAlert.onUseRichListener = new VoIPFragment$$ExternalSyntheticLambda7(anonymousClass4BeginSelectionEdit, 26);
                                aIEditorAlert.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        ChatAttachAlertRichLayout.this.sendSelectedItems(0, true, 0, false, 0L);
                        break;
                    case 7:
                        RichEditorHistory richEditorHistory = ChatAttachAlertRichLayout.this.listView.history;
                        if (richEditorHistory != null) {
                            richEditorHistory.undo();
                        }
                        break;
                    case 8:
                        RichEditorHistory richEditorHistory2 = ChatAttachAlertRichLayout.this.listView.history;
                        if (richEditorHistory2 != null) {
                            richEditorHistory2.redo();
                        }
                        break;
                    case 9:
                        ChatAttachAlertRichLayout.AnonymousClass2 anonymousClass5 = anonymousClass2;
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout3 = ChatAttachAlertRichLayout.this;
                        new RichAIComposeSheet(chatAttachAlertRichLayout3.currentAccount, chatAttachAlertRichLayout3.getContext(), new VoIPFragment$$ExternalSyntheticLambda7(anonymousClass5, 27), chatAttachAlertRichLayout3.resourcesProvider).show();
                        break;
                    case 10:
                        ChatAttachAlertRichLayout.access$2100(ChatAttachAlertRichLayout.this);
                        break;
                    default:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout4 = ChatAttachAlertRichLayout.this;
                        chatAttachAlertRichLayout4.listView.pendingMediaRow = null;
                        chatAttachAlertRichLayout4.openAttach(90, 0);
                        break;
                }
            }
        });
        linearLayout5.addView(button3, LayoutHelper.createLinear(38, 38, 16));
        RichEditor.Button button4 = new RichEditor.Button(context, R.drawable.msg_calendar2, resourcesProvider);
        this.dateButton = button4;
        button4.setBackgroundColorKey(i2);
        button4.setContentDescription(LocaleController.getString(R.string.AccDescrIVInsertDate));
        final int i14 = 4;
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (i14) {
                    case 0:
                        ChatAttachAlertRichLayout.this.listView.onMathClicked();
                        break;
                    case 1:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
                        chatAttachAlertRichLayout.listView.toggleQuoteOnSelection();
                        chatAttachAlertRichLayout.updateFormattingButtons();
                        break;
                    case 2:
                        ChatAttachAlertRichLayout.this.listView.onInlineButtonClicked(view3);
                        break;
                    case 3:
                        ChatAttachAlertRichLayout.this.listView.onLinkClicked();
                        break;
                    case 4:
                        ChatAttachAlertRichLayout.this.listView.onDateClicked();
                        break;
                    case 5:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout2 = ChatAttachAlertRichLayout.this;
                        RichEditorListView.AnonymousClass4 anonymousClass4BeginSelectionEdit = chatAttachAlertRichLayout2.listView.beginSelectionEdit();
                        if (anonymousClass4BeginSelectionEdit != null) {
                            TL_iv.RichMessage richMessageExtractRichMessage = anonymousClass4BeginSelectionEdit.extractRichMessage();
                            if (!richMessageExtractRichMessage.blocks.isEmpty()) {
                                AIEditorAlert aIEditorAlert = new AIEditorAlert(chatAttachAlertRichLayout2.getContext(), chatAttachAlertRichLayout2.resourcesProvider);
                                aIEditorAlert.setText(richMessageExtractRichMessage);
                                aIEditorAlert.onUseRichListener = new VoIPFragment$$ExternalSyntheticLambda7(anonymousClass4BeginSelectionEdit, 26);
                                aIEditorAlert.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        ChatAttachAlertRichLayout.this.sendSelectedItems(0, true, 0, false, 0L);
                        break;
                    case 7:
                        RichEditorHistory richEditorHistory = ChatAttachAlertRichLayout.this.listView.history;
                        if (richEditorHistory != null) {
                            richEditorHistory.undo();
                        }
                        break;
                    case 8:
                        RichEditorHistory richEditorHistory2 = ChatAttachAlertRichLayout.this.listView.history;
                        if (richEditorHistory2 != null) {
                            richEditorHistory2.redo();
                        }
                        break;
                    case 9:
                        ChatAttachAlertRichLayout.AnonymousClass2 anonymousClass5 = anonymousClass2;
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout3 = ChatAttachAlertRichLayout.this;
                        new RichAIComposeSheet(chatAttachAlertRichLayout3.currentAccount, chatAttachAlertRichLayout3.getContext(), new VoIPFragment$$ExternalSyntheticLambda7(anonymousClass5, 27), chatAttachAlertRichLayout3.resourcesProvider).show();
                        break;
                    case 10:
                        ChatAttachAlertRichLayout.access$2100(ChatAttachAlertRichLayout.this);
                        break;
                    default:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout4 = ChatAttachAlertRichLayout.this;
                        chatAttachAlertRichLayout4.listView.pendingMediaRow = null;
                        chatAttachAlertRichLayout4.openAttach(90, 0);
                        break;
                }
            }
        });
        linearLayout5.addView(button4, LayoutHelper.createLinear(38, 38, 16));
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.formattingLayout3 = linearLayout6;
        linearLayout6.setOrientation(0);
        linearLayout6.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout6.setBackground(new RichEditor.ShadowWrapperDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), Theme.getColor(i2, resourcesProvider))));
        anonymousClass35.addView(linearLayout6, LayoutHelper.createFrame(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        RichEditor.Button button5 = new RichEditor.Button(context, i9, resourcesProvider);
        this.mathButton = button5;
        button5.setBackgroundColorKey(i2);
        button5.setPremium();
        arrayList.add(button5);
        button5.setContentDescription(LocaleController.getString(R.string.AccDescrIVFormula));
        final int i15 = 0;
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        ChatAttachAlertRichLayout.this.listView.onMathClicked();
                        break;
                    case 1:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
                        chatAttachAlertRichLayout.listView.toggleQuoteOnSelection();
                        chatAttachAlertRichLayout.updateFormattingButtons();
                        break;
                    case 2:
                        ChatAttachAlertRichLayout.this.listView.onInlineButtonClicked(view3);
                        break;
                    case 3:
                        ChatAttachAlertRichLayout.this.listView.onLinkClicked();
                        break;
                    case 4:
                        ChatAttachAlertRichLayout.this.listView.onDateClicked();
                        break;
                    case 5:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout2 = ChatAttachAlertRichLayout.this;
                        RichEditorListView.AnonymousClass4 anonymousClass4BeginSelectionEdit = chatAttachAlertRichLayout2.listView.beginSelectionEdit();
                        if (anonymousClass4BeginSelectionEdit != null) {
                            TL_iv.RichMessage richMessageExtractRichMessage = anonymousClass4BeginSelectionEdit.extractRichMessage();
                            if (!richMessageExtractRichMessage.blocks.isEmpty()) {
                                AIEditorAlert aIEditorAlert = new AIEditorAlert(chatAttachAlertRichLayout2.getContext(), chatAttachAlertRichLayout2.resourcesProvider);
                                aIEditorAlert.setText(richMessageExtractRichMessage);
                                aIEditorAlert.onUseRichListener = new VoIPFragment$$ExternalSyntheticLambda7(anonymousClass4BeginSelectionEdit, 26);
                                aIEditorAlert.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        ChatAttachAlertRichLayout.this.sendSelectedItems(0, true, 0, false, 0L);
                        break;
                    case 7:
                        RichEditorHistory richEditorHistory = ChatAttachAlertRichLayout.this.listView.history;
                        if (richEditorHistory != null) {
                            richEditorHistory.undo();
                        }
                        break;
                    case 8:
                        RichEditorHistory richEditorHistory2 = ChatAttachAlertRichLayout.this.listView.history;
                        if (richEditorHistory2 != null) {
                            richEditorHistory2.redo();
                        }
                        break;
                    case 9:
                        ChatAttachAlertRichLayout.AnonymousClass2 anonymousClass5 = anonymousClass2;
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout3 = ChatAttachAlertRichLayout.this;
                        new RichAIComposeSheet(chatAttachAlertRichLayout3.currentAccount, chatAttachAlertRichLayout3.getContext(), new VoIPFragment$$ExternalSyntheticLambda7(anonymousClass5, 27), chatAttachAlertRichLayout3.resourcesProvider).show();
                        break;
                    case 10:
                        ChatAttachAlertRichLayout.access$2100(ChatAttachAlertRichLayout.this);
                        break;
                    default:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout4 = ChatAttachAlertRichLayout.this;
                        chatAttachAlertRichLayout4.listView.pendingMediaRow = null;
                        chatAttachAlertRichLayout4.openAttach(90, 0);
                        break;
                }
            }
        });
        linearLayout6.addView(button5, LayoutHelper.createLinear(38, 38, 16));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.formattingLayout1 = linearLayout7;
        linearLayout7.setOrientation(0);
        linearLayout7.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout7.setBackground(new RichEditor.ShadowWrapperDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), Theme.getColor(i2, resourcesProvider))));
        anonymousClass35.addView(linearLayout7, 0, LayoutHelper.createFrame(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        RichEditor.Button button6 = new RichEditor.Button(context, R.drawable.input_ai, resourcesProvider);
        button6.setImageDrawable(new AiButtonDrawable(context));
        button6.setBackgroundColorKey(i2);
        button6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        final int i16 = 5;
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (i16) {
                    case 0:
                        ChatAttachAlertRichLayout.this.listView.onMathClicked();
                        break;
                    case 1:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
                        chatAttachAlertRichLayout.listView.toggleQuoteOnSelection();
                        chatAttachAlertRichLayout.updateFormattingButtons();
                        break;
                    case 2:
                        ChatAttachAlertRichLayout.this.listView.onInlineButtonClicked(view3);
                        break;
                    case 3:
                        ChatAttachAlertRichLayout.this.listView.onLinkClicked();
                        break;
                    case 4:
                        ChatAttachAlertRichLayout.this.listView.onDateClicked();
                        break;
                    case 5:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout2 = ChatAttachAlertRichLayout.this;
                        RichEditorListView.AnonymousClass4 anonymousClass4BeginSelectionEdit = chatAttachAlertRichLayout2.listView.beginSelectionEdit();
                        if (anonymousClass4BeginSelectionEdit != null) {
                            TL_iv.RichMessage richMessageExtractRichMessage = anonymousClass4BeginSelectionEdit.extractRichMessage();
                            if (!richMessageExtractRichMessage.blocks.isEmpty()) {
                                AIEditorAlert aIEditorAlert = new AIEditorAlert(chatAttachAlertRichLayout2.getContext(), chatAttachAlertRichLayout2.resourcesProvider);
                                aIEditorAlert.setText(richMessageExtractRichMessage);
                                aIEditorAlert.onUseRichListener = new VoIPFragment$$ExternalSyntheticLambda7(anonymousClass4BeginSelectionEdit, 26);
                                aIEditorAlert.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        ChatAttachAlertRichLayout.this.sendSelectedItems(0, true, 0, false, 0L);
                        break;
                    case 7:
                        RichEditorHistory richEditorHistory = ChatAttachAlertRichLayout.this.listView.history;
                        if (richEditorHistory != null) {
                            richEditorHistory.undo();
                        }
                        break;
                    case 8:
                        RichEditorHistory richEditorHistory2 = ChatAttachAlertRichLayout.this.listView.history;
                        if (richEditorHistory2 != null) {
                            richEditorHistory2.redo();
                        }
                        break;
                    case 9:
                        ChatAttachAlertRichLayout.AnonymousClass2 anonymousClass5 = anonymousClass2;
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout3 = ChatAttachAlertRichLayout.this;
                        new RichAIComposeSheet(chatAttachAlertRichLayout3.currentAccount, chatAttachAlertRichLayout3.getContext(), new VoIPFragment$$ExternalSyntheticLambda7(anonymousClass5, 27), chatAttachAlertRichLayout3.resourcesProvider).show();
                        break;
                    case 10:
                        ChatAttachAlertRichLayout.access$2100(ChatAttachAlertRichLayout.this);
                        break;
                    default:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout4 = ChatAttachAlertRichLayout.this;
                        chatAttachAlertRichLayout4.listView.pendingMediaRow = null;
                        chatAttachAlertRichLayout4.openAttach(90, 0);
                        break;
                }
            }
        });
        linearLayout7.addView(button6, LayoutHelper.createLinear(38, 38, 16));
        RichEditor.AnonymousClass9 anonymousClass9 = new RichEditor.AnonymousClass9(this, context, R.drawable.send_plane_24, resourcesProvider, 3);
        this.sendButton = anonymousClass9;
        anonymousClass9.setBackground(new RichEditor.ShadowWrapperDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), Theme.getColor(Theme.key_chat_messagePanelSend, resourcesProvider))));
        ScaleStateListAnimator.apply(anonymousClass9, 0.1f, 1.5f);
        linearLayout2.addView(anonymousClass9, LayoutHelper.createLinear(44, 44, 0.0f, 5, 8, 0, 0, 0));
        anonymousClass9.setContentDescription("Send");
        final int i17 = 6;
        anonymousClass9.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                switch (i17) {
                    case 0:
                        ChatAttachAlertRichLayout.this.listView.onMathClicked();
                        break;
                    case 1:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout = ChatAttachAlertRichLayout.this;
                        chatAttachAlertRichLayout.listView.toggleQuoteOnSelection();
                        chatAttachAlertRichLayout.updateFormattingButtons();
                        break;
                    case 2:
                        ChatAttachAlertRichLayout.this.listView.onInlineButtonClicked(view3);
                        break;
                    case 3:
                        ChatAttachAlertRichLayout.this.listView.onLinkClicked();
                        break;
                    case 4:
                        ChatAttachAlertRichLayout.this.listView.onDateClicked();
                        break;
                    case 5:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout2 = ChatAttachAlertRichLayout.this;
                        RichEditorListView.AnonymousClass4 anonymousClass4BeginSelectionEdit = chatAttachAlertRichLayout2.listView.beginSelectionEdit();
                        if (anonymousClass4BeginSelectionEdit != null) {
                            TL_iv.RichMessage richMessageExtractRichMessage = anonymousClass4BeginSelectionEdit.extractRichMessage();
                            if (!richMessageExtractRichMessage.blocks.isEmpty()) {
                                AIEditorAlert aIEditorAlert = new AIEditorAlert(chatAttachAlertRichLayout2.getContext(), chatAttachAlertRichLayout2.resourcesProvider);
                                aIEditorAlert.setText(richMessageExtractRichMessage);
                                aIEditorAlert.onUseRichListener = new VoIPFragment$$ExternalSyntheticLambda7(anonymousClass4BeginSelectionEdit, 26);
                                aIEditorAlert.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        ChatAttachAlertRichLayout.this.sendSelectedItems(0, true, 0, false, 0L);
                        break;
                    case 7:
                        RichEditorHistory richEditorHistory = ChatAttachAlertRichLayout.this.listView.history;
                        if (richEditorHistory != null) {
                            richEditorHistory.undo();
                        }
                        break;
                    case 8:
                        RichEditorHistory richEditorHistory2 = ChatAttachAlertRichLayout.this.listView.history;
                        if (richEditorHistory2 != null) {
                            richEditorHistory2.redo();
                        }
                        break;
                    case 9:
                        ChatAttachAlertRichLayout.AnonymousClass2 anonymousClass5 = anonymousClass2;
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout3 = ChatAttachAlertRichLayout.this;
                        new RichAIComposeSheet(chatAttachAlertRichLayout3.currentAccount, chatAttachAlertRichLayout3.getContext(), new VoIPFragment$$ExternalSyntheticLambda7(anonymousClass5, 27), chatAttachAlertRichLayout3.resourcesProvider).show();
                        break;
                    case 10:
                        ChatAttachAlertRichLayout.access$2100(ChatAttachAlertRichLayout.this);
                        break;
                    default:
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout4 = ChatAttachAlertRichLayout.this;
                        chatAttachAlertRichLayout4.listView.pendingMediaRow = null;
                        chatAttachAlertRichLayout4.openAttach(90, 0);
                        break;
                }
            }
        });
        anonymousClass9.setOnLongClickListener(new PhotoViewer$$ExternalSyntheticLambda44(anonymousClass2, 18));
        updatePanel(0, false);
    }

    public final void addBlockButton(int i, int i2, boolean z) {
        String string;
        LinearLayout linearLayout = this.blocksLayout;
        RichEditor.Button button = new RichEditor.Button(linearLayout.getContext(), i, this.resourcesProvider);
        button.setBackgroundColorKey(Theme.key_windowBackgroundWhite);
        if (z) {
            button.setPremium();
            this.premiumButtons.add(button);
        }
        button.setTag(Integer.valueOf(i2));
        if (i2 == 1) {
            string = LocaleController.getString(R.string.AccDescrIVTextStyle);
        } else if (i2 == 2) {
            string = LocaleController.getString(R.string.AccDescrIVListStyle);
        } else if (i2 == 4) {
            string = LocaleController.getString(R.string.AccDescrIVTable);
        } else if (i2 != 7) {
            string = i2 != 9 ? null : LocaleController.getString(R.string.AccDescrIVDetails);
        } else {
            string = LocaleController.getString(R.string.AccDescrIVFormula);
        }
        button.setContentDescription(string);
        button.setOnClickListener(new RichEditorToolbar$$ExternalSyntheticLambda17(this, i2, 0));
        this.blockButtons.add(button);
        linearLayout.addView(button, LayoutHelper.createLinear(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
    }

    public final void addFormattingButton(int i, int i2, boolean z) {
        RichEditor.Button button = new RichEditor.Button(getContext(), i, this.resourcesProvider);
        button.setBackgroundColorKey(Theme.key_glass_targetMainTabs);
        if (z) {
            button.setPremium();
            this.premiumButtons.add(button);
        }
        button.setTag(Integer.valueOf(i2));
        button.setContentDescription(RichEditor.formattingButtonContentDescription(i2));
        button.setOnClickListener(new RichEditorToolbar$$ExternalSyntheticLambda17(this, i2, 1));
        this.formattingButtons.add(button);
        LinearLayout linearLayout = this.formattingPanelLayout;
        linearLayout.addView(button, LayoutHelper.createLinear(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
    }

    public ImageView getAddButton() {
        return this.addButton;
    }

    public FrameLayout getBottomContainer() {
        return this.bottomContainer;
    }

    public FrameLayout getBottomInnerContainer() {
        return this.bottomInnerContainer;
    }

    public LinearLayout getBottomPanel() {
        return this.bottomPanel;
    }

    public View getEmojiButton() {
        return this.emojiButton;
    }

    public ChatActivityEnterView.SendButton getSendButton() {
        return this.sendButton;
    }

    public void setBackVisible(boolean z) {
        this.backButton.setVisibility(z ? 0 : 8);
    }

    public void setBottomGradientTranslationY(float f) {
        this.bottomGradient.setTranslationY(f);
    }

    public void setEmojiOpened(boolean z) {
        ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView = this.emojiButton;
        chatActivityEnterViewAnimatedIconView.setState(z ? ChatActivityEnterViewAnimatedIconView.State.KEYBOARD : ChatActivityEnterViewAnimatedIconView.State.SMILE, true);
        chatActivityEnterViewAnimatedIconView.setContentDescription(z ? "Keyboard" : "Emoji");
    }

    public final void setFormattingState(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        ArrayList arrayList = this.formattingButtons;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            RichEditor.Button button = (RichEditor.Button) obj;
            int iIntValue = ((Integer) button.getTag()).intValue();
            button.setSelected((i & iIntValue) != 0);
            if (iIntValue == 1 || iIntValue == 2) {
                button.setEnabled(z5);
            }
        }
        RichEditor.Button button2 = this.linkButton;
        button2.setSelected(z);
        RichEditor.Button button3 = this.dateButton;
        button3.setSelected(z2);
        button2.setEnabled(z3);
        this.inlineButton.setEnabled(z4);
        button3.setEnabled(z3);
        this.mathButton.setEnabled(z3);
    }

    public final void setHistoryEnabled(boolean z, boolean z2) {
        ImageView imageView = this.undoButton;
        imageView.setEnabled(z);
        imageView.setAlpha(z ? 1.0f : 0.35f);
        ImageView imageView2 = this.redoButton;
        imageView2.setEnabled(z2);
        imageView2.setAlpha(z2 ? 1.0f : 0.35f);
    }

    public void setPremiumLocked(boolean z) {
        ArrayList arrayList = this.premiumButtons;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((RichEditor.Button) obj).setPremiumLocked(z);
        }
    }

    public void setQuoteState(boolean z) {
        this.quoteButton.setSelected(z);
    }

    public void setSelectedBlockType(int i) {
        setSelectedBlockType(i, 0);
    }

    public void setSendEditing(boolean z) {
        this.sendButton.setResourceId(z ? R.drawable.input_done : R.drawable.send_plane_24);
    }

    public void setSendEnabled(boolean z) {
        RichEditor.AnonymousClass9 anonymousClass9 = this.sendButton;
        if (anonymousClass9.isEnabled() == z) {
            return;
        }
        anonymousClass9.setEnabled(z);
        OKLCH.m(anonymousClass9.animate(), z ? 1.0f : 0.5f, 150L);
    }

    public void setSendLoading(boolean z) {
        if (this.sendLoading == z) {
            return;
        }
        this.sendLoading = z;
        this.sendButton.invalidate();
    }

    public void setTopButtonsOffset(int i) {
        LinearLayout linearLayout = this.historyButtons;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        if (layoutParams.topMargin != i) {
            layoutParams.topMargin = i;
            linearLayout.setLayoutParams(layoutParams);
        }
        ImageView imageView = this.backButton;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        if (layoutParams2.topMargin != i) {
            layoutParams2.topMargin = i;
            imageView.setLayoutParams(layoutParams2);
        }
    }

    public void setTopGradientVisible(boolean z) {
        this.topGradient.setVisibility(z ? 0 : 8);
    }

    public void setTopPanelVisible(boolean z) {
        this.topPanel.setVisibility(z ? 0 : 8);
        this.topGradient.setVisibility(z ? 0 : 8);
    }

    public final void setTrashHovered(boolean z, boolean z2) {
        if (this.trashHovered == z && z2) {
            return;
        }
        this.trashHovered = z;
        float f = z ? 1.15f : 1.0f;
        RLottieImageView rLottieImageView = this.trashPanelIcon;
        if (z2) {
            rLottieImageView.animate().scaleX(f).scaleY(f).setDuration(180L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
        } else {
            rLottieImageView.animate().cancel();
            rLottieImageView.setScaleX(f);
            rLottieImageView.setScaleY(f);
        }
        rLottieImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(z ? Theme.key_text_RedBold : Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
        RLottieDrawable animatedDrawable = rLottieImageView.getAnimatedDrawable();
        if (animatedDrawable != null) {
            if (z) {
                if (animatedDrawable.currentFrame > 34) {
                    animatedDrawable.setCurrentFrame(0, false, false);
                }
                animatedDrawable.setCustomEndFrame(33);
            } else {
                animatedDrawable.setCustomEndFrame(0);
            }
            animatedDrawable.start();
        }
    }

    public final void updatePanel(int i, boolean z) {
        if (this.panelType == i) {
            return;
        }
        this.panelType = i;
        FrameLayout frameLayout = this.trashPanel;
        LinearLayout linearLayout = this.bottomPanel;
        PhotoViewer.AnonymousClass35 anonymousClass35 = this.formattingPanel;
        if (z) {
            linearLayout.setVisibility(0);
            ViewPropertyAnimator duration = linearLayout.animate().alpha(i == 0 ? 1.0f : 0.0f).scaleX(i == 0 ? 1.0f : 0.8f).scaleY(i == 0 ? 1.0f : 0.8f).translationY(i == 0 ? 0.0f : AndroidUtilities.dp(30.0f)).setDuration(420L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            final int i2 = 0;
            duration.setInterpolator(cubicBezierInterpolator).withEndAction(new Runnable(this) {
                public final RichEditorToolbar f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i2) {
                        case 0:
                            RichEditorToolbar richEditorToolbar = this.f$0;
                            if (richEditorToolbar.panelType != 0) {
                                richEditorToolbar.bottomPanel.setVisibility(8);
                            }
                            break;
                        case 1:
                            RichEditorToolbar richEditorToolbar2 = this.f$0;
                            if (richEditorToolbar2.panelType != 1) {
                                richEditorToolbar2.formattingPanel.setVisibility(8);
                            }
                            break;
                        default:
                            RichEditorToolbar richEditorToolbar3 = this.f$0;
                            if (richEditorToolbar3.panelType != 2) {
                                richEditorToolbar3.trashPanel.setVisibility(8);
                            }
                            break;
                    }
                }
            }).start();
            anonymousClass35.setVisibility(0);
            ViewPropertyAnimator viewPropertyAnimatorScaleY = anonymousClass35.animate().alpha(i == 1 ? 1.0f : 0.0f).scaleX(i == 1 ? 1.0f : 0.8f).scaleY(i == 1 ? 1.0f : 0.8f);
            final int i3 = 1;
            viewPropertyAnimatorScaleY.translationY(i == 1 ? 0.0f : AndroidUtilities.dp(30.0f)).setDuration(420L).setInterpolator(cubicBezierInterpolator).withEndAction(new Runnable(this) {
                public final RichEditorToolbar f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i3) {
                        case 0:
                            RichEditorToolbar richEditorToolbar = this.f$0;
                            if (richEditorToolbar.panelType != 0) {
                                richEditorToolbar.bottomPanel.setVisibility(8);
                            }
                            break;
                        case 1:
                            RichEditorToolbar richEditorToolbar2 = this.f$0;
                            if (richEditorToolbar2.panelType != 1) {
                                richEditorToolbar2.formattingPanel.setVisibility(8);
                            }
                            break;
                        default:
                            RichEditorToolbar richEditorToolbar3 = this.f$0;
                            if (richEditorToolbar3.panelType != 2) {
                                richEditorToolbar3.trashPanel.setVisibility(8);
                            }
                            break;
                    }
                }
            }).start();
            frameLayout.setVisibility(0);
            final int i4 = 2;
            frameLayout.animate().alpha(i == 2 ? 1.0f : 0.0f).scaleX(i == 2 ? 1.0f : 0.8f).scaleY(i == 2 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(cubicBezierInterpolator).withEndAction(new Runnable(this) {
                public final RichEditorToolbar f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i4) {
                        case 0:
                            RichEditorToolbar richEditorToolbar = this.f$0;
                            if (richEditorToolbar.panelType != 0) {
                                richEditorToolbar.bottomPanel.setVisibility(8);
                            }
                            break;
                        case 1:
                            RichEditorToolbar richEditorToolbar2 = this.f$0;
                            if (richEditorToolbar2.panelType != 1) {
                                richEditorToolbar2.formattingPanel.setVisibility(8);
                            }
                            break;
                        default:
                            RichEditorToolbar richEditorToolbar3 = this.f$0;
                            if (richEditorToolbar3.panelType != 2) {
                                richEditorToolbar3.trashPanel.setVisibility(8);
                            }
                            break;
                    }
                }
            }).start();
            return;
        }
        linearLayout.setVisibility(i == 0 ? 0 : 8);
        linearLayout.setAlpha(i == 0 ? 1.0f : 0.0f);
        linearLayout.setScaleX(i == 0 ? 1.0f : 0.8f);
        linearLayout.setScaleY(i == 0 ? 1.0f : 0.8f);
        linearLayout.setTranslationY(i == 0 ? 0.0f : AndroidUtilities.dp(30.0f));
        anonymousClass35.setVisibility(i == 1 ? 0 : 8);
        anonymousClass35.setAlpha(i == 1 ? 1.0f : 0.0f);
        anonymousClass35.setScaleX(i == 1 ? 1.0f : 0.8f);
        anonymousClass35.setScaleY(i == 1 ? 1.0f : 0.8f);
        anonymousClass35.setTranslationY(i == 1 ? 0.0f : AndroidUtilities.dp(30.0f));
        frameLayout.setVisibility(i != 2 ? 8 : 0);
        frameLayout.setAlpha(i == 2 ? 1.0f : 0.0f);
        frameLayout.setScaleX(i == 2 ? 1.0f : 0.8f);
        frameLayout.setScaleY(i == 2 ? 1.0f : 0.8f);
    }

    public final void setSelectedBlockType(int i, int i2) {
        ArrayList arrayList = this.blockButtons;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            RichEditor.Button button = (RichEditor.Button) obj;
            boolean z = i == ((Integer) button.getTag()).intValue();
            button.setSelected(z);
            if (!z || i2 == 0) {
                button.updateIcon(button.startIcon);
            } else {
                button.updateIcon(i2);
            }
        }
    }
}
