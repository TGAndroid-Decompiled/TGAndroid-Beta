package org.telegram.ui.iv;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AiButtonDrawable;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatActivityEnterViewAnimatedIconView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.iv.RichEditor;

public class RichEditorToolbar extends FrameLayout {
    private final ImageView addButton;
    private final ImageView aiButton;
    private final RichEditor.Button aiStyleButton;
    private final ImageView backButton;
    private final ArrayList blockButtons;
    private final LinearLayout blocksLayout;
    private final HorizontalScrollView blocksScrollView;
    private final FrameLayout bottomContainer;
    private final View bottomGradient;
    private final FrameLayout bottomInnerContainer;
    private final LinearLayout bottomPanel;
    private final RichEditor.Button dateButton;
    private final Delegate delegate;
    private final ChatActivityEnterViewAnimatedIconView emojiButton;
    private final ArrayList formattingButtons;
    private LinearLayout formattingLayout1;
    private LinearLayout formattingLayout2;
    private LinearLayout formattingLayout3;
    private final LinearLayout formattingPanel;
    private final LinearLayout formattingPanelLayout;
    private int formattingScrollMaxWidth;
    private HorizontalScrollView formattingScrollView;
    private final LinearLayout historyButtons;
    private final RichEditor.Button linkButton;
    private final RichEditor.Button mathButton;
    private int panelType;
    private final ImageView redoButton;
    private int reorderSavedPanelType;
    private final Theme.ResourcesProvider resourcesProvider;
    private final ChatActivityEnterView.SendButton sendButton;
    private boolean sendLoading;
    private final View topGradient;
    private final FrameLayout topPanel;
    private boolean trashHovered;
    private final FrameLayout trashPanel;
    private final RLottieImageView trashPanelIcon;
    private final ImageView undoButton;

    public interface Delegate {
        Theme.ResourcesProvider getResourcesProvider();

        void onAi();

        void onAiStyle();

        void onAttach();

        void onBack();

        void onBlockButton(int i, View view);

        void onDate();

        void onEmoji();

        void onFormatting(int i);

        void onLink();

        void onMath();

        void onRedo();

        void onSend();

        boolean onSendLongClick(View view);

        void onUndo();
    }

    public RichEditorToolbar(Context context, final Delegate delegate) {
        super(context);
        this.formattingScrollMaxWidth = Integer.MAX_VALUE;
        this.blockButtons = new ArrayList();
        this.formattingButtons = new ArrayList();
        this.panelType = -1;
        this.reorderSavedPanelType = 0;
        this.delegate = delegate;
        Theme.ResourcesProvider resourcesProvider = delegate.getResourcesProvider();
        this.resourcesProvider = resourcesProvider;
        setClipChildren(false);
        setClipToPadding(false);
        View view = new View(context);
        this.topGradient = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i = Theme.key_windowBackgroundWhite;
        view.setBackground(new GradientDrawable(orientation, new int[]{color(i), Theme.multAlpha(color(i), 0.0f)}));
        addView(view, LayoutHelper.createFrame(-1, 68, 55));
        View view2 = new View(context);
        this.bottomGradient = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{Theme.multAlpha(color(i), 0.0f), color(i)}));
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
        int iColor = color(i2);
        int iColor2 = color(i2);
        int i3 = Theme.key_listSelector;
        imageView.setBackground(RichEditor.withShadow(Theme.createRadSelectorDrawable(iColor, Theme.blendOver(iColor2, color(i3)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        int i4 = Theme.key_windowBackgroundWhiteBlackText;
        int iColor3 = color(i4);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(iColor3, mode));
        ScaleStateListAnimator.apply(imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                delegate.onBack();
            }
        });
        frameLayout.addView(imageView, LayoutHelper.createFrame(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.historyButtons = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(RichEditor.withShadow(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), color(i2))));
        frameLayout.addView(linearLayout, LayoutHelper.createFrame(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView2 = new ImageView(context);
        this.undoButton = imageView2;
        imageView2.setImageResource(R.drawable.iv_undo);
        imageView2.setScaleType(scaleType);
        imageView2.setBackground(Theme.createSelectorDrawable(color(i3)));
        imageView2.setColorFilter(new PorterDuffColorFilter(color(i4), mode));
        ScaleStateListAnimator.apply(imageView2);
        imageView2.setContentDescription("Undo");
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                delegate.onUndo();
            }
        });
        linearLayout.addView(imageView2, LayoutHelper.createLinear(41, 41, 16));
        ImageView imageView3 = new ImageView(context);
        this.redoButton = imageView3;
        imageView3.setImageResource(R.drawable.iv_redo);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(Theme.createSelectorDrawable(color(i3)));
        imageView3.setColorFilter(new PorterDuffColorFilter(color(i4), mode));
        ScaleStateListAnimator.apply(imageView3);
        imageView3.setContentDescription("Redo");
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                delegate.onRedo();
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
        ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView = new ChatActivityEnterViewAnimatedIconView(context, 24);
        this.emojiButton = chatActivityEnterViewAnimatedIconView;
        chatActivityEnterViewAnimatedIconView.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        chatActivityEnterViewAnimatedIconView.setColorFilter(new PorterDuffColorFilter(color(i4), mode));
        chatActivityEnterViewAnimatedIconView.setBackground(RichEditor.withShadow(Theme.createRadSelectorDrawable(color(i2), Theme.blendOver(color(i2), color(i3)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        chatActivityEnterViewAnimatedIconView.setState(ChatActivityEnterViewAnimatedIconView.State.SMILE, false);
        linearLayout2.addView(chatActivityEnterViewAnimatedIconView, LayoutHelper.createLinear(44, 44, 0.0f, 19, 0, 0, 8, 0));
        ScaleStateListAnimator.apply(chatActivityEnterViewAnimatedIconView);
        chatActivityEnterViewAnimatedIconView.setContentDescription("Emoji");
        chatActivityEnterViewAnimatedIconView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                delegate.onEmoji();
            }
        });
        ImageView imageView4 = new ImageView(context);
        this.aiButton = imageView4;
        imageView4.setImageDrawable(new AiButtonDrawable(context));
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(color(i4), mode));
        imageView4.setBackground(RichEditor.withShadow(Theme.createRadSelectorDrawable(color(i2), Theme.blendOver(color(i2), color(i3)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        linearLayout2.addView(imageView4, LayoutHelper.createLinear(44, 44, 0.0f, 19, 0, 0, 8, 0));
        ScaleStateListAnimator.apply(imageView4);
        imageView4.setContentDescription("AI");
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                delegate.onAi();
            }
        });
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setBackground(RichEditor.withShadow(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), color(i2))));
        frameLayout4.addView(frameLayout5, LayoutHelper.createFrame(-2, 44, 81));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context) {
            @Override
            protected void onMeasure(int i5, int i6) {
                int mode2 = View.MeasureSpec.getMode(i5);
                int size = View.MeasureSpec.getSize(i5);
                if (mode2 == 1073741824) {
                    super.onMeasure(i5, i6);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 0), i6);
                int measuredWidth = getMeasuredWidth();
                if (mode2 == Integer.MIN_VALUE) {
                    measuredWidth = Math.min(measuredWidth, size);
                }
                setMeasuredDimension(measuredWidth, getMeasuredHeight());
            }
        };
        this.blocksScrollView = horizontalScrollView;
        horizontalScrollView.setClipToOutline(true);
        horizontalScrollView.setOutlineProvider(new ViewOutlineProvider() {
            @Override
            public void getOutline(View view3, Outline outline) {
                outline.setRoundRect(0, 0, view3.getWidth(), view3.getHeight(), AndroidUtilities.dp(22.0f));
            }
        });
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.blocksLayout = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout3.setOrientation(0);
        horizontalScrollView.addView(linearLayout3);
        frameLayout5.addView(horizontalScrollView, LayoutHelper.createFrame(-1, -1.0f));
        addBlockButton(R.drawable.iv_text, 1);
        addBlockButton(R.drawable.iv_lists, 2);
        addBlockButton(R.drawable.iv_table, 4);
        int i5 = R.drawable.iv_math;
        addBlockButton(i5, 7);
        linearLayout2.addView(frameLayout4, LayoutHelper.createLinear(0, 44, 1.0f));
        ImageView imageView5 = new ImageView(context);
        this.addButton = imageView5;
        imageView5.setImageResource(R.drawable.outline_poll_attach_24);
        imageView5.setScaleType(scaleType);
        imageView5.setColorFilter(new PorterDuffColorFilter(color(i4), mode));
        imageView5.setBackground(RichEditor.withShadow(Theme.createRadSelectorDrawable(color(i2), Theme.blendOver(color(i2), color(i3)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        linearLayout2.addView(imageView5, LayoutHelper.createLinear(44, 44, 0.0f, 21, 8, 0, 0, 0));
        ScaleStateListAnimator.apply(imageView5);
        imageView5.setContentDescription("Attach");
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                delegate.onAttach();
            }
        });
        LinearLayout linearLayout4 = new LinearLayout(context) {
            @Override
            protected void onMeasure(int i6, int i7) {
                int size = View.MeasureSpec.getSize(i6);
                int paddingLeft = getPaddingLeft() + getPaddingRight();
                if (RichEditorToolbar.this.formattingLayout1 != null) {
                    RichEditorToolbar.this.formattingLayout1.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) RichEditorToolbar.this.formattingLayout1.getLayoutParams();
                    paddingLeft += RichEditorToolbar.this.formattingLayout1.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }
                if (RichEditorToolbar.this.formattingLayout2 != null) {
                    RichEditorToolbar.this.formattingLayout2.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) RichEditorToolbar.this.formattingLayout2.getLayoutParams();
                    paddingLeft += RichEditorToolbar.this.formattingLayout2.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
                if (RichEditorToolbar.this.formattingLayout3 != null) {
                    RichEditorToolbar.this.formattingLayout3.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) RichEditorToolbar.this.formattingLayout3.getLayoutParams();
                    paddingLeft += RichEditorToolbar.this.formattingLayout3.getMeasuredWidth() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin;
                }
                RichEditorToolbar.this.formattingScrollMaxWidth = Math.max(0, size - paddingLeft);
                super.onMeasure(i6, i7);
            }
        };
        this.formattingPanel = linearLayout4;
        linearLayout4.setOrientation(0);
        linearLayout4.setClipToPadding(false);
        linearLayout4.setClipChildren(false);
        linearLayout4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout2.addView(linearLayout4, LayoutHelper.createFrame(-2, 60, 81));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.trashPanel = frameLayout6;
        frameLayout6.setClipChildren(false);
        frameLayout6.setClipToPadding(false);
        frameLayout6.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout2.addView(frameLayout6, LayoutHelper.createFrame(80, 60, 81));
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.trashPanelIcon = rLottieImageView;
        rLottieImageView.setAnimation(R.raw.group_pip_delete_icon, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        RLottieDrawable animatedDrawable = rLottieImageView.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.setPlayInDirectionOfCustomEndFrame(true);
            animatedDrawable.setAutoRepeat(0);
            animatedDrawable.setCustomEndFrame(0);
        }
        rLottieImageView.setScaleType(scaleType);
        rLottieImageView.setColorFilter(new PorterDuffColorFilter(color(i4), mode));
        rLottieImageView.setBackground(RichEditor.withShadow(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), color(i2))));
        frameLayout6.addView(rLottieImageView, LayoutHelper.createFrame(-1, -1, 119));
        FrameLayout frameLayout7 = new FrameLayout(context);
        frameLayout7.setBackground(RichEditor.withShadow(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), color(i2))));
        linearLayout4.addView(frameLayout7, LayoutHelper.createFrame(-2, 44.0f));
        HorizontalScrollView horizontalScrollView2 = new HorizontalScrollView(context) {
            @Override
            protected void onMeasure(int i6, int i7) {
                int mode2 = View.MeasureSpec.getMode(i6);
                if (mode2 == 1073741824) {
                    super.onMeasure(i6, i7);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i6), 0), i7);
                int measuredWidth = getMeasuredWidth();
                int iMin = RichEditorToolbar.this.formattingScrollMaxWidth;
                if (mode2 == Integer.MIN_VALUE) {
                    iMin = Math.min(iMin, View.MeasureSpec.getSize(i6));
                }
                setMeasuredDimension(Math.min(measuredWidth, iMin), getMeasuredHeight());
            }
        };
        this.formattingScrollView = horizontalScrollView2;
        horizontalScrollView2.setHorizontalScrollBarEnabled(false);
        this.formattingScrollView.setClipToOutline(true);
        this.formattingScrollView.setOutlineProvider(new ViewOutlineProvider() {
            @Override
            public void getOutline(View view3, Outline outline) {
                outline.setRoundRect(0, 0, view3.getWidth(), view3.getHeight(), AndroidUtilities.dp(22.0f));
            }
        });
        frameLayout7.addView(this.formattingScrollView, LayoutHelper.createFrame(-1, -1.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.formattingPanelLayout = linearLayout5;
        linearLayout5.setOrientation(0);
        linearLayout5.setPadding(AndroidUtilities.dp(1.5f), AndroidUtilities.dp(1.5f), AndroidUtilities.dp(1.5f), AndroidUtilities.dp(1.5f));
        this.formattingScrollView.addView(linearLayout5, new FrameLayout.LayoutParams(-2, -1));
        addFormattingButton(R.drawable.formatting_bold, 1);
        addFormattingButton(R.drawable.formatting_italic, 2);
        addFormattingButton(R.drawable.formatting_underline, 16);
        addFormattingButton(R.drawable.formatting_strikethrough, 8);
        addFormattingButton(R.drawable.formatting_spoiler, 256);
        addFormattingButton(R.drawable.iv_code, 4);
        addFormattingButton(R.drawable.iv_sub, 16384);
        addFormattingButton(R.drawable.iv_super, 32768);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.formattingLayout2 = linearLayout6;
        linearLayout6.setOrientation(0);
        this.formattingLayout2.setPadding(AndroidUtilities.dp(1.5f), AndroidUtilities.dp(1.5f), AndroidUtilities.dp(1.5f), AndroidUtilities.dp(1.5f));
        this.formattingLayout2.setBackground(RichEditor.withShadow(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), color(i2))));
        linearLayout4.addView(this.formattingLayout2, LayoutHelper.createFrame(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        RichEditor.Button button = new RichEditor.Button(context, R.drawable.media_link_24, resourcesProvider);
        this.linkButton = button;
        button.setBackgroundColorKey(i2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                delegate.onLink();
            }
        });
        this.formattingLayout2.addView(button, LayoutHelper.createLinear(41, 41));
        RichEditor.Button button2 = new RichEditor.Button(context, R.drawable.msg_calendar2, resourcesProvider);
        this.dateButton = button2;
        button2.setBackgroundColorKey(i2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                delegate.onDate();
            }
        });
        this.formattingLayout2.addView(button2, LayoutHelper.createLinear(41, 41));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.formattingLayout3 = linearLayout7;
        linearLayout7.setOrientation(0);
        this.formattingLayout3.setPadding(AndroidUtilities.dp(1.5f), AndroidUtilities.dp(1.5f), AndroidUtilities.dp(1.5f), AndroidUtilities.dp(1.5f));
        this.formattingLayout3.setBackground(RichEditor.withShadow(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), color(i2))));
        linearLayout4.addView(this.formattingLayout3, LayoutHelper.createFrame(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        RichEditor.Button button3 = new RichEditor.Button(context, i5, resourcesProvider);
        this.mathButton = button3;
        button3.setBackgroundColorKey(i2);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                delegate.onMath();
            }
        });
        this.formattingLayout3.addView(button3, LayoutHelper.createLinear(41, 41));
        LinearLayout linearLayout8 = new LinearLayout(context);
        this.formattingLayout1 = linearLayout8;
        linearLayout8.setOrientation(0);
        this.formattingLayout1.setPadding(AndroidUtilities.dp(1.5f), AndroidUtilities.dp(1.5f), AndroidUtilities.dp(1.5f), AndroidUtilities.dp(1.5f));
        this.formattingLayout1.setBackground(RichEditor.withShadow(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), color(i2))));
        linearLayout4.addView(this.formattingLayout1, 0, LayoutHelper.createFrame(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        RichEditor.Button button4 = new RichEditor.Button(context, R.drawable.input_ai, resourcesProvider);
        this.aiStyleButton = button4;
        button4.setBackgroundColorKey(i2);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                delegate.onAiStyle();
            }
        });
        this.formattingLayout1.addView(button4, LayoutHelper.createLinear(41, 41));
        ChatActivityEnterView.SendButton sendButton = new ChatActivityEnterView.SendButton(context, R.drawable.send_plane_24, resourcesProvider, true) {
            @Override
            public boolean isOpen() {
                return RichEditorToolbar.this.sendLoading || super.isOpen();
            }
        };
        this.sendButton = sendButton;
        sendButton.setBackground(RichEditor.withShadow(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), color(Theme.key_chat_messagePanelSend))));
        ScaleStateListAnimator.apply(sendButton);
        linearLayout2.addView(sendButton, LayoutHelper.createLinear(44, 44, 0.0f, 5, 8, 0, 0, 0));
        sendButton.setContentDescription("Send");
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                delegate.onSend();
            }
        });
        sendButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view3) {
                return delegate.onSendLongClick(view3);
            }
        });
        updatePanel(0, false);
    }

    private RichEditor.Button addBlockButton(int i, final int i2) {
        RichEditor.Button button = new RichEditor.Button(this.blocksLayout.getContext(), i, this.resourcesProvider);
        button.setBackgroundColorKey(Theme.key_glass_targetMainTabs);
        button.setTag(Integer.valueOf(i2));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$addBlockButton$12(i2, view);
            }
        });
        this.blockButtons.add(button);
        LinearLayout linearLayout = this.blocksLayout;
        linearLayout.addView(button, LayoutHelper.createLinear(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        return button;
    }

    public void lambda$addBlockButton$12(int i, View view) {
        this.delegate.onBlockButton(i, view);
    }

    private void addFormattingButton(int i, final int i2) {
        RichEditor.Button button = new RichEditor.Button(getContext(), i, this.resourcesProvider);
        button.setBackgroundColorKey(Theme.key_glass_targetMainTabs);
        button.setTag(Integer.valueOf(i2));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$addFormattingButton$13(i2, view);
            }
        });
        this.formattingButtons.add(button);
        LinearLayout linearLayout = this.formattingPanelLayout;
        linearLayout.addView(button, LayoutHelper.createLinear(41, 41, linearLayout.getChildCount() > 0 ? 2.0f : 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public void lambda$addFormattingButton$13(int i, View view) {
        this.delegate.onFormatting(i);
    }

    public void setBackVisible(boolean z) {
        this.backButton.setVisibility(z ? 0 : 8);
    }

    public void setTopPanelVisible(boolean z) {
        this.topPanel.setVisibility(z ? 0 : 8);
        this.topGradient.setVisibility(z ? 0 : 8);
    }

    public void setTopGradientVisible(boolean z) {
        this.topGradient.setVisibility(z ? 0 : 8);
    }

    public void setTopButtonsOffset(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.historyButtons.getLayoutParams();
        if (layoutParams.topMargin != i) {
            layoutParams.topMargin = i;
            this.historyButtons.setLayoutParams(layoutParams);
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.backButton.getLayoutParams();
        if (layoutParams2.topMargin != i) {
            layoutParams2.topMargin = i;
            this.backButton.setLayoutParams(layoutParams2);
        }
    }

    public void setHistoryEnabled(boolean z, boolean z2) {
        this.undoButton.setEnabled(z);
        this.undoButton.setAlpha(z ? 1.0f : 0.35f);
        this.redoButton.setEnabled(z2);
        this.redoButton.setAlpha(z2 ? 1.0f : 0.35f);
    }

    public void setSelectedBlockType(int i) {
        setSelectedBlockType(i, 0);
    }

    public void setSelectedBlockType(int i, int i2) {
        Iterator it = this.blockButtons.iterator();
        while (it.hasNext()) {
            RichEditor.Button button = (RichEditor.Button) it.next();
            boolean z = i == ((Integer) button.getTag()).intValue();
            button.setSelected(z);
            if (z && i2 != 0) {
                button.updateIcon(i2);
            } else {
                button.resetIcon();
            }
        }
    }

    public void setFormattingState(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        Iterator it = this.formattingButtons.iterator();
        while (it.hasNext()) {
            RichEditor.Button button = (RichEditor.Button) it.next();
            int iIntValue = ((Integer) button.getTag()).intValue();
            button.setSelected((i & iIntValue) != 0);
            if (iIntValue == 1 || iIntValue == 2) {
                button.setEnabled(z4);
            }
        }
        this.linkButton.setSelected(z);
        this.dateButton.setSelected(z2);
        this.linkButton.setEnabled(z3);
        this.dateButton.setEnabled(z3);
        this.mathButton.setEnabled(z3);
    }

    public void showFormattingPanel(boolean z, boolean z2) {
        if (this.panelType == 2) {
            this.reorderSavedPanelType = z ? 1 : 0;
        } else {
            updatePanel(z ? 1 : 0, z2);
        }
    }

    private void updatePanel(int i, boolean z) {
        if (this.panelType == i) {
            return;
        }
        this.panelType = i;
        if (z) {
            this.bottomPanel.setVisibility(0);
            ViewPropertyAnimator duration = this.bottomPanel.animate().alpha(i == 0 ? 1.0f : 0.0f).scaleX(i == 0 ? 1.0f : 0.8f).scaleY(i == 0 ? 1.0f : 0.8f).translationY(i == 0 ? 0.0f : AndroidUtilities.dp(30.0f)).setDuration(420L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            duration.setInterpolator(cubicBezierInterpolator).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$updatePanel$14();
                }
            }).start();
            this.formattingPanel.setVisibility(0);
            this.formattingPanel.animate().alpha(i == 1 ? 1.0f : 0.0f).scaleX(i == 1 ? 1.0f : 0.8f).scaleY(i == 1 ? 1.0f : 0.8f).translationY(i == 1 ? 0.0f : AndroidUtilities.dp(30.0f)).setDuration(420L).setInterpolator(cubicBezierInterpolator).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$updatePanel$15();
                }
            }).start();
            this.trashPanel.setVisibility(0);
            this.trashPanel.animate().alpha(i == 2 ? 1.0f : 0.0f).scaleX(i == 2 ? 1.0f : 0.8f).scaleY(i == 2 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(cubicBezierInterpolator).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$updatePanel$16();
                }
            }).start();
            return;
        }
        this.bottomPanel.setVisibility(i == 0 ? 0 : 8);
        this.bottomPanel.setAlpha(i == 0 ? 1.0f : 0.0f);
        this.bottomPanel.setScaleX(i == 0 ? 1.0f : 0.8f);
        this.bottomPanel.setScaleY(i == 0 ? 1.0f : 0.8f);
        this.bottomPanel.setTranslationY(i == 0 ? 0.0f : AndroidUtilities.dp(30.0f));
        this.formattingPanel.setVisibility(i == 1 ? 0 : 8);
        this.formattingPanel.setAlpha(i == 1 ? 1.0f : 0.0f);
        this.formattingPanel.setScaleX(i == 1 ? 1.0f : 0.8f);
        this.formattingPanel.setScaleY(i == 1 ? 1.0f : 0.8f);
        this.formattingPanel.setTranslationY(i == 1 ? 0.0f : AndroidUtilities.dp(30.0f));
        this.trashPanel.setVisibility(i != 2 ? 8 : 0);
        this.trashPanel.setAlpha(i == 2 ? 1.0f : 0.0f);
        this.trashPanel.setScaleX(i == 2 ? 1.0f : 0.8f);
        this.trashPanel.setScaleY(i == 2 ? 1.0f : 0.8f);
    }

    public void lambda$updatePanel$14() {
        if (this.panelType != 0) {
            this.bottomPanel.setVisibility(8);
        }
    }

    public void lambda$updatePanel$15() {
        if (this.panelType != 1) {
            this.formattingPanel.setVisibility(8);
        }
    }

    public void lambda$updatePanel$16() {
        if (this.panelType != 2) {
            this.trashPanel.setVisibility(8);
        }
    }

    public void onReorderStart() {
        int i = this.panelType;
        if (i == 2) {
            i = 0;
        }
        this.reorderSavedPanelType = i;
        setTrashHovered(false, false);
        updatePanel(2, true);
    }

    public boolean onReorderMove(float f, float f2) {
        boolean zIsOverTrash = isOverTrash(f2);
        setTrashHovered(zIsOverTrash, true);
        return zIsOverTrash;
    }

    public void onReorderEnd() {
        setTrashHovered(false, true);
        int i = this.reorderSavedPanelType;
        updatePanel(i != 2 ? i : 0, true);
    }

    private boolean isOverTrash(float f) {
        FrameLayout frameLayout = this.trashPanel;
        if (frameLayout == null) {
            return false;
        }
        int[] iArr = new int[2];
        frameLayout.getLocationOnScreen(iArr);
        return f >= ((float) iArr[1]);
    }

    private void setTrashHovered(boolean z, boolean z2) {
        if (this.trashHovered == z && z2) {
            return;
        }
        this.trashHovered = z;
        float f = z ? 1.15f : 1.0f;
        if (z2) {
            this.trashPanelIcon.animate().scaleX(f).scaleY(f).setDuration(180L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
        } else {
            this.trashPanelIcon.animate().cancel();
            this.trashPanelIcon.setScaleX(f);
            this.trashPanelIcon.setScaleY(f);
        }
        this.trashPanelIcon.setColorFilter(new PorterDuffColorFilter(color(z ? Theme.key_text_RedBold : Theme.key_windowBackgroundWhiteBlackText), PorterDuff.Mode.SRC_IN));
        RLottieDrawable animatedDrawable = this.trashPanelIcon.getAnimatedDrawable();
        if (animatedDrawable != null) {
            if (z) {
                if (animatedDrawable.getCurrentFrame() > 34) {
                    animatedDrawable.setCurrentFrame(0, false);
                }
                animatedDrawable.setCustomEndFrame(33);
            } else {
                animatedDrawable.setCustomEndFrame(0);
            }
            animatedDrawable.start();
        }
    }

    public void setSendEditing(boolean z) throws Resources.NotFoundException {
        this.sendButton.setResourceId(z ? R.drawable.input_done : R.drawable.send_plane_24);
    }

    public void setSendLoading(boolean z) {
        if (this.sendLoading == z) {
            return;
        }
        this.sendLoading = z;
        this.sendButton.invalidate();
    }

    public void setSendEnabled(boolean z) {
        if (this.sendButton.isEnabled() == z) {
            return;
        }
        this.sendButton.setEnabled(z);
        this.sendButton.animate().alpha(z ? 1.0f : 0.5f).setDuration(150L).start();
    }

    public void setEmojiOpened(boolean z) {
        this.emojiButton.setState(z ? ChatActivityEnterViewAnimatedIconView.State.KEYBOARD : ChatActivityEnterViewAnimatedIconView.State.SMILE, true);
        this.emojiButton.setContentDescription(z ? "Keyboard" : "Emoji");
    }

    public ChatActivityEnterView.SendButton getSendButton() {
        return this.sendButton;
    }

    public ImageView getAddButton() {
        return this.addButton;
    }

    public View getEmojiButton() {
        return this.emojiButton;
    }

    public LinearLayout getBottomPanel() {
        return this.bottomPanel;
    }

    public FrameLayout getBottomContainer() {
        return this.bottomContainer;
    }

    public FrameLayout getBottomInnerContainer() {
        return this.bottomInnerContainer;
    }

    private int color(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }
}
