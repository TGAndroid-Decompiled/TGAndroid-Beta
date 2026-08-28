package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class s31 extends xu0 {
    public final t31 A0;
    public final Paint f32353s0;
    public boolean f32354t0;
    public boolean f32355u0;
    public boolean f32356v0;
    public ValueAnimator f32357w0;
    public float f32358x0;
    public final float[] f32359y0;
    public boolean f32360z0;

    public s31(t31 t31Var, Context context) {
        super(context, null);
        int i9;
        int i10;
        this.A0 = t31Var;
        this.f32353s0 = new Paint(1);
        this.f32354t0 = false;
        this.f32355u0 = false;
        this.f32356v0 = false;
        this.f32358x0 = 0.0f;
        this.f32359y0 = new float[8];
        setWillNotDraw(false);
        i9 = ((org.telegram.ui.ActionBar.f3) t31Var).backgroundPaddingLeft;
        i10 = ((org.telegram.ui.ActionBar.f3) t31Var).backgroundPaddingLeft;
        setPadding(i9, 0, i10, 0);
        setDelegate(new r31(this));
    }

    public final float Z() {
        t31 t31Var = this.A0;
        return Math.min(1.0f, Math.max(0.0f, t31Var.f32620f / (t31Var.f32617b * 2.0f)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        Canvas canvas2;
        int themedColor;
        int i9;
        int i10;
        boolean z12;
        float f10;
        float f11;
        t31 t31Var = this.A0;
        h41 h41Var = t31Var.f32619e;
        int i11 = t31Var.f32617b;
        GradientDrawable gradientDrawable = t31Var.f32618c;
        float Z = Z();
        boolean z13 = false;
        if (Z == 0.0f && !t31Var.isDismissed()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f32356v0 != z10) {
            ValueAnimator valueAnimator = this.f32357w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f32356v0 = z10;
            ValueAnimator valueAnimator2 = this.f32357w0;
            if (valueAnimator2 == null) {
                float f12 = this.f32358x0;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
                this.f32357w0 = ofFloat;
                ofFloat.addUpdateListener(new q60(this, 29));
                this.f32357w0.setDuration(200L);
            } else {
                float f13 = this.f32358x0;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                valueAnimator2.setFloatValues(f13, f10);
            }
            this.f32357w0.start();
        }
        if (this.f32358x0 > 0.5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f32360z0 != z11) {
            this.f32360z0 = z11;
            if (AndroidUtilities.computePerceivedBrightness(t31Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5)) > 0.721f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v(t31Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23269s8), 855638016)) > 0.721f) {
                z13 = true;
            }
            if (!z11) {
                z12 = z13;
            }
            AndroidUtilities.setLightStatusBar(t31Var.getWindow(), z12);
        }
        if (this.f32358x0 > 0.0f) {
            int themedColor2 = t31Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5);
            Paint paint = this.f32353s0;
            paint.setColor(themedColor2);
            int max = (int) Math.max(0.0f, h41Var.getTranslationY() + (AndroidUtilities.statusBarHeight - i11) + ((1.0f - Z()) * i11) + t31Var.f32620f + AndroidUtilities.dp(24.0f));
            i9 = ((org.telegram.ui.ActionBar.f3) t31Var).backgroundPaddingLeft;
            int measuredWidth = getMeasuredWidth();
            i10 = ((org.telegram.ui.ActionBar.f3) t31Var).backgroundPaddingLeft;
            float f14 = max;
            canvas2 = canvas;
            canvas2.drawRect(i9, AndroidUtilities.lerp(max, -AndroidUtilities.statusBarHeight, this.f32358x0), measuredWidth - i10, f14, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas2.save();
        canvas2.translate(0.0f, (h41Var.getTranslationY() + AndroidUtilities.statusBarHeight) - i11);
        int dp = AndroidUtilities.dp(36.0f);
        int dp2 = AndroidUtilities.dp(4.0f);
        int i12 = (int) ((1.0f - Z) * dp2 * 2.0f);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(2.0f));
        gradientDrawable.setColor(i0.a.k(t31Var.getThemedColor(org.telegram.ui.ActionBar.f6.Ii), (int) (Color.alpha(themedColor) * Z)));
        gradientDrawable.setBounds((getWidth() - dp) / 2, org.telegram.messenger.l0.C(10.0f, t31Var.f32620f, i12), (getWidth() + dp) / 2, AndroidUtilities.dp(10.0f) + t31Var.f32620f + i12 + dp2);
        gradientDrawable.draw(canvas2);
        canvas2.restore();
    }

    @Override
    public final float getTranslationY() {
        return this.A0.f32619e.getTranslationY();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AndroidUtilities.runOnUIThread(new tp0(this, 25), 200L);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        int i9;
        int i10;
        Drawable drawable2;
        int i11;
        int i12;
        t31 t31Var = this.A0;
        GradientDrawable gradientDrawable = t31Var.f32618c;
        t31.m(t31Var);
        super.onDraw(canvas);
        float Z = Z();
        int i13 = t31Var.f32617b;
        int i14 = (int) ((1.0f - Z) * i13);
        int i15 = AndroidUtilities.statusBarHeight - i13;
        canvas.save();
        canvas.translate(0.0f, t31Var.f32619e.getTranslationY() + i15);
        drawable = ((org.telegram.ui.ActionBar.f3) t31Var).shadowDrawable;
        int i16 = t31Var.f32620f;
        i9 = ((org.telegram.ui.ActionBar.f3) t31Var).backgroundPaddingTop;
        int i17 = (i16 - i9) + i14;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (i15 < 0) {
            i10 = -i15;
        } else {
            i10 = 0;
        }
        drawable.setBounds(0, i17, measuredWidth, measuredHeight + i10);
        drawable2 = ((org.telegram.ui.ActionBar.f3) t31Var).shadowDrawable;
        drawable2.draw(canvas);
        if (Z > 0.0f && Z < 1.0f) {
            float dp = AndroidUtilities.dp(12.0f) * Z;
            gradientDrawable.setColor(t31Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5));
            float[] fArr = this.f32359y0;
            fArr[3] = dp;
            fArr[2] = dp;
            fArr[1] = dp;
            fArr[0] = dp;
            gradientDrawable.setCornerRadii(fArr);
            i11 = ((org.telegram.ui.ActionBar.f3) t31Var).backgroundPaddingLeft;
            int width = getWidth();
            i12 = ((org.telegram.ui.ActionBar.f3) t31Var).backgroundPaddingLeft;
            gradientDrawable.setBounds(i11, t31Var.f32620f + i14, width - i12, AndroidUtilities.dp(24.0f) + t31Var.f32620f + i14);
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            t31 t31Var = this.A0;
            if (t31Var.f32620f != 0 && motionEvent.getY() < t31Var.f32620f) {
                t31Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        t31 t31Var = this.A0;
        h41 h41Var = t31Var.f32619e;
        int i15 = AndroidUtilities.statusBarHeight;
        int R = R();
        int size = (int) (((View.MeasureSpec.getSize(getMeasuredHeight()) - i15) + R) * 0.2f);
        this.f32355u0 = true;
        if (R > AndroidUtilities.dp(20.0f)) {
            h41Var.a(true);
            t31Var.setAllowNestedScroll(false);
            this.f32354t0 = true;
        } else {
            h41Var.a(false);
            t31Var.setAllowNestedScroll(true);
            this.f32354t0 = false;
        }
        h41Var.setContentViewPaddingTop(size);
        if (getPaddingTop() != i15) {
            i13 = ((org.telegram.ui.ActionBar.f3) t31Var).backgroundPaddingLeft;
            i14 = ((org.telegram.ui.ActionBar.f3) t31Var).backgroundPaddingLeft;
            setPadding(i13, i15, i14, 0);
        }
        this.f32355u0 = false;
        super.onLayout(z10, i9, i10, i11, i12);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.A0.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (!this.f32355u0) {
            super.requestLayout();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        this.A0.f32619e.setTranslationY(f10);
        invalidate();
    }
}
