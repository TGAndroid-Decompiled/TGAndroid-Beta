package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class z40 extends FrameLayout {
    public final RectF f40901a;
    public boolean f40902b;
    public Boolean f40903c;
    public final n50 d;

    public z40(n50 n50Var, Context context) {
        super(context);
        this.d = n50Var;
        this.f40901a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        boolean z9;
        boolean z10;
        n50 n50Var = this.d;
        int L = (n50Var.Q1 - n50Var.f28653s0) - org.telegram.messenger.g0.L(8.0f);
        int L2 = org.telegram.messenger.g0.L(36.0f) + getMeasuredHeight();
        int i10 = n50Var.f28653s0;
        int i11 = org.telegram.messenger.g0.f22557m;
        int i12 = L + i11;
        int i13 = (L2 + i10) - i11;
        boolean z11 = false;
        if (this.f40902b) {
            int i14 = i11 * 2;
            if (i12 + i10 < i14) {
                int min = Math.min(i11, (i14 - i12) - i10);
                i12 -= min;
                i13 += min;
                f10 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.g0.f22557m);
            } else {
                f10 = 1.0f;
            }
            int i15 = n50Var.f28653s0;
            int i16 = i12 + i15;
            int i17 = org.telegram.messenger.g0.f22557m;
            if (i16 < i17) {
                i7 = Math.min(i17, (i17 - i12) - i15);
            } else {
                i7 = 0;
            }
        } else {
            i7 = 0;
            f10 = 1.0f;
        }
        n50Var.f28651r0.setBounds(0, i12, getMeasuredWidth(), org.telegram.messenger.g0.L(10.0f) + i13 + org.telegram.messenger.g0.f22558n);
        n50Var.f28651r0.draw(canvas);
        if (f10 != 1.0f) {
            org.telegram.ui.ActionBar.l6.f28156t0.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27938h5, false));
            int i18 = n50Var.f28653s0 + i12;
            RectF rectF = this.f40901a;
            rectF.set(n50Var.f28654t0, n50Var.f28653s0 + i12, getMeasuredWidth() - n50Var.f28654t0, org.telegram.messenger.g0.L(24.0f) + i18);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.l6.f28156t0);
        }
        if (i7 > 0) {
            org.telegram.ui.ActionBar.l6.f28156t0.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27938h5, false));
            canvas.drawRect(n50Var.f28654t0, org.telegram.messenger.g0.f22557m - i7, getMeasuredWidth() - n50Var.f28654t0, org.telegram.messenger.g0.f22557m, org.telegram.ui.ActionBar.l6.f28156t0);
        }
        if (i7 > org.telegram.messenger.g0.f22557m / 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        Boolean bool = this.f40903c;
        if (bool != null && bool.booleanValue() == z9) {
            return;
        }
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27938h5, n50Var.I0)) > 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28145s8, n50Var.I0), 855638016)) > 0.721f) {
            z11 = true;
        }
        this.f40903c = Boolean.valueOf(z9);
        if (!z9) {
            z10 = z11;
        }
        org.telegram.messenger.g0.s3(n50Var.getWindow(), z10);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            n50 n50Var = this.d;
            if (n50Var.Q1 != 0 && motionEvent.getY() < n50Var.Q1) {
                n50Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        n50.I0(this.d);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        n50 n50Var = this.d;
        n50Var.R1 = true;
        int i11 = n50Var.f28654t0;
        setPadding(i11, org.telegram.messenger.g0.f22557m, i11, 0);
        n50Var.R1 = false;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        this.f40902b = true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.d.I && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.d.R1) {
            return;
        }
        super.requestLayout();
    }
}
