package org.telegram.ui.Components.Premium;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.math.MathUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EllipsizeSpanAnimator;
import org.telegram.ui.Components.EmptyStubSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.Premium.PremiumGradient;

public class LimitPreviewView extends LinearLayout {
    private boolean animate;
    private boolean animateArrowFadeIn;
    private boolean animateArrowFadeOut;
    private boolean animateBackgroundFade;
    private boolean animateIncrease;
    private int animateIncreaseWidth;
    private Runnable animateStarRatingRunnable;
    private boolean animatingRotation;
    boolean animationCanPlay;
    private ValueAnimator arrowAnimator;
    private int currentValue;
    private DarkGradientProvider darkGradientProvider;
    TextView defaultCount;
    private final FrameLayout defaultLayout;
    private final AnimatedTextView defaultText;
    public int gradientTotalHeight;
    int gradientYOffset;
    private boolean hideNegativeValues;
    int icon;
    boolean inc;
    public boolean invalidationEnabled;
    private boolean isBoostsStyle;
    private boolean isRatingNegative;
    private boolean isRatingStyle;
    private boolean isSimpleStyle;
    public boolean isStatistic;
    CounterView limitIcon;
    float limitIconRotation;
    FrameLayout limitsContainer;
    private View parentVideForGradient;
    private float percent;
    private float position;
    AnimatedTextView premiumCount;
    private final FrameLayout premiumLayout;
    private final int premiumLimit;
    private boolean premiumLocked;
    private final TextView premiumText;
    float progress;
    private final Paint ratingPaint;
    Theme.ResourcesProvider resourcesProvider;
    PremiumGradient.PremiumGradientTools staticGradient;
    boolean wasAnimation;
    boolean wasHaptic;
    int width1;

    public class CounterView extends View {
        ArrayList animatedLayouts;
        StaticLayout animatedStableLayout;
        boolean animationInProgress;
        float arrowCenter;
        Paint dstOutPaint;
        boolean invalidatePath;
        Paint overlayPaint;
        Path path;
        PathEffect pathEffect;
        CharSequence text;
        StaticLayout textLayout;
        TextPaint textPaint;
        float textWidth;

        public class AnimatedLayout {
            public boolean direction;
            float progress;
            public boolean replace;
            ArrayList staticLayouts;
            ValueAnimator valueAnimator;
            float x;

            private AnimatedLayout() {
                this.staticLayouts = new ArrayList();
            }
        }

        public CounterView(Context context) {
            super(context);
            this.path = new Path();
            this.pathEffect = new CornerPathEffect(AndroidUtilities.dp(6.0f));
            this.textPaint = new TextPaint(1);
            this.animatedLayouts = new ArrayList();
            this.dstOutPaint = new Paint();
            this.overlayPaint = new Paint();
            this.textPaint.setTypeface(AndroidUtilities.bold());
            this.textPaint.setTextSize(AndroidUtilities.dp(22.0f));
            this.textPaint.setColor(-1);
            this.dstOutPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            this.overlayPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
        }

        public void checkAnimationComplete() {
            for (int i = 0; i < this.animatedLayouts.size(); i++) {
                if (((AnimatedLayout) this.animatedLayouts.get(i)).valueAnimator != null) {
                    return;
                }
            }
            this.animatedLayouts.clear();
            this.animationInProgress = false;
            invalidate();
        }

        public void lambda$createAnimationLayouts$0(AnimatedLayout animatedLayout, ValueAnimator valueAnimator) {
            animatedLayout.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidate();
        }

        public void lambda$createAnimationLayoutsDiff$1(AnimatedLayout animatedLayout, ValueAnimator valueAnimator) {
            animatedLayout.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidate();
        }

        private void updatePath() {
            int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
            float measuredWidth = getMeasuredWidth() * this.arrowCenter;
            float clamp = Utilities.clamp(AndroidUtilities.dp(8.0f) + measuredWidth, getMeasuredWidth(), 0.0f);
            float clamp2 = Utilities.clamp(AndroidUtilities.dp(10.0f) + measuredWidth, getMeasuredWidth(), AndroidUtilities.dp(24.0f));
            float clamp3 = Utilities.clamp(measuredWidth - AndroidUtilities.dp(this.arrowCenter >= 0.7f ? 24.0f : 10.0f), getMeasuredWidth(), 0.0f);
            float clamp4 = Utilities.clamp(measuredWidth - AndroidUtilities.dp(8.0f), getMeasuredWidth(), 0.0f);
            this.path.rewind();
            float f = measuredHeight;
            float f2 = f - (f / 2.0f);
            this.path.moveTo(clamp3, f2 - AndroidUtilities.dp(2.0f));
            this.path.lineTo(clamp3, f);
            this.path.lineTo(clamp4, f);
            this.path.lineTo(measuredWidth, measuredHeight + AndroidUtilities.dp(8.0f));
            if (this.arrowCenter < 0.7f) {
                this.path.lineTo(clamp, f);
            }
            this.path.lineTo(clamp2, f);
            this.path.lineTo(clamp2, f2 - AndroidUtilities.dp(2.0f));
            this.path.close();
        }

        void createAnimationLayouts() {
            this.animatedLayouts.clear();
            if (LimitPreviewView.this.isBoostsStyle && LimitPreviewView.this.currentValue == 0) {
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.text);
            int i = 0;
            boolean z = true;
            for (int i2 = 0; i2 < this.text.length(); i2++) {
                if (Character.isDigit(this.text.charAt(i2))) {
                    AnimatedLayout animatedLayout = new AnimatedLayout();
                    this.animatedLayouts.add(animatedLayout);
                    animatedLayout.x = this.textLayout.getSecondaryHorizontal(i2);
                    animatedLayout.direction = z;
                    if (i >= 1) {
                        z = !z;
                        i = 0;
                    }
                    i++;
                    int charAt = this.text.charAt(i2) - '0';
                    if (charAt == 0) {
                        charAt = 10;
                    }
                    int i3 = 1;
                    while (i3 <= charAt) {
                        animatedLayout.staticLayouts.add(new StaticLayout("" + (i3 == 10 ? 0 : i3), this.textPaint, (int) this.textWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                        i3++;
                    }
                    spannableStringBuilder.setSpan(new EmptyStubSpan(), i2, i2 + 1, 0);
                }
            }
            this.animatedStableLayout = new StaticLayout(spannableStringBuilder, this.textPaint, AndroidUtilities.dp(12.0f) + ((int) this.textWidth), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            for (int i4 = 0; i4 < this.animatedLayouts.size(); i4++) {
                this.animationInProgress = true;
                final AnimatedLayout animatedLayout2 = (AnimatedLayout) this.animatedLayouts.get(i4);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                animatedLayout2.valueAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        LimitPreviewView.CounterView.this.lambda$createAnimationLayouts$0(animatedLayout2, valueAnimator);
                    }
                });
                animatedLayout2.valueAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        animatedLayout2.valueAnimator = null;
                        CounterView.this.checkAnimationComplete();
                    }
                });
                animatedLayout2.valueAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                animatedLayout2.valueAnimator.setDuration(750L);
                animatedLayout2.valueAnimator.setStartDelay(((this.animatedLayouts.size() - 1) - i4) * 60);
                animatedLayout2.valueAnimator.start();
            }
        }

        void createAnimationLayoutsDiff(CharSequence charSequence) {
            if (this.textLayout == null) {
                return;
            }
            this.animatedLayouts.clear();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.text);
            int length = this.text.length() - 1;
            int i = 0;
            while (length >= 0) {
                char charAt = length < charSequence.length() ? charSequence.charAt(length) : ' ';
                if (charAt != this.text.charAt(length) && Character.isDigit(this.text.charAt(length))) {
                    AnimatedLayout animatedLayout = new AnimatedLayout();
                    this.animatedLayouts.add(animatedLayout);
                    animatedLayout.x = this.textLayout.getSecondaryHorizontal(length);
                    animatedLayout.replace = true;
                    if (i >= 1) {
                        i = 0;
                    }
                    i++;
                    TextPaint textPaint = this.textPaint;
                    int i2 = (int) this.textWidth;
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    animatedLayout.staticLayouts.add(new StaticLayout("" + charAt, textPaint, i2, alignment, 1.0f, 0.0f, false));
                    animatedLayout.staticLayouts.add(new StaticLayout("" + this.text.charAt(length), this.textPaint, (int) this.textWidth, alignment, 1.0f, 0.0f, false));
                    spannableStringBuilder.setSpan(new EmptyStubSpan(), length, length + 1, 0);
                }
                length--;
            }
            this.animatedStableLayout = new StaticLayout(spannableStringBuilder, this.textPaint, AndroidUtilities.dp(12.0f) + ((int) this.textWidth), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            for (int i3 = 0; i3 < this.animatedLayouts.size(); i3++) {
                this.animationInProgress = true;
                final AnimatedLayout animatedLayout2 = (AnimatedLayout) this.animatedLayouts.get(i3);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                animatedLayout2.valueAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        LimitPreviewView.CounterView.this.lambda$createAnimationLayoutsDiff$1(animatedLayout2, valueAnimator);
                    }
                });
                animatedLayout2.valueAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        animatedLayout2.valueAnimator = null;
                        CounterView.this.checkAnimationComplete();
                    }
                });
                animatedLayout2.valueAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                animatedLayout2.valueAnimator.setDuration(250L);
                animatedLayout2.valueAnimator.setStartDelay(((this.animatedLayouts.size() - 1) - i3) * 60);
                animatedLayout2.valueAnimator.start();
            }
        }

        public float getArrowCenter() {
            return this.arrowCenter;
        }

        @Override
        protected void onDraw(android.graphics.Canvas r14) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Premium.LimitPreviewView.CounterView.onDraw(android.graphics.Canvas):void");
        }

        @Override
        protected void onMeasure(int i, int i2) {
            TextPaint textPaint = this.textPaint;
            CharSequence charSequence = this.text;
            this.textWidth = textPaint.measureText(charSequence, 0, charSequence.length());
            this.textLayout = new StaticLayout(this.text, this.textPaint, ((int) this.textWidth) + AndroidUtilities.dp(12.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.textWidth = 0.0f;
            for (int i3 = 0; i3 < this.textLayout.getLineCount(); i3++) {
                this.textWidth = Math.max(this.textWidth, this.textLayout.getLineWidth(i3));
            }
            setMeasuredDimension((int) (this.textWidth + getPaddingRight() + getPaddingLeft()), AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(8.0f));
            updatePath();
        }

        public void setArrowCenter(float f) {
            if (this.arrowCenter != f) {
                this.arrowCenter = f;
                this.invalidatePath = true;
                invalidate();
            }
        }

        public void setText(CharSequence charSequence, boolean z) {
            if (!z) {
                this.text = charSequence;
                return;
            }
            CharSequence charSequence2 = this.text;
            this.text = charSequence;
            createAnimationLayoutsDiff(charSequence2);
        }

        @Override
        public void setTranslationX(float f) {
            if (f != getTranslationX()) {
                super.setTranslationX(f);
                invalidate();
            }
        }
    }

    public interface DarkGradientProvider {
        Paint setDarkGradientLocation(float f, float f2);
    }

    private class TextViewHolder extends FrameLayout {
        private final boolean isLeft;
        private final Paint paint;

        public TextViewHolder(Context context, boolean z) {
            super(context);
            Paint paint = new Paint();
            this.paint = paint;
            setLayerType(2, null);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            this.isLeft = z;
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if (!(view instanceof TextView)) {
                return super.drawChild(canvas, view, j);
            }
            boolean drawChild = super.drawChild(canvas, view, j);
            boolean z = false;
            boolean z2 = LimitPreviewView.this.percent != 0.0f && LimitPreviewView.this.percent <= 1.0f && this.isLeft;
            if (LimitPreviewView.this.percent == 1.0f && !this.isLeft) {
                z = true;
            }
            if ((z2 || z) && LimitPreviewView.this.hasDarkGradientProvider()) {
                canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), this.paint, 31);
                canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), LimitPreviewView.this.darkGradientProvider.setDarkGradientLocation(((ViewGroup) getParent()).getX() + getX(), ((ViewGroup) getParent()).getY() + getY()));
                canvas.restore();
                invalidate();
            }
            return drawChild;
        }
    }

    public LimitPreviewView(Context context, int i, int i2, int i3, float f, final Theme.ResourcesProvider resourcesProvider) {
        super(context);
        float f2;
        float f3;
        TextView textView;
        int i4;
        int i5;
        AnimatedTextView animatedTextView;
        float f4;
        float f5;
        int i6;
        float f6;
        int i7;
        this.animationCanPlay = true;
        this.ratingPaint = new Paint(1);
        this.invalidationEnabled = true;
        this.resourcesProvider = resourcesProvider;
        this.percent = MathUtils.clamp(f, 0.1f, 0.9f);
        this.icon = i;
        this.currentValue = i2;
        this.premiumLimit = i3;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        if (i != 0) {
            setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
            this.limitIcon = new CounterView(context);
            setIconValue(i2, false);
            this.limitIcon.setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(14.0f));
            addView(this.limitIcon, LayoutHelper.createLinear(-2, -2, 0.0f, 3));
        }
        TextViewHolder textViewHolder = new TextViewHolder(context, true);
        this.defaultLayout = textViewHolder;
        AnimatedTextView animatedTextView2 = new AnimatedTextView(context);
        this.defaultText = animatedTextView2;
        animatedTextView2.setTextSize(AndroidUtilities.dp(14.0f));
        animatedTextView2.setTypeface(AndroidUtilities.bold());
        animatedTextView2.setText(LocaleController.getString(R.string.LimitFree));
        animatedTextView2.setGravity(16);
        int i8 = Theme.key_windowBackgroundWhiteBlackText;
        animatedTextView2.setTextColor(Theme.getColor(i8, resourcesProvider));
        TextView textView2 = new TextView(context);
        this.defaultCount = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        this.defaultCount.setText(String.format("%d", Integer.valueOf(i3)));
        this.defaultCount.setGravity(16);
        this.defaultCount.setTextColor(Theme.getColor(i8, resourcesProvider));
        if (LocaleController.isRTL) {
            f2 = 12.0f;
            f3 = 0.0f;
            textViewHolder.addView(animatedTextView2, LayoutHelper.createFrame(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            textView = this.defaultCount;
            i4 = -2;
            i5 = 3;
        } else {
            f2 = 12.0f;
            f3 = 0.0f;
            textViewHolder.addView(animatedTextView2, LayoutHelper.createFrame(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            textView = this.defaultCount;
            i4 = -2;
            i5 = 5;
        }
        textViewHolder.addView(textView, LayoutHelper.createFrame(i4, 30.0f, i5, f2, f3, 12.0f, 0.0f));
        TextViewHolder textViewHolder2 = new TextViewHolder(context, false);
        this.premiumLayout = textViewHolder2;
        TextView textView3 = new TextView(context);
        this.premiumText = textView3;
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setText(LocaleController.getString(R.string.LimitPremium));
        textView3.setGravity(16);
        textView3.setTextColor(-1);
        AnimatedTextView animatedTextView3 = new AnimatedTextView(context);
        this.premiumCount = animatedTextView3;
        animatedTextView3.setTextSize(AndroidUtilities.dp(14.0f));
        this.premiumCount.setTypeface(AndroidUtilities.bold());
        this.premiumCount.setText(String.format("%d", Integer.valueOf(i3)));
        this.premiumCount.setGravity(21);
        this.premiumCount.setTextColor(-1);
        if (LocaleController.isRTL) {
            textViewHolder2.addView(textView3, LayoutHelper.createFrame(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            animatedTextView = this.premiumCount;
            f4 = 12.0f;
            f5 = 0.0f;
            i6 = -2;
            f6 = 30.0f;
            i7 = 3;
        } else {
            textViewHolder2.addView(textView3, LayoutHelper.createFrame(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            animatedTextView = this.premiumCount;
            f4 = 12.0f;
            f5 = 0.0f;
            i6 = -2;
            f6 = 30.0f;
            i7 = 5;
        }
        textViewHolder2.addView(animatedTextView, LayoutHelper.createFrame(i6, f6, i7, 12.0f, 0.0f, f4, f5));
        FrameLayout frameLayout = new FrameLayout(context) {
            Paint grayPaint = new Paint();
            Paint whitePaint;

            {
                Paint paint = new Paint();
                this.whitePaint = paint;
                paint.setColor(-1);
            }

            @Override
            protected void dispatchDraw(android.graphics.Canvas r23) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Premium.LimitPreviewView.AnonymousClass1.dispatchDraw(android.graphics.Canvas):void");
            }

            @Override
            protected void onLayout(boolean z, int i9, int i10, int i11, int i12) {
                if (getChildCount() != 2) {
                    super.onLayout(z, i9, i10, i11, i12);
                    return;
                }
                View childAt = getChildAt(0);
                View childAt2 = getChildAt(1);
                int measuredWidth = childAt.getMeasuredWidth();
                int i13 = i12 - i10;
                childAt.layout(0, 0, measuredWidth, i13);
                childAt2.layout(measuredWidth, 0, i11 - i9, i13);
            }

            @Override
            protected void onMeasure(int i9, int i10) {
                AnimatedTextView animatedTextView4;
                if (getChildCount() != 2) {
                    super.onMeasure(i9, i10);
                    return;
                }
                int size = View.MeasureSpec.getSize(i9);
                int size2 = View.MeasureSpec.getSize(i10);
                LimitPreviewView.this.defaultLayout.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                int max = Math.max(LimitPreviewView.this.defaultLayout.getMeasuredWidth(), AndroidUtilities.dp(24.0f) + LimitPreviewView.this.defaultText.getMeasuredWidth() + (LimitPreviewView.this.defaultCount.getVisibility() == 0 ? AndroidUtilities.dp(24.0f) + LimitPreviewView.this.defaultCount.getMeasuredWidth() : 0));
                LimitPreviewView.this.premiumLayout.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                if (LimitPreviewView.this.isBoostsStyle) {
                    int i11 = -1;
                    if (LimitPreviewView.this.percent == 0.0f) {
                        LimitPreviewView limitPreviewView = LimitPreviewView.this;
                        limitPreviewView.width1 = 0;
                        if (!limitPreviewView.animateArrowFadeIn && !LimitPreviewView.this.animateArrowFadeOut) {
                            LimitPreviewView limitPreviewView2 = LimitPreviewView.this;
                            limitPreviewView2.premiumCount.setTextColor((limitPreviewView2.isRatingNegative || LimitPreviewView.this.hasDarkGradientProvider()) ? -1 : Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
                            animatedTextView4 = LimitPreviewView.this.defaultText;
                            if (!LimitPreviewView.this.hasDarkGradientProvider()) {
                                i11 = Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider);
                            }
                            animatedTextView4.setTextColor(i11);
                        }
                    } else {
                        if (LimitPreviewView.this.percent < 1.0f) {
                            float measuredWidth = LimitPreviewView.this.isRatingNegative ? 0.0f : LimitPreviewView.this.defaultLayout.getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                            float measuredWidth2 = (size - measuredWidth) - (LimitPreviewView.this.isRatingNegative ? 0.0f : LimitPreviewView.this.premiumLayout.getMeasuredWidth() - AndroidUtilities.dp(8.0f));
                            LimitPreviewView limitPreviewView3 = LimitPreviewView.this;
                            limitPreviewView3.width1 = (int) (measuredWidth + (measuredWidth2 * limitPreviewView3.percent));
                            if (!LimitPreviewView.this.animateArrowFadeIn && !LimitPreviewView.this.animateArrowFadeOut) {
                                LimitPreviewView limitPreviewView4 = LimitPreviewView.this;
                                limitPreviewView4.premiumCount.setTextColor((limitPreviewView4.isRatingNegative || LimitPreviewView.this.hasDarkGradientProvider()) ? -1 : Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
                                animatedTextView4 = LimitPreviewView.this.defaultText;
                            }
                        } else {
                            LimitPreviewView limitPreviewView5 = LimitPreviewView.this;
                            limitPreviewView5.width1 = size;
                            if (!limitPreviewView5.animateArrowFadeIn && !LimitPreviewView.this.animateArrowFadeOut) {
                                LimitPreviewView.this.premiumCount.setTextColor(-1);
                                animatedTextView4 = LimitPreviewView.this.defaultText;
                            }
                        }
                        animatedTextView4.setTextColor(i11);
                    }
                } else {
                    int max2 = Math.max(LimitPreviewView.this.premiumLayout.getMeasuredWidth(), AndroidUtilities.dp(24.0f) + LimitPreviewView.this.premiumText.getMeasuredWidth() + (LimitPreviewView.this.premiumCount.getVisibility() == 0 ? AndroidUtilities.dp(24.0f) + LimitPreviewView.this.premiumCount.getMeasuredWidth() : 0));
                    LimitPreviewView limitPreviewView6 = LimitPreviewView.this;
                    limitPreviewView6.width1 = (int) Utilities.clamp(size * limitPreviewView6.percent, size - max2, max);
                    LimitPreviewView.this.defaultLayout.measure(View.MeasureSpec.makeMeasureSpec(LimitPreviewView.this.width1, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    LimitPreviewView.this.premiumLayout.measure(View.MeasureSpec.makeMeasureSpec(size - LimitPreviewView.this.width1, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                }
                setMeasuredDimension(size, size2);
            }
        };
        this.limitsContainer = frameLayout;
        frameLayout.addView(textViewHolder, LayoutHelper.createFrame(-1, 30.0f));
        this.limitsContainer.addView(textViewHolder2, LayoutHelper.createFrame(-1, 30.0f));
        addView(this.limitsContainer, LayoutHelper.createLinear(-1, 30, 0.0f, 0, 14, i == 0 ? 0 : 12, 14, 0));
    }

    public LimitPreviewView(Context context, int i, int i2, int i3, Theme.ResourcesProvider resourcesProvider) {
        this(context, i, i2, i3, 0.5f, resourcesProvider);
    }

    public float getGlobalXOffset() {
        return (((-getMeasuredWidth()) * 0.1f) * this.progress) - (getMeasuredWidth() * 0.2f);
    }

    public boolean hasDarkGradientProvider() {
        return this.darkGradientProvider != null;
    }

    public void lambda$animateStarRating$2(TL_stars.Tl_starsRating tl_starsRating) {
        AnimatedTextView animatedTextView;
        String formatString;
        this.animateStarRatingRunnable = null;
        if (isAttachedToWindow()) {
            ValueAnimator valueAnimator = this.arrowAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.isRatingNegative = false;
            this.ratingPaint.setColor(Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider));
            long j = tl_starsRating.stars;
            if (j <= 0) {
                this.percent = 0.0f;
                this.defaultText.setText("");
                this.premiumCount.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
                this.ratingPaint.setColor(Theme.getColor(Theme.key_color_red, this.resourcesProvider));
                this.isRatingNegative = true;
            } else {
                long j2 = tl_starsRating.next_level_stars;
                if (j2 == 0) {
                    this.percent = 1.0f;
                    AnimatedTextView animatedTextView2 = this.defaultText;
                    int i = R.string.StarRatingLevel;
                    animatedTextView2.setText(LocaleController.formatString(i, Integer.valueOf(tl_starsRating.level - 1)));
                    animatedTextView = this.premiumCount;
                    formatString = LocaleController.formatString(i, Integer.valueOf(tl_starsRating.level));
                } else {
                    long j3 = tl_starsRating.current_level_stars;
                    this.percent = MathUtils.clamp(((float) (j - j3)) / ((float) (j2 - j3)), 0.0f, 1.0f);
                    AnimatedTextView animatedTextView3 = this.defaultText;
                    int i2 = R.string.StarRatingLevel;
                    animatedTextView3.setText(LocaleController.formatString(i2, Integer.valueOf(tl_starsRating.level)));
                    animatedTextView = this.premiumCount;
                    formatString = LocaleController.formatString(i2, Integer.valueOf(tl_starsRating.level + 1));
                }
                animatedTextView.setText(formatString);
            }
            setArrowX(0.0f);
            this.limitIcon.setScaleX(0.6f);
            this.limitIcon.setScaleY(0.6f);
            this.limitIcon.setAlpha(0.0f);
            this.animate = true;
            this.animateArrowFadeIn = true;
            this.animateArrowFadeOut = false;
            this.animateBackgroundFade = false;
            this.animateIncreaseWidth = this.width1;
            this.limitsContainer.requestLayout();
            requestLayout();
            ViewPropertyAnimator duration = this.defaultText.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            this.premiumCount.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(cubicBezierInterpolator).start();
            this.premiumCount.setTextColor(this.isRatingNegative ? -1 : Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
            this.defaultText.setTextColor(-1);
            setIconValue((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars, false);
        }
    }

    public void lambda$animateStarRating$3(TL_stars.Tl_starsRating tl_starsRating) {
        AnimatedTextView animatedTextView;
        String formatString;
        this.animateStarRatingRunnable = null;
        if (isAttachedToWindow()) {
            ValueAnimator valueAnimator = this.arrowAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.isRatingNegative = false;
            this.ratingPaint.setColor(Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider));
            long j = tl_starsRating.stars;
            if (j <= 0) {
                this.percent = 0.5f;
                this.defaultText.setText("");
                this.premiumCount.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
                this.ratingPaint.setColor(Theme.getColor(Theme.key_color_red, this.resourcesProvider));
                this.isRatingNegative = true;
            } else {
                long j2 = tl_starsRating.next_level_stars;
                if (j2 == 0) {
                    this.percent = 1.0f;
                    AnimatedTextView animatedTextView2 = this.defaultText;
                    int i = R.string.StarRatingLevel;
                    animatedTextView2.setText(LocaleController.formatString(i, Integer.valueOf(tl_starsRating.level - 1)));
                    animatedTextView = this.premiumCount;
                    formatString = LocaleController.formatString(i, Integer.valueOf(tl_starsRating.level));
                } else {
                    long j3 = tl_starsRating.current_level_stars;
                    this.percent = MathUtils.clamp(((float) (j - j3)) / ((float) (j2 - j3)), 0.0f, 1.0f);
                    AnimatedTextView animatedTextView3 = this.defaultText;
                    int i2 = R.string.StarRatingLevel;
                    animatedTextView3.setText(LocaleController.formatString(i2, Integer.valueOf(tl_starsRating.level)));
                    animatedTextView = this.premiumCount;
                    formatString = LocaleController.formatString(i2, Integer.valueOf(tl_starsRating.level + 1));
                }
                animatedTextView.setText(formatString);
            }
            setArrowX(1.0f);
            this.limitIcon.setScaleX(0.6f);
            this.limitIcon.setScaleY(0.6f);
            this.limitIcon.setAlpha(0.0f);
            this.animate = true;
            this.animateArrowFadeIn = true;
            this.animateArrowFadeOut = false;
            this.animateBackgroundFade = false;
            this.animateIncreaseWidth = this.width1;
            this.limitsContainer.requestLayout();
            requestLayout();
            ViewPropertyAnimator duration = this.defaultText.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            this.premiumCount.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(cubicBezierInterpolator).start();
            this.premiumCount.setTextColor(this.isRatingNegative ? -1 : Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
            this.defaultText.setTextColor(-1);
            setIconValue((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars, false);
        }
    }

    public void lambda$onLayout$0(boolean r9, float r10, float r11, float r12, float r13, boolean r14, float r15, boolean r16, boolean r17, android.animation.ValueAnimator r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Premium.LimitPreviewView.lambda$onLayout$0(boolean, float, float, float, float, boolean, float, boolean, boolean, android.animation.ValueAnimator):void");
    }

    public void lambda$onLayout$1(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.limitIconRotation = floatValue < 0.5f ? (floatValue / 0.5f) * (-7.0f) : (1.0f - ((floatValue - 0.5f) / 0.5f)) * (-7.0f);
    }

    private void setArrowX(float f) {
        this.width1 = f >= 1.0f ? this.limitsContainer.getMeasuredWidth() : 0;
        float dp = AndroidUtilities.dp(14.0f);
        this.limitIcon.setTranslationX(Utilities.clamp((Math.max(this.width1, (getMeasuredWidth() - (r0 * 2)) * f) + dp) - (this.limitIcon.getMeasuredWidth() / 2.0f), (getMeasuredWidth() - r0) - this.limitIcon.getMeasuredWidth(), dp));
        this.limitIcon.setArrowCenter(f);
        this.limitIcon.setPivotX(r0.getMeasuredWidth() * f);
    }

    public void animateStarRating(TL_stars.Tl_starsRating tl_starsRating, final TL_stars.Tl_starsRating tl_starsRating2) {
        Runnable runnable;
        AnimatedTextView animatedTextView;
        String formatString;
        AndroidUtilities.cancelRunOnUIThread(this.animateStarRatingRunnable);
        this.animateStarRatingRunnable = null;
        Paint paint = this.ratingPaint;
        int i = Theme.key_featuredStickers_addButton;
        paint.setColor(Theme.getColor(i, this.resourcesProvider));
        this.isRatingNegative = false;
        int i2 = tl_starsRating.level;
        int i3 = tl_starsRating2.level;
        if (i2 == i3) {
            long j = tl_starsRating2.stars;
            if (j <= 0) {
                this.percent = 0.0f;
                this.defaultText.setText("");
                this.premiumCount.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
                this.ratingPaint.setColor(Theme.getColor(Theme.key_color_red, this.resourcesProvider));
                this.isRatingNegative = true;
            } else {
                long j2 = tl_starsRating2.next_level_stars;
                if (j2 == 0) {
                    this.percent = 1.0f;
                    AnimatedTextView animatedTextView2 = this.defaultText;
                    int i4 = R.string.StarRatingLevel;
                    animatedTextView2.setText(LocaleController.formatString(i4, Integer.valueOf(i3 - 1)));
                    animatedTextView = this.premiumCount;
                    formatString = LocaleController.formatString(i4, Integer.valueOf(tl_starsRating2.level));
                } else {
                    long j3 = tl_starsRating2.current_level_stars;
                    this.percent = MathUtils.clamp(((float) (j - j3)) / ((float) (j2 - j3)), 0.0f, 1.0f);
                    AnimatedTextView animatedTextView3 = this.defaultText;
                    int i5 = R.string.StarRatingLevel;
                    animatedTextView3.setText(LocaleController.formatString(i5, Integer.valueOf(tl_starsRating2.level)));
                    animatedTextView = this.premiumCount;
                    formatString = LocaleController.formatString(i5, Integer.valueOf(tl_starsRating2.level + 1));
                }
                animatedTextView.setText(formatString);
            }
            this.animate = true;
            this.animateArrowFadeIn = false;
            this.animateArrowFadeOut = false;
            this.animateBackgroundFade = false;
            this.animateIncreaseWidth = this.width1;
            this.limitsContainer.requestLayout();
            requestLayout();
            this.premiumCount.setTextColor(this.isRatingNegative ? -1 : Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
            this.defaultText.setTextColor(-1);
            setIconValue((int) tl_starsRating2.stars, (int) tl_starsRating2.next_level_stars, false);
            return;
        }
        if (i3 > i2) {
            long j4 = tl_starsRating.stars;
            if (j4 <= 0) {
                this.isRatingNegative = true;
            }
            this.percent = 1.0f;
            this.animate = true;
            this.animateArrowFadeIn = false;
            this.animateArrowFadeOut = true;
            this.animateBackgroundFade = ((j4 > 0L ? 1 : (j4 == 0L ? 0 : -1)) <= 0) == ((tl_starsRating2.stars > 0L ? 1 : (tl_starsRating2.stars == 0L ? 0 : -1)) <= 0);
            this.animateIncreaseWidth = this.width1;
            this.limitsContainer.requestLayout();
            requestLayout();
            this.premiumCount.setTextColor(this.isRatingNegative ? -1 : Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
            this.defaultText.setTextColor(-1);
            ViewPropertyAnimator duration = this.defaultText.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            this.premiumCount.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(cubicBezierInterpolator).start();
            setIconValue((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars, false);
            runnable = new Runnable() {
                @Override
                public final void run() {
                    LimitPreviewView.this.lambda$animateStarRating$2(tl_starsRating2);
                }
            };
        } else {
            if (i3 >= i2) {
                return;
            }
            this.ratingPaint.setColor(Theme.getColor(i, this.resourcesProvider));
            this.isRatingNegative = false;
            long j5 = tl_starsRating.stars;
            if (j5 <= 0) {
                this.isRatingNegative = true;
            }
            this.percent = 0.0f;
            this.animate = true;
            this.animateArrowFadeIn = false;
            this.animateArrowFadeOut = true;
            this.animateBackgroundFade = ((j5 > 0L ? 1 : (j5 == 0L ? 0 : -1)) <= 0) == ((tl_starsRating2.stars > 0L ? 1 : (tl_starsRating2.stars == 0L ? 0 : -1)) <= 0);
            this.animateIncreaseWidth = this.width1;
            this.limitsContainer.requestLayout();
            requestLayout();
            ViewPropertyAnimator duration2 = this.defaultText.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.EASE_OUT_QUINT;
            duration2.setInterpolator(cubicBezierInterpolator2).start();
            this.premiumCount.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(cubicBezierInterpolator2).start();
            this.premiumCount.setTextColor(this.isRatingNegative ? -1 : Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
            this.defaultText.setTextColor(-1);
            setIconValue((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars, false);
            runnable = new Runnable() {
                @Override
                public final void run() {
                    LimitPreviewView.this.lambda$animateStarRating$3(tl_starsRating2);
                }
            };
        }
        this.animateStarRatingRunnable = runnable;
        AndroidUtilities.runOnUIThread(runnable, 600L);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        boolean z;
        if (this.staticGradient == null) {
            if (this.inc) {
                float f = this.progress + 0.016f;
                this.progress = f;
                if (f > 3.0f) {
                    z = false;
                    this.inc = z;
                }
                invalidate();
            } else {
                float f2 = this.progress - 0.016f;
                this.progress = f2;
                if (f2 < 1.0f) {
                    z = true;
                    this.inc = z;
                }
                invalidate();
            }
        }
        super.dispatchDraw(canvas);
    }

    public void increaseCurrentValue(int i, int i2, int i3) {
        this.currentValue++;
        this.percent = MathUtils.clamp(i2 / i3, 0.0f, 1.0f);
        this.animateIncrease = true;
        this.animateIncreaseWidth = this.width1;
        setIconValue(i, true);
        this.limitsContainer.requestLayout();
        requestLayout();
    }

    @Override
    protected void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Premium.LimitPreviewView.onLayout(boolean, int, int, int, int):void");
    }

    public void setBagePosition(float f) {
        this.position = MathUtils.clamp(f, 0.1f, 0.9f);
    }

    public void setBoosts(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z) {
        int i;
        AnimatedTextView animatedTextView;
        String formatString;
        if ((tL_premium_boostsStatus.current_level_boosts == tL_premium_boostsStatus.boosts && z) || (i = tL_premium_boostsStatus.next_level_boosts) == 0) {
            this.percent = 1.0f;
            AnimatedTextView animatedTextView2 = this.defaultText;
            int i2 = R.string.BoostsLevel;
            animatedTextView2.setText(LocaleController.formatString("BoostsLevel", i2, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            animatedTextView = this.premiumCount;
            formatString = LocaleController.formatString("BoostsLevel", i2, Integer.valueOf(tL_premium_boostsStatus.level));
        } else {
            this.percent = MathUtils.clamp((r2 - r1) / (i - r1), 0.0f, 1.0f);
            AnimatedTextView animatedTextView3 = this.defaultText;
            int i3 = R.string.BoostsLevel;
            animatedTextView3.setText(LocaleController.formatString("BoostsLevel", i3, Integer.valueOf(tL_premium_boostsStatus.level)));
            animatedTextView = this.premiumCount;
            formatString = LocaleController.formatString("BoostsLevel", i3, Integer.valueOf(tL_premium_boostsStatus.level + 1));
        }
        animatedTextView.setText(formatString);
        ((FrameLayout.LayoutParams) this.premiumCount.getLayoutParams()).gravity = 5;
        setType(17);
        this.defaultCount.setVisibility(8);
        this.premiumText.setVisibility(8);
        this.premiumCount.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
        this.defaultText.setTextColor(-1);
        setIconValue(tL_premium_boostsStatus.boosts, false);
        this.isBoostsStyle = true;
    }

    public void setDarkGradientProvider(DarkGradientProvider darkGradientProvider) {
        this.darkGradientProvider = darkGradientProvider;
    }

    public void setDelayedAnimation() {
        this.animationCanPlay = false;
    }

    public void setHideNegativeValues(boolean z) {
        this.hideNegativeValues = z;
    }

    public void setIconValue(int i, int i2, boolean z) {
        if (i < 0) {
            setIconValue(i, z);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(new ColoredImageSpan(this.icon), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i, ','));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "\u200a/\u200a");
        spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i2, ','));
        spannableStringBuilder.setSpan(new EllipsizeSpanAnimator.TextAlphaSpan(170), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.65f), length, spannableStringBuilder.length(), 33);
        this.limitIcon.setText(spannableStringBuilder, z);
        this.limitIcon.requestLayout();
    }

    public void setIconValue(int i, boolean z) {
        ColoredImageSpan coloredImageSpan = i < 0 ? new ColoredImageSpan(R.drawable.warning_sign) : new ColoredImageSpan(this.icon);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(coloredImageSpan, 0, 1, 0);
        if (i >= 0 || !this.hideNegativeValues) {
            spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i, ','));
        }
        this.limitIcon.setText(spannableStringBuilder, z);
        this.limitIcon.requestLayout();
    }

    public void setParentViewForGradien(ViewGroup viewGroup) {
        this.parentVideForGradient = viewGroup;
    }

    public void setPremiumLocked() {
        this.limitsContainer.setVisibility(8);
        CounterView counterView = this.limitIcon;
        if (counterView != null) {
            counterView.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(3.0f));
        }
        this.premiumLocked = true;
    }

    public void setStarRating(TL_stars.Tl_starsRating tl_starsRating) {
        AnimatedTextView animatedTextView;
        String formatString;
        this.isRatingNegative = false;
        this.ratingPaint.setColor(Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider));
        long j = tl_starsRating.current_level_stars;
        long j2 = tl_starsRating.stars;
        if (j2 <= 0) {
            this.percent = 0.5f;
            this.defaultText.setText("");
            this.premiumCount.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
            this.ratingPaint.setColor(Theme.getColor(Theme.key_color_red, this.resourcesProvider));
            this.isRatingNegative = true;
        } else {
            long j3 = tl_starsRating.next_level_stars;
            if (j3 == 0) {
                this.percent = 1.0f;
                AnimatedTextView animatedTextView2 = this.defaultText;
                int i = R.string.StarRatingLevel;
                animatedTextView2.setText(LocaleController.formatString(i, Integer.valueOf(tl_starsRating.level - 1)));
                animatedTextView = this.premiumCount;
                formatString = LocaleController.formatString(i, Integer.valueOf(tl_starsRating.level));
            } else {
                this.percent = MathUtils.clamp(((float) (j2 - j)) / ((float) (j3 - j)), 0.0f, 1.0f);
                AnimatedTextView animatedTextView3 = this.defaultText;
                int i2 = R.string.StarRatingLevel;
                animatedTextView3.setText(LocaleController.formatString(i2, Integer.valueOf(tl_starsRating.level)));
                animatedTextView = this.premiumCount;
                formatString = LocaleController.formatString(i2, Integer.valueOf(tl_starsRating.level + 1));
            }
            animatedTextView.setText(formatString);
        }
        ((FrameLayout.LayoutParams) this.premiumCount.getLayoutParams()).gravity = 5;
        setType(17);
        this.defaultCount.setVisibility(8);
        this.premiumText.setVisibility(8);
        this.premiumCount.setTextColor(this.isRatingNegative ? -1 : Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
        this.defaultText.setTextColor(-1);
        setIconValue((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars, false);
        this.isBoostsStyle = true;
        this.isSimpleStyle = true;
        this.isRatingStyle = true;
    }

    public void setStaticGradinet(PremiumGradient.PremiumGradientTools premiumGradientTools) {
        this.staticGradient = premiumGradientTools;
    }

    public void setType(int i) {
        AnimatedTextView animatedTextView;
        String str;
        if (i == 6) {
            str = "4 GB";
            if (this.limitIcon != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new ColoredImageSpan(this.icon), 0, 1, 0);
                spannableStringBuilder.append((CharSequence) (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() ? "4 GB" : "2 GB"));
                this.limitIcon.setText(spannableStringBuilder, false);
            }
            animatedTextView = this.premiumCount;
        } else {
            if (i != 11) {
                return;
            }
            if (this.limitIcon != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new ColoredImageSpan(this.icon), 0, 1, 0);
                this.limitIcon.setText(spannableStringBuilder2, false);
            }
            animatedTextView = this.premiumCount;
            str = "";
        }
        animatedTextView.setText(str);
    }

    public void startDelayedAnimation() {
        this.animationCanPlay = true;
        requestLayout();
    }
}
