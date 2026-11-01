package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class o50 extends FrameLayout {
    public final RectF f29027a;
    public boolean f29028b;
    public Boolean f29029c;
    public final c60 d;

    public o50(c60 c60Var, Context context) {
        super(context);
        this.d = c60Var;
        this.f29027a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        boolean z10;
        boolean z11;
        c60 c60Var = this.d;
        int L = (c60Var.Q1 - c60Var.f21615s0) - org.telegram.messenger.i0.L(8.0f);
        int L2 = org.telegram.messenger.i0.L(36.0f) + getMeasuredHeight();
        int i11 = c60Var.f21615s0;
        int i12 = org.telegram.messenger.i0.f16166m;
        int i13 = L + i12;
        int i14 = (L2 + i11) - i12;
        boolean z12 = false;
        if (this.f29028b) {
            int i15 = i12 * 2;
            if (i13 + i11 < i15) {
                int min = Math.min(i12, (i15 - i13) - i11);
                i13 -= min;
                i14 += min;
                f7 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.i0.f16166m);
            } else {
                f7 = 1.0f;
            }
            int i16 = c60Var.f21615s0;
            int i17 = i13 + i16;
            int i18 = org.telegram.messenger.i0.f16166m;
            if (i17 < i18) {
                i10 = Math.min(i18, (i18 - i13) - i16);
            } else {
                i10 = 0;
            }
        } else {
            i10 = 0;
            f7 = 1.0f;
        }
        c60Var.f21613r0.setBounds(0, i13, getMeasuredWidth(), org.telegram.messenger.i0.L(10.0f) + i14 + org.telegram.messenger.i0.f16167n);
        c60Var.f21613r0.draw(canvas);
        if (f7 != 1.0f) {
            org.telegram.ui.ActionBar.t6.f21218t0.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21002h5, false));
            int i19 = c60Var.f21615s0 + i13;
            RectF rectF = this.f29027a;
            rectF.set(c60Var.f21616t0, c60Var.f21615s0 + i13, getMeasuredWidth() - c60Var.f21616t0, org.telegram.messenger.i0.L(24.0f) + i19);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(12.0f) * f7, org.telegram.messenger.i0.L(12.0f) * f7, org.telegram.ui.ActionBar.t6.f21218t0);
        }
        if (i10 > 0) {
            org.telegram.ui.ActionBar.t6.f21218t0.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21002h5, false));
            canvas.drawRect(c60Var.f21616t0, org.telegram.messenger.i0.f16166m - i10, getMeasuredWidth() - c60Var.f21616t0, org.telegram.messenger.i0.f16166m, org.telegram.ui.ActionBar.t6.f21218t0);
        }
        if (i10 > org.telegram.messenger.i0.f16166m / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f29029c;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, c60Var.I0)) > 0.721f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21207s8, c60Var.I0), 855638016)) > 0.721f) {
            z12 = true;
        }
        this.f29029c = Boolean.valueOf(z10);
        if (!z10) {
            z11 = z12;
        }
        org.telegram.messenger.i0.r3(c60Var.getWindow(), z11);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            c60 c60Var = this.d;
            if (c60Var.Q1 != 0 && motionEvent.getY() < c60Var.Q1) {
                c60Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        c60.I0(this.d);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        c60 c60Var = this.d;
        c60Var.R1 = true;
        int i12 = c60Var.f21616t0;
        setPadding(i12, org.telegram.messenger.i0.f16166m, i12, 0);
        c60Var.R1 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        this.f29028b = true;
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
