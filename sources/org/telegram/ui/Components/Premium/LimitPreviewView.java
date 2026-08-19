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
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.OvershootInterpolator;
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
import org.telegram.ui.Stories.recorder.HintView2;

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
    private boolean drawFromRight;
    public int gradientTotalHeight;
    int gradientYOffset;
    private boolean hideNegativeValues;
    int icon;
    float iconScale;
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

    public interface DarkGradientProvider {
        Paint setDarkGradientLocation(float f, float f2);
    }

    public LimitPreviewView(Context context, int i, int i2, int i3, Theme.ResourcesProvider resourcesProvider) {
        this(context, i, i2, i3, 0.5f, resourcesProvider);
    }

    public LimitPreviewView(Context context, int i, int i2, int i3, float f, final Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.iconScale = 1.0f;
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
        AnimatedTextView animatedTextView = new AnimatedTextView(context);
        this.defaultText = animatedTextView;
        animatedTextView.setTextSize(AndroidUtilities.dp(14.0f));
        animatedTextView.setTypeface(AndroidUtilities.bold());
        animatedTextView.setText(LocaleController.getString(R.string.LimitFree));
        animatedTextView.setGravity(16);
        int i4 = Theme.key_windowBackgroundWhiteBlackText;
        animatedTextView.setTextColor(Theme.getColor(i4, resourcesProvider));
        TextView textView = new TextView(context);
        this.defaultCount = textView;
        textView.setTypeface(AndroidUtilities.bold());
        this.defaultCount.setText(String.format("%d", Integer.valueOf(i3)));
        this.defaultCount.setGravity(16);
        this.defaultCount.setTextColor(Theme.getColor(i4, resourcesProvider));
        if (LocaleController.isRTL) {
            textViewHolder.addView(animatedTextView, LayoutHelper.createFrame(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            textViewHolder.addView(this.defaultCount, LayoutHelper.createFrame(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            textViewHolder.addView(animatedTextView, LayoutHelper.createFrame(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            textViewHolder.addView(this.defaultCount, LayoutHelper.createFrame(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        TextViewHolder textViewHolder2 = new TextViewHolder(context, false);
        this.premiumLayout = textViewHolder2;
        TextView textView2 = new TextView(context);
        this.premiumText = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.LimitPremium));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        AnimatedTextView animatedTextView2 = new AnimatedTextView(context);
        this.premiumCount = animatedTextView2;
        animatedTextView2.setTextSize(AndroidUtilities.dp(14.0f));
        this.premiumCount.setTypeface(AndroidUtilities.bold());
        this.premiumCount.setText(String.format("%d", Integer.valueOf(i3)));
        this.premiumCount.setGravity(21);
        this.premiumCount.setTextColor(-1);
        if (LocaleController.isRTL) {
            textViewHolder2.addView(textView2, LayoutHelper.createFrame(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            textViewHolder2.addView(this.premiumCount, LayoutHelper.createFrame(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            textViewHolder2.addView(textView2, LayoutHelper.createFrame(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            textViewHolder2.addView(this.premiumCount, LayoutHelper.createFrame(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        FrameLayout frameLayout = new FrameLayout(context) {
            Paint grayPaint = new Paint();
            Paint whitePaint;

            {
                Paint paint = new Paint();
                this.whitePaint = paint;
                paint.setColor(-1);
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                if (LimitPreviewView.this.isBoostsStyle) {
                    LimitPreviewView limitPreviewView = LimitPreviewView.this;
                    if (limitPreviewView.isStatistic || limitPreviewView.isRatingStyle) {
                        this.grayPaint.setColor(Theme.getColor(Theme.key_listSelector, resourcesProvider));
                    } else {
                        this.grayPaint.setColor(Theme.getColor(Theme.key_graySection, resourcesProvider));
                    }
                } else {
                    this.grayPaint.setColor(Theme.getColor(Theme.key_windowBackgroundGray, resourcesProvider));
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                if (LimitPreviewView.this.hasDarkGradientProvider()) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), LimitPreviewView.this.darkGradientProvider.setDarkGradientLocation(((ViewGroup) getParent()).getX() + getX(), ((ViewGroup) getParent()).getY() + getY()));
                } else {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.grayPaint);
                }
                canvas.save();
                if (!LimitPreviewView.this.isBoostsStyle) {
                    canvas.clipRect(LimitPreviewView.this.width1, 0, getMeasuredWidth(), getMeasuredHeight());
                }
                Paint mainGradientPaint = LimitPreviewView.this.isRatingStyle ? LimitPreviewView.this.ratingPaint : LimitPreviewView.this.hasDarkGradientProvider() ? this.whitePaint : PremiumGradient.getInstance().getMainGradientPaint();
                if (LimitPreviewView.this.parentVideForGradient != null) {
                    View view = LimitPreviewView.this.parentVideForGradient;
                    LimitPreviewView limitPreviewView2 = LimitPreviewView.this;
                    PremiumGradient.PremiumGradientTools premiumGradientTools = limitPreviewView2.staticGradient;
                    if (premiumGradientTools == null) {
                        float y = 0.0f;
                        for (View view2 = this; view2 != view; view2 = (View) view2.getParent()) {
                            y += view2.getY();
                        }
                        PremiumGradient.getInstance().updateMainGradientMatrix(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), LimitPreviewView.this.getGlobalXOffset() - getLeft(), -y);
                    } else {
                        mainGradientPaint = premiumGradientTools.paint;
                        premiumGradientTools.gradientMatrixLinear(limitPreviewView2.gradientTotalHeight, -limitPreviewView2.gradientYOffset);
                    }
                } else {
                    PremiumGradient.getInstance().updateMainGradientMatrix(0, 0, LimitPreviewView.this.getMeasuredWidth(), LimitPreviewView.this.getMeasuredHeight(), LimitPreviewView.this.getGlobalXOffset() - getLeft(), -getTop());
                }
                int alpha = mainGradientPaint.getAlpha();
                if (!LimitPreviewView.this.animateArrowFadeOut || LimitPreviewView.this.arrowAnimator == null) {
                    if (LimitPreviewView.this.animateArrowFadeIn && LimitPreviewView.this.arrowAnimator != null) {
                        mainGradientPaint.setAlpha((int) (alpha * ((Float) LimitPreviewView.this.arrowAnimator.getAnimatedValue()).floatValue()));
                    }
                } else {
                    mainGradientPaint.setAlpha((int) (alpha * (1.0f - ((Float) LimitPreviewView.this.arrowAnimator.getAnimatedValue()).floatValue())));
                }
                if (LimitPreviewView.this.isBoostsStyle) {
                    if (LimitPreviewView.this.isRatingNegative || LimitPreviewView.this.drawFromRight) {
                        AndroidUtilities.rectTmp.set(LimitPreviewView.this.width1, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    } else {
                        AndroidUtilities.rectTmp.set(0.0f, 0.0f, LimitPreviewView.this.width1, getMeasuredHeight());
                    }
                }
                canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), mainGradientPaint);
                mainGradientPaint.setAlpha(alpha);
                canvas.restore();
                LimitPreviewView limitPreviewView3 = LimitPreviewView.this;
                if (limitPreviewView3.staticGradient == null && limitPreviewView3.invalidationEnabled) {
                    invalidate();
                }
                super.dispatchDraw(canvas);
            }

            @Override
            protected void onMeasure(int i5, int i6) {
                if (getChildCount() == 2) {
                    int size = View.MeasureSpec.getSize(i5);
                    int size2 = View.MeasureSpec.getSize(i6);
                    LimitPreviewView.this.defaultLayout.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    int iMax = Math.max(LimitPreviewView.this.defaultLayout.getMeasuredWidth(), AndroidUtilities.dp(24.0f) + LimitPreviewView.this.defaultText.getMeasuredWidth() + (LimitPreviewView.this.defaultCount.getVisibility() == 0 ? AndroidUtilities.dp(24.0f) + LimitPreviewView.this.defaultCount.getMeasuredWidth() : 0));
                    LimitPreviewView.this.premiumLayout.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    if (LimitPreviewView.this.isBoostsStyle) {
                        if (LimitPreviewView.this.percent == 0.0f) {
                            LimitPreviewView limitPreviewView = LimitPreviewView.this;
                            limitPreviewView.width1 = 0;
                            if (!limitPreviewView.animateArrowFadeIn && !LimitPreviewView.this.animateArrowFadeOut) {
                                LimitPreviewView limitPreviewView2 = LimitPreviewView.this;
                                limitPreviewView2.premiumCount.setTextColor((limitPreviewView2.isRatingNegative || LimitPreviewView.this.hasDarkGradientProvider()) ? -1 : Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
                                LimitPreviewView.this.defaultText.setTextColor(LimitPreviewView.this.hasDarkGradientProvider() ? -1 : Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
                            }
                        } else if (LimitPreviewView.this.percent < 1.0f) {
                            float measuredWidth = LimitPreviewView.this.isRatingNegative ? 0.0f : LimitPreviewView.this.defaultLayout.getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                            float measuredWidth2 = (size - measuredWidth) - (LimitPreviewView.this.isRatingNegative ? 0.0f : LimitPreviewView.this.premiumLayout.getMeasuredWidth() - AndroidUtilities.dp(8.0f));
                            LimitPreviewView limitPreviewView3 = LimitPreviewView.this;
                            limitPreviewView3.width1 = (int) (measuredWidth + (measuredWidth2 * limitPreviewView3.percent));
                            if (!LimitPreviewView.this.animateArrowFadeIn && !LimitPreviewView.this.animateArrowFadeOut) {
                                LimitPreviewView limitPreviewView4 = LimitPreviewView.this;
                                limitPreviewView4.premiumCount.setTextColor((limitPreviewView4.isRatingNegative || LimitPreviewView.this.hasDarkGradientProvider()) ? -1 : Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
                                LimitPreviewView.this.defaultText.setTextColor(-1);
                            }
                        } else {
                            LimitPreviewView limitPreviewView5 = LimitPreviewView.this;
                            limitPreviewView5.width1 = size;
                            if (!limitPreviewView5.animateArrowFadeIn && !LimitPreviewView.this.animateArrowFadeOut) {
                                LimitPreviewView.this.premiumCount.setTextColor(-1);
                                LimitPreviewView.this.defaultText.setTextColor(-1);
                            }
                        }
                    } else {
                        int iMax2 = Math.max(LimitPreviewView.this.premiumLayout.getMeasuredWidth(), AndroidUtilities.dp(24.0f) + LimitPreviewView.this.premiumText.getMeasuredWidth() + (LimitPreviewView.this.premiumCount.getVisibility() == 0 ? AndroidUtilities.dp(24.0f) + LimitPreviewView.this.premiumCount.getMeasuredWidth() : 0));
                        LimitPreviewView limitPreviewView6 = LimitPreviewView.this;
                        limitPreviewView6.width1 = (int) Utilities.clamp(size * limitPreviewView6.percent, size - iMax2, iMax);
                        LimitPreviewView.this.defaultLayout.measure(View.MeasureSpec.makeMeasureSpec(LimitPreviewView.this.width1, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                        LimitPreviewView.this.premiumLayout.measure(View.MeasureSpec.makeMeasureSpec(size - LimitPreviewView.this.width1, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    }
                    setMeasuredDimension(size, size2);
                    return;
                }
                super.onMeasure(i5, i6);
            }

            @Override
            protected void onLayout(boolean z, int i5, int i6, int i7, int i8) {
                if (getChildCount() == 2) {
                    View childAt = getChildAt(0);
                    View childAt2 = getChildAt(1);
                    int measuredWidth = childAt.getMeasuredWidth();
                    int i9 = i8 - i6;
                    childAt.layout(0, 0, measuredWidth, i9);
                    childAt2.layout(measuredWidth, 0, i7 - i5, i9);
                    return;
                }
                super.onLayout(z, i5, i6, i7, i8);
            }
        };
        this.limitsContainer = frameLayout;
        frameLayout.addView(textViewHolder, LayoutHelper.createFrame(-1, 30.0f));
        this.limitsContainer.addView(textViewHolder2, LayoutHelper.createFrame(-1, 30.0f));
        addView(this.limitsContainer, LayoutHelper.createLinear(-1, 30, 0.0f, 0, 14, i == 0 ? 0 : 12, 14, 0));
    }

    public void setHideNegativeValues(boolean z) {
        this.hideNegativeValues = z;
    }

    public void setDarkGradientProvider(DarkGradientProvider darkGradientProvider) {
        this.darkGradientProvider = darkGradientProvider;
    }

    public boolean hasDarkGradientProvider() {
        return this.darkGradientProvider != null;
    }

    public void setIconScale(float f) {
        this.iconScale = f;
    }

    public void setIconValue(int i, boolean z) {
        ColoredImageSpan coloredImageSpan;
        if (i < 0) {
            coloredImageSpan = new ColoredImageSpan(R.drawable.warning_sign);
        } else {
            coloredImageSpan = new ColoredImageSpan(this.icon);
            float f = this.iconScale;
            coloredImageSpan.setScale(f, f);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(coloredImageSpan, 0, 1, 0);
        if (i >= 0 || !this.hideNegativeValues) {
            spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i, ','));
        }
        this.limitIcon.setText(spannableStringBuilder, z);
        this.limitIcon.requestLayout();
    }

    public void setIconValue(int i, int i2, boolean z, boolean z2) {
        if (i < 0) {
            setIconValue(i, z2);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(new ColoredImageSpan(this.icon), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) ((!z || i <= 1200) ? LocaleController.formatNumber(i, ',') : LocaleController.formatShortNumber(i, null)));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "\u200a/\u200a");
        spannableStringBuilder.append((CharSequence) ((!z || i2 <= 1200) ? LocaleController.formatNumber(i2, ',') : LocaleController.formatShortNumber(i2, null)));
        spannableStringBuilder.setSpan(new EllipsizeSpanAnimator.TextAlphaSpan(170), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.65f), length, spannableStringBuilder.length(), 33);
        this.limitIcon.setText(spannableStringBuilder, z2);
        this.limitIcon.requestLayout();
    }

    public float getGlobalXOffset() {
        return (((-getMeasuredWidth()) * 0.1f) * this.progress) - (getMeasuredWidth() * 0.2f);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        if (this.staticGradient == null) {
            if (this.inc) {
                float f = this.progress + 0.016f;
                this.progress = f;
                if (f > 3.0f) {
                    this.inc = false;
                }
            } else {
                float f2 = this.progress - 0.016f;
                this.progress = f2;
                if (f2 < 1.0f) {
                    this.inc = true;
                }
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float fClamp;
        final float f3;
        float measuredWidth;
        super.onLayout(z, i, i2, i3, i4);
        float f4 = 0.5f;
        if (this.animateIncrease || this.animate || (!this.wasAnimation && this.limitIcon != null && this.animationCanPlay && !this.premiumLocked)) {
            int iDp = AndroidUtilities.dp(14.0f);
            boolean z2 = this.animate || this.animateIncrease;
            this.animateIncrease = false;
            this.animate = false;
            float translationX = z2 ? this.limitIcon.getTranslationX() : 0.0f;
            float f5 = iDp;
            int i5 = iDp * 2;
            float fMax = (Math.max(this.width1, (getMeasuredWidth() - i5) * this.position) + f5) - (this.limitIcon.getMeasuredWidth() / 2.0f);
            if (this.isSimpleStyle) {
                float arrowCenter = this.limitIcon.getArrowCenter();
                measuredWidth = Utilities.clamp(fMax, (getMeasuredWidth() - iDp) - this.limitIcon.getMeasuredWidth(), f5);
                int i6 = this.width1;
                if (i6 <= 0) {
                    f3 = measuredWidth;
                    f2 = arrowCenter;
                    fClamp = 0.0f;
                } else if (i6 >= getMeasuredWidth() - i5) {
                    f = arrowCenter;
                    f3 = measuredWidth;
                    f2 = f;
                    fClamp = 1.0f;
                } else {
                    fClamp = Utilities.clamp((this.width1 - (measuredWidth - f5)) / this.limitIcon.getMeasuredWidth(), 1.0f, 0.0f);
                    f3 = measuredWidth;
                    f2 = arrowCenter;
                }
            } else {
                if (fMax < f5) {
                    f = 0.0f;
                    f4 = 0.0f;
                } else {
                    f5 = fMax;
                    f = 0.5f;
                }
                if (f5 > (getMeasuredWidth() - iDp) - this.limitIcon.getMeasuredWidth()) {
                    measuredWidth = (getMeasuredWidth() - iDp) - this.limitIcon.getMeasuredWidth();
                    f3 = measuredWidth;
                    f2 = f;
                    fClamp = 1.0f;
                } else {
                    f2 = f;
                    fClamp = f4;
                    f3 = f5;
                }
            }
            final boolean z3 = this.animateArrowFadeIn;
            final boolean z4 = this.animateArrowFadeOut;
            if (!z3 && !z4) {
                this.limitIcon.setAlpha(1.0f);
            }
            this.limitIcon.setTranslationX(translationX);
            CounterView counterView = this.limitIcon;
            counterView.setPivotX(counterView.getMeasuredWidth() / 2.0f);
            CounterView counterView2 = this.limitIcon;
            counterView2.setPivotY(counterView2.getMeasuredHeight());
            if (!z2) {
                this.limitIcon.setScaleX(0.0f);
                this.limitIcon.setScaleY(0.0f);
                this.limitIcon.createAnimationLayouts();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.arrowAnimator = valueAnimatorOfFloat;
            final float f6 = this.width1;
            if (z2) {
                this.width1 = this.animateIncreaseWidth;
            }
            final boolean z5 = !this.animatingRotation;
            this.animatingRotation = true;
            final float f7 = fClamp;
            final float f8 = translationX;
            final boolean z6 = z2;
            final float f9 = f2;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LimitPreviewView.m2577$r8$lambda$93f7gEB1YqhVT1TebQ3xJwA08(this.f$0, z5, f8, f3, f9, f7, z6, f6, z3, z4, valueAnimator);
                }
            });
            this.arrowAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (z5) {
                        LimitPreviewView.this.animatingRotation = false;
                    }
                    if (LimitPreviewView.this.animateStarRatingRunnable != null) {
                        AndroidUtilities.cancelRunOnUIThread(LimitPreviewView.this.animateStarRatingRunnable);
                        LimitPreviewView.this.animateStarRatingRunnable.run();
                    }
                }
            });
            this.arrowAnimator.setInterpolator(new OvershootInterpolator());
            if (this.animateIncrease) {
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        LimitPreviewView.$r8$lambda$tL6ZQzAf2DtDVOI5Wu9O19FB0mc(this.f$0, valueAnimator);
                    }
                });
                valueAnimatorOfFloat2.setDuration(500L);
                valueAnimatorOfFloat2.start();
                this.arrowAnimator.setDuration(600L);
            } else if (z4) {
                this.arrowAnimator.setInterpolator(CubicBezierInterpolator.EASE_IN);
                this.arrowAnimator.setDuration(320L);
            } else if (z3) {
                this.arrowAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.arrowAnimator.setDuration(500L);
            } else {
                this.arrowAnimator.setDuration(1000L);
                this.arrowAnimator.setStartDelay(200L);
            }
            this.arrowAnimator.start();
            this.wasAnimation = true;
            return;
        }
        if (this.isBoostsStyle) {
            if (this.animateArrowFadeIn || this.animateArrowFadeOut) {
                return;
            }
            this.limitIcon.setAlpha(1.0f);
            this.limitIcon.setScaleX(1.0f);
            this.limitIcon.setScaleY(1.0f);
            return;
        }
        if (this.premiumLocked) {
            int iDp2 = AndroidUtilities.dp(14.0f);
            float measuredWidth2 = (iDp2 + ((getMeasuredWidth() - (iDp2 * 2)) * 0.5f)) - (this.limitIcon.getMeasuredWidth() / 2.0f);
            boolean z7 = this.wasAnimation;
            if (!z7 && this.animationCanPlay) {
                this.wasAnimation = true;
                this.limitIcon.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(new OvershootInterpolator()).start();
            } else if (!z7) {
                this.limitIcon.setAlpha(0.0f);
                this.limitIcon.setScaleX(0.0f);
                this.limitIcon.setScaleY(0.0f);
            } else {
                this.limitIcon.setAlpha(1.0f);
                this.limitIcon.setScaleX(1.0f);
                this.limitIcon.setScaleY(1.0f);
            }
            this.limitIcon.setTranslationX(measuredWidth2);
            return;
        }
        CounterView counterView3 = this.limitIcon;
        if (counterView3 != null) {
            counterView3.setAlpha(0.0f);
        }
    }

    public static void m2577$r8$lambda$93f7gEB1YqhVT1TebQ3xJwA08(LimitPreviewView limitPreviewView, boolean z, float f, float f2, float f3, float f4, boolean z2, float f5, boolean z3, boolean z4, ValueAnimator valueAnimator) {
        limitPreviewView.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float fMin = Math.min(1.0f, fFloatValue);
        if (fFloatValue > 1.0f && z) {
            if (!limitPreviewView.wasHaptic) {
                limitPreviewView.wasHaptic = true;
                try {
                    limitPreviewView.limitIcon.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            limitPreviewView.limitIcon.setRotation(limitPreviewView.limitIconRotation + ((fFloatValue - 1.0f) * 60.0f));
        } else if (!limitPreviewView.animatingRotation) {
            limitPreviewView.limitIcon.setRotation(limitPreviewView.limitIconRotation);
        }
        if (valueAnimator == limitPreviewView.arrowAnimator) {
            limitPreviewView.limitIcon.setTranslationX(AndroidUtilities.lerp(f, f2, fMin));
            float fLerp = AndroidUtilities.lerp(f3, f4, fMin);
            limitPreviewView.limitIcon.setArrowCenter(fLerp);
            CounterView counterView = limitPreviewView.limitIcon;
            counterView.setPivotX(counterView.getMeasuredWidth() * fLerp);
        }
        float fMin2 = Math.min(1.0f, 2.0f * fMin);
        if (!z2) {
            limitPreviewView.limitIcon.setScaleX(fMin2);
            limitPreviewView.limitIcon.setScaleY(fMin2);
        } else {
            limitPreviewView.width1 = (int) AndroidUtilities.lerp(limitPreviewView.animateIncreaseWidth, f5, fMin);
            limitPreviewView.limitsContainer.invalidate();
        }
        if (z3) {
            limitPreviewView.limitIcon.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, fFloatValue));
            limitPreviewView.limitIcon.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, fFloatValue));
            limitPreviewView.limitIcon.setAlpha(fFloatValue);
        } else if (z4) {
            float f6 = 1.0f - fFloatValue;
            limitPreviewView.limitIcon.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f6));
            limitPreviewView.limitIcon.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f6));
            limitPreviewView.limitIcon.setAlpha(f6);
        }
    }

    public static void $r8$lambda$tL6ZQzAf2DtDVOI5Wu9O19FB0mc(LimitPreviewView limitPreviewView, ValueAnimator valueAnimator) {
        limitPreviewView.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        limitPreviewView.limitIconRotation = fFloatValue < 0.5f ? (fFloatValue / 0.5f) * (-7.0f) : (1.0f - ((fFloatValue - 0.5f) / 0.5f)) * (-7.0f);
    }

    private void setArrowX(float f) {
        this.width1 = f >= 1.0f ? this.limitsContainer.getMeasuredWidth() : 0;
        int iDp = AndroidUtilities.dp(14.0f);
        float f2 = iDp;
        this.limitIcon.setTranslationX(Utilities.clamp((Math.max(this.width1, (getMeasuredWidth() - (iDp * 2)) * f) + f2) - (this.limitIcon.getMeasuredWidth() / 2.0f), (getMeasuredWidth() - iDp) - this.limitIcon.getMeasuredWidth(), f2));
        this.limitIcon.setArrowCenter(f);
        CounterView counterView = this.limitIcon;
        counterView.setPivotX(counterView.getMeasuredWidth() * f);
    }

    public void setType(int i) {
        if (i == 6) {
            if (this.limitIcon != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new ColoredImageSpan(this.icon), 0, 1, 0);
                spannableStringBuilder.append((CharSequence) (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() ? "4 GB" : "2 GB"));
                this.limitIcon.setText(spannableStringBuilder, false);
            }
            this.premiumCount.setText("4 GB");
            return;
        }
        if (i == 11) {
            if (this.limitIcon != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new ColoredImageSpan(this.icon), 0, 1, 0);
                this.limitIcon.setText(spannableStringBuilder2, false);
            }
            this.premiumCount.setText("");
        }
    }

    public void setBagePosition(float f) {
        this.position = MathUtils.clamp(f, 0.1f, 0.9f);
    }

    public void setParentViewForGradien(ViewGroup viewGroup) {
        this.parentVideForGradient = viewGroup;
    }

    public void setStaticGradinet(PremiumGradient.PremiumGradientTools premiumGradientTools) {
        this.staticGradient = premiumGradientTools;
    }

    public void setDelayedAnimation() {
        this.animationCanPlay = false;
    }

    public void startDelayedAnimation() {
        this.animationCanPlay = true;
        requestLayout();
    }

    public void setPremiumLocked() {
        this.limitsContainer.setVisibility(8);
        CounterView counterView = this.limitIcon;
        if (counterView != null) {
            counterView.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(3.0f));
        }
        this.premiumLocked = true;
    }

    public void setBoosts(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z) {
        int i;
        int i2 = tL_premium_boostsStatus.current_level_boosts;
        int i3 = tL_premium_boostsStatus.boosts;
        if ((i2 == i3 && z) || (i = tL_premium_boostsStatus.next_level_boosts) == 0) {
            this.percent = 1.0f;
            AnimatedTextView animatedTextView = this.defaultText;
            int i4 = R.string.BoostsLevel;
            animatedTextView.setText(LocaleController.formatString("BoostsLevel", i4, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            this.premiumCount.setText(LocaleController.formatString("BoostsLevel", i4, Integer.valueOf(tL_premium_boostsStatus.level)));
        } else {
            this.percent = MathUtils.clamp((i3 - i2) / (i - i2), 0.0f, 1.0f);
            AnimatedTextView animatedTextView2 = this.defaultText;
            int i5 = R.string.BoostsLevel;
            animatedTextView2.setText(LocaleController.formatString("BoostsLevel", i5, Integer.valueOf(tL_premium_boostsStatus.level)));
            this.premiumCount.setText(LocaleController.formatString("BoostsLevel", i5, Integer.valueOf(tL_premium_boostsStatus.level + 1)));
        }
        ((FrameLayout.LayoutParams) this.premiumCount.getLayoutParams()).gravity = 5;
        setType(17);
        this.defaultCount.setVisibility(8);
        this.premiumText.setVisibility(8);
        this.premiumCount.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
        this.defaultText.setTextColor(-1);
        setIconValue(tL_premium_boostsStatus.boosts, false);
        this.isBoostsStyle = true;
    }

    public void setStarsUpgradePrice(TL_stars.StarGiftUpgradePrice starGiftUpgradePrice, long j, TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2) {
        this.drawFromRight = true;
        this.ratingPaint.setColor(Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider));
        this.percent = AndroidUtilities.ilerp(j, starGiftUpgradePrice.upgrade_stars, starGiftUpgradePrice2.upgrade_stars);
        this.defaultText.setText(LocaleController.formatPluralStringComma("Stars", (int) starGiftUpgradePrice.upgrade_stars));
        this.premiumCount.setText(LocaleController.formatPluralStringComma("Stars", (int) starGiftUpgradePrice2.upgrade_stars));
        ((FrameLayout.LayoutParams) this.premiumCount.getLayoutParams()).gravity = 5;
        setType(17);
        this.defaultCount.setVisibility(8);
        this.premiumText.setVisibility(8);
        this.premiumCount.setTextColor(this.isRatingNegative ? -1 : Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
        this.defaultText.setTextColor(-1);
        setIconValue((int) j, false);
        this.isBoostsStyle = true;
        this.isSimpleStyle = true;
        this.isRatingStyle = true;
    }

    public void setStarRating(TL_stars.Tl_starsRating tl_starsRating) {
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
                AnimatedTextView animatedTextView = this.defaultText;
                int i = R.string.StarRatingLevel;
                animatedTextView.setText(LocaleController.formatString(i, Integer.valueOf(tl_starsRating.level - 1)));
                this.premiumCount.setText(LocaleController.formatString(i, Integer.valueOf(tl_starsRating.level)));
            } else {
                this.percent = MathUtils.clamp((j2 - j) / (j3 - j), 0.0f, 1.0f);
                AnimatedTextView animatedTextView2 = this.defaultText;
                int i2 = R.string.StarRatingLevel;
                animatedTextView2.setText(LocaleController.formatString(i2, Integer.valueOf(tl_starsRating.level)));
                this.premiumCount.setText(LocaleController.formatString(i2, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        ((FrameLayout.LayoutParams) this.premiumCount.getLayoutParams()).gravity = 5;
        setType(17);
        this.defaultCount.setVisibility(8);
        this.premiumText.setVisibility(8);
        this.premiumCount.setTextColor(this.isRatingNegative ? -1 : Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
        this.defaultText.setTextColor(-1);
        setIconValue((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars, true, false);
        this.isBoostsStyle = true;
        this.isSimpleStyle = true;
        this.isRatingStyle = true;
    }

    public void animateStarRating(TL_stars.Tl_starsRating tl_starsRating, final TL_stars.Tl_starsRating tl_starsRating2) {
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
                    AnimatedTextView animatedTextView = this.defaultText;
                    int i4 = R.string.StarRatingLevel;
                    animatedTextView.setText(LocaleController.formatString(i4, Integer.valueOf(i3 - 1)));
                    this.premiumCount.setText(LocaleController.formatString(i4, Integer.valueOf(tl_starsRating2.level)));
                } else {
                    long j3 = tl_starsRating2.current_level_stars;
                    this.percent = MathUtils.clamp((j - j3) / (j2 - j3), 0.0f, 1.0f);
                    AnimatedTextView animatedTextView2 = this.defaultText;
                    int i5 = R.string.StarRatingLevel;
                    animatedTextView2.setText(LocaleController.formatString(i5, Integer.valueOf(tl_starsRating2.level)));
                    this.premiumCount.setText(LocaleController.formatString(i5, Integer.valueOf(tl_starsRating2.level + 1)));
                }
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
            setIconValue((int) tl_starsRating2.stars, (int) tl_starsRating2.next_level_stars, true, false);
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
            setIconValue((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars, true, false);
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    LimitPreviewView.m2579$r8$lambda$_CuaWokFkxFoRhtFqFhgtRIXDM(this.f$0, tl_starsRating2);
                }
            };
            this.animateStarRatingRunnable = runnable;
            AndroidUtilities.runOnUIThread(runnable, 600L);
            return;
        }
        if (i3 < i2) {
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
            setIconValue((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars, true, false);
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    LimitPreviewView.m2578$r8$lambda$EZXAzRQXnjrCHXaeJ59FJVwKAc(this.f$0, tl_starsRating2);
                }
            };
            this.animateStarRatingRunnable = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, 600L);
        }
    }

    public static void m2579$r8$lambda$_CuaWokFkxFoRhtFqFhgtRIXDM(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        limitPreviewView.animateStarRatingRunnable = null;
        if (limitPreviewView.isAttachedToWindow()) {
            ValueAnimator valueAnimator = limitPreviewView.arrowAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            limitPreviewView.isRatingNegative = false;
            limitPreviewView.ratingPaint.setColor(Theme.getColor(Theme.key_featuredStickers_addButton, limitPreviewView.resourcesProvider));
            long j = tl_starsRating.stars;
            if (j <= 0) {
                limitPreviewView.percent = 0.0f;
                limitPreviewView.defaultText.setText("");
                limitPreviewView.premiumCount.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
                limitPreviewView.ratingPaint.setColor(Theme.getColor(Theme.key_color_red, limitPreviewView.resourcesProvider));
                limitPreviewView.isRatingNegative = true;
            } else {
                long j2 = tl_starsRating.next_level_stars;
                if (j2 == 0) {
                    limitPreviewView.percent = 1.0f;
                    AnimatedTextView animatedTextView = limitPreviewView.defaultText;
                    int i = R.string.StarRatingLevel;
                    animatedTextView.setText(LocaleController.formatString(i, Integer.valueOf(tl_starsRating.level - 1)));
                    limitPreviewView.premiumCount.setText(LocaleController.formatString(i, Integer.valueOf(tl_starsRating.level)));
                } else {
                    long j3 = tl_starsRating.current_level_stars;
                    limitPreviewView.percent = MathUtils.clamp((j - j3) / (j2 - j3), 0.0f, 1.0f);
                    AnimatedTextView animatedTextView2 = limitPreviewView.defaultText;
                    int i2 = R.string.StarRatingLevel;
                    animatedTextView2.setText(LocaleController.formatString(i2, Integer.valueOf(tl_starsRating.level)));
                    limitPreviewView.premiumCount.setText(LocaleController.formatString(i2, Integer.valueOf(tl_starsRating.level + 1)));
                }
            }
            limitPreviewView.setArrowX(0.0f);
            limitPreviewView.limitIcon.setScaleX(0.6f);
            limitPreviewView.limitIcon.setScaleY(0.6f);
            limitPreviewView.limitIcon.setAlpha(0.0f);
            limitPreviewView.animate = true;
            limitPreviewView.animateArrowFadeIn = true;
            limitPreviewView.animateArrowFadeOut = false;
            limitPreviewView.animateBackgroundFade = false;
            limitPreviewView.animateIncreaseWidth = limitPreviewView.width1;
            limitPreviewView.limitsContainer.requestLayout();
            limitPreviewView.requestLayout();
            ViewPropertyAnimator duration = limitPreviewView.defaultText.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            limitPreviewView.premiumCount.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(cubicBezierInterpolator).start();
            limitPreviewView.premiumCount.setTextColor(limitPreviewView.isRatingNegative ? -1 : Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, limitPreviewView.resourcesProvider));
            limitPreviewView.defaultText.setTextColor(-1);
            limitPreviewView.setIconValue((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars, true, false);
        }
    }

    public static void m2578$r8$lambda$EZXAzRQXnjrCHXaeJ59FJVwKAc(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        limitPreviewView.animateStarRatingRunnable = null;
        if (limitPreviewView.isAttachedToWindow()) {
            ValueAnimator valueAnimator = limitPreviewView.arrowAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            limitPreviewView.isRatingNegative = false;
            limitPreviewView.ratingPaint.setColor(Theme.getColor(Theme.key_featuredStickers_addButton, limitPreviewView.resourcesProvider));
            long j = tl_starsRating.stars;
            if (j <= 0) {
                limitPreviewView.percent = 0.5f;
                limitPreviewView.defaultText.setText("");
                limitPreviewView.premiumCount.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
                limitPreviewView.ratingPaint.setColor(Theme.getColor(Theme.key_color_red, limitPreviewView.resourcesProvider));
                limitPreviewView.isRatingNegative = true;
            } else {
                long j2 = tl_starsRating.next_level_stars;
                if (j2 == 0) {
                    limitPreviewView.percent = 1.0f;
                    AnimatedTextView animatedTextView = limitPreviewView.defaultText;
                    int i = R.string.StarRatingLevel;
                    animatedTextView.setText(LocaleController.formatString(i, Integer.valueOf(tl_starsRating.level - 1)));
                    limitPreviewView.premiumCount.setText(LocaleController.formatString(i, Integer.valueOf(tl_starsRating.level)));
                } else {
                    long j3 = tl_starsRating.current_level_stars;
                    limitPreviewView.percent = MathUtils.clamp((j - j3) / (j2 - j3), 0.0f, 1.0f);
                    AnimatedTextView animatedTextView2 = limitPreviewView.defaultText;
                    int i2 = R.string.StarRatingLevel;
                    animatedTextView2.setText(LocaleController.formatString(i2, Integer.valueOf(tl_starsRating.level)));
                    limitPreviewView.premiumCount.setText(LocaleController.formatString(i2, Integer.valueOf(tl_starsRating.level + 1)));
                }
            }
            limitPreviewView.setArrowX(1.0f);
            limitPreviewView.limitIcon.setScaleX(0.6f);
            limitPreviewView.limitIcon.setScaleY(0.6f);
            limitPreviewView.limitIcon.setAlpha(0.0f);
            limitPreviewView.animate = true;
            limitPreviewView.animateArrowFadeIn = true;
            limitPreviewView.animateArrowFadeOut = false;
            limitPreviewView.animateBackgroundFade = false;
            limitPreviewView.animateIncreaseWidth = limitPreviewView.width1;
            limitPreviewView.limitsContainer.requestLayout();
            limitPreviewView.requestLayout();
            ViewPropertyAnimator duration = limitPreviewView.defaultText.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            limitPreviewView.premiumCount.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(cubicBezierInterpolator).start();
            limitPreviewView.premiumCount.setTextColor(limitPreviewView.isRatingNegative ? -1 : Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, limitPreviewView.resourcesProvider));
            limitPreviewView.defaultText.setTextColor(-1);
            limitPreviewView.setIconValue((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars, true, false);
        }
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
            if (view instanceof TextView) {
                boolean zDrawChild = super.drawChild(canvas, view, j);
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
                return zDrawChild;
            }
            return super.drawChild(canvas, view, j);
        }
    }

    class CounterView extends View {
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

        @Override
        protected void onMeasure(int i, int i2) {
            this.textWidth = HintView2.measureCorrectly(this.text, this.textPaint);
            this.textLayout = new StaticLayout(this.text, this.textPaint, ((int) this.textWidth) + AndroidUtilities.dp(12.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.textWidth = 0.0f;
            for (int i3 = 0; i3 < this.textLayout.getLineCount(); i3++) {
                this.textWidth = Math.max(this.textWidth, this.textLayout.getLineWidth(i3));
            }
            setMeasuredDimension((int) (this.textWidth + getPaddingRight() + getPaddingLeft()), AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(8.0f));
            updatePath();
        }

        private void updatePath() {
            int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
            float measuredWidth = getMeasuredWidth() * this.arrowCenter;
            float fClamp = Utilities.clamp(AndroidUtilities.dp(8.0f) + measuredWidth, getMeasuredWidth(), 0.0f);
            float fClamp2 = Utilities.clamp(AndroidUtilities.dp(10.0f) + measuredWidth, getMeasuredWidth(), AndroidUtilities.dp(24.0f));
            float fClamp3 = Utilities.clamp(measuredWidth - AndroidUtilities.dp(this.arrowCenter >= 0.7f ? 24.0f : 10.0f), getMeasuredWidth(), 0.0f);
            float fClamp4 = Utilities.clamp(measuredWidth - AndroidUtilities.dp(8.0f), getMeasuredWidth(), 0.0f);
            this.path.rewind();
            float f = measuredHeight;
            float f2 = f - (f / 2.0f);
            this.path.moveTo(fClamp3, f2 - AndroidUtilities.dp(2.0f));
            this.path.lineTo(fClamp3, f);
            this.path.lineTo(fClamp4, f);
            this.path.lineTo(measuredWidth, measuredHeight + AndroidUtilities.dp(8.0f));
            if (this.arrowCenter < 0.7f) {
                this.path.lineTo(fClamp, f);
            }
            this.path.lineTo(fClamp2, f);
            this.path.lineTo(fClamp2, f2 - AndroidUtilities.dp(2.0f));
            this.path.close();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
            if (LimitPreviewView.this.premiumLocked) {
                measuredHeight = getMeasuredHeight();
                PremiumGradient.getInstance().updateMainGradientMatrix(0, 0, LimitPreviewView.this.getMeasuredWidth(), LimitPreviewView.this.getMeasuredHeight(), LimitPreviewView.this.getGlobalXOffset() - getX(), -getTop());
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, AndroidUtilities.dp(3.0f), getMeasuredWidth(), measuredHeight - AndroidUtilities.dp(3.0f));
                float f = measuredHeight / 2.0f;
                canvas.drawRoundRect(rectF, f, f, PremiumGradient.getInstance().getPremiumLocakedPaint());
            } else {
                if (this.invalidatePath) {
                    this.invalidatePath = false;
                    updatePath();
                }
                PremiumGradient.getInstance().updateMainGradientMatrix(0, 0, LimitPreviewView.this.getMeasuredWidth(), LimitPreviewView.this.getMeasuredHeight(), LimitPreviewView.this.getGlobalXOffset() - getX(), -getTop());
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f2 = measuredHeight;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), f2);
                float f3 = f2 / 2.0f;
                canvas.drawRoundRect(rectF2, f3, f3, LimitPreviewView.this.isRatingStyle ? LimitPreviewView.this.ratingPaint : LimitPreviewView.this.hasDarkGradientProvider() ? this.textPaint : PremiumGradient.getInstance().getMainGradientPaint());
                PremiumGradient.getInstance().getMainGradientPaint().setPathEffect(this.pathEffect);
                if (LimitPreviewView.this.hasDarkGradientProvider()) {
                    this.textPaint.setPathEffect(this.pathEffect);
                }
                canvas.drawPath(this.path, LimitPreviewView.this.isRatingStyle ? LimitPreviewView.this.ratingPaint : LimitPreviewView.this.hasDarkGradientProvider() ? this.textPaint : PremiumGradient.getInstance().getMainGradientPaint());
                PremiumGradient.getInstance().getMainGradientPaint().setPathEffect(null);
                if (LimitPreviewView.this.hasDarkGradientProvider()) {
                    this.textPaint.setPathEffect(null);
                }
                if (LimitPreviewView.this.invalidationEnabled) {
                    invalidate();
                }
            }
            int i = measuredHeight;
            if (LimitPreviewView.this.hasDarkGradientProvider()) {
                canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.dstOutPaint, 31);
            }
            float measuredWidth = (getMeasuredWidth() - this.textWidth) / 2.0f;
            float height = (i - this.textLayout.getHeight()) / 2.0f;
            if (!this.animationInProgress) {
                if (this.textLayout != null) {
                    canvas.save();
                    canvas.translate(measuredWidth, height);
                    this.textLayout.draw(canvas);
                    canvas.restore();
                }
            } else {
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(8.0f));
                if (this.animatedStableLayout != null) {
                    canvas.save();
                    canvas.translate(measuredWidth, height);
                    this.animatedStableLayout.draw(canvas);
                    canvas.restore();
                }
                for (int i2 = 0; i2 < this.animatedLayouts.size(); i2++) {
                    AnimatedLayout animatedLayout = (AnimatedLayout) this.animatedLayouts.get(i2);
                    canvas.save();
                    if (animatedLayout.replace) {
                        canvas.translate(animatedLayout.x + measuredWidth, ((i * animatedLayout.progress) + height) - ((1 - animatedLayout.staticLayouts.size()) * i));
                        for (int i3 = 0; i3 < animatedLayout.staticLayouts.size(); i3++) {
                            canvas.translate(0.0f, -i);
                            ((StaticLayout) animatedLayout.staticLayouts.get(i3)).draw(canvas);
                        }
                    } else if (animatedLayout.direction) {
                        canvas.translate(animatedLayout.x + measuredWidth, (height - ((i * 10) * animatedLayout.progress)) + ((10 - animatedLayout.staticLayouts.size()) * i));
                        for (int i4 = 0; i4 < animatedLayout.staticLayouts.size(); i4++) {
                            canvas.translate(0.0f, i);
                            ((StaticLayout) animatedLayout.staticLayouts.get(i4)).draw(canvas);
                        }
                    } else {
                        canvas.translate(animatedLayout.x + measuredWidth, (((i * 10) * animatedLayout.progress) + height) - ((10 - animatedLayout.staticLayouts.size()) * i));
                        for (int i5 = 0; i5 < animatedLayout.staticLayouts.size(); i5++) {
                            canvas.translate(0.0f, -i);
                            ((StaticLayout) animatedLayout.staticLayouts.get(i5)).draw(canvas);
                        }
                    }
                    canvas.restore();
                }
                canvas.restore();
            }
            if (LimitPreviewView.this.hasDarkGradientProvider()) {
                canvas.restore();
                canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.overlayPaint, 31);
                canvas.drawRect(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f), getMeasuredWidth() - AndroidUtilities.dp(12.0f), getMeasuredHeight() - AndroidUtilities.dp(10.0f), LimitPreviewView.this.darkGradientProvider.setDarkGradientLocation(getX(), getY()));
                canvas.restore();
            }
        }

        @Override
        public void setTranslationX(float f) {
            if (f != getTranslationX()) {
                super.setTranslationX(f);
                invalidate();
            }
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
                    int iCharAt = this.text.charAt(i2) - '0';
                    if (iCharAt == 0) {
                        iCharAt = 10;
                    }
                    int i3 = 1;
                    while (i3 <= iCharAt) {
                        animatedLayout.staticLayouts.add(new StaticLayout("" + (i3 == 10 ? 0 : i3), this.textPaint, (int) this.textWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                        i3++;
                    }
                    spannableStringBuilder.setSpan(new EmptyStubSpan(), i2, i2 + 1, 0);
                }
            }
            this.animatedStableLayout = new StaticLayout(spannableStringBuilder, this.textPaint, ((int) this.textWidth) + AndroidUtilities.dp(12.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            for (int i4 = 0; i4 < this.animatedLayouts.size(); i4++) {
                this.animationInProgress = true;
                final AnimatedLayout animatedLayout2 = (AnimatedLayout) this.animatedLayouts.get(i4);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                animatedLayout2.valueAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        LimitPreviewView.CounterView.$r8$lambda$Mj2VMU18w4QfPCJEvHW4fBcAAyA(this.f$0, animatedLayout2, valueAnimator);
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
                animatedLayout2.valueAnimator.setStartDelay(((long) ((this.animatedLayouts.size() - 1) - i4)) * 60);
                animatedLayout2.valueAnimator.start();
            }
        }

        public static void $r8$lambda$Mj2VMU18w4QfPCJEvHW4fBcAAyA(CounterView counterView, AnimatedLayout animatedLayout, ValueAnimator valueAnimator) {
            counterView.getClass();
            animatedLayout.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            counterView.invalidate();
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
                char cCharAt = length < charSequence.length() ? charSequence.charAt(length) : ' ';
                if (cCharAt != this.text.charAt(length) && Character.isDigit(this.text.charAt(length))) {
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
                    animatedLayout.staticLayouts.add(new StaticLayout("" + cCharAt, textPaint, i2, alignment, 1.0f, 0.0f, false));
                    animatedLayout.staticLayouts.add(new StaticLayout("" + this.text.charAt(length), this.textPaint, (int) this.textWidth, alignment, 1.0f, 0.0f, false));
                    spannableStringBuilder.setSpan(new EmptyStubSpan(), length, length + 1, 0);
                }
                length--;
            }
            this.animatedStableLayout = new StaticLayout(spannableStringBuilder, this.textPaint, AndroidUtilities.dp(12.0f) + ((int) this.textWidth), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            for (int i3 = 0; i3 < this.animatedLayouts.size(); i3++) {
                this.animationInProgress = true;
                final AnimatedLayout animatedLayout2 = (AnimatedLayout) this.animatedLayouts.get(i3);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                animatedLayout2.valueAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        LimitPreviewView.CounterView.$r8$lambda$If9wipavzZiQSylvd13Gtl5GUvI(this.f$0, animatedLayout2, valueAnimator);
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
                animatedLayout2.valueAnimator.setStartDelay(((long) ((this.animatedLayouts.size() - 1) - i3)) * 60);
                animatedLayout2.valueAnimator.start();
            }
        }

        public static void $r8$lambda$If9wipavzZiQSylvd13Gtl5GUvI(CounterView counterView, AnimatedLayout animatedLayout, ValueAnimator valueAnimator) {
            counterView.getClass();
            animatedLayout.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            counterView.invalidate();
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

        public void setText(CharSequence charSequence, boolean z) {
            if (!z) {
                this.text = charSequence;
                return;
            }
            CharSequence charSequence2 = this.text;
            this.text = charSequence;
            createAnimationLayoutsDiff(charSequence2);
        }

        public void setArrowCenter(float f) {
            if (this.arrowCenter != f) {
                this.arrowCenter = f;
                this.invalidatePath = true;
                invalidate();
            }
        }

        public float getArrowCenter() {
            return this.arrowCenter;
        }

        class AnimatedLayout {
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
    }
}
