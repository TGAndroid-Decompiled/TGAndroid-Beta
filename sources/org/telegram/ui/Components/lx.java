package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class lx extends og.d {
    public boolean W2;
    public final d00 X2;

    public lx(d00 d00Var, Context context) {
        super(context, null);
        this.X2 = d00Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.X2.f25111m2.h++;
    }

    @Override
    public final void k0(int i10, int i11) {
        int i12;
        ah.h hVar;
        d00 d00Var = this.X2;
        yz yzVar = d00Var.f25154z0;
        if (Build.VERSION.SDK_INT >= 31 && (hVar = d00Var.f25104j2) != null) {
            hVar.f(i10, i11);
        }
        if (d00Var.C0 != null) {
            px pxVar = d00Var.B0;
            if (d00Var.D0.canScrollVertically(-1)) {
                i12 = AndroidUtilities.getShadowHeight();
            } else {
                i12 = 0;
            }
            pxVar.setUnderlineHeight(i12);
        }
        if (yzVar != null && getAdapter() == yzVar && yzVar.d == 0) {
            yz yzVar2 = yzVar.O.f32590w;
            if (!yzVar2.Q.G0.F && !yzVar2.f33230y) {
                if (d00Var.E0.N0() + 50 > yzVar.h()) {
                    wz wzVar = yzVar.O;
                    Objects.requireNonNull(wzVar);
                    AndroidUtilities.runOnUIThread(new kx(wzVar, 0));
                }
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        d00 d00Var = this.X2;
        if (!d00Var.f25089f) {
            org.telegram.ui.ut q6 = org.telegram.ui.ut.q();
            lx lxVar = d00Var.D0;
            d00Var.getMeasuredHeight();
            boolean r10 = q6.r(motionEvent, lxVar, d00Var.f25095g2, this.f32467n2);
            if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        d00 d00Var = this.X2;
        if (d00Var.I0 && d00Var.f25151y0.h() > 0) {
            this.W2 = true;
            d00Var.E0.h1(0, 0);
            d00Var.I0 = false;
            this.W2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        d00Var.r(true);
    }

    @Override
    public final void requestLayout() {
        if (this.W2) {
            return;
        }
        super.requestLayout();
    }
}
