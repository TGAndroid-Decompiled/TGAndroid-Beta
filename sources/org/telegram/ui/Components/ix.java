package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class ix extends og.d {
    public boolean W2;
    public final a00 X2;

    public ix(a00 a00Var, Context context) {
        super(context, null);
        this.X2 = a00Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.X2.f24432m2.h++;
    }

    @Override
    public final void k0(int i10, int i11) {
        int i12;
        ah.h hVar;
        a00 a00Var = this.X2;
        vz vzVar = a00Var.f24475z0;
        if (Build.VERSION.SDK_INT >= 31 && (hVar = a00Var.f24425j2) != null) {
            hVar.f(i10, i11);
        }
        if (a00Var.C0 != null) {
            mx mxVar = a00Var.B0;
            if (a00Var.D0.canScrollVertically(-1)) {
                i12 = AndroidUtilities.getShadowHeight();
            } else {
                i12 = 0;
            }
            mxVar.setUnderlineHeight(i12);
        }
        if (vzVar != null && getAdapter() == vzVar && vzVar.d == 0) {
            vz vzVar2 = vzVar.O.f31318w;
            if (!vzVar2.Q.G0.F && !vzVar2.f32485y) {
                if (a00Var.E0.N0() + 50 > vzVar.h()) {
                    tz tzVar = vzVar.O;
                    Objects.requireNonNull(tzVar);
                    AndroidUtilities.runOnUIThread(new hx(tzVar, 0));
                }
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a00 a00Var = this.X2;
        if (!a00Var.f24410f) {
            org.telegram.ui.rt q6 = org.telegram.ui.rt.q();
            ix ixVar = a00Var.D0;
            a00Var.getMeasuredHeight();
            boolean r10 = q6.r(motionEvent, ixVar, a00Var.f24416g2, this.f30216n2);
            if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        a00 a00Var = this.X2;
        if (a00Var.I0 && a00Var.f24472y0.h() > 0) {
            this.W2 = true;
            a00Var.E0.h1(0, 0);
            a00Var.I0 = false;
            this.W2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        a00Var.r(true);
    }

    @Override
    public final void requestLayout() {
        if (this.W2) {
            return;
        }
        super.requestLayout();
    }
}
