package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class m50 extends FrameLayout {
    public final RectF f37425a;
    public boolean f37426b;
    public Boolean f37427c;
    public final a60 d;

    public m50(a60 a60Var, Context context) {
        super(context);
        this.d = a60Var;
        this.f37425a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        boolean z10;
        boolean z11;
        a60 a60Var = this.d;
        int L = (a60Var.U1 - a60Var.f30210t0) - org.telegram.messenger.g0.L(8.0f);
        int L2 = org.telegram.messenger.g0.L(36.0f) + getMeasuredHeight();
        int i10 = a60Var.f30210t0;
        int i11 = org.telegram.messenger.g0.f24040m;
        int i12 = L + i11;
        int i13 = (L2 + i10) - i11;
        boolean z12 = false;
        if (this.f37426b) {
            int i14 = i11 * 2;
            if (i12 + i10 < i14) {
                int min = Math.min(i11, (i14 - i12) - i10);
                i12 -= min;
                i13 += min;
                f10 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.g0.f24040m);
            } else {
                f10 = 1.0f;
            }
            int i15 = a60Var.f30210t0;
            int i16 = i12 + i15;
            int i17 = org.telegram.messenger.g0.f24040m;
            if (i16 < i17) {
                i7 = Math.min(i17, (i17 - i12) - i15);
            } else {
                i7 = 0;
            }
        } else {
            i7 = 0;
            f10 = 1.0f;
        }
        a60Var.f30209s0.setBounds(0, i12, getMeasuredWidth(), org.telegram.messenger.g0.L(10.0f) + i13 + org.telegram.messenger.g0.f24041n);
        a60Var.f30209s0.draw(canvas);
        if (f10 != 1.0f) {
            org.telegram.ui.ActionBar.m6.f29672t0.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29454h5, false));
            int i18 = a60Var.f30210t0 + i12;
            RectF rectF = this.f37425a;
            rectF.set(a60Var.f30211u0, a60Var.f30210t0 + i12, getMeasuredWidth() - a60Var.f30211u0, org.telegram.messenger.g0.L(24.0f) + i18);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.m6.f29672t0);
        }
        if (i7 > 0) {
            org.telegram.ui.ActionBar.m6.f29672t0.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29454h5, false));
            canvas.drawRect(a60Var.f30211u0, org.telegram.messenger.g0.f24040m - i7, getMeasuredWidth() - a60Var.f30211u0, org.telegram.messenger.g0.f24040m, org.telegram.ui.ActionBar.m6.f29672t0);
        }
        if (i7 > org.telegram.messenger.g0.f24040m / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f37427c;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29454h5, a60Var.J0)) > 0.721f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29661s8, a60Var.J0), 855638016)) > 0.721f) {
            z12 = true;
        }
        this.f37427c = Boolean.valueOf(z10);
        if (!z10) {
            z11 = z12;
        }
        org.telegram.messenger.g0.r3(a60Var.getWindow(), z11);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            a60 a60Var = this.d;
            if (a60Var.U1 != 0 && motionEvent.getY() < a60Var.U1) {
                a60Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        a60.J0(this.d);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        a60 a60Var = this.d;
        a60Var.V1 = true;
        int i11 = a60Var.f30211u0;
        setPadding(i11, org.telegram.messenger.g0.f24040m, i11, 0);
        a60Var.V1 = false;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        this.f37426b = true;
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
