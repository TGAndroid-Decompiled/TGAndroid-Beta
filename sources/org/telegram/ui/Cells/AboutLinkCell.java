package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.GestureDetectorCompat;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.browser.Browser;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.ChatbotSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda70;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.StaticLayoutEx;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda46;

public abstract class AboutLinkCell extends FrameLayout {
    private static final int COLLAPSED_HEIGHT;
    private static final int MAX_OPEN_HEIGHT;
    private static final int MOST_SPEC;
    final float SPACE;
    private CharSequence accessibilityText;
    private Paint backgroundPaint;
    private FrameLayout bottomShadow;
    private ValueAnimator collapseAnimator;
    private FrameLayout container;
    private LoadingDrawable currentLoading;
    private Browser.Progress currentProgress;
    private float expandT;
    private boolean expanded;
    private StaticLayout firstThreeLinesLayout;
    private GestureDetectorCompat gestureDetector;
    private int lastInlineLine;
    private int lastMaxWidth;
    private LinkSpanDrawable.LinkCollector links;
    Runnable longPressedRunnable;
    private boolean moreButtonDisabled;
    private boolean needSpace;
    private StaticLayout[] nextLinesLayouts;
    private Point[] nextLinesLayoutsPositions;
    private String oldText;
    private BaseFragment parentFragment;
    private LinkSpanDrawable pressedLink;
    private Layout pressedLinkLayout;
    private float pressedLinkYOffset;
    private float rawCollapseT;
    private Theme.ResourcesProvider resourcesProvider;
    private Drawable rippleBackground;
    private boolean shouldExpand;
    private Drawable showMoreBackgroundDrawable;
    private FrameLayout showMoreTextBackgroundView;
    private TextView showMoreTextView;
    private SpannableStringBuilder stringBuilder;
    private StaticLayout textLayout;
    private int textX;
    private int textY;
    private LinkPath urlPath;
    private Point urlPathOffset;
    private TextView valueTextView;

    public final class AnonymousClass1 extends TextView {
        public boolean pressed;

        @Override
        public final void onDraw(Canvas canvas) {
            if (this.pressed) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), Theme.chat_urlPaint);
            }
            super.onDraw(canvas);
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z = this.pressed;
            if (motionEvent.getAction() == 0) {
                this.pressed = true;
            } else if (motionEvent.getAction() != 2) {
                this.pressed = false;
            }
            if (z != this.pressed) {
                invalidate();
            }
            return this.pressed || super.onTouchEvent(motionEvent);
        }
    }

    public final class AnonymousClass2 implements Runnable {
        public AnonymousClass2() {
        }

        @Override
        public final void run() {
            String url;
            AboutLinkCell aboutLinkCell = AboutLinkCell.this;
            if (aboutLinkCell.pressedLink != null) {
                if (aboutLinkCell.pressedLink.getSpan() instanceof URLSpanNoUnderline) {
                    url = ((URLSpanNoUnderline) aboutLinkCell.pressedLink.getSpan()).getURL();
                } else {
                    url = aboutLinkCell.pressedLink.getSpan() instanceof URLSpan ? ((URLSpan) aboutLinkCell.pressedLink.getSpan()).getURL() : aboutLinkCell.pressedLink.getSpan().toString();
                }
                final String str = url;
                try {
                    aboutLinkCell.performHapticFeedback(0, 2);
                } catch (Exception unused) {
                }
                final Layout layout = aboutLinkCell.pressedLinkLayout;
                final float f = aboutLinkCell.pressedLinkYOffset;
                if (aboutLinkCell.getContext() != null) {
                    final ClickableSpan clickableSpan = (ClickableSpan) aboutLinkCell.pressedLink.getSpan();
                    BottomSheet bottomSheet = new BottomSheet(aboutLinkCell.getContext(), false, false, null);
                    bottomSheet.fixNavigationBar();
                    bottomSheet.title = str;
                    bottomSheet.bigTitle = false;
                    CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            AboutLinkCell aboutLinkCell2 = AboutLinkCell.this;
                            if (i == 0) {
                                aboutLinkCell2.onLinkClick(clickableSpan, layout, f);
                                return;
                            }
                            if (i == 1) {
                                String str2 = str;
                                AndroidUtilities.addToClipboard(str2);
                                if (AndroidUtilities.shouldShowClipboardToast()) {
                                    if (str2.startsWith("@")) {
                                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.UsernameCopied, BulletinFactory.of(aboutLinkCell2.parentFragment), R.raw.copy);
                                    } else if (str2.startsWith("#") || str2.startsWith("$")) {
                                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.HashtagCopied, BulletinFactory.of(aboutLinkCell2.parentFragment), R.raw.copy);
                                    } else {
                                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.LinkCopied, BulletinFactory.of(aboutLinkCell2.parentFragment), R.raw.copy);
                                    }
                                }
                            }
                        }
                    };
                    bottomSheet.items = charSequenceArr;
                    bottomSheet.onClickListener = onClickListener;
                    bottomSheet.setOnHideListener(new RichEditor$$ExternalSyntheticLambda46(this, 3));
                    bottomSheet.show();
                }
                aboutLinkCell.pressedLink = null;
            }
        }
    }

    public final class AnonymousClass3 extends Browser.Progress {
        public LoadingDrawable thisLoading;
        public final Layout val$layout;
        public final ClickableSpan val$pressedLink;
        public final float val$yOffset;

        public AnonymousClass3(ClickableSpan clickableSpan, Layout layout, float f) {
            this.val$layout = layout;
            this.val$pressedLink = clickableSpan;
            this.val$yOffset = f;
        }

        @Override
        public final void end(boolean z) {
            AndroidUtilities.runOnUIThread(new ChatbotSheet$$ExternalSyntheticLambda0(this, 6), z ? 0L : 350L);
        }

        @Override
        public final void init() {
            AboutLinkCell aboutLinkCell = AboutLinkCell.this;
            if (aboutLinkCell.currentLoading != null) {
                aboutLinkCell.links.removeLoading(aboutLinkCell.currentLoading, true);
            }
            LoadingDrawable loadingDrawableMakeLoading = LinkSpanDrawable.LinkCollector.makeLoading(this.val$layout, this.val$pressedLink, this.val$yOffset);
            this.thisLoading = loadingDrawableMakeLoading;
            aboutLinkCell.currentLoading = loadingDrawableMakeLoading;
            int iProcessColor = aboutLinkCell.processColor(Theme.getColor(Theme.key_chat_linkSelectBackground, aboutLinkCell.resourcesProvider));
            this.thisLoading.setColors(Theme.multAlpha(0.8f, iProcessColor), Theme.multAlpha(1.3f, iProcessColor), Theme.multAlpha(1.0f, iProcessColor), Theme.multAlpha(4.0f, iProcessColor));
            this.thisLoading.strokePaint.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
            aboutLinkCell.links.addLoading(this.thisLoading);
        }
    }

    public final class AnonymousClass5 extends ClickableSpan {
        public final int $r8$classId;
        public final Object this$0;
        public final CharacterStyle val$original;

        public AnonymousClass5(Object obj, CharacterStyle characterStyle, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
            this.val$original = characterStyle;
        }

        @Override
        public final void onClick(View view) {
            switch (this.$r8$classId) {
                case 0:
                    AboutLinkCell aboutLinkCell = (AboutLinkCell) this.this$0;
                    aboutLinkCell.onLinkClick((ClickableSpan) this.val$original, aboutLinkCell.textLayout, 0.0f);
                    break;
                case 1:
                    ChatActionCell chatActionCell = (ChatActionCell) this.this$0;
                    if (chatActionCell.delegate != null) {
                        chatActionCell.openLink(this.val$original);
                    }
                    break;
                default:
                    CharacterStyle characterStyle = this.val$original;
                    if (!(characterStyle instanceof ChatMessageCell.MessageAccessibilityNodeProvider.ProfileSpan)) {
                        ChatMessageCell chatMessageCell = ChatMessageCell.this;
                        if (chatMessageCell.delegate != null) {
                            chatMessageCell.delegate.didPressUrl(chatMessageCell, characterStyle, false);
                        }
                    } else {
                        ((ChatMessageCell.MessageAccessibilityNodeProvider.ProfileSpan) characterStyle).onClick(view);
                    }
                    break;
            }
        }
    }

    public final class SpringInterpolator {
        public float position;
        public float velocity;
    }

    static {
        int iDp = AndroidUtilities.dp(76.0f);
        COLLAPSED_HEIGHT = iDp;
        MAX_OPEN_HEIGHT = iDp;
        MOST_SPEC = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
    }

    public AboutLinkCell(BaseFragment baseFragment, Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.urlPathOffset = new Point();
        this.urlPath = new LinkPath(true);
        this.nextLinesLayouts = null;
        this.lastInlineLine = -1;
        this.needSpace = false;
        this.backgroundPaint = new Paint();
        this.SPACE = AndroidUtilities.dp(3.0f);
        this.longPressedRunnable = new AnonymousClass2();
        this.expandT = 0.0f;
        this.rawCollapseT = 0.0f;
        this.expanded = false;
        this.lastMaxWidth = 0;
        this.shouldExpand = false;
        this.resourcesProvider = resourcesProvider;
        this.parentFragment = baseFragment;
        FrameLayout frameLayout = new FrameLayout(context);
        this.container = frameLayout;
        frameLayout.setImportantForAccessibility(2);
        this.links = new LinkSpanDrawable.LinkCollector(this.container);
        this.rippleBackground = Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 0, 0);
        TextView textView = new TextView(context);
        this.valueTextView = textView;
        textView.setVisibility(8);
        this.valueTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
        this.valueTextView.setTextSize(1, 13.0f);
        this.valueTextView.setLines(1);
        this.valueTextView.setMaxLines(1);
        this.valueTextView.setSingleLine(true);
        this.valueTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        this.valueTextView.setImportantForAccessibility(2);
        this.valueTextView.setFocusable(false);
        this.container.addView(this.valueTextView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 18.0f, 0.0f, 18.0f, 10.0f));
        this.bottomShadow = new FrameLayout(context);
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.gradient_bottom).mutate();
        int i = Theme.key_windowBackgroundWhite;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, resourcesProvider), PorterDuff.Mode.SRC_ATOP));
        this.bottomShadow.setBackground(drawableMutate);
        addView(this.bottomShadow, LayoutHelper.createFrame(-1, 12.0f, 87, 16.0f, 0.0f, 16.0f, 0.0f));
        addView(this.container, LayoutHelper.createFrame(-1, -1, 55));
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context);
        anonymousClass1.pressed = false;
        this.showMoreTextView = anonymousClass1;
        anonymousClass1.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText, resourcesProvider));
        this.showMoreTextView.setTextSize(1, 16.0f);
        this.showMoreTextView.setLines(1);
        this.showMoreTextView.setMaxLines(1);
        this.showMoreTextView.setSingleLine(true);
        this.showMoreTextView.setText(LocaleController.getString(R.string.DescriptionMore));
        this.showMoreTextView.setOnClickListener(new AboutLinkCell$$ExternalSyntheticLambda1(this, 0));
        this.showMoreTextView.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.showMoreTextBackgroundView = new FrameLayout(context);
        Drawable drawableMutate2 = context.getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.showMoreBackgroundDrawable = drawableMutate2;
        drawableMutate2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, resourcesProvider), PorterDuff.Mode.MULTIPLY));
        this.showMoreTextBackgroundView.setBackground(this.showMoreBackgroundDrawable);
        FrameLayout frameLayout2 = this.showMoreTextBackgroundView;
        frameLayout2.setPadding(AndroidUtilities.dp(4.0f) + frameLayout2.getPaddingLeft(), AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(3.0f));
        this.showMoreTextBackgroundView.addView(this.showMoreTextView, LayoutHelper.createFrame(-2, -2.0f));
        FrameLayout frameLayout3 = this.showMoreTextBackgroundView;
        addView(frameLayout3, LayoutHelper.createFrame(-2, -2.0f, 85, 18.0f - (frameLayout3.getPaddingLeft() / AndroidUtilities.density), 0.0f, 18.0f - (this.showMoreTextBackgroundView.getPaddingRight() / AndroidUtilities.density), 6.0f));
        this.backgroundPaint.setColor(Theme.getColor(i, resourcesProvider));
        setWillNotDraw(false);
    }

    public static void access$300(AboutLinkCell aboutLinkCell) {
        aboutLinkCell.links.clear();
        aboutLinkCell.pressedLink = null;
        AndroidUtilities.cancelRunOnUIThread(aboutLinkCell.longPressedRunnable);
        aboutLinkCell.invalidate();
    }

    public static StaticLayout makeTextLayout(CharSequence charSequence, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), Theme.profile_aboutTextPaint, Math.max(1, i)).setBreakStrategy(0).setHyphenationFrequency(0).setAlignment(LocaleController.isRTL ? StaticLayoutEx.ALIGN_RIGHT() : StaticLayoutEx.ALIGN_LEFT()).build();
        }
        return new StaticLayout(charSequence, Theme.profile_aboutTextPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    private void setHeight(int i) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) getLayoutParams();
        boolean z = true;
        if (layoutParams == null) {
            if (getMinimumHeight() == 0) {
                getHeight();
            } else {
                getMinimumHeight();
            }
            layoutParams = new RecyclerView.LayoutParams(-1, i);
        } else {
            z = ((ViewGroup.MarginLayoutParams) layoutParams).height != i;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = i;
        }
        if (z) {
            setLayoutParams(layoutParams);
        }
    }

    private void setShowMoreMarginBottom(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.showMoreTextBackgroundView.getLayoutParams();
        if (layoutParams.bottomMargin != i) {
            layoutParams.bottomMargin = i;
            this.showMoreTextBackgroundView.setLayoutParams(layoutParams);
        }
    }

    public final void checkTextLayout(int i, boolean z) {
        if (this.moreButtonDisabled) {
            this.shouldExpand = false;
        }
        SpannableStringBuilder spannableStringBuilder = this.stringBuilder;
        if (spannableStringBuilder != null && (i != this.lastMaxWidth || z)) {
            StaticLayout staticLayoutMakeTextLayout = makeTextLayout(spannableStringBuilder, i);
            this.textLayout = staticLayoutMakeTextLayout;
            this.shouldExpand = staticLayoutMakeTextLayout.getLineCount() >= 4;
            if (this.textLayout.getLineCount() >= 3 && this.shouldExpand) {
                int iMax = Math.max(this.textLayout.getLineStart(2), this.textLayout.getLineEnd(2));
                if (this.stringBuilder.charAt(iMax - 1) == '\n') {
                    iMax--;
                }
                int i2 = iMax - 1;
                this.needSpace = (this.stringBuilder.charAt(i2) == ' ' || this.stringBuilder.charAt(i2) == '\n') ? false : true;
                this.firstThreeLinesLayout = makeTextLayout(this.stringBuilder.subSequence(0, iMax), i);
                this.nextLinesLayouts = new StaticLayout[this.textLayout.getLineCount() - 3];
                this.nextLinesLayoutsPositions = new Point[this.textLayout.getLineCount() - 3];
                float lineRight = this.firstThreeLinesLayout.getLineRight(this.firstThreeLinesLayout.getLineCount() - 1) + (this.needSpace ? this.SPACE : 0.0f);
                this.lastInlineLine = -1;
                if (this.showMoreTextBackgroundView.getMeasuredWidth() <= 0) {
                    FrameLayout frameLayout = this.showMoreTextBackgroundView;
                    int i3 = MOST_SPEC;
                    frameLayout.measure(i3, i3);
                }
                for (int i4 = 3; i4 < this.textLayout.getLineCount(); i4++) {
                    int lineStart = this.textLayout.getLineStart(i4);
                    int lineEnd = this.textLayout.getLineEnd(i4);
                    StaticLayout staticLayoutMakeTextLayout2 = makeTextLayout(this.stringBuilder.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd)), i);
                    int i5 = i4 - 3;
                    this.nextLinesLayouts[i5] = staticLayoutMakeTextLayout2;
                    this.nextLinesLayoutsPositions[i5] = new Point();
                    if (this.lastInlineLine == -1) {
                        if (lineRight > this.showMoreTextBackgroundView.getPaddingLeft() + (i - this.showMoreTextBackgroundView.getMeasuredWidth())) {
                            this.lastInlineLine = i5;
                        }
                    }
                    lineRight += staticLayoutMakeTextLayout2.getLineRight(0) + this.SPACE;
                }
                if (lineRight < this.showMoreTextBackgroundView.getPaddingLeft() + (i - this.showMoreTextBackgroundView.getMeasuredWidth())) {
                    this.shouldExpand = false;
                }
            }
            if (!this.shouldExpand) {
                this.firstThreeLinesLayout = null;
                this.nextLinesLayouts = null;
            }
            this.lastMaxWidth = i;
            this.container.setMinimumHeight(textHeight());
            if (this.shouldExpand && this.firstThreeLinesLayout != null) {
                int iMin = Math.min(COLLAPSED_HEIGHT + (this.valueTextView.getVisibility() == 0 ? AndroidUtilities.dp(20.0f) : 0), textHeight()) - AndroidUtilities.dp(8.0f);
                StaticLayout staticLayout = this.firstThreeLinesLayout;
                setShowMoreMarginBottom((((iMin - staticLayout.getLineBottom(staticLayout.getLineCount() - 1)) - this.showMoreTextBackgroundView.getPaddingBottom()) - this.showMoreTextView.getPaddingBottom()) - (this.showMoreTextView.getLayout() == null ? 0 : this.showMoreTextView.getLayout().getHeight() - this.showMoreTextView.getLayout().getLineBottom(this.showMoreTextView.getLineCount() - 1)));
            }
        }
        this.showMoreTextView.setVisibility(this.shouldExpand ? 0 : 8);
        if (!this.shouldExpand && this.container.getBackground() == null) {
            this.container.setBackground(this.rippleBackground);
        }
        if (!this.shouldExpand || this.expandT >= 1.0f || this.container.getBackground() == null) {
            return;
        }
        this.container.setBackground(null);
    }

    public final LinkSpanDrawable checkTouchTextLayout(StaticLayout staticLayout, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        try {
            int lineForVertical = staticLayout.getLineForVertical(i6);
            float f = i5;
            int offsetForHorizontal = staticLayout.getOffsetForHorizontal(lineForVertical, f);
            float lineLeft = staticLayout.getLineLeft(lineForVertical);
            if (lineLeft > f || lineLeft + staticLayout.getLineWidth(lineForVertical) < f || i6 < 0 || i6 > staticLayout.getHeight()) {
                return null;
            }
            Spannable spannable = (Spannable) staticLayout.getText();
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length == 0 || AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                return null;
            }
            LinkSpanDrawable linkSpanDrawable = new LinkSpanDrawable(clickableSpanArr[0], this.resourcesProvider, i3, i4);
            linkSpanDrawable.setColor(processColor(Theme.getColor(Theme.key_chat_linkSelectBackground, this.resourcesProvider)));
            int spanStart = spannable.getSpanStart(clickableSpanArr[0]);
            int spanEnd = spannable.getSpanEnd(clickableSpanArr[0]);
            LinkPath linkPathObtainNewPath = linkSpanDrawable.obtainNewPath();
            float f2 = i2;
            this.pressedLinkYOffset = f2;
            linkPathObtainNewPath.setCurrentLayout(staticLayout, spanStart, f2);
            staticLayout.getSelectionPath(spanStart, spanEnd, linkPathObtainNewPath);
            return linkSpanDrawable;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public void didExtend() {
    }

    public abstract void didPressUrl(String str, Browser.Progress progress);

    public abstract void didResizeEnd();

    public abstract void didResizeStart();

    @Override
    public void draw(Canvas canvas) {
        float f;
        float f2;
        StaticLayout staticLayout;
        int i;
        super.draw(canvas);
        View view = (View) getParent();
        float fPow = view == null ? 1.0f : (float) Math.pow(view.getAlpha(), 2.0d);
        canvas.save();
        canvas.clipRect(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f), getWidth() - AndroidUtilities.dp(18.0f), getHeight());
        int iDp = AndroidUtilities.dp(18.0f);
        this.textX = iDp;
        float f3 = 0.0f;
        canvas.translate(iDp, 0.0f);
        LinkSpanDrawable.LinkCollector linkCollector = this.links;
        if (linkCollector != null && linkCollector.draw(canvas)) {
            invalidate();
        }
        int iDp2 = AndroidUtilities.dp(8.0f);
        this.textY = iDp2;
        canvas.translate(0.0f, iDp2);
        float f4 = 255.0f;
        try {
            Theme.profile_aboutTextPaint.linkColor = processColor(Theme.getColor(Theme.key_chat_messageLinkIn, this.resourcesProvider));
            StaticLayout staticLayout2 = this.firstThreeLinesLayout;
            try {
                if (staticLayout2 == null || !this.shouldExpand) {
                    f = 0.0f;
                    f2 = 255.0f;
                    StaticLayout staticLayout3 = this.textLayout;
                    if (staticLayout3 != null) {
                        staticLayout3.draw(canvas);
                    }
                } else {
                    staticLayout2.draw(canvas);
                    int lineCount = this.firstThreeLinesLayout.getLineCount() - 1;
                    float lineTop = this.firstThreeLinesLayout.getLineTop(lineCount) + this.firstThreeLinesLayout.getTopPadding();
                    float lineRight = this.firstThreeLinesLayout.getLineRight(lineCount) + (this.needSpace ? this.SPACE : 0.0f);
                    float lineBottom = (this.firstThreeLinesLayout.getLineBottom(lineCount) - this.firstThreeLinesLayout.getLineTop(lineCount)) - this.firstThreeLinesLayout.getBottomPadding();
                    float fPow2 = 1.0f - ((float) Math.pow(this.expandT, 0.25d));
                    float fM = ((double) fPow2) < 0.5d ? MediaController$$ExternalSyntheticOutline0.m(fPow2, 4.0f, fPow2, fPow2) : 1.0f - (((float) Math.pow((fPow2 * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
                    if (this.nextLinesLayouts != null) {
                        float f5 = lineRight;
                        int i2 = 0;
                        while (true) {
                            StaticLayout[] staticLayoutArr = this.nextLinesLayouts;
                            if (i2 >= staticLayoutArr.length) {
                                break;
                            }
                            StaticLayout staticLayout4 = staticLayoutArr[i2];
                            if (staticLayout4 != null) {
                                int iSave = canvas.save();
                                Point point = this.nextLinesLayoutsPositions[i2];
                                if (point != null) {
                                    point.set((int) ((f5 * fM) + this.textX), (int) DiffUtil.m(1.0f, fM, lineBottom, this.textY + lineTop));
                                }
                                int i3 = this.lastInlineLine;
                                if (i3 == -1 || i3 > i2) {
                                    staticLayout = staticLayout4;
                                    i = iSave;
                                    canvas.translate(f5 * fM, DiffUtil.m(1.0f, fM, lineBottom, lineTop));
                                } else {
                                    canvas.translate(f3, lineTop + lineBottom);
                                    float width = staticLayout4.getWidth();
                                    float height = staticLayout4.getHeight();
                                    int i4 = (int) (this.expandT * f4);
                                    i = iSave;
                                    staticLayout = staticLayout4;
                                    canvas.saveLayerAlpha(0.0f, 0.0f, width, height, i4, 31);
                                }
                                staticLayout.draw(canvas);
                                canvas.restoreToCount(i);
                                float lineRight2 = staticLayout.getLineRight(0) + this.SPACE + f5;
                                lineBottom += (staticLayout.getLineBottom(0) + staticLayout.getTopPadding()) - 1;
                                f5 = lineRight2;
                            } else {
                                i2 = i2;
                            }
                            i2++;
                            f3 = 0.0f;
                            f4 = 255.0f;
                        }
                    }
                    f = 0.0f;
                    f2 = 255.0f;
                }
            } catch (Exception e) {
                e = e;
                FileLog.e(e);
            }
        } catch (Exception e2) {
            e = e2;
            f = 0.0f;
            f2 = 255.0f;
        }
        canvas.restore();
        float alpha = this.showMoreTextBackgroundView.getAlpha();
        if (alpha > f) {
            canvas.save();
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (alpha * f2), 31);
            this.showMoreBackgroundDrawable.setAlpha((int) (fPow * f2));
            canvas.translate(this.showMoreTextBackgroundView.getLeft(), this.showMoreTextBackgroundView.getTop());
            this.showMoreTextBackgroundView.draw(canvas);
            canvas.restore();
        }
        float alpha2 = this.bottomShadow.getAlpha();
        if (alpha2 > f) {
            canvas.save();
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (alpha2 * f2), 31);
            canvas.translate(this.bottomShadow.getLeft(), this.bottomShadow.getTop());
            this.bottomShadow.draw(canvas);
            canvas.restore();
        }
        this.container.draw(canvas);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        return false;
    }

    public final void lambda$new$0(View view) {
        updateCollapse(true, true);
    }

    public final void lambda$updateCollapse$1(AtomicReference atomicReference, float f, float f2, SpringInterpolator springInterpolator, ValueAnimator valueAnimator) {
        Float f3 = (Float) valueAnimator.getAnimatedValue();
        float fFloatValue = (f3.floatValue() - ((Float) atomicReference.getAndSet(f3)).floatValue()) * 1000.0f * 8.0f;
        this.rawCollapseT = AndroidUtilities.lerp(f, f2, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        springInterpolator.getClass();
        float fMin = Math.min(fFloatValue, 250.0f);
        while (fMin > 0.0f) {
            float fMin2 = Math.min(fMin, 18.0f);
            float f4 = springInterpolator.position;
            float f5 = springInterpolator.velocity;
            float f6 = (((((-0.020170001f) * f5) + ((f4 - 1.0f) * (-3.8E-4f))) / 1.0f) * fMin2) + f5;
            springInterpolator.velocity = f6;
            springInterpolator.position = (f6 * fMin2) + f4;
            fMin -= fMin2;
        }
        float fLerp = AndroidUtilities.lerp(f, f2, springInterpolator.position);
        this.expandT = fLerp;
        if (fLerp > 0.8f && this.container.getBackground() == null) {
            this.container.setBackground(this.rippleBackground);
        }
        this.showMoreTextBackgroundView.setAlpha(1.0f - this.expandT);
        this.bottomShadow.setAlpha((float) Math.pow(1.0f - this.expandT, 2.0d));
        int iTextHeight = textHeight();
        float fMin3 = Math.min(COLLAPSED_HEIGHT + (this.valueTextView.getVisibility() == 0 ? AndroidUtilities.dp(20.0f) : 0), textHeight());
        if (this.shouldExpand) {
            iTextHeight = (int) AndroidUtilities.lerp(fMin3, iTextHeight, this.expandT);
        }
        setHeight(iTextHeight);
        this.container.invalidate();
    }

    public boolean onClick() {
        if (!this.shouldExpand || this.expandT > 0.0f) {
            return false;
        }
        updateCollapse(true, true);
        return true;
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i = 0;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.textLayout != null) {
            CharSequence charSequence = this.accessibilityText;
            if (charSequence == null) {
                SpannableStringBuilder spannableStringBuilder = this.stringBuilder;
                if (spannableStringBuilder == null) {
                    charSequence = null;
                } else {
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class);
                    if (clickableSpanArr == null || clickableSpanArr.length == 0) {
                        charSequence = this.stringBuilder;
                        this.accessibilityText = charSequence;
                    } else {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.stringBuilder);
                        for (ClickableSpan clickableSpan : clickableSpanArr) {
                            int spanStart = spannableStringBuilder2.getSpanStart(clickableSpan);
                            int spanEnd = spannableStringBuilder2.getSpanEnd(clickableSpan);
                            if (spanStart >= 0 && spanEnd > spanStart) {
                                spannableStringBuilder2.removeSpan(clickableSpan);
                                spannableStringBuilder2.setSpan(new AnonymousClass5(this, clickableSpan, i), spanStart, spanEnd, 33);
                            }
                        }
                        this.accessibilityText = spannableStringBuilder2;
                        charSequence = spannableStringBuilder2;
                    }
                }
            }
            CharSequence text = this.valueTextView.getText();
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
            } else {
                accessibilityNodeInfo.setText(TextUtils.concat(text, ": ", charSequence));
            }
        }
    }

    public final void onLinkClick(ClickableSpan clickableSpan, Layout layout, float f) {
        Browser.Progress progress = this.currentProgress;
        AnonymousClass3 anonymousClass3 = null;
        if (progress != null) {
            progress.cancel();
            this.currentProgress = null;
        }
        if (layout != null && clickableSpan != null) {
            anonymousClass3 = new AnonymousClass3(clickableSpan, layout, f);
        }
        this.currentProgress = anonymousClass3;
        if (clickableSpan instanceof URLSpanNoUnderline) {
            String url = ((URLSpanNoUnderline) clickableSpan).getURL();
            if (url.startsWith("@") || url.startsWith("#") || url.startsWith("$") || url.startsWith("/")) {
                didPressUrl(url, this.currentProgress);
                return;
            }
            return;
        }
        if (!(clickableSpan instanceof URLSpan)) {
            clickableSpan.onClick(this);
            return;
        }
        String url2 = ((URLSpan) clickableSpan).getURL();
        if (AndroidUtilities.shouldShowUrlInAlert(url2)) {
            AlertsCreator.showOpenUrlAlert(this.parentFragment, url2, true, true, true, this.currentProgress, null);
        } else {
            Browser.openUrl(getContext(), Uri.parse(url2), true, true, this.currentProgress);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        checkTextLayout(View.MeasureSpec.getSize(i) - AndroidUtilities.dp(36.0f), false);
        int iTextHeight = textHeight();
        float fMin = Math.min(COLLAPSED_HEIGHT + (this.valueTextView.getVisibility() == 0 ? AndroidUtilities.dp(20.0f) : 0), textHeight());
        if (this.shouldExpand) {
            iTextHeight = (int) AndroidUtilities.lerp(fMin, iTextHeight, this.expandT);
        }
        setHeight(iTextHeight);
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(iTextHeight, 1073741824));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AboutLinkCell aboutLinkCell;
        LinkSpanDrawable linkSpanDrawableCheckTouchTextLayout;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (this.showMoreTextView.getVisibility() == 0 && x >= this.showMoreTextBackgroundView.getLeft() && x <= this.showMoreTextBackgroundView.getRight() && y >= this.showMoreTextBackgroundView.getTop() && y <= this.showMoreTextBackgroundView.getBottom()) {
            return false;
        }
        if (this.textLayout != null || this.nextLinesLayouts != null) {
            LinkSpanDrawable linkSpanDrawable = null;
            if (motionEvent.getAction() != 0 && (this.pressedLink == null || motionEvent.getAction() != 1)) {
                if (motionEvent.getAction() == 3) {
                    this.links.clear();
                    this.pressedLink = null;
                    AndroidUtilities.cancelRunOnUIThread(this.longPressedRunnable);
                    invalidate();
                }
                if (super.onTouchEvent(motionEvent)) {
                    return false;
                }
            } else if (motionEvent.getAction() == 0) {
                this.links.clear();
                this.pressedLink = null;
                AndroidUtilities.cancelRunOnUIThread(this.longPressedRunnable);
                invalidate();
                if ((x < this.showMoreTextView.getLeft() || x > this.showMoreTextView.getRight() || y < this.showMoreTextView.getTop() || y > this.showMoreTextView.getBottom()) && (getMeasuredWidth() <= 0 || x <= getMeasuredWidth() - AndroidUtilities.dp(18.0f))) {
                    StaticLayout staticLayout = this.firstThreeLinesLayout;
                    if (staticLayout == null || this.expandT >= 1.0f || !this.shouldExpand) {
                        aboutLinkCell = this;
                    } else {
                        aboutLinkCell = this;
                        linkSpanDrawableCheckTouchTextLayout = aboutLinkCell.checkTouchTextLayout(staticLayout, this.textX, this.textY, x, y);
                        if (linkSpanDrawableCheckTouchTextLayout != null) {
                            linkSpanDrawable = linkSpanDrawableCheckTouchTextLayout;
                        } else if (aboutLinkCell.nextLinesLayouts != null) {
                            int i = 0;
                            while (true) {
                                StaticLayout[] staticLayoutArr = aboutLinkCell.nextLinesLayouts;
                                if (i < staticLayoutArr.length) {
                                    StaticLayout staticLayout2 = staticLayoutArr[i];
                                    Point point = aboutLinkCell.nextLinesLayoutsPositions[i];
                                    LinkSpanDrawable linkSpanDrawableCheckTouchTextLayout2 = aboutLinkCell.checkTouchTextLayout(staticLayout2, point.x, point.y, x, y);
                                    if (linkSpanDrawableCheckTouchTextLayout2 != null) {
                                        linkSpanDrawable = linkSpanDrawableCheckTouchTextLayout2;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    }
                    linkSpanDrawableCheckTouchTextLayout = aboutLinkCell.checkTouchTextLayout(aboutLinkCell.textLayout, aboutLinkCell.textX, aboutLinkCell.textY, x, y);
                    if (linkSpanDrawableCheckTouchTextLayout != null) {
                        linkSpanDrawable = linkSpanDrawableCheckTouchTextLayout;
                    }
                } else {
                    aboutLinkCell = this;
                }
                if (linkSpanDrawable != null) {
                    aboutLinkCell.pressedLinkLayout = aboutLinkCell.textLayout;
                    LinkSpanDrawable.LinkCollector linkCollector = aboutLinkCell.links;
                    aboutLinkCell.pressedLink = linkSpanDrawable;
                    linkCollector.addLink(linkSpanDrawable);
                    AndroidUtilities.runOnUIThread(aboutLinkCell.longPressedRunnable, ViewConfiguration.getLongPressTimeout());
                } else if (super.onTouchEvent(motionEvent)) {
                    return false;
                }
            } else {
                LinkSpanDrawable linkSpanDrawable2 = this.pressedLink;
                if (linkSpanDrawable2 != null) {
                    try {
                        onLinkClick((ClickableSpan) linkSpanDrawable2.getSpan(), this.textLayout, this.pressedLinkYOffset);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    this.links.clear();
                    this.pressedLink = null;
                    AndroidUtilities.cancelRunOnUIThread(this.longPressedRunnable);
                    invalidate();
                } else if (super.onTouchEvent(motionEvent)) {
                    return false;
                }
            }
        } else if (super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public abstract int processColor(int i);

    public void setMoreButtonDisabled(boolean z) {
        this.moreButtonDisabled = z;
    }

    public void setText(String str, boolean z) {
        setTextAndValue(str, null, z);
    }

    public void setTextAndValue(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, this.oldText)) {
            return;
        }
        try {
            this.oldText = AndroidUtilities.getSafeString(str);
        } catch (Throwable unused) {
            this.oldText = str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.oldText);
        this.stringBuilder = spannableStringBuilder;
        this.accessibilityText = null;
        MessageObject.addLinks(false, spannableStringBuilder, false, false, !z);
        Emoji.replaceEmoji(this.stringBuilder, Theme.profile_aboutTextPaint.getFontMetricsInt(), false);
        if (this.lastMaxWidth <= 0) {
            this.lastMaxWidth = AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f);
        }
        checkTextLayout(this.lastMaxWidth, true);
        int iTextHeight = textHeight();
        float fMin = Math.min(COLLAPSED_HEIGHT + (this.valueTextView.getVisibility() == 0 ? AndroidUtilities.dp(20.0f) : 0), textHeight());
        if (this.shouldExpand) {
            iTextHeight = (int) AndroidUtilities.lerp(fMin, iTextHeight, this.expandT);
        }
        setHeight(iTextHeight);
        int visibility = this.valueTextView.getVisibility();
        if (TextUtils.isEmpty(str2)) {
            this.valueTextView.setVisibility(8);
        } else {
            this.valueTextView.setText(str2);
            this.valueTextView.setVisibility(0);
        }
        if (visibility != this.valueTextView.getVisibility()) {
            checkTextLayout(this.lastMaxWidth, true);
        }
        requestLayout();
    }

    public final int textHeight() {
        StaticLayout staticLayout = this.textLayout;
        int iDp = AndroidUtilities.dp(16.0f) + (staticLayout != null ? staticLayout.getHeight() : AndroidUtilities.dp(20.0f));
        return this.valueTextView.getVisibility() == 0 ? AndroidUtilities.dp(23.0f) + iDp : iDp;
    }

    public void updateCollapse(boolean z, boolean z2) {
        int i = 2;
        ValueAnimator valueAnimator = this.collapseAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.collapseAnimator = null;
        }
        float f = this.expandT;
        float f2 = z ? 1.0f : 0.0f;
        if (!z2) {
            this.expandT = f2;
            forceLayout();
            return;
        }
        if (f2 > 0.0f) {
            didExtend();
        }
        float fTextHeight = textHeight();
        float fMin = Math.min(COLLAPSED_HEIGHT, fTextHeight);
        Math.abs(AndroidUtilities.lerp(fMin, fTextHeight, f2) - AndroidUtilities.lerp(fMin, fTextHeight, f));
        this.collapseAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
        float fAbs = Math.abs(f - f2) * 1250.0f * 2.0f;
        SpringInterpolator springInterpolator = new SpringInterpolator();
        springInterpolator.position = 0.0f;
        springInterpolator.velocity = 0.0f;
        this.collapseAnimator.addUpdateListener(new ChatActivity$$ExternalSyntheticLambda70(this, new AtomicReference(Float.valueOf(f)), f, f2, springInterpolator));
        this.collapseAnimator.addListener(new BotButton.AnonymousClass1(this, i));
        this.collapseAnimator.setDuration((long) fAbs);
        this.collapseAnimator.start();
    }

    public void updateColors() {
        Theme.profile_aboutTextPaint.linkColor = processColor(Theme.getColor(Theme.key_chat_messageLinkIn, this.resourcesProvider));
    }
}
