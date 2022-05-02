package org.telegram.p009ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.CounterView;

public class CounterView extends View {
    public CounterDrawable counterDrawable;
    private final Theme.ResourcesProvider resourcesProvider;

    public CounterView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        setVisibility(8);
        CounterDrawable counterDrawable = new CounterDrawable(this, true, resourcesProvider);
        this.counterDrawable = counterDrawable;
        counterDrawable.updateVisibility = true;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.counterDrawable.setSize(getMeasuredHeight(), getMeasuredWidth());
    }

    @Override
    protected void onDraw(Canvas canvas) {
        this.counterDrawable.draw(canvas);
    }

    public void setColors(String str, String str2) {
        this.counterDrawable.textColorKey = str;
        this.counterDrawable.circleColorKey = str2;
    }

    public void setGravity(int i) {
        this.counterDrawable.gravity = i;
    }

    public void setReverse(boolean z) {
        this.counterDrawable.reverseAnimation = z;
    }

    public void setCount(int i, boolean z) {
        this.counterDrawable.setCount(i, z);
    }

    public static class CounterDrawable {
        public boolean addServiceGradient;
        private int circleColor;
        public Paint circlePaint;
        private StaticLayout countAnimationInLayout;
        private boolean countAnimationIncrement;
        private StaticLayout countAnimationStableLayout;
        private ValueAnimator countAnimator;
        private StaticLayout countLayout;
        float countLeft;
        private StaticLayout countOldLayout;
        private int countWidth;
        private int countWidthOld;
        int currentCount;
        private boolean drawBackground;
        public float horizontalPadding;
        int lastH;
        private View parent;
        private final Theme.ResourcesProvider resourcesProvider;
        private boolean reverseAnimation;
        public boolean shortFormat;
        private int textColor;
        public boolean updateVisibility;
        int width;
        float f1030x;
        int animationType = -1;
        public TextPaint textPaint = new TextPaint(1);
        public RectF rectF = new RectF();
        public float countChangeProgress = 1.0f;
        private String textColorKey = "chat_goDownButtonCounter";
        private String circleColorKey = "chat_goDownButtonCounterBackground";
        public int gravity = 17;
        int type = 0;

        public CounterDrawable(View view, boolean z, Theme.ResourcesProvider resourcesProvider) {
            this.drawBackground = true;
            this.parent = view;
            this.resourcesProvider = resourcesProvider;
            this.drawBackground = z;
            if (z) {
                Paint paint = new Paint(1);
                this.circlePaint = paint;
                paint.setColor(-16777216);
            }
            this.textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
            this.textPaint.setTextSize(AndroidUtilities.m34dp(13.0f));
        }

        public void setSize(int i, int i2) {
            if (i != this.lastH) {
                int i3 = this.currentCount;
                this.currentCount = -1;
                setCount(i3, this.animationType == 0);
                this.lastH = i;
            }
            this.width = i2;
        }

        private void drawInternal(Canvas canvas) {
            float dp = (this.lastH - AndroidUtilities.m34dp(23.0f)) / 2.0f;
            updateX(this.countWidth);
            RectF rectF = this.rectF;
            float f = this.f1030x;
            rectF.set(f, dp, this.countWidth + f + AndroidUtilities.m34dp(11.0f), AndroidUtilities.m34dp(23.0f) + dp);
            Paint paint = this.circlePaint;
            if (paint != null && this.drawBackground) {
                RectF rectF2 = this.rectF;
                float f2 = AndroidUtilities.density;
                canvas.drawRoundRect(rectF2, f2 * 11.5f, f2 * 11.5f, paint);
                if (this.addServiceGradient && Theme.hasGradientService()) {
                    RectF rectF3 = this.rectF;
                    float f3 = AndroidUtilities.density;
                    canvas.drawRoundRect(rectF3, f3 * 11.5f, f3 * 11.5f, Theme.chat_actionBackgroundGradientDarkenPaint);
                }
            }
            if (this.countLayout != null) {
                canvas.save();
                canvas.translate(this.countLeft, dp + AndroidUtilities.m34dp(4.0f));
                this.countLayout.draw(canvas);
                canvas.restore();
            }
        }

        public void setCount(int i, boolean z) {
            View view;
            View view2;
            if (i != this.currentCount) {
                ValueAnimator valueAnimator = this.countAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (i > 0 && this.updateVisibility && (view2 = this.parent) != null) {
                    view2.setVisibility(0);
                }
                boolean z2 = Math.abs(i - this.currentCount) > 99 ? false : z;
                if (!z2) {
                    this.currentCount = i;
                    if (i != 0) {
                        String stringOfCCount = getStringOfCCount(i);
                        this.countWidth = Math.max(AndroidUtilities.m34dp(12.0f), (int) Math.ceil(this.textPaint.measureText(stringOfCCount)));
                        this.countLayout = new StaticLayout(stringOfCCount, this.textPaint, this.countWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        View view3 = this.parent;
                        if (view3 != null) {
                            view3.invalidate();
                        }
                    } else if (this.updateVisibility && (view = this.parent) != null) {
                        view.setVisibility(8);
                        return;
                    } else {
                        return;
                    }
                }
                String stringOfCCount2 = getStringOfCCount(i);
                if (z2) {
                    ValueAnimator valueAnimator2 = this.countAnimator;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    this.countChangeProgress = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.countAnimator = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                            CounterView.CounterDrawable.this.lambda$setCount$0(valueAnimator3);
                        }
                    });
                    this.countAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            CounterDrawable counterDrawable = CounterDrawable.this;
                            counterDrawable.countChangeProgress = 1.0f;
                            counterDrawable.countOldLayout = null;
                            CounterDrawable.this.countAnimationStableLayout = null;
                            CounterDrawable.this.countAnimationInLayout = null;
                            if (CounterDrawable.this.parent != null) {
                                CounterDrawable counterDrawable2 = CounterDrawable.this;
                                if (counterDrawable2.currentCount == 0 && counterDrawable2.updateVisibility) {
                                    counterDrawable2.parent.setVisibility(8);
                                }
                                CounterDrawable.this.parent.invalidate();
                            }
                            CounterDrawable.this.animationType = -1;
                        }
                    });
                    if (this.currentCount <= 0) {
                        this.animationType = 0;
                        this.countAnimator.setDuration(220L);
                        this.countAnimator.setInterpolator(new OvershootInterpolator());
                    } else if (i == 0) {
                        this.animationType = 1;
                        this.countAnimator.setDuration(150L);
                        this.countAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    } else {
                        this.animationType = 2;
                        this.countAnimator.setDuration(430L);
                        this.countAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    }
                    if (this.countLayout != null) {
                        String stringOfCCount3 = getStringOfCCount(this.currentCount);
                        if (stringOfCCount3.length() == stringOfCCount2.length()) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(stringOfCCount3);
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(stringOfCCount2);
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(stringOfCCount2);
                            for (int i2 = 0; i2 < stringOfCCount3.length(); i2++) {
                                if (stringOfCCount3.charAt(i2) == stringOfCCount2.charAt(i2)) {
                                    int i3 = i2 + 1;
                                    spannableStringBuilder.setSpan(new EmptyStubSpan(), i2, i3, 0);
                                    spannableStringBuilder2.setSpan(new EmptyStubSpan(), i2, i3, 0);
                                } else {
                                    spannableStringBuilder3.setSpan(new EmptyStubSpan(), i2, i2 + 1, 0);
                                }
                            }
                            int max = Math.max(AndroidUtilities.m34dp(12.0f), (int) Math.ceil(this.textPaint.measureText(stringOfCCount3)));
                            this.countOldLayout = new StaticLayout(spannableStringBuilder, this.textPaint, max, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            this.countAnimationStableLayout = new StaticLayout(spannableStringBuilder3, this.textPaint, max, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            this.countAnimationInLayout = new StaticLayout(spannableStringBuilder2, this.textPaint, max, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        } else {
                            this.countOldLayout = this.countLayout;
                        }
                    }
                    this.countWidthOld = this.countWidth;
                    this.countAnimationIncrement = i > this.currentCount;
                    this.countAnimator.start();
                }
                if (i > 0) {
                    this.countWidth = Math.max(AndroidUtilities.m34dp(12.0f), (int) Math.ceil(this.textPaint.measureText(stringOfCCount2)));
                    this.countLayout = new StaticLayout(stringOfCCount2, this.textPaint, this.countWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                }
                this.currentCount = i;
                View view4 = this.parent;
                if (view4 != null) {
                    view4.invalidate();
                }
            }
        }

        public void lambda$setCount$0(ValueAnimator valueAnimator) {
            this.countChangeProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            View view = this.parent;
            if (view != null) {
                view.invalidate();
            }
        }

        private String getStringOfCCount(int i) {
            if (this.shortFormat) {
                return AndroidUtilities.formatWholeNumber(i, 0);
            }
            return String.valueOf(i);
        }

        public void draw(Canvas canvas) {
            float f;
            Paint paint;
            float f2;
            int i = this.type;
            boolean z = true;
            if (!(i == 1 || i == 2)) {
                int themedColor = getThemedColor(this.textColorKey);
                int themedColor2 = getThemedColor(this.circleColorKey);
                if (this.textColor != themedColor) {
                    this.textColor = themedColor;
                    this.textPaint.setColor(themedColor);
                }
                Paint paint2 = this.circlePaint;
                if (!(paint2 == null || this.circleColor == themedColor2)) {
                    this.circleColor = themedColor2;
                    paint2.setColor(themedColor2);
                }
            }
            float f3 = this.countChangeProgress;
            if (f3 != 1.0f) {
                int i2 = this.animationType;
                if (i2 == 0 || i2 == 1) {
                    updateX(this.countWidth);
                    float f4 = this.countLeft + (this.countWidth / 2.0f);
                    float f5 = this.lastH / 2.0f;
                    canvas.save();
                    float f6 = this.animationType == 0 ? this.countChangeProgress : 1.0f - this.countChangeProgress;
                    canvas.scale(f6, f6, f4, f5);
                    drawInternal(canvas);
                    canvas.restore();
                    return;
                }
                float f7 = f3 * 2.0f;
                if (f7 > 1.0f) {
                    f7 = 1.0f;
                }
                float dp = (this.lastH - AndroidUtilities.m34dp(23.0f)) / 2.0f;
                int i3 = this.countWidth;
                int i4 = this.countWidthOld;
                float f8 = i3 == i4 ? i3 : (i3 * f7) + (i4 * (1.0f - f7));
                updateX(f8);
                if (this.countAnimationIncrement) {
                    float f9 = this.countChangeProgress;
                    if (f9 <= 0.5f) {
                        f2 = CubicBezierInterpolator.EASE_OUT.getInterpolation(f9 * 2.0f);
                    } else {
                        f2 = CubicBezierInterpolator.EASE_IN.getInterpolation(1.0f - ((f9 - 0.5f) * 2.0f));
                    }
                    f = (f2 * 0.1f) + 1.0f;
                } else {
                    f = 1.0f;
                }
                RectF rectF = this.rectF;
                float f10 = this.f1030x;
                rectF.set(f10, dp, f8 + f10 + AndroidUtilities.m34dp(11.0f), AndroidUtilities.m34dp(23.0f) + dp);
                canvas.save();
                canvas.scale(f, f, this.rectF.centerX(), this.rectF.centerY());
                if (this.drawBackground && (paint = this.circlePaint) != null) {
                    RectF rectF2 = this.rectF;
                    float f11 = AndroidUtilities.density;
                    canvas.drawRoundRect(rectF2, f11 * 11.5f, f11 * 11.5f, paint);
                    if (this.addServiceGradient && Theme.hasGradientService()) {
                        RectF rectF3 = this.rectF;
                        float f12 = AndroidUtilities.density;
                        canvas.drawRoundRect(rectF3, f12 * 11.5f, f12 * 11.5f, Theme.chat_actionBackgroundGradientDarkenPaint);
                    }
                }
                canvas.clipRect(this.rectF);
                if (this.reverseAnimation == this.countAnimationIncrement) {
                    z = false;
                }
                if (this.countAnimationInLayout != null) {
                    canvas.save();
                    float f13 = this.countLeft;
                    float dp2 = AndroidUtilities.m34dp(4.0f) + dp;
                    int dp3 = AndroidUtilities.m34dp(13.0f);
                    if (!z) {
                        dp3 = -dp3;
                    }
                    canvas.translate(f13, dp2 + (dp3 * (1.0f - f7)));
                    this.textPaint.setAlpha((int) (f7 * 255.0f));
                    this.countAnimationInLayout.draw(canvas);
                    canvas.restore();
                } else if (this.countLayout != null) {
                    canvas.save();
                    float f14 = this.countLeft;
                    float dp4 = AndroidUtilities.m34dp(4.0f) + dp;
                    int dp5 = AndroidUtilities.m34dp(13.0f);
                    if (!z) {
                        dp5 = -dp5;
                    }
                    canvas.translate(f14, dp4 + (dp5 * (1.0f - f7)));
                    this.textPaint.setAlpha((int) (f7 * 255.0f));
                    this.countLayout.draw(canvas);
                    canvas.restore();
                }
                if (this.countOldLayout != null) {
                    canvas.save();
                    canvas.translate(this.countLeft, AndroidUtilities.m34dp(4.0f) + dp + ((z ? -AndroidUtilities.m34dp(13.0f) : AndroidUtilities.m34dp(13.0f)) * f7));
                    this.textPaint.setAlpha((int) ((1.0f - f7) * 255.0f));
                    this.countOldLayout.draw(canvas);
                    canvas.restore();
                }
                if (this.countAnimationStableLayout != null) {
                    canvas.save();
                    canvas.translate(this.countLeft, dp + AndroidUtilities.m34dp(4.0f));
                    this.textPaint.setAlpha(255);
                    this.countAnimationStableLayout.draw(canvas);
                    canvas.restore();
                }
                this.textPaint.setAlpha(255);
                canvas.restore();
                return;
            }
            drawInternal(canvas);
        }

        public void updateBackgroundRect() {
            float f = this.countChangeProgress;
            if (f != 1.0f) {
                int i = this.animationType;
                if (i == 0 || i == 1) {
                    updateX(this.countWidth);
                    float dp = (this.lastH - AndroidUtilities.m34dp(23.0f)) / 2.0f;
                    RectF rectF = this.rectF;
                    float f2 = this.f1030x;
                    rectF.set(f2, dp, this.countWidth + f2 + AndroidUtilities.m34dp(11.0f), AndroidUtilities.m34dp(23.0f) + dp);
                    return;
                }
                float f3 = f * 2.0f;
                if (f3 > 1.0f) {
                    f3 = 1.0f;
                }
                float dp2 = (this.lastH - AndroidUtilities.m34dp(23.0f)) / 2.0f;
                int i2 = this.countWidth;
                int i3 = this.countWidthOld;
                float f4 = i2 == i3 ? i2 : (i2 * f3) + (i3 * (1.0f - f3));
                updateX(f4);
                RectF rectF2 = this.rectF;
                float f5 = this.f1030x;
                rectF2.set(f5, dp2, f4 + f5 + AndroidUtilities.m34dp(11.0f), AndroidUtilities.m34dp(23.0f) + dp2);
                return;
            }
            updateX(this.countWidth);
            float dp3 = (this.lastH - AndroidUtilities.m34dp(23.0f)) / 2.0f;
            RectF rectF3 = this.rectF;
            float f6 = this.f1030x;
            rectF3.set(f6, dp3, this.countWidth + f6 + AndroidUtilities.m34dp(11.0f), AndroidUtilities.m34dp(23.0f) + dp3);
        }

        private void updateX(float f) {
            float dp = this.drawBackground ? AndroidUtilities.m34dp(5.5f) : 0.0f;
            int i = this.gravity;
            if (i == 5) {
                float f2 = this.width - dp;
                this.countLeft = f2;
                float f3 = this.horizontalPadding;
                if (f3 != 0.0f) {
                    this.countLeft = f2 - Math.max(f3 + (f / 2.0f), f);
                } else {
                    this.countLeft = f2 - f;
                }
            } else if (i == 3) {
                this.countLeft = dp;
            } else {
                this.countLeft = (int) ((this.width - f) / 2.0f);
            }
            this.f1030x = this.countLeft - dp;
        }

        public float getCenterX() {
            updateX(this.countWidth);
            return this.countLeft + (this.countWidth / 2.0f);
        }

        public void setType(int i) {
            this.type = i;
        }

        public void setParent(View view) {
            this.parent = view;
        }

        private int getThemedColor(String str) {
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
            return color != null ? color.intValue() : Theme.getColor(str);
        }
    }

    public float getEnterProgress() {
        int i;
        CounterDrawable counterDrawable = this.counterDrawable;
        float f = counterDrawable.countChangeProgress;
        return (f == 1.0f || !((i = counterDrawable.animationType) == 0 || i == 1)) ? counterDrawable.currentCount == 0 ? 0.0f : 1.0f : i == 0 ? f : 1.0f - f;
    }

    public boolean isInOutAnimation() {
        int i = this.counterDrawable.animationType;
        return i == 0 || i == 1;
    }
}
