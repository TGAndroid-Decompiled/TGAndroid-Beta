package org.telegram.p009ui.Components.Premium;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.ColoredImageSpan;
import org.telegram.p009ui.Components.CubicBezierInterpolator;
import org.telegram.p009ui.Components.EmptyStubSpan;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.Premium.LimitPreviewView;
import org.telegram.p009ui.Components.Premium.PremiumGradient;

public class LimitPreviewView extends LinearLayout {
    boolean animationCanPlay;
    TextView defaultCount;
    public int gradientTotalHeight;
    int gradientYOffset;
    int icon;
    boolean inc;
    CounterView limitIcon;
    LinearLayout limitsContainer;
    private View parentVideForGradient;
    private float position;
    TextView premiumCount;
    private boolean premiumLocked;
    float progress;
    PremiumGradient.GradientTools staticGradient;
    boolean wasAnimation;
    boolean wasHaptic;

    @SuppressLint({"SetTextI18n"})
    public LimitPreviewView(Context context, int i, int i2, int i3) {
        super(context);
        this.animationCanPlay = true;
        this.icon = i;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        if (i != 0) {
            setPadding(0, AndroidUtilities.m35dp(16.0f), 0, 0);
            this.limitIcon = new CounterView(context);
            setIconValue(i2);
            this.limitIcon.setPadding(AndroidUtilities.m35dp(24.0f), AndroidUtilities.m35dp(6.0f), AndroidUtilities.m35dp(24.0f), AndroidUtilities.m35dp(14.0f));
            addView(this.limitIcon, LayoutHelper.createLinear(-2, -2, 0.0f, 3));
        }
        LinearLayout linearLayout = new LinearLayout(context) {
            Paint grayPaint = new Paint();

            @Override
            protected void dispatchDraw(Canvas canvas) {
                this.grayPaint.setColor(Theme.getColor("windowBackgroundGray"));
                RectF rectF = AndroidUtilities.rectTmp;
                float f = 0.0f;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.m35dp(6.0f), AndroidUtilities.m35dp(6.0f), this.grayPaint);
                canvas.save();
                canvas.clipRect(getMeasuredWidth() / 2.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint mainGradientPaint = PremiumGradient.getInstance().getMainGradientPaint();
                if (LimitPreviewView.this.parentVideForGradient != null) {
                    View view = LimitPreviewView.this.parentVideForGradient;
                    LimitPreviewView limitPreviewView = LimitPreviewView.this;
                    PremiumGradient.GradientTools gradientTools = limitPreviewView.staticGradient;
                    if (gradientTools == null) {
                        for (View view2 = this; view2 != view; view2 = (View) view2.getParent()) {
                            f += view2.getY();
                        }
                        PremiumGradient.getInstance().updateMainGradientMatrix(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), LimitPreviewView.this.getGlobalXOffset() - getLeft(), -f);
                    } else {
                        mainGradientPaint = gradientTools.paint;
                        gradientTools.gradientMatrixLinear(limitPreviewView.gradientTotalHeight, -limitPreviewView.gradientYOffset);
                    }
                } else {
                    PremiumGradient.getInstance().updateMainGradientMatrix(0, 0, LimitPreviewView.this.getMeasuredWidth(), LimitPreviewView.this.getMeasuredHeight(), LimitPreviewView.this.getGlobalXOffset() - getLeft(), -getTop());
                }
                canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.m35dp(6.0f), AndroidUtilities.m35dp(6.0f), mainGradientPaint);
                canvas.restore();
                if (LimitPreviewView.this.staticGradient == null) {
                    invalidate();
                }
                super.dispatchDraw(canvas);
            }
        };
        this.limitsContainer = linearLayout;
        linearLayout.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        textView.setText(LocaleController.getString("LimitFree", C1072R.string.LimitFree));
        textView.setGravity(16);
        textView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        textView.setPadding(AndroidUtilities.m35dp(12.0f), 0, 0, 0);
        TextView textView2 = new TextView(context);
        this.defaultCount = textView2;
        textView2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.defaultCount.setText(Integer.toString(i3));
        this.defaultCount.setGravity(16);
        this.defaultCount.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        frameLayout.addView(textView, LayoutHelper.createFrame(-1, 30.0f, 3, 0.0f, 0.0f, 36.0f, 0.0f));
        frameLayout.addView(this.defaultCount, LayoutHelper.createFrame(-2, 30.0f, 5, 0.0f, 0.0f, 12.0f, 0.0f));
        this.limitsContainer.addView(frameLayout, LayoutHelper.createLinear(0, 30, 1.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        TextView textView3 = new TextView(context);
        textView3.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        textView3.setText(LocaleController.getString("LimitPremium", C1072R.string.LimitPremium));
        textView3.setGravity(16);
        textView3.setTextColor(-1);
        textView3.setPadding(AndroidUtilities.m35dp(12.0f), 0, 0, 0);
        TextView textView4 = new TextView(context);
        this.premiumCount = textView4;
        textView4.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.premiumCount.setText(Integer.toString(i3));
        this.premiumCount.setGravity(16);
        this.premiumCount.setTextColor(-1);
        frameLayout2.addView(textView3, LayoutHelper.createFrame(-1, 30.0f, 3, 0.0f, 0.0f, 36.0f, 0.0f));
        frameLayout2.addView(this.premiumCount, LayoutHelper.createFrame(-2, 30.0f, 5, 0.0f, 0.0f, 12.0f, 0.0f));
        this.limitsContainer.addView(frameLayout2, LayoutHelper.createLinear(0, 30, 1.0f));
        addView(this.limitsContainer, LayoutHelper.createLinear(-1, -2, 0.0f, 0, 14, i == 0 ? 0 : 12, 14, 0));
    }

    public void setIconValue(int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").setSpan(new ColoredImageSpan(this.icon), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) Integer.toString(i));
        this.limitIcon.setText(spannableStringBuilder);
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
        int m35dp;
        float f;
        float f2;
        CounterView counterView;
        CounterView counterView2;
        super.onLayout(z, i, i2, i3, i4);
        if (!this.wasAnimation && this.limitIcon != null && this.animationCanPlay && !this.premiumLocked) {
            int m35dp2 = AndroidUtilities.m35dp(14.0f);
            float measuredWidth = (m35dp2 + ((getMeasuredWidth() - (m35dp2 * 2)) * this.position)) - (this.limitIcon.getMeasuredWidth() / 2.0f);
            if (measuredWidth > (getMeasuredWidth() - m35dp2) - this.limitIcon.getMeasuredWidth()) {
                f = (getMeasuredWidth() - m35dp2) - this.limitIcon.getMeasuredWidth();
                f2 = 1.0f;
            } else {
                f = measuredWidth;
                f2 = 0.5f;
            }
            this.limitIcon.setAlpha(1.0f);
            this.limitIcon.setTranslationX(0.0f);
            this.limitIcon.setPivotX(counterView.getMeasuredWidth() / 2.0f);
            this.limitIcon.setPivotY(counterView2.getMeasuredHeight());
            this.limitIcon.setScaleX(0.0f);
            this.limitIcon.setScaleY(0.0f);
            this.limitIcon.createAnimationLayouts();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            final float f3 = f;
            final float f4 = f2;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LimitPreviewView.this.lambda$onLayout$0(r2, f3, r4, f4, valueAnimator);
                }
            });
            ofFloat.setInterpolator(new OvershootInterpolator());
            ofFloat.setDuration(1000L);
            ofFloat.setStartDelay(200L);
            ofFloat.start();
            this.wasAnimation = true;
        } else if (this.premiumLocked) {
            float m35dp3 = (AndroidUtilities.m35dp(14.0f) + ((getMeasuredWidth() - (m35dp * 2)) * 0.5f)) - (this.limitIcon.getMeasuredWidth() / 2.0f);
            boolean z2 = this.wasAnimation;
            if (!z2 && this.animationCanPlay) {
                this.wasAnimation = true;
                this.limitIcon.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(new OvershootInterpolator()).start();
            } else if (!z2) {
                this.limitIcon.setAlpha(0.0f);
                this.limitIcon.setScaleX(0.0f);
                this.limitIcon.setScaleY(0.0f);
            } else {
                this.limitIcon.setAlpha(1.0f);
                this.limitIcon.setScaleX(1.0f);
                this.limitIcon.setScaleY(1.0f);
            }
            this.limitIcon.setTranslationX(m35dp3);
        } else {
            CounterView counterView3 = this.limitIcon;
            if (counterView3 != null) {
                counterView3.setAlpha(0.0f);
            }
        }
    }

    public void lambda$onLayout$0(float f, float f2, float f3, float f4, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float min = Math.min(1.0f, floatValue);
        if (floatValue > 1.0f) {
            if (!this.wasHaptic) {
                this.wasHaptic = true;
                this.limitIcon.performHapticFeedback(3);
            }
            this.limitIcon.setRotation((floatValue - 1.0f) * 60.0f);
        } else {
            this.limitIcon.setRotation(0.0f);
        }
        float f5 = 1.0f - min;
        this.limitIcon.setTranslationX((f * f5) + (f2 * min));
        float f6 = (f3 * f5) + (f4 * min);
        this.limitIcon.setArrowCenter(f6);
        float min2 = Math.min(1.0f, min * 2.0f);
        this.limitIcon.setScaleX(min2);
        this.limitIcon.setScaleY(min2);
        CounterView counterView = this.limitIcon;
        counterView.setPivotX(counterView.getMeasuredWidth() * f6);
    }

    public void setType(int i) {
        if (i == 6) {
            if (this.limitIcon != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new ColoredImageSpan(this.icon), 0, 1, 0);
                spannableStringBuilder.append((CharSequence) (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() ? "4 GB" : "2 GB"));
                this.limitIcon.setText(spannableStringBuilder);
            }
            this.premiumCount.setText("4 GB");
        }
    }

    public void setBagePosition(float f) {
        this.position = f;
    }

    public void setParentViewForGradien(ViewGroup viewGroup) {
        this.parentVideForGradient = viewGroup;
    }

    public void setStaticGradinet(PremiumGradient.GradientTools gradientTools) {
        this.staticGradient = gradientTools;
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
        this.limitIcon.setPadding(AndroidUtilities.m35dp(24.0f), AndroidUtilities.m35dp(3.0f), AndroidUtilities.m35dp(24.0f), AndroidUtilities.m35dp(3.0f));
        this.premiumLocked = true;
    }

    public class CounterView extends View {
        ArrayList<AnimatedLayout> animatedLayouts;
        StaticLayout animatedStableLayout;
        boolean animationInProgress;
        float arrowCenter;
        boolean invalidatePath;
        Path path;
        PathEffect pathEffect;
        CharSequence text;
        StaticLayout textLayout;
        TextPaint textPaint;
        float textWidth;

        public CounterView(Context context) {
            super(context);
            LimitPreviewView.this = r1;
            this.path = new Path();
            this.pathEffect = new CornerPathEffect(AndroidUtilities.m35dp(6.0f));
            this.textPaint = new TextPaint(1);
            this.animatedLayouts = new ArrayList<>();
            this.textPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.textPaint.setTextSize(AndroidUtilities.m35dp(22.0f));
            this.textPaint.setColor(-1);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            TextPaint textPaint = this.textPaint;
            CharSequence charSequence = this.text;
            this.textWidth = textPaint.measureText(charSequence, 0, charSequence.length());
            this.textLayout = new StaticLayout(this.text, this.textPaint, ((int) this.textWidth) + AndroidUtilities.m35dp(12.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            setMeasuredDimension((int) (this.textWidth + getPaddingRight() + getPaddingLeft()), AndroidUtilities.m35dp(44.0f) + AndroidUtilities.m35dp(8.0f));
            updatePath();
        }

        private void updatePath() {
            int measuredHeight = getMeasuredHeight() - AndroidUtilities.m35dp(8.0f);
            float measuredWidth = getMeasuredWidth() * this.arrowCenter;
            float clamp = Utilities.clamp(AndroidUtilities.m35dp(8.0f) + measuredWidth, getMeasuredWidth(), 0.0f);
            float clamp2 = Utilities.clamp(AndroidUtilities.m35dp(10.0f) + measuredWidth, getMeasuredWidth(), 0.0f);
            this.path.rewind();
            float f = measuredHeight;
            float f2 = f - (f / 2.0f);
            this.path.moveTo(measuredWidth - AndroidUtilities.m35dp(24.0f), f2 - AndroidUtilities.m35dp(2.0f));
            this.path.lineTo(measuredWidth - AndroidUtilities.m35dp(24.0f), f);
            this.path.lineTo(measuredWidth - AndroidUtilities.m35dp(8.0f), f);
            this.path.lineTo(measuredWidth, measuredHeight + AndroidUtilities.m35dp(8.0f));
            if (this.arrowCenter < 0.7f) {
                this.path.lineTo(clamp, f);
            }
            this.path.lineTo(clamp2, f);
            this.path.lineTo(clamp2, f2 - AndroidUtilities.m35dp(2.0f));
            this.path.close();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int measuredHeight = getMeasuredHeight() - AndroidUtilities.m35dp(8.0f);
            if (LimitPreviewView.this.premiumLocked) {
                measuredHeight = getMeasuredHeight();
                PremiumGradient.getInstance().updateMainGradientMatrix(0, 0, LimitPreviewView.this.getMeasuredWidth(), LimitPreviewView.this.getMeasuredHeight(), LimitPreviewView.this.getGlobalXOffset() - getX(), -getTop());
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, AndroidUtilities.m35dp(3.0f), getMeasuredWidth(), measuredHeight - AndroidUtilities.m35dp(3.0f));
                float f = measuredHeight / 2.0f;
                canvas.drawRoundRect(rectF, f, f, PremiumGradient.getInstance().getMainGradientPaint());
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
                canvas.drawRoundRect(rectF2, f3, f3, PremiumGradient.getInstance().getMainGradientPaint());
                PremiumGradient.getInstance().getMainGradientPaint().setPathEffect(this.pathEffect);
                canvas.drawPath(this.path, PremiumGradient.getInstance().getMainGradientPaint());
                PremiumGradient.getInstance().getMainGradientPaint().setPathEffect(null);
                invalidate();
            }
            float measuredWidth = (getMeasuredWidth() - this.textLayout.getWidth()) / 2.0f;
            float height = (measuredHeight - this.textLayout.getHeight()) / 2.0f;
            if (!this.animationInProgress) {
                if (this.textLayout != null) {
                    canvas.save();
                    canvas.translate(measuredWidth, height);
                    this.textLayout.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            }
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.m35dp(8.0f));
            if (this.animatedStableLayout != null) {
                canvas.save();
                canvas.translate(measuredWidth, height);
                this.animatedStableLayout.draw(canvas);
                canvas.restore();
            }
            for (int i = 0; i < this.animatedLayouts.size(); i++) {
                AnimatedLayout animatedLayout = this.animatedLayouts.get(i);
                canvas.save();
                if (animatedLayout.direction) {
                    canvas.translate(animatedLayout.f1109x + measuredWidth, (height - ((measuredHeight * 10) * animatedLayout.progress)) + ((10 - animatedLayout.staticLayouts.size()) * measuredHeight));
                    for (int i2 = 0; i2 < animatedLayout.staticLayouts.size(); i2++) {
                        canvas.translate(0.0f, measuredHeight);
                        animatedLayout.staticLayouts.get(i2).draw(canvas);
                    }
                } else {
                    canvas.translate(animatedLayout.f1109x + measuredWidth, (((measuredHeight * 10) * animatedLayout.progress) + height) - ((10 - animatedLayout.staticLayouts.size()) * measuredHeight));
                    for (int i3 = 0; i3 < animatedLayout.staticLayouts.size(); i3++) {
                        canvas.translate(0.0f, -measuredHeight);
                        animatedLayout.staticLayouts.get(i3).draw(canvas);
                    }
                }
                canvas.restore();
            }
            canvas.restore();
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
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.text);
            boolean z = true;
            int i = 0;
            for (int i2 = 0; i2 < this.text.length(); i2++) {
                if (Character.isDigit(this.text.charAt(i2))) {
                    AnimatedLayout animatedLayout = new AnimatedLayout();
                    this.animatedLayouts.add(animatedLayout);
                    animatedLayout.f1109x = this.textLayout.getSecondaryHorizontal(i2);
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
            this.animatedStableLayout = new StaticLayout(spannableStringBuilder, this.textPaint, AndroidUtilities.m35dp(12.0f) + ((int) this.textWidth), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            for (int i4 = 0; i4 < this.animatedLayouts.size(); i4++) {
                this.animationInProgress = true;
                final AnimatedLayout animatedLayout2 = this.animatedLayouts.get(i4);
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

        public void lambda$createAnimationLayouts$0(AnimatedLayout animatedLayout, ValueAnimator valueAnimator) {
            animatedLayout.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidate();
        }

        public void checkAnimationComplete() {
            for (int i = 0; i < this.animatedLayouts.size(); i++) {
                if (this.animatedLayouts.get(i).valueAnimator != null) {
                    return;
                }
            }
            this.animatedLayouts.clear();
            this.animationInProgress = false;
            invalidate();
        }

        public void setText(CharSequence charSequence) {
            this.text = charSequence;
        }

        public void setArrowCenter(float f) {
            if (this.arrowCenter != f) {
                this.arrowCenter = f;
                this.invalidatePath = true;
                invalidate();
            }
        }

        public class AnimatedLayout {
            public boolean direction;
            float progress;
            ArrayList<StaticLayout> staticLayouts;
            ValueAnimator valueAnimator;
            float f1109x;

            private AnimatedLayout(CounterView counterView) {
                this.staticLayouts = new ArrayList<>();
            }
        }
    }
}
