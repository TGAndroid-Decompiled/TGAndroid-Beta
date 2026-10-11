package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class jx extends og.d {
    public boolean W2;
    public final b00 X2;

    public jx(b00 b00Var, Context context) {
        super(context, null);
        this.X2 = b00Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.X2.f24693m2.h++;
    }

    @Override
    public final void k0(int i10, int i11) {
        int i12;
        ah.h hVar;
        b00 b00Var = this.X2;
        wz wzVar = b00Var.f24736z0;
        if (Build.VERSION.SDK_INT >= 31 && (hVar = b00Var.f24686j2) != null) {
            hVar.f(i10, i11);
        }
        if (b00Var.C0 != null) {
            nx nxVar = b00Var.B0;
            if (b00Var.D0.canScrollVertically(-1)) {
                i12 = AndroidUtilities.getShadowHeight();
            } else {
                i12 = 0;
            }
            nxVar.setUnderlineHeight(i12);
        }
        if (wzVar != null && getAdapter() == wzVar && wzVar.d == 0) {
            wz wzVar2 = wzVar.O.f31619w;
            if (!wzVar2.Q.G0.F && !wzVar2.f32770y) {
                if (b00Var.E0.N0() + 50 > wzVar.h()) {
                    uz uzVar = wzVar.O;
                    Objects.requireNonNull(uzVar);
                    AndroidUtilities.runOnUIThread(new ix(uzVar, 0));
                }
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b00 b00Var = this.X2;
        if (!b00Var.f24671f) {
            org.telegram.ui.qt q6 = org.telegram.ui.qt.q();
            jx jxVar = b00Var.D0;
            b00Var.getMeasuredHeight();
            boolean r10 = q6.r(motionEvent, jxVar, b00Var.f24677g2, this.f30807n2);
            if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        b00 b00Var = this.X2;
        if (b00Var.I0 && b00Var.f24733y0.h() > 0) {
            this.W2 = true;
            b00Var.E0.h1(0, 0);
            b00Var.I0 = false;
            this.W2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        b00Var.r(true);
    }

    @Override
    public final void requestLayout() {
        if (this.W2) {
            return;
        }
        super.requestLayout();
    }
}
