package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class b50 extends FrameLayout {
    public final RectF f33198a;
    public boolean f33199b;
    public Boolean f33200c;
    public final p50 d;

    public b50(p50 p50Var, Context context) {
        super(context);
        this.d = p50Var;
        this.f33198a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        boolean z10;
        boolean z11;
        p50 p50Var = this.d;
        int L = (p50Var.U1 - p50Var.f29716t0) - org.telegram.messenger.g0.L(8.0f);
        int L2 = org.telegram.messenger.g0.L(36.0f) + getMeasuredHeight();
        int i10 = p50Var.f29716t0;
        int i11 = org.telegram.messenger.g0.f23603m;
        int i12 = L + i11;
        int i13 = (L2 + i10) - i11;
        boolean z12 = false;
        if (this.f33199b) {
            int i14 = i11 * 2;
            if (i12 + i10 < i14) {
                int min = Math.min(i11, (i14 - i12) - i10);
                i12 -= min;
                i13 += min;
                f10 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.g0.f23603m);
            } else {
                f10 = 1.0f;
            }
            int i15 = p50Var.f29716t0;
            int i16 = i12 + i15;
            int i17 = org.telegram.messenger.g0.f23603m;
            if (i16 < i17) {
                i7 = Math.min(i17, (i17 - i12) - i15);
            } else {
                i7 = 0;
            }
        } else {
            i7 = 0;
            f10 = 1.0f;
        }
        p50Var.f29715s0.setBounds(0, i12, getMeasuredWidth(), org.telegram.messenger.g0.L(10.0f) + i13 + org.telegram.messenger.g0.f23604n);
        p50Var.f29715s0.draw(canvas);
        if (f10 != 1.0f) {
            org.telegram.ui.ActionBar.j6.f29140t0.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28922h5, false));
            int i18 = p50Var.f29716t0 + i12;
            RectF rectF = this.f33198a;
            rectF.set(p50Var.f29717u0, p50Var.f29716t0 + i12, getMeasuredWidth() - p50Var.f29717u0, org.telegram.messenger.g0.L(24.0f) + i18);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.j6.f29140t0);
        }
        if (i7 > 0) {
            org.telegram.ui.ActionBar.j6.f29140t0.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28922h5, false));
            canvas.drawRect(p50Var.f29717u0, org.telegram.messenger.g0.f23603m - i7, getMeasuredWidth() - p50Var.f29717u0, org.telegram.messenger.g0.f23603m, org.telegram.ui.ActionBar.j6.f29140t0);
        }
        if (i7 > org.telegram.messenger.g0.f23603m / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f33200c;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, p50Var.J0)) > 0.721f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29129s8, p50Var.J0), 855638016)) > 0.721f) {
            z12 = true;
        }
        this.f33200c = Boolean.valueOf(z10);
        if (!z10) {
            z11 = z12;
        }
        org.telegram.messenger.g0.s3(p50Var.getWindow(), z11);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            p50 p50Var = this.d;
            if (p50Var.U1 != 0 && motionEvent.getY() < p50Var.U1) {
                p50Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        p50.I0(this.d);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        p50 p50Var = this.d;
        p50Var.V1 = true;
        int i11 = p50Var.f29717u0;
        setPadding(i11, org.telegram.messenger.g0.f23603m, i11, 0);
        p50Var.V1 = false;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        this.f33199b = true;
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
        if (this.d.V1) {
            return;
        }
        super.requestLayout();
    }
}
