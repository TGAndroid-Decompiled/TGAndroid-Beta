package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class dd0 extends FrameLayout {
    public final RectF f34379a;
    public boolean f34380b;
    public final Context f34381c;
    public final ld0 d;

    public dd0(ld0 ld0Var, Activity activity, Activity activity2) {
        super(activity);
        this.d = ld0Var;
        this.f34381c = activity2;
        this.f34379a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        ld0 ld0Var = this.d;
        Paint paint = ld0Var.f37104v1;
        int i7 = ld0Var.f37105w1 - ld0Var.f30226t0;
        int L = org.telegram.messenger.g0.L(30.0f) + getMeasuredHeight() + ld0Var.f30226t0;
        float L2 = org.telegram.messenger.g0.L(12.0f);
        int i10 = ld0Var.f30226t0;
        if (i7 + i10 < L2) {
            f10 = 1.0f - Math.min(1.0f, ((L2 - i7) - i10) / L2);
        } else {
            f10 = 1.0f;
        }
        int i11 = org.telegram.messenger.g0.f24115m;
        int i12 = i7 + i11;
        ld0Var.f30225s0.setBounds(0, i12, getMeasuredWidth(), L - i11);
        ld0Var.f30225s0.draw(canvas);
        if (f10 != 1.0f) {
            paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29469h5, ld0Var.J0));
            int i13 = ld0Var.f30226t0 + i12;
            RectF rectF = this.f34379a;
            rectF.set(ld0Var.f30227u0, ld0Var.f30226t0 + i12, getMeasuredWidth() - ld0Var.f30227u0, org.telegram.messenger.g0.L(24.0f) + i13);
            float f11 = L2 * f10;
            canvas.drawRoundRect(rectF, f11, f11, paint);
        }
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29469h5, ld0Var.J0);
        paint.setColor(Color.argb((int) (ld0Var.f37098p1.getAlpha() * 255.0f), (int) (Color.red(w02) * 0.8f), (int) (Color.green(w02) * 0.8f), (int) (Color.blue(w02) * 0.8f)));
        canvas.drawRect(ld0Var.f30227u0, 0.0f, getMeasuredWidth() - ld0Var.f30227u0, org.telegram.messenger.g0.f24115m, paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ld0 ld0Var = this.d;
            if (ld0Var.f37105w1 != 0 && motionEvent.getY() < ld0Var.f37105w1 && ld0Var.f37098p1.getAlpha() == 0.0f) {
                ld0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        ld0 ld0Var = this.d;
        ld0Var.f37103u1 = true;
        super.onLayout(z10, i7, i10, i11, i12);
        ld0Var.f37103u1 = false;
        ld0Var.K0(false);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i10);
        this.f34380b = true;
        ld0 ld0Var = this.d;
        ed0 ed0Var = ld0Var.n1;
        int i12 = ld0Var.f30227u0;
        setPadding(i12, org.telegram.messenger.g0.f24115m, i12, 0);
        this.f34380b = false;
        int paddingTop = size - getPaddingTop();
        View.MeasureSpec.getSize(i7);
        ((FrameLayout.LayoutParams) ld0Var.f37099q1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.f34380b = true;
        int L = org.telegram.messenger.g0.L(80.0f);
        org.telegram.ui.Cells.b5 b5Var = ld0Var.f37096m1;
        int i13 = ((ld0) b5Var.f30431a).f37108z1;
        for (int i14 = 0; i14 < i13; i14++) {
            ViewGroup u10 = b5Var.u(this.f34381c, i14);
            u10.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
            L += u10.getMeasuredHeight();
        }
        if (L < paddingTop) {
            i11 = paddingTop - L;
        } else {
            i11 = paddingTop / 5;
        }
        if (ed0Var.getPaddingTop() != i11) {
            ed0Var.getPaddingTop();
            ed0Var.setPadding(0, i11, 0, 0);
        }
        this.f34380b = false;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.d.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f34380b) {
            return;
        }
        super.requestLayout();
    }
}
