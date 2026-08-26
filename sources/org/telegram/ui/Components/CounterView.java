package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.DiffUtil;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.CountrySelectActivity;

public final class CounterView extends View {
    public final CounterDrawable counterDrawable;

    public final class CounterDrawable {
        public boolean addServiceGradient;
        public int circleColor;
        public Paint circlePaint;
        public StaticLayout countAnimationInLayout;
        public boolean countAnimationIncrement;
        public StaticLayout countAnimationStableLayout;
        public ValueAnimator countAnimator;
        public StaticLayout countLayout;
        public float countLayoutWidth;
        public float countLeft;
        public StaticLayout countOldLayout;
        public int countWidth;
        public int countWidthOld;
        public int currentCount;
        public String currentText;
        public final boolean drawBackground;
        public float horizontalPadding;
        public int lastH;
        public View parent;
        public final Theme.ResourcesProvider resourcesProvider;
        public boolean reverseAnimation;
        public boolean shortFormat;
        public int textColor;
        public boolean updateVisibility;
        public int width;
        public float x;
        public float circleScale = 1.0f;
        public int animationType = -1;
        public TextPaint textPaint = new TextPaint(1);
        public final RectF rectF = new RectF();
        public float countChangeProgress = 1.0f;
        public int textColorKey = Theme.key_chat_goDownButtonCounter;
        public int circleColorKey = Theme.key_chat_goDownButtonCounterBackground;
        public int gravity = 17;
        public final float radius = 11.5f;
        public int type = 0;

        public CounterDrawable(View view, boolean z, Theme.ResourcesProvider resourcesProvider) {
            this.parent = view;
            this.resourcesProvider = resourcesProvider;
            this.drawBackground = z;
            if (z) {
                Paint paint = new Paint(1);
                this.circlePaint = paint;
                paint.setColor(-16777216);
            }
            this.textPaint.setTypeface(AndroidUtilities.bold());
            this.textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        }

        public final void draw(Canvas canvas) {
            float interpolation;
            boolean z;
            Paint paint;
            int i = this.type;
            if (i != 1 && i != 2) {
                int i2 = this.textColorKey;
                Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
                int color = Theme.getColor(i2, resourcesProvider);
                int color2 = Theme.getColor(this.circleColorKey, resourcesProvider);
                if (this.textColor != color) {
                    this.textColor = color;
                    this.textPaint.setColor(color);
                }
                Paint paint2 = this.circlePaint;
                if (paint2 != null && this.circleColor != color2) {
                    this.circleColor = color2;
                    paint2.setColor(color2);
                }
            }
            float f = this.countChangeProgress;
            if (f == 1.0f) {
                drawInternal(canvas);
                return;
            }
            int i3 = this.animationType;
            if (i3 == 0 || i3 == 1) {
                updateX(this.countWidth);
                float f2 = (this.countWidth / 2.0f) + this.countLeft;
                float f3 = this.lastH / 2.0f;
                canvas.save();
                float f4 = this.animationType == 0 ? this.countChangeProgress : 1.0f - this.countChangeProgress;
                canvas.scale(f4, f4, f2, f3);
                drawInternal(canvas);
                canvas.restore();
                return;
            }
            float f5 = f * 2.0f;
            if (f5 > 1.0f) {
                f5 = 1.0f;
            }
            int i4 = this.lastH;
            float f6 = this.radius;
            float f7 = f6 * 2.0f;
            float fDp = (i4 - AndroidUtilities.dp(f7)) / 2.0f;
            int i5 = this.countWidth;
            int i6 = this.countWidthOld;
            float fM = i5 == i6 ? i5 : DiffUtil.m(1.0f, f5, i6, i5 * f5);
            updateX(fM);
            if (this.countAnimationIncrement) {
                float f8 = this.countChangeProgress;
                interpolation = ((f8 <= 0.5f ? CubicBezierInterpolator.EASE_OUT.getInterpolation(f8 * 2.0f) : CubicBezierInterpolator.EASE_IN.getInterpolation(1.0f - ((f8 - 0.5f) * 2.0f))) * 0.1f) + 1.0f;
            } else {
                interpolation = 1.0f;
            }
            RectF rectF = this.rectF;
            float f9 = this.x;
            rectF.set(f9, fDp, fM + f9 + AndroidUtilities.dp(f6 - 0.5f), AndroidUtilities.dp(f7) + fDp);
            canvas.save();
            canvas.scale(interpolation, interpolation, rectF.centerX(), rectF.centerY());
            if (this.circleScale != 1.0f) {
                canvas.save();
                float f10 = this.circleScale;
                canvas.scale(f10, f10, rectF.centerX(), rectF.centerY());
                z = true;
            } else {
                z = false;
            }
            if (this.drawBackground && (paint = this.circlePaint) != null) {
                float f11 = AndroidUtilities.density * f6;
                canvas.drawRoundRect(rectF, f11, f11, paint);
                if (this.addServiceGradient && Theme.hasGradientService()) {
                    float f12 = f6 * AndroidUtilities.density;
                    canvas.drawRoundRect(rectF, f12, f12, Theme.chat_actionBackgroundGradientDarkenPaint);
                }
            }
            if (z) {
                canvas.restore();
            }
            canvas.clipRect(rectF);
            boolean z2 = this.reverseAnimation != this.countAnimationIncrement;
            if (this.countAnimationInLayout != null) {
                canvas.save();
                float f13 = this.countLeft;
                float fDp2 = AndroidUtilities.dp(4.0f) + fDp;
                int iDp = AndroidUtilities.dp(13.0f);
                if (!z2) {
                    iDp = -iDp;
                }
                canvas.translate(f13, DiffUtil.m(1.0f, f5, iDp, fDp2));
                this.textPaint.setAlpha((int) (f5 * 255.0f));
                this.countAnimationInLayout.draw(canvas);
                canvas.restore();
            } else if (this.countLayout != null) {
                canvas.save();
                float f14 = this.countLeft;
                float fDp3 = AndroidUtilities.dp(4.0f) + fDp;
                int iDp2 = AndroidUtilities.dp(13.0f);
                if (!z2) {
                    iDp2 = -iDp2;
                }
                canvas.translate(f14, DiffUtil.m(1.0f, f5, iDp2, fDp3));
                this.textPaint.setAlpha((int) (f5 * 255.0f));
                this.countLayout.draw(canvas);
                canvas.restore();
            }
            if (this.countOldLayout != null) {
                canvas.save();
                canvas.translate(this.countLeft, ((z2 ? -AndroidUtilities.dp(13.0f) : AndroidUtilities.dp(13.0f)) * f5) + AndroidUtilities.dp(4.0f) + fDp);
                this.textPaint.setAlpha((int) ((1.0f - f5) * 255.0f));
                this.countOldLayout.draw(canvas);
                canvas.restore();
            }
            if (this.countAnimationStableLayout != null) {
                canvas.save();
                canvas.translate(this.countLeft, fDp + AndroidUtilities.dp(4.0f));
                this.textPaint.setAlpha(255);
                this.countAnimationStableLayout.draw(canvas);
                canvas.restore();
            }
            this.textPaint.setAlpha(255);
            canvas.restore();
        }

        public final void drawInternal(Canvas canvas) {
            boolean z;
            float f = this.radius;
            float f2 = f * 2.0f;
            float fDp = (this.lastH - AndroidUtilities.dp(f2)) / 2.0f;
            updateX(this.countWidth);
            RectF rectF = this.rectF;
            float f3 = this.x;
            rectF.set(f3, fDp, this.countWidth + f3 + AndroidUtilities.dp(f - 0.5f), AndroidUtilities.dp(f2) + fDp);
            if (this.circlePaint != null && this.drawBackground) {
                if (this.circleScale != 1.0f) {
                    canvas.save();
                    float f4 = this.circleScale;
                    canvas.scale(f4, f4, rectF.centerX(), rectF.centerY());
                    z = true;
                } else {
                    z = false;
                }
                float f5 = AndroidUtilities.density * f;
                canvas.drawRoundRect(rectF, f5, f5, this.circlePaint);
                if (this.addServiceGradient && Theme.hasGradientService()) {
                    float f6 = f * AndroidUtilities.density;
                    canvas.drawRoundRect(rectF, f6, f6, Theme.chat_actionBackgroundGradientDarkenPaint);
                }
                if (z) {
                    canvas.restore();
                }
            }
            if (this.countLayout != null) {
                canvas.save();
                canvas.translate(this.countLeft, fDp + AndroidUtilities.dp(4.0f));
                this.countLayout.draw(canvas);
                canvas.restore();
            }
        }

        public final void setCount(int i, boolean z) {
            View view;
            View view2;
            boolean z2 = false;
            String wholeNumber = this.shortFormat ? AndroidUtilities.formatWholeNumber(i, 0) : String.valueOf(i);
            if (TextUtils.equals(wholeNumber, this.currentText)) {
                return;
            }
            ValueAnimator valueAnimator = this.countAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (i > 0 && this.updateVisibility && (view2 = this.parent) != null) {
                view2.setVisibility(0);
            }
            boolean z3 = Math.abs(i - this.currentCount) > 99 ? false : z;
            if (!z3) {
                this.currentCount = i;
                this.currentText = wholeNumber;
                if (i == 0) {
                    if (!this.updateVisibility || (view = this.parent) == null) {
                        return;
                    }
                    view.setVisibility(8);
                    return;
                }
                this.countWidth = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.textPaint.measureText(wholeNumber.toString())));
                StaticLayout staticLayout = new StaticLayout(wholeNumber, this.textPaint, this.countWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.countLayout = staticLayout;
                this.countLayoutWidth = staticLayout.getLineCount() >= 1 ? this.countLayout.getLineWidth(0) : 0.0f;
                View view3 = this.parent;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
            }
            if (z3) {
                ValueAnimator valueAnimator2 = this.countAnimator;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.countChangeProgress = 0.0f;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.countAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda4(this, 3));
                this.countAnimator.addListener(new CheckBox.AnonymousClass1(this, 23));
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
                    String str = this.currentText;
                    if (str.length() == wholeNumber.length()) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(wholeNumber);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(wholeNumber);
                        for (int i2 = 0; i2 < str.length(); i2++) {
                            if (str.charAt(i2) == wholeNumber.charAt(i2)) {
                                int i3 = i2 + 1;
                                spannableStringBuilder.setSpan(new CountrySelectActivity.AnonymousClass5(z2), i2, i3, 0);
                                spannableStringBuilder2.setSpan(new CountrySelectActivity.AnonymousClass5(z2), i2, i3, 0);
                            } else {
                                spannableStringBuilder3.setSpan(new CountrySelectActivity.AnonymousClass5(z2), i2, i2 + 1, 0);
                            }
                        }
                        int iMax = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.textPaint.measureText(str.toString())));
                        TextPaint textPaint = this.textPaint;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        this.countOldLayout = new StaticLayout(spannableStringBuilder, textPaint, iMax, alignment, 1.0f, 0.0f, false);
                        this.countAnimationStableLayout = new StaticLayout(spannableStringBuilder3, this.textPaint, iMax, alignment, 1.0f, 0.0f, false);
                        this.countAnimationInLayout = new StaticLayout(spannableStringBuilder2, this.textPaint, iMax, alignment, 1.0f, 0.0f, false);
                    } else {
                        this.countOldLayout = this.countLayout;
                    }
                }
                this.countWidthOld = this.countWidth;
                this.countAnimationIncrement = i > this.currentCount;
                this.countAnimator.start();
            }
            if (i > 0) {
                this.countWidth = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.textPaint.measureText(wholeNumber.toString())));
                StaticLayout staticLayout2 = new StaticLayout(wholeNumber, this.textPaint, this.countWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.countLayout = staticLayout2;
                this.countLayoutWidth = staticLayout2.getLineCount() >= 1 ? this.countLayout.getLineWidth(0) : 0.0f;
            }
            this.currentCount = i;
            this.currentText = wholeNumber;
            View view4 = this.parent;
            if (view4 != null) {
                view4.invalidate();
            }
        }

        public final void setSize(int i, int i2) {
            if (i != this.lastH) {
                int i3 = this.currentCount;
                this.currentCount = -1;
                setCount(i3, this.animationType == 0);
                this.lastH = i;
            }
            this.width = i2;
        }

        public final void updateX(float f) {
            float fDp = this.drawBackground ? AndroidUtilities.dp(5.5f) : 0.0f;
            int i = this.gravity;
            if (i == 5) {
                float f2 = this.width - fDp;
                this.countLeft = f2;
                float f3 = this.horizontalPadding;
                if (f3 != 0.0f) {
                    this.countLeft = f2 - Math.max((f / 2.0f) + f3, f);
                } else {
                    this.countLeft = f2 - f;
                }
            } else if (i == 3) {
                this.countLeft = fDp;
            } else {
                this.countLeft = (int) ((this.width - f) / 2.0f);
            }
            this.x = this.countLeft - fDp;
        }
    }

    public CounterView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        setVisibility(8);
        CounterDrawable counterDrawable = new CounterDrawable(this, true, resourcesProvider);
        this.counterDrawable = counterDrawable;
        counterDrawable.updateVisibility = true;
    }

    public float getEnterProgress() {
        int i;
        CounterDrawable counterDrawable = this.counterDrawable;
        float f = counterDrawable.countChangeProgress;
        if (f == 1.0f || !((i = counterDrawable.animationType) == 0 || i == 1)) {
            return counterDrawable.currentCount == 0 ? 0.0f : 1.0f;
        }
        return i == 0 ? f : 1.0f - f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.counterDrawable.draw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.counterDrawable.setSize(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i) {
        this.counterDrawable.gravity = i;
    }

    public void setReverse(boolean z) {
        this.counterDrawable.reverseAnimation = z;
    }
}
