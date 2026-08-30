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
public final class p41 extends qv0 {
    public boolean A0;
    public final q41 B0;
    public final Paint f27732t0;
    public boolean f27733u0;
    public boolean f27734v0;
    public boolean f27735w0;
    public ValueAnimator f27736x0;
    public float f27737y0;
    public final float[] f27738z0;

    public p41(q41 q41Var, Context context) {
        super(context, null);
        int i10;
        int i11;
        this.B0 = q41Var;
        this.f27732t0 = new Paint(1);
        this.f27733u0 = false;
        this.f27734v0 = false;
        this.f27735w0 = false;
        this.f27737y0 = 0.0f;
        this.f27738z0 = new float[8];
        setWillNotDraw(false);
        i10 = ((org.telegram.ui.ActionBar.g3) q41Var).backgroundPaddingLeft;
        i11 = ((org.telegram.ui.ActionBar.g3) q41Var).backgroundPaddingLeft;
        setPadding(i10, 0, i11, 0);
        setDelegate(new o41(this));
    }

    public final float Z() {
        q41 q41Var = this.B0;
        return Math.min(1.0f, Math.max(0.0f, q41Var.f28057f / (q41Var.f28055b * 2.0f)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z4;
        boolean z10;
        Canvas canvas2;
        int themedColor;
        int i10;
        int i11;
        boolean z11;
        float f10;
        float f11;
        q41 q41Var = this.B0;
        e51 e51Var = q41Var.e;
        int i12 = q41Var.f28055b;
        GradientDrawable gradientDrawable = q41Var.f28056c;
        float Z = Z();
        boolean z12 = false;
        if (Z == 0.0f && !q41Var.isDismissed()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f27735w0 != z4) {
            ValueAnimator valueAnimator = this.f27736x0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f27735w0 = z4;
            ValueAnimator valueAnimator2 = this.f27736x0;
            if (valueAnimator2 == null) {
                float f12 = this.f27737y0;
                if (z4) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
                this.f27736x0 = ofFloat;
                ofFloat.addUpdateListener(new i70(this, 29));
                this.f27736x0.setDuration(200L);
            } else {
                float f13 = this.f27737y0;
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                valueAnimator2.setFloatValues(f13, f10);
            }
            this.f27736x0.start();
        }
        if (this.f27737y0 > 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.A0 != z10) {
            this.A0 = z10;
            if (AndroidUtilities.computePerceivedBrightness(q41Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19977h5)) > 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v(q41Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20176s8), 855638016)) > 0.721f) {
                z12 = true;
            }
            if (!z10) {
                z11 = z12;
            }
            AndroidUtilities.setLightStatusBar(q41Var.getWindow(), z11);
        }
        if (this.f27737y0 > 0.0f) {
            int themedColor2 = q41Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19977h5);
            Paint paint = this.f27732t0;
            paint.setColor(themedColor2);
            int max = (int) Math.max(0.0f, e51Var.getTranslationY() + (AndroidUtilities.statusBarHeight - i12) + ((1.0f - Z()) * i12) + q41Var.f28057f + AndroidUtilities.dp(24.0f));
            i10 = ((org.telegram.ui.ActionBar.g3) q41Var).backgroundPaddingLeft;
            int measuredWidth = getMeasuredWidth();
            i11 = ((org.telegram.ui.ActionBar.g3) q41Var).backgroundPaddingLeft;
            float f14 = max;
            canvas2 = canvas;
            canvas2.drawRect(i10, AndroidUtilities.lerp(max, -AndroidUtilities.statusBarHeight, this.f27737y0), measuredWidth - i11, f14, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas2.save();
        canvas2.translate(0.0f, (e51Var.getTranslationY() + AndroidUtilities.statusBarHeight) - i12);
        int dp = AndroidUtilities.dp(36.0f);
        int dp2 = AndroidUtilities.dp(4.0f);
        int i13 = (int) ((1.0f - Z) * dp2 * 2.0f);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(2.0f));
        gradientDrawable.setColor(i0.a.k(q41Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ii), (int) (Color.alpha(themedColor) * Z)));
        gradientDrawable.setBounds((getWidth() - dp) / 2, org.telegram.messenger.y3.C(10.0f, q41Var.f28057f, i13), (getWidth() + dp) / 2, AndroidUtilities.dp(10.0f) + q41Var.f28057f + i13 + dp2);
        gradientDrawable.draw(canvas2);
        canvas2.restore();
    }

    @Override
    public final float getTranslationY() {
        return this.B0.e.getTranslationY();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AndroidUtilities.runOnUIThread(new nq0(this, 25), 200L);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        int i10;
        int i11;
        Drawable drawable2;
        int i12;
        int i13;
        q41 q41Var = this.B0;
        GradientDrawable gradientDrawable = q41Var.f28056c;
        q41.m(q41Var);
        super.onDraw(canvas);
        float Z = Z();
        int i14 = q41Var.f28055b;
        int i15 = (int) ((1.0f - Z) * i14);
        int i16 = AndroidUtilities.statusBarHeight - i14;
        canvas.save();
        canvas.translate(0.0f, q41Var.e.getTranslationY() + i16);
        drawable = ((org.telegram.ui.ActionBar.g3) q41Var).shadowDrawable;
        int i17 = q41Var.f28057f;
        i10 = ((org.telegram.ui.ActionBar.g3) q41Var).backgroundPaddingTop;
        int i18 = (i17 - i10) + i15;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (i16 < 0) {
            i11 = -i16;
        } else {
            i11 = 0;
        }
        drawable.setBounds(0, i18, measuredWidth, measuredHeight + i11);
        drawable2 = ((org.telegram.ui.ActionBar.g3) q41Var).shadowDrawable;
        drawable2.draw(canvas);
        if (Z > 0.0f && Z < 1.0f) {
            float dp = AndroidUtilities.dp(12.0f) * Z;
            gradientDrawable.setColor(q41Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19977h5));
            float[] fArr = this.f27738z0;
            fArr[3] = dp;
            fArr[2] = dp;
            fArr[1] = dp;
            fArr[0] = dp;
            gradientDrawable.setCornerRadii(fArr);
            i12 = ((org.telegram.ui.ActionBar.g3) q41Var).backgroundPaddingLeft;
            int width = getWidth();
            i13 = ((org.telegram.ui.ActionBar.g3) q41Var).backgroundPaddingLeft;
            gradientDrawable.setBounds(i12, q41Var.f28057f + i15, width - i13, AndroidUtilities.dp(24.0f) + q41Var.f28057f + i15);
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            q41 q41Var = this.B0;
            if (q41Var.f28057f != 0 && motionEvent.getY() < q41Var.f28057f) {
                q41Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        q41 q41Var = this.B0;
        e51 e51Var = q41Var.e;
        int i16 = AndroidUtilities.statusBarHeight;
        int R = R();
        int size = (int) (((View.MeasureSpec.getSize(getMeasuredHeight()) - i16) + R) * 0.2f);
        this.f27734v0 = true;
        if (R > AndroidUtilities.dp(20.0f)) {
            e51Var.a(true);
            q41Var.setAllowNestedScroll(false);
            this.f27733u0 = true;
        } else {
            e51Var.a(false);
            q41Var.setAllowNestedScroll(true);
            this.f27733u0 = false;
        }
        e51Var.setContentViewPaddingTop(size);
        if (getPaddingTop() != i16) {
            i14 = ((org.telegram.ui.ActionBar.g3) q41Var).backgroundPaddingLeft;
            i15 = ((org.telegram.ui.ActionBar.g3) q41Var).backgroundPaddingLeft;
            setPadding(i14, i16, i15, 0);
        }
        this.f27734v0 = false;
        super.onLayout(z4, i10, i11, i12, i13);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.B0.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (!this.f27734v0) {
            super.requestLayout();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        this.B0.e.setTranslationY(f10);
        invalidate();
    }
}
