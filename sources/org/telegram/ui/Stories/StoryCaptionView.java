package org.telegram.ui.Stories;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.core.graphics.ColorUtils;
import androidx.core.widget.NestedScrollView;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.StaticLayoutEx;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.Components.spoilers.SpoilersClickDetector;
import org.telegram.ui.Stories.StoryCaptionView;
public class StoryCaptionView extends NestedScrollView {
    private Method abortAnimatedScrollMethod;
    public int blackoutBottomOffset;
    FrameLayout captionContainer;
    public StoryCaptionTextView captionTextview;
    private boolean disableDraw;
    public boolean disableTouches;
    private boolean dontChangeTopMargin;
    boolean expanded;
    int gradientColor;
    private boolean isLandscape;
    private float lastMotionX;
    private float lastMotionY;
    private boolean nestedScrollStarted;
    private float overScrollY;
    private final Paint paint;
    private int pendingTopMargin;
    private int prevHeight;
    private OverScroller scroller;
    private final SpringAnimation springAnimation;
    private int textHash;
    TextSelectionHelper.SimpleTextSelectionHelper textSelectionHelper;
    boolean touched;
    private float velocitySign;
    private float velocityY;

    @Override
    protected float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    @Override
    protected float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    public void onEmojiClick(AnimatedEmojiSpan animatedEmojiSpan) {
    }

    public void onLinkClick(CharacterStyle characterStyle, View view) {
    }

    public void onLinkLongPress(URLSpan uRLSpan, View view, Runnable runnable) {
    }

    public StoryCaptionView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        Paint paint = new Paint(1);
        this.paint = paint;
        this.pendingTopMargin = -1;
        this.gradientColor = ColorUtils.setAlphaComponent(-16777216, 51);
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, this.gradientColor});
        this.captionContainer = new FrameLayout(context);
        setClipChildren(false);
        setOverScrollMode(2);
        NotificationCenter.listenEmojiLoading(this);
        StoryCaptionTextView storyCaptionTextView = new StoryCaptionTextView(getContext(), resourcesProvider);
        this.captionTextview = storyCaptionTextView;
        TextSelectionHelper.SimpleTextSelectionHelper simpleTextSelectionHelper = new TextSelectionHelper.SimpleTextSelectionHelper(storyCaptionTextView, resourcesProvider);
        this.textSelectionHelper = simpleTextSelectionHelper;
        simpleTextSelectionHelper.useMovingOffset = false;
        this.captionContainer.addView(this.captionTextview, -1, -2);
        addView(this.captionContainer, new ViewGroup.LayoutParams(-1, -2));
        paint.setColor(-16777216);
        setFadingEdgeLength(AndroidUtilities.dp(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        SpringAnimation springAnimation = new SpringAnimation(this.captionTextview, DynamicAnimation.TRANSLATION_Y, 0.0f);
        this.springAnimation = springAnimation;
        springAnimation.getSpring().setStiffness(100.0f);
        springAnimation.setMinimumVisibleChange(1.0f);
        springAnimation.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
            @Override
            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                StoryCaptionView.this.lambda$new$0(dynamicAnimation, f, f2);
            }
        });
        springAnimation.getSpring().setDampingRatio(1.0f);
        try {
            Method declaredMethod = NestedScrollView.class.getDeclaredMethod("abortAnimatedScroll", new Class[0]);
            this.abortAnimatedScrollMethod = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception e) {
            this.abortAnimatedScrollMethod = null;
            FileLog.e(e);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            this.scroller = (OverScroller) declaredField.get(this);
        } catch (Exception e2) {
            this.scroller = null;
            FileLog.e(e2);
        }
    }

    public void lambda$new$0(DynamicAnimation dynamicAnimation, float f, float f2) {
        this.overScrollY = f;
        this.velocityY = f2;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.captionTextview.progressToExpand != 1.0f || this.disableTouches || (motionEvent.getAction() == 0 && motionEvent.getY() < (this.captionContainer.getTop() - getScrollY()) + this.captionTextview.getTranslationY())) {
            if (this.touched) {
                this.touched = false;
                invalidate();
            }
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.touched = true;
            invalidate();
        } else if (this.touched && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.touched = false;
            invalidate();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.captionTextview.progressToExpand != 1.0f || this.disableTouches || (motionEvent.getAction() == 0 && motionEvent.getY() < (this.captionContainer.getTop() - getScrollY()) + this.captionTextview.getTranslationY())) {
            if (this.touched) {
                this.touched = false;
                invalidate();
            }
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.touched = true;
            invalidate();
        } else if (this.touched && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.touched = false;
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void onMeasure(int i, int i2) {
        updateTopMargin(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        super.onMeasure(i, i2);
    }

    public int getPendingMarginTopDiff() {
        int i = this.pendingTopMargin;
        if (i >= 0) {
            return i - ((ViewGroup.MarginLayoutParams) this.captionContainer.getLayoutParams()).topMargin;
        }
        return 0;
    }

    private void updateTopMargin(int i, int i2) {
        int calculateNewContainerMarginTop = calculateNewContainerMarginTop(i, i2);
        if (calculateNewContainerMarginTop >= 0) {
            if (this.dontChangeTopMargin) {
                this.pendingTopMargin = calculateNewContainerMarginTop;
                return;
            }
            ((ViewGroup.MarginLayoutParams) this.captionContainer.getLayoutParams()).topMargin = calculateNewContainerMarginTop;
            this.pendingTopMargin = -1;
        }
    }

    public int calculateNewContainerMarginTop(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return -1;
        }
        StoryCaptionTextView storyCaptionTextView = this.captionTextview;
        int hashCode = storyCaptionTextView.text.hashCode();
        Point point = AndroidUtilities.displaySize;
        boolean z = point.x > point.y;
        if (this.textHash == hashCode && this.isLandscape == z && this.prevHeight == i2) {
            return -1;
        }
        this.textHash = hashCode;
        this.isLandscape = z;
        this.prevHeight = i2;
        storyCaptionTextView.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
        int lineCount = storyCaptionTextView.fullLayout.getLineCount();
        if (lineCount <= 3) {
            return i2 - storyCaptionTextView.getMeasuredHeight();
        }
        return i2 - (storyCaptionTextView.textPaint.getFontMetricsInt(null) * (Math.min(3, lineCount) + 1));
    }

    public void reset() {
        scrollTo(0, 0);
        this.expanded = false;
        StoryCaptionTextView storyCaptionTextView = this.captionTextview;
        storyCaptionTextView.progressToExpand = 0.0f;
        storyCaptionTextView.invalidate();
    }

    @Override
    public void fling(int i) {
        super.fling(i);
        this.velocitySign = Math.signum(i);
        this.velocityY = 0.0f;
    }

    @Override
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        iArr[1] = 0;
        if (this.nestedScrollStarted) {
            float f = this.overScrollY;
            if ((f > 0.0f && i2 > 0) || (f < 0.0f && i2 < 0)) {
                float f2 = i2;
                float f3 = f - f2;
                if (f > 0.0f) {
                    if (f3 < 0.0f) {
                        this.overScrollY = 0.0f;
                        iArr[1] = (int) (iArr[1] + f2 + f3);
                    } else {
                        this.overScrollY = f3;
                        iArr[1] = iArr[1] + i2;
                    }
                } else if (f3 > 0.0f) {
                    this.overScrollY = 0.0f;
                    iArr[1] = (int) (iArr[1] + f2 + f3);
                } else {
                    this.overScrollY = f3;
                    iArr[1] = iArr[1] + i2;
                }
                this.captionTextview.setTranslationY(this.overScrollY);
                this.textSelectionHelper.invalidate();
                return true;
            }
        }
        return false;
    }

    @Override
    public void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        int round;
        float f;
        if (i4 != 0 && (round = Math.round(i4 * (1.0f - Math.abs((-this.overScrollY) / (this.captionContainer.getTop() + 0))))) != 0) {
            if (!this.nestedScrollStarted) {
                if (!this.springAnimation.isRunning()) {
                    OverScroller overScroller = this.scroller;
                    float currVelocity = overScroller != null ? overScroller.getCurrVelocity() : Float.NaN;
                    if (Float.isNaN(currVelocity)) {
                        f = 0.0f;
                    } else {
                        Point point = AndroidUtilities.displaySize;
                        float min = Math.min(point.x > point.y ? 3000.0f : 5000.0f, currVelocity);
                        round = (int) ((round * min) / currVelocity);
                        f = min * (-this.velocitySign);
                    }
                    if (round != 0) {
                        float f2 = this.overScrollY - round;
                        this.overScrollY = f2;
                        this.captionTextview.setTranslationY(f2);
                    }
                    startSpringAnimationIfNotRunning(f);
                }
            } else {
                float f3 = this.overScrollY - round;
                this.overScrollY = f3;
                this.captionTextview.setTranslationY(f3);
            }
        }
        this.textSelectionHelper.invalidate();
    }

    private void startSpringAnimationIfNotRunning(float f) {
        if (!this.springAnimation.isRunning()) {
            this.springAnimation.setStartVelocity(f);
            this.springAnimation.start();
        }
        if (getScrollY() < AndroidUtilities.dp(2.0f)) {
            collapse();
        }
    }

    @Override
    public boolean startNestedScroll(int i, int i2) {
        if (i2 == 0) {
            this.springAnimation.cancel();
            this.nestedScrollStarted = true;
            this.overScrollY = this.captionTextview.getTranslationY();
        }
        return true;
    }

    @Override
    public void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (this.nestedScrollStarted || this.overScrollY == 0.0f || (overScroller = this.scroller) == null || !overScroller.isFinished()) {
            return;
        }
        startSpringAnimationIfNotRunning(0.0f);
    }

    @Override
    public void stopNestedScroll(int i) {
        OverScroller overScroller;
        if (this.nestedScrollStarted && i == 0) {
            this.nestedScrollStarted = false;
            if (this.overScrollY == 0.0f || (overScroller = this.scroller) == null || !overScroller.isFinished()) {
                return;
            }
            startSpringAnimationIfNotRunning(this.velocityY);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        if (this.disableDraw) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i = height + scrollY;
        canvas.clipRect(0, scrollY, width, this.blackoutBottomOffset + i);
        canvas.clipRect(0, scrollY, width, i);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    public float getTextTop() {
        return (this.captionContainer.getTop() + this.captionTextview.getTranslationY()) - getScrollY();
    }

    public float getMaxTop() {
        return this.captionContainer.getTop() - (this.captionContainer.getBottom() - getMeasuredHeight());
    }

    public boolean allowInterceptTouchEvent(float f, float f2) {
        return this.captionTextview.progressToExpand == 1.0f && !this.disableTouches && f2 > ((float) (this.captionContainer.getTop() - getScrollY())) + this.captionTextview.getTranslationY();
    }

    @Override
    public void scrollBy(int i, int i2) {
        super.scrollBy(i, i2);
        invalidate();
    }

    @Override
    public void invalidate() {
        super.invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.textSelectionHelper.invalidate();
    }

    public float getProgressToBlackout() {
        return Utilities.clamp((getScrollY() - this.captionTextview.getTranslationY()) / Math.min(this.prevHeight, AndroidUtilities.dp(40.0f)), 1.0f, 0.0f);
    }

    public void expand() {
        if (this.expanded) {
            return;
        }
        this.expanded = true;
        final float scrollY = getScrollY();
        final float bottom = this.captionContainer.getBottom() - getMeasuredHeight();
        final float f = this.captionTextview.progressToExpand;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                StoryCaptionView.this.lambda$expand$1(scrollY, bottom, f, r5, valueAnimator);
            }
        });
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
        ofFloat.start();
    }

    public void lambda$expand$1(float f, float f2, float f3, float f4, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        setScrollY((int) AndroidUtilities.lerp(f, f2, floatValue));
        this.captionTextview.progressToExpand = AndroidUtilities.lerp(f3, f4, floatValue);
        this.captionTextview.invalidate();
    }

    public void collapse() {
        if (this.expanded) {
            this.expanded = false;
            final float scrollY = getScrollY();
            final float f = this.captionTextview.progressToExpand;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    StoryCaptionView.this.lambda$collapse$2(scrollY, r3, f, r5, valueAnimator);
                }
            });
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
            ofFloat.start();
        }
    }

    public void lambda$collapse$2(float f, float f2, float f3, float f4, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        setScrollY((int) AndroidUtilities.lerp(f, f2, floatValue));
        this.captionTextview.progressToExpand = AndroidUtilities.lerp(f3, f4, floatValue);
        this.captionTextview.invalidate();
    }

    public void disableDraw(boolean z) {
        if (this.disableDraw != z) {
            this.disableDraw = z;
            invalidate();
        }
    }

    public boolean isTouched() {
        return this.touched;
    }

    public void cancelTouch() {
        this.touched = false;
    }

    public boolean hasScroll() {
        return this.captionContainer.getBottom() - getMeasuredHeight() > 0;
    }

    public void checkCancelTextSelection() {
        if (this.textSelectionHelper.isInSelectionMode()) {
            this.textSelectionHelper.getOverlayView(getContext()).checkCancel(this.lastMotionX, this.lastMotionY, false);
        }
    }

    public class StoryCaptionTextView extends View implements TextSelectionHelper.SelectableView, TextSelectionHelper.SimpleSelectabeleView {
        public boolean allowClickSpoilers;
        private SpoilersClickDetector clickDetector;
        private final PorterDuffColorFilter emojiColorFilter;
        StaticLayout firstLayout;
        private AnimatedEmojiSpan.EmojiGroupedSpans firstLayoutEmoji;
        StaticLayout fullLayout;
        private AnimatedEmojiSpan.EmojiGroupedSpans fullLayoutEmoji;
        int horizontalPadding;
        private boolean isSpoilersRevealed;
        private LinkSpanDrawable.LinkCollector links;
        LineInfo[] nextLinesLayouts;
        AtomicReference<Layout> patchedLayout;
        private AnimatedEmojiSpan pressedEmoji;
        private LinkSpanDrawable<CharacterStyle> pressedLink;
        float progressToExpand;
        StaticLayout showMore;
        TextPaint showMorePaint;
        float showMoreX;
        float showMoreY;
        int sizeCached;
        protected List<SpoilerEffect> spoilers;
        private Stack<SpoilerEffect> spoilersPool;
        CharSequence text;
        int textHeight;
        TextPaint textPaint;
        float textX;
        float textY;
        int verticalPadding;
        private final Paint xRefGradinetPaint;
        private final Paint xRefPaint;

        public StoryCaptionTextView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.links = new LinkSpanDrawable.LinkCollector(this);
            this.textPaint = new TextPaint(1);
            this.showMorePaint = new TextPaint(1);
            Paint paint = new Paint();
            this.xRefPaint = paint;
            Paint paint2 = new Paint(1);
            this.xRefGradinetPaint = paint2;
            this.sizeCached = 0;
            this.text = BuildConfig.APP_CENTER_HASH;
            this.spoilers = new ArrayList();
            this.spoilersPool = new Stack<>();
            new Path();
            this.allowClickSpoilers = true;
            this.patchedLayout = new AtomicReference<>();
            this.textPaint.setColor(-1);
            this.textPaint.linkColor = Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider);
            this.textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            this.showMorePaint.setColor(-1);
            this.showMorePaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.showMorePaint.setTextSize(AndroidUtilities.dp(16.0f));
            paint.setColor(-16777216);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            paint2.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(16.0f), 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            this.clickDetector = new SpoilersClickDetector(this, this.spoilers, new SpoilersClickDetector.OnSpoilerClickedListener() {
                @Override
                public final void onSpoilerClicked(SpoilerEffect spoilerEffect, float f, float f2) {
                    StoryCaptionView.StoryCaptionTextView.this.lambda$new$2(spoilerEffect, f, f2);
                }
            });
            this.emojiColorFilter = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }

        public void lambda$new$2(SpoilerEffect spoilerEffect, float f, float f2) {
            if (this.isSpoilersRevealed) {
                return;
            }
            spoilerEffect.setOnRippleEndCallback(new Runnable() {
                @Override
                public final void run() {
                    StoryCaptionView.StoryCaptionTextView.this.lambda$new$1();
                }
            });
            float sqrt = (float) Math.sqrt(Math.pow(getWidth(), 2.0d) + Math.pow(getHeight(), 2.0d));
            for (SpoilerEffect spoilerEffect2 : this.spoilers) {
                spoilerEffect2.startRipple(f, f2, sqrt);
            }
        }

        public void lambda$new$1() {
            post(new Runnable() {
                @Override
                public final void run() {
                    StoryCaptionView.StoryCaptionTextView.this.lambda$new$0();
                }
            });
        }

        public void lambda$new$0() {
            this.isSpoilersRevealed = true;
        }

        public void setText(CharSequence charSequence) {
            if (charSequence == null) {
                charSequence = BuildConfig.APP_CENTER_HASH;
            }
            this.isSpoilersRevealed = false;
            this.text = charSequence;
            this.sizeCached = 0;
            if (getMeasuredWidth() > 0) {
                createLayout(getMeasuredWidth());
            }
            requestLayout();
            invalidate();
        }

        @Override
        @SuppressLint({"DrawAllocation"})
        protected void onMeasure(int i, int i2) {
            int i3 = (i2 + i) << 16;
            this.horizontalPadding = AndroidUtilities.dp(16.0f);
            this.verticalPadding = AndroidUtilities.dp(8.0f);
            if (this.sizeCached != i3) {
                this.sizeCached = i3;
                createLayout(View.MeasureSpec.getSize(i));
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((this.verticalPadding * 2) + this.textHeight, 1073741824));
        }

        private void createLayout(int i) {
            int i2 = i - (this.horizontalPadding * 2);
            StaticLayout makeTextLayout = makeTextLayout(this.textPaint, this.text, i2);
            this.fullLayout = makeTextLayout;
            this.textHeight = makeTextLayout.getHeight();
            this.textX = this.horizontalPadding;
            this.textY = this.verticalPadding;
            float measureText = this.textPaint.measureText(" ");
            if (this.fullLayout.getLineCount() > 3) {
                String string = LocaleController.getString("ShowMore", R.string.ShowMore);
                this.showMore = makeTextLayout(this.showMorePaint, string, i2);
                float lineTop = this.fullLayout.getLineTop(2) + this.fullLayout.getTopPadding();
                this.showMoreY = (this.textY + lineTop) - AndroidUtilities.dpf2(0.3f);
                this.showMoreX = (i2 - this.horizontalPadding) - this.showMorePaint.measureText(string);
                this.firstLayout = makeTextLayout(this.textPaint, this.text.subSequence(0, this.fullLayout.getLineEnd(2)), i2);
                this.spoilersPool.addAll(this.spoilers);
                this.spoilers.clear();
                SpoilerEffect.addSpoilers(this, this.fullLayout, this.spoilersPool, this.spoilers);
                float lineRight = this.fullLayout.getLineRight(2) + measureText;
                if (this.nextLinesLayouts != null) {
                    int i3 = 0;
                    while (true) {
                        LineInfo[] lineInfoArr = this.nextLinesLayouts;
                        if (i3 >= lineInfoArr.length) {
                            break;
                        }
                        if (lineInfoArr[i3] != null) {
                            AnimatedEmojiSpan.release(this, lineInfoArr[i3].layoutEmoji);
                        }
                        i3++;
                    }
                }
                this.nextLinesLayouts = new LineInfo[this.fullLayout.getLineCount() - 3];
                if (this.spoilers.isEmpty()) {
                    for (int i4 = 3; i4 < this.fullLayout.getLineCount(); i4++) {
                        int lineStart = this.fullLayout.getLineStart(i4);
                        int lineEnd = this.fullLayout.getLineEnd(i4);
                        StaticLayout makeTextLayout2 = makeTextLayout(this.textPaint, this.text.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd)), i2);
                        LineInfo lineInfo = new LineInfo(this);
                        this.nextLinesLayouts[i4 - 3] = lineInfo;
                        lineInfo.staticLayout = makeTextLayout2;
                        lineInfo.finalX = this.fullLayout.getLineLeft(i4);
                        lineInfo.finalY = this.fullLayout.getLineTop(i4) + this.fullLayout.getTopPadding();
                        if (lineRight < this.showMoreX - AndroidUtilities.dp(16.0f)) {
                            lineInfo.collapsedY = lineTop;
                            lineInfo.collapsedX = lineRight;
                            lineRight += makeTextLayout2.getLineRight(0) + measureText;
                        } else {
                            lineInfo.collapsedY = lineInfo.finalY;
                            lineInfo.collapsedX = lineInfo.finalX;
                        }
                    }
                    return;
                }
                return;
            }
            this.showMore = null;
            this.firstLayout = null;
            this.spoilersPool.addAll(this.spoilers);
            this.spoilers.clear();
            SpoilerEffect.addSpoilers(this, this.fullLayout, this.spoilersPool, this.spoilers);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.showMore != null) {
                canvas.saveLayerAlpha(this.textX - this.horizontalPadding, this.textY, getMeasuredWidth(), getMeasuredHeight() - this.verticalPadding, 255, 31);
            } else {
                canvas.save();
            }
            canvas.save();
            canvas.translate(this.textX, this.textY);
            if (this.links.draw(canvas)) {
                invalidate();
            }
            canvas.restore();
            if (!this.spoilers.isEmpty() || this.firstLayout == null) {
                if (this.fullLayout != null) {
                    canvas.save();
                    canvas.translate(this.textX, this.textY);
                    if (StoryCaptionView.this.textSelectionHelper.isInSelectionMode()) {
                        StoryCaptionView.this.textSelectionHelper.draw(canvas);
                    }
                    drawLayout(this.fullLayout, canvas);
                    AnimatedEmojiSpan.EmojiGroupedSpans update = AnimatedEmojiSpan.update(0, this, this.fullLayoutEmoji, this.fullLayout);
                    this.fullLayoutEmoji = update;
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas, this.fullLayout, update, 0.0f, this.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, this.emojiColorFilter);
                    canvas.restore();
                }
            } else {
                if (StoryCaptionView.this.textSelectionHelper.isInSelectionMode()) {
                    canvas.save();
                    canvas.translate(this.textX, this.textY);
                    StoryCaptionView.this.textSelectionHelper.draw(canvas);
                    canvas.restore();
                }
                if (this.firstLayout != null) {
                    canvas.save();
                    canvas.translate(this.textX, this.textY);
                    drawLayout(this.firstLayout, canvas);
                    AnimatedEmojiSpan.EmojiGroupedSpans update2 = AnimatedEmojiSpan.update(0, this, this.firstLayoutEmoji, this.firstLayout);
                    this.firstLayoutEmoji = update2;
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas, this.firstLayout, update2, 0.0f, this.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, this.emojiColorFilter);
                    canvas.restore();
                }
                if (this.nextLinesLayouts != null) {
                    int i = 0;
                    while (true) {
                        LineInfo[] lineInfoArr = this.nextLinesLayouts;
                        if (i >= lineInfoArr.length) {
                            break;
                        }
                        LineInfo lineInfo = lineInfoArr[i];
                        canvas.save();
                        float f = lineInfo.collapsedX;
                        float f2 = lineInfo.finalX;
                        if (f == f2) {
                            this.textPaint.setAlpha((int) (this.progressToExpand * 255.0f));
                            canvas.translate(this.textX + lineInfo.finalX, this.textY + lineInfo.finalY);
                            drawLayout(lineInfo.staticLayout, canvas);
                            lineInfo.staticLayout.draw(canvas);
                            lineInfo.layoutEmoji = AnimatedEmojiSpan.update(0, this, lineInfo.layoutEmoji, lineInfo.staticLayout);
                            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, lineInfo.staticLayout, lineInfo.layoutEmoji, 0.0f, this.spoilers, 0.0f, 0.0f, 0.0f, this.progressToExpand, this.emojiColorFilter);
                            this.textPaint.setAlpha(255);
                        } else {
                            canvas.translate(this.textX + AndroidUtilities.lerp(f, f2, this.progressToExpand), this.textY + AndroidUtilities.lerp(lineInfo.collapsedY, lineInfo.finalY, CubicBezierInterpolator.EASE_OUT.getInterpolation(this.progressToExpand)));
                            lineInfo.staticLayout.draw(canvas);
                            lineInfo.layoutEmoji = AnimatedEmojiSpan.update(0, this, lineInfo.layoutEmoji, lineInfo.staticLayout);
                            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, lineInfo.staticLayout, lineInfo.layoutEmoji, 0.0f, this.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, this.emojiColorFilter);
                        }
                        canvas.restore();
                        i++;
                    }
                }
            }
            if (this.showMore != null) {
                float scrollY = this.showMoreY + StoryCaptionView.this.getScrollY();
                int clamp = (int) ((1.0f - Utilities.clamp(this.progressToExpand / 0.5f, 1.0f, 0.0f)) * 255.0f);
                this.xRefGradinetPaint.setAlpha(clamp);
                this.xRefPaint.setAlpha(clamp);
                this.showMorePaint.setAlpha(clamp);
                canvas.save();
                canvas.translate(this.showMoreX - AndroidUtilities.dp(32.0f), scrollY);
                canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(32.0f), this.showMore.getHeight() + this.verticalPadding, this.xRefGradinetPaint);
                canvas.restore();
                canvas.drawRect(this.showMoreX - AndroidUtilities.dp(16.0f), scrollY, getMeasuredWidth(), this.showMore.getHeight() + scrollY + this.verticalPadding, this.xRefPaint);
                canvas.save();
                canvas.translate(this.showMoreX, scrollY);
                this.showMore.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }

        private void drawLayout(StaticLayout staticLayout, Canvas canvas) {
            if (!this.spoilers.isEmpty()) {
                SpoilerEffect.renderWithRipple(this, false, -1, 0, this.patchedLayout, staticLayout, this.spoilers, canvas, false);
            } else {
                staticLayout.draw(canvas);
            }
        }

        private StaticLayout makeTextLayout(TextPaint textPaint, CharSequence charSequence, int i) {
            if (Build.VERSION.SDK_INT >= 24) {
                return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i).setBreakStrategy(0).setHyphenationFrequency(0).setAlignment(LocaleController.isRTL ? StaticLayoutEx.ALIGN_RIGHT() : StaticLayoutEx.ALIGN_LEFT()).build();
            }
            return new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }

        public Paint getPaint() {
            return this.textPaint;
        }

        @Override
        public CharSequence getText() {
            return this.text;
        }

        @Override
        public StaticLayout getStaticTextLayout() {
            return this.fullLayout;
        }

        public class LineInfo {
            float collapsedX;
            float collapsedY;
            float finalX;
            float finalY;
            private AnimatedEmojiSpan.EmojiGroupedSpans layoutEmoji;
            StaticLayout staticLayout;

            public LineInfo(StoryCaptionTextView storyCaptionTextView) {
            }
        }

        @Override
        public boolean onTouchEvent(android.view.MotionEvent r12) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.StoryCaptionView.StoryCaptionTextView.onTouchEvent(android.view.MotionEvent):boolean");
        }

        public void lambda$onTouchEvent$4(LinkSpanDrawable linkSpanDrawable) {
            LinkSpanDrawable<CharacterStyle> linkSpanDrawable2 = this.pressedLink;
            if (linkSpanDrawable == linkSpanDrawable2 && linkSpanDrawable2 != null && (linkSpanDrawable2.getSpan() instanceof URLSpan)) {
                StoryCaptionView.this.onLinkLongPress((URLSpan) this.pressedLink.getSpan(), this, new Runnable() {
                    @Override
                    public final void run() {
                        StoryCaptionView.StoryCaptionTextView.this.lambda$onTouchEvent$3();
                    }
                });
                this.pressedLink = null;
            }
        }

        public void lambda$onTouchEvent$3() {
            this.links.clear();
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            AnimatedEmojiSpan.release(this, this.fullLayoutEmoji);
            AnimatedEmojiSpan.release(this, this.firstLayoutEmoji);
            if (this.nextLinesLayouts == null) {
                return;
            }
            int i = 0;
            while (true) {
                LineInfo[] lineInfoArr = this.nextLinesLayouts;
                if (i >= lineInfoArr.length) {
                    return;
                }
                if (lineInfoArr[i] != null) {
                    AnimatedEmojiSpan.release(this, lineInfoArr[i].layoutEmoji);
                }
                i++;
            }
        }

        private void clearPressedLinks() {
            this.links.clear();
            this.pressedLink = null;
            invalidate();
        }

        @Override
        public void setPressed(boolean z) {
            boolean z2 = z != isPressed();
            super.setPressed(z);
            if (z2) {
                invalidate();
            }
        }

        @Override
        public void setTranslationY(float f) {
            if (getTranslationY() != f) {
                super.setTranslationY(f);
                StoryCaptionView.this.invalidate();
            }
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            boolean z;
            StoryCaptionView.this.lastMotionX = motionEvent.getX();
            StoryCaptionView.this.lastMotionY = motionEvent.getY();
            StaticLayout staticLayout = this.showMore;
            if (staticLayout != null) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f = this.showMoreX;
                rectF.set(f, this.showMoreY, staticLayout.getWidth() + f, this.showMoreY + this.showMore.getHeight());
                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    z = false;
                    if (!z && this.allowClickSpoilers && this.clickDetector.onTouchEvent(motionEvent)) {
                        return true;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
            z = true;
            if (!z) {
            }
            return super.dispatchTouchEvent(motionEvent);
        }
    }
}
