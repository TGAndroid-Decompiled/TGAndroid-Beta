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
public final class o41 extends ov0 {
    public ValueAnimator A0;
    public float B0;
    public final float[] C0;
    public boolean D0;
    public final p41 E0;
    public final Paint f28953w0;
    public boolean f28954x0;
    public boolean f28955y0;
    public boolean f28956z0;

    public o41(p41 p41Var, Context context) {
        super(context, null);
        int i10;
        int i11;
        this.E0 = p41Var;
        this.f28953w0 = new Paint(1);
        this.f28954x0 = false;
        this.f28955y0 = false;
        this.f28956z0 = false;
        this.B0 = 0.0f;
        this.C0 = new float[8];
        setWillNotDraw(false);
        i10 = ((org.telegram.ui.ActionBar.f3) p41Var).backgroundPaddingLeft;
        i11 = ((org.telegram.ui.ActionBar.f3) p41Var).backgroundPaddingLeft;
        setPadding(i10, 0, i11, 0);
        setDelegate(new n41(this));
    }

    public final float Z() {
        p41 p41Var = this.E0;
        return Math.min(1.0f, Math.max(0.0f, p41Var.f29275f / (p41Var.f29272b * 2.0f)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        Canvas canvas2;
        int themedColor;
        int i10;
        int i11;
        boolean z12;
        float f7;
        float f10;
        p41 p41Var = this.E0;
        d51 d51Var = p41Var.f29274e;
        int i12 = p41Var.f29272b;
        GradientDrawable gradientDrawable = p41Var.f29273c;
        float Z = Z();
        boolean z13 = false;
        if (Z == 0.0f && !p41Var.isDismissed()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f28956z0 != z10) {
            ValueAnimator valueAnimator = this.A0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f28956z0 = z10;
            ValueAnimator valueAnimator2 = this.A0;
            if (valueAnimator2 == null) {
                float f11 = this.B0;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                this.A0 = ofFloat;
                ofFloat.addUpdateListener(new h70(this, 29));
                this.A0.setDuration(200L);
            } else {
                float f12 = this.B0;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                valueAnimator2.setFloatValues(f12, f7);
            }
            this.A0.start();
        }
        if (this.B0 > 0.5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.D0 != z11) {
            this.D0 = z11;
            if (AndroidUtilities.computePerceivedBrightness(p41Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20734h5)) > 0.721f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v(p41Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20937s8), 855638016)) > 0.721f) {
                z13 = true;
            }
            if (!z11) {
                z12 = z13;
            }
            AndroidUtilities.setLightStatusBar(p41Var.getWindow(), z12);
        }
        if (this.B0 > 0.0f) {
            int themedColor2 = p41Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20734h5);
            Paint paint = this.f28953w0;
            paint.setColor(themedColor2);
            int max = (int) Math.max(0.0f, d51Var.getTranslationY() + (AndroidUtilities.statusBarHeight - i12) + ((1.0f - Z()) * i12) + p41Var.f29275f + AndroidUtilities.dp(24.0f));
            i10 = ((org.telegram.ui.ActionBar.f3) p41Var).backgroundPaddingLeft;
            int measuredWidth = getMeasuredWidth();
            i11 = ((org.telegram.ui.ActionBar.f3) p41Var).backgroundPaddingLeft;
            float f13 = max;
            canvas2 = canvas;
            canvas2.drawRect(i10, AndroidUtilities.lerp(max, -AndroidUtilities.statusBarHeight, this.B0), measuredWidth - i11, f13, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas2.save();
        canvas2.translate(0.0f, (d51Var.getTranslationY() + AndroidUtilities.statusBarHeight) - i12);
        int dp = AndroidUtilities.dp(36.0f);
        int dp2 = AndroidUtilities.dp(4.0f);
        int i13 = (int) ((1.0f - Z) * dp2 * 2.0f);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(2.0f));
        gradientDrawable.setColor(i0.a.k(p41Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ii), (int) (Color.alpha(themedColor) * Z)));
        gradientDrawable.setBounds((getWidth() - dp) / 2, org.telegram.messenger.w1.C(10.0f, p41Var.f29275f, i13), (getWidth() + dp) / 2, AndroidUtilities.dp(10.0f) + p41Var.f29275f + i13 + dp2);
        gradientDrawable.draw(canvas2);
        canvas2.restore();
    }

    @Override
    public final float getTranslationY() {
        return this.E0.f29274e.getTranslationY();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AndroidUtilities.runOnUIThread(new jq0(this, 25), 200L);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        int i10;
        int i11;
        Drawable drawable2;
        int i12;
        int i13;
        p41 p41Var = this.E0;
        GradientDrawable gradientDrawable = p41Var.f29273c;
        p41.m(p41Var);
        super.onDraw(canvas);
        float Z = Z();
        int i14 = p41Var.f29272b;
        int i15 = (int) ((1.0f - Z) * i14);
        int i16 = AndroidUtilities.statusBarHeight - i14;
        canvas.save();
        canvas.translate(0.0f, p41Var.f29274e.getTranslationY() + i16);
        drawable = ((org.telegram.ui.ActionBar.f3) p41Var).shadowDrawable;
        int i17 = p41Var.f29275f;
        i10 = ((org.telegram.ui.ActionBar.f3) p41Var).backgroundPaddingTop;
        int i18 = (i17 - i10) + i15;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (i16 < 0) {
            i11 = -i16;
        } else {
            i11 = 0;
        }
        drawable.setBounds(0, i18, measuredWidth, measuredHeight + i11);
        drawable2 = ((org.telegram.ui.ActionBar.f3) p41Var).shadowDrawable;
        drawable2.draw(canvas);
        if (Z > 0.0f && Z < 1.0f) {
            float dp = AndroidUtilities.dp(12.0f) * Z;
            gradientDrawable.setColor(p41Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20734h5));
            float[] fArr = this.C0;
            fArr[3] = dp;
            fArr[2] = dp;
            fArr[1] = dp;
            fArr[0] = dp;
            gradientDrawable.setCornerRadii(fArr);
            i12 = ((org.telegram.ui.ActionBar.f3) p41Var).backgroundPaddingLeft;
            int width = getWidth();
            i13 = ((org.telegram.ui.ActionBar.f3) p41Var).backgroundPaddingLeft;
            gradientDrawable.setBounds(i12, p41Var.f29275f + i15, width - i13, AndroidUtilities.dp(24.0f) + p41Var.f29275f + i15);
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            p41 p41Var = this.E0;
            if (p41Var.f29275f != 0 && motionEvent.getY() < p41Var.f29275f) {
                p41Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        p41 p41Var = this.E0;
        d51 d51Var = p41Var.f29274e;
        int i16 = AndroidUtilities.statusBarHeight;
        int R = R();
        int size = (int) (((View.MeasureSpec.getSize(getMeasuredHeight()) - i16) + R) * 0.2f);
        this.f28955y0 = true;
        if (R > AndroidUtilities.dp(20.0f)) {
            d51Var.a(true);
            p41Var.setAllowNestedScroll(false);
            this.f28954x0 = true;
        } else {
            d51Var.a(false);
            p41Var.setAllowNestedScroll(true);
            this.f28954x0 = false;
        }
        d51Var.setContentViewPaddingTop(size);
        if (getPaddingTop() != i16) {
            i14 = ((org.telegram.ui.ActionBar.f3) p41Var).backgroundPaddingLeft;
            i15 = ((org.telegram.ui.ActionBar.f3) p41Var).backgroundPaddingLeft;
            setPadding(i14, i16, i15, 0);
        }
        this.f28955y0 = false;
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.E0.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (!this.f28955y0) {
            super.requestLayout();
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        this.E0.f29274e.setTranslationY(f7);
        invalidate();
    }
}
