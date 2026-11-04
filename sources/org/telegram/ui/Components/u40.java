package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class u40 extends FrameLayout {
    public final RectF f38640a;
    public boolean f38641b;
    public Boolean f38642c;
    public final i50 d;

    public u40(i50 i50Var, Context context) {
        super(context);
        this.d = i50Var;
        this.f38640a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i3;
        float f10;
        boolean z10;
        boolean z11;
        i50 i50Var = this.d;
        int L = (i50Var.R1 - i50Var.f28617t0) - org.telegram.messenger.g0.L(8.0f);
        int L2 = org.telegram.messenger.g0.L(36.0f) + getMeasuredHeight();
        int i10 = i50Var.f28617t0;
        int i11 = org.telegram.messenger.g0.f22602m;
        int i12 = L + i11;
        int i13 = (L2 + i10) - i11;
        boolean z12 = false;
        if (this.f38641b) {
            int i14 = i11 * 2;
            if (i12 + i10 < i14) {
                int min = Math.min(i11, (i14 - i12) - i10);
                i12 -= min;
                i13 += min;
                f10 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.g0.f22602m);
            } else {
                f10 = 1.0f;
            }
            int i15 = i50Var.f28617t0;
            int i16 = i12 + i15;
            int i17 = org.telegram.messenger.g0.f22602m;
            if (i16 < i17) {
                i3 = Math.min(i17, (i17 - i12) - i15);
            } else {
                i3 = 0;
            }
        } else {
            i3 = 0;
            f10 = 1.0f;
        }
        i50Var.f28616s0.setBounds(0, i12, getMeasuredWidth(), org.telegram.messenger.g0.L(10.0f) + i13 + org.telegram.messenger.g0.f22603n);
        i50Var.f28616s0.draw(canvas);
        if (f10 != 1.0f) {
            org.telegram.ui.ActionBar.k6.f28171t0.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, false));
            int i18 = i50Var.f28617t0 + i12;
            RectF rectF = this.f38640a;
            rectF.set(i50Var.f28618u0, i50Var.f28617t0 + i12, getMeasuredWidth() - i50Var.f28618u0, org.telegram.messenger.g0.L(24.0f) + i18);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.k6.f28171t0);
        }
        if (i3 > 0) {
            org.telegram.ui.ActionBar.k6.f28171t0.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, false));
            canvas.drawRect(i50Var.f28618u0, org.telegram.messenger.g0.f22602m - i3, getMeasuredWidth() - i50Var.f28618u0, org.telegram.messenger.g0.f22602m, org.telegram.ui.ActionBar.k6.f28171t0);
        }
        if (i3 > org.telegram.messenger.g0.f22602m / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f38642c;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, i50Var.J0)) > 0.721f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28160s8, i50Var.J0), 855638016)) > 0.721f) {
            z12 = true;
        }
        this.f38642c = Boolean.valueOf(z10);
        if (!z10) {
            z11 = z12;
        }
        org.telegram.messenger.g0.s3(i50Var.getWindow(), z11);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            i50 i50Var = this.d;
            if (i50Var.R1 != 0 && motionEvent.getY() < i50Var.R1) {
                i50Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        i50.I0(this.d);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        i50 i50Var = this.d;
        i50Var.S1 = true;
        int i11 = i50Var.f28618u0;
        setPadding(i11, org.telegram.messenger.g0.f22602m, i11, 0);
        i50Var.S1 = false;
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        this.f38641b = true;
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
        if (this.d.S1) {
            return;
        }
        super.requestLayout();
    }
}
