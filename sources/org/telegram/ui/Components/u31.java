package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class u31 extends zu0 {
    public final v31 A0;

    public final Paint f32957s0;

    public boolean f32958t0;

    public boolean f32959u0;

    public boolean f32960v0;

    public ValueAnimator f32961w0;

    public float f32962x0;

    public final float[] f32963y0;

    public boolean f32964z0;

    public u31(v31 v31Var, Context context) {
        super(context, null);
        this.A0 = v31Var;
        this.f32957s0 = new Paint(1);
        this.f32958t0 = false;
        this.f32959u0 = false;
        this.f32960v0 = false;
        this.f32962x0 = 0.0f;
        this.f32963y0 = new float[8];
        setWillNotDraw(false);
        setPadding(((org.telegram.ui.ActionBar.e3) v31Var).backgroundPaddingLeft, 0, ((org.telegram.ui.ActionBar.e3) v31Var).backgroundPaddingLeft, 0);
        setDelegate(new t31(this));
    }

    public final float Z() {
        v31 v31Var = this.A0;
        return Math.min(1.0f, Math.max(0.0f, v31Var.f33265f / (v31Var.f33262b * 2.0f)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        v31 v31Var = this.A0;
        j41 j41Var = v31Var.f33264e;
        int i10 = v31Var.f33262b;
        GradientDrawable gradientDrawable = v31Var.f33263c;
        float fZ = Z();
        boolean z10 = fZ == 0.0f && !v31Var.isDismissed();
        if (this.f32960v0 != z10) {
            ValueAnimator valueAnimator = this.f32961w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f32960v0 = z10;
            ValueAnimator valueAnimator2 = this.f32961w0;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f32962x0, z10 ? 1.0f : 0.0f);
                this.f32961w0 = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new v60(this, 29));
                this.f32961w0.setDuration(200L);
            } else {
                valueAnimator2.setFloatValues(this.f32962x0, z10 ? 1.0f : 0.0f);
            }
            this.f32961w0.start();
        }
        boolean z11 = this.f32962x0 > 0.5f;
        if (this.f32964z0 != z11) {
            this.f32964z0 = z11;
            boolean z12 = AndroidUtilities.computePerceivedBrightness(v31Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5)) > 0.721f;
            boolean z13 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v(v31Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23322s8), 855638016)) > 0.721f;
            if (!z11) {
                z12 = z13;
            }
            AndroidUtilities.setLightStatusBar(v31Var.getWindow(), z12);
        }
        if (this.f32962x0 > 0.0f) {
            int themedColor = v31Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5);
            Paint paint = this.f32957s0;
            paint.setColor(themedColor);
            int iMax = (int) Math.max(0.0f, j41Var.getTranslationY() + (AndroidUtilities.statusBarHeight - i10) + ((1.0f - Z()) * i10) + v31Var.f33265f + AndroidUtilities.dp(24.0f));
            float f10 = iMax;
            canvas2 = canvas;
            canvas2.drawRect(((org.telegram.ui.ActionBar.e3) v31Var).backgroundPaddingLeft, AndroidUtilities.lerp(iMax, -AndroidUtilities.statusBarHeight, this.f32962x0), getMeasuredWidth() - ((org.telegram.ui.ActionBar.e3) v31Var).backgroundPaddingLeft, f10, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas2.save();
        canvas2.translate(0.0f, (j41Var.getTranslationY() + AndroidUtilities.statusBarHeight) - i10);
        int iDp = AndroidUtilities.dp(36.0f);
        int iDp2 = AndroidUtilities.dp(4.0f);
        int i11 = (int) ((1.0f - fZ) * iDp2 * 2.0f);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(2.0f));
        int themedColor2 = v31Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ii);
        gradientDrawable.setColor(i0.b.k(themedColor2, (int) (Color.alpha(themedColor2) * fZ)));
        gradientDrawable.setBounds((getWidth() - iDp) / 2, org.telegram.messenger.y1.C(10.0f, v31Var.f33265f, i11), (getWidth() + iDp) / 2, AndroidUtilities.dp(10.0f) + v31Var.f33265f + i11 + iDp2);
        gradientDrawable.draw(canvas2);
        canvas2.restore();
    }

    @Override
    public final float getTranslationY() {
        return this.A0.f33264e.getTranslationY();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AndroidUtilities.runOnUIThread(new up0(this, 25), 200L);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        v31 v31Var = this.A0;
        GradientDrawable gradientDrawable = v31Var.f33263c;
        v31.m(v31Var);
        super.onDraw(canvas);
        float fZ = Z();
        int i10 = v31Var.f33262b;
        int i11 = (int) ((1.0f - fZ) * i10);
        int i12 = AndroidUtilities.statusBarHeight - i10;
        canvas.save();
        canvas.translate(0.0f, v31Var.f33264e.getTranslationY() + i12);
        ((org.telegram.ui.ActionBar.e3) v31Var).shadowDrawable.setBounds(0, (v31Var.f33265f - ((org.telegram.ui.ActionBar.e3) v31Var).backgroundPaddingTop) + i11, getMeasuredWidth(), getMeasuredHeight() + (i12 < 0 ? -i12 : 0));
        ((org.telegram.ui.ActionBar.e3) v31Var).shadowDrawable.draw(canvas);
        if (fZ > 0.0f && fZ < 1.0f) {
            float fDp = AndroidUtilities.dp(12.0f) * fZ;
            gradientDrawable.setColor(v31Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5));
            float[] fArr = this.f32963y0;
            fArr[3] = fDp;
            fArr[2] = fDp;
            fArr[1] = fDp;
            fArr[0] = fDp;
            gradientDrawable.setCornerRadii(fArr);
            gradientDrawable.setBounds(((org.telegram.ui.ActionBar.e3) v31Var).backgroundPaddingLeft, v31Var.f33265f + i11, getWidth() - ((org.telegram.ui.ActionBar.e3) v31Var).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + v31Var.f33265f + i11);
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            v31 v31Var = this.A0;
            if (v31Var.f33265f != 0 && motionEvent.getY() < v31Var.f33265f) {
                v31Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        v31 v31Var = this.A0;
        j41 j41Var = v31Var.f33264e;
        int i14 = AndroidUtilities.statusBarHeight;
        int size = View.MeasureSpec.getSize(getMeasuredHeight()) - i14;
        int iR = R();
        int i15 = (int) ((size + iR) * 0.2f);
        this.f32959u0 = true;
        if (iR > AndroidUtilities.dp(20.0f)) {
            j41Var.a(true);
            v31Var.setAllowNestedScroll(false);
            this.f32958t0 = true;
        } else {
            j41Var.a(false);
            v31Var.setAllowNestedScroll(true);
            this.f32958t0 = false;
        }
        j41Var.setContentViewPaddingTop(i15);
        if (getPaddingTop() != i14) {
            setPadding(((org.telegram.ui.ActionBar.e3) v31Var).backgroundPaddingLeft, i14, ((org.telegram.ui.ActionBar.e3) v31Var).backgroundPaddingLeft, 0);
        }
        this.f32959u0 = false;
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.A0.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.f32959u0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f10) {
        this.A0.f33264e.setTranslationY(f10);
        invalidate();
    }
}
