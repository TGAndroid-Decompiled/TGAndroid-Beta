package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import j$.util.Objects;
public final class bw extends hg.e {
    public boolean f24886f3;
    public final vy f24887g3;

    public bw(vy vyVar, Context context) {
        super(context, null);
        this.f24887g3 = vyVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f24887g3.f31899n2.g();
    }

    @Override
    public final void l0(int i10) {
        int i11;
        vy vyVar = this.f24887g3;
        qy qyVar = vyVar.f31938z0;
        if (vyVar.C0 != null) {
            gw gwVar = vyVar.B0;
            if (vyVar.D0.canScrollVertically(-1)) {
                i11 = org.telegram.messenger.i0.f1();
            } else {
                i11 = 0;
            }
            gwVar.setUnderlineHeight(i11);
        }
        if (qyVar != null && getAdapter() == qyVar && qyVar.d == 0) {
            qy qyVar2 = qyVar.O.f29460x;
            if (!qyVar2.Q.G0.F && !qyVar2.D) {
                if (vyVar.E0.N0() + 50 > qyVar.b()) {
                    py pyVar = qyVar.O;
                    Objects.requireNonNull(pyVar);
                    org.telegram.messenger.i0.g3(new aw(pyVar, 0));
                }
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        vy vyVar = this.f24887g3;
        if (!vyVar.f31873f) {
            org.telegram.ui.lt p5 = org.telegram.ui.lt.p();
            bw bwVar = vyVar.D0;
            vyVar.getMeasuredHeight();
            boolean q6 = p5.q(motionEvent, bwVar, vyVar.f31879g2, this.f30625n2);
            if (!super.onInterceptTouchEvent(motionEvent) && !q6) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        vy vyVar = this.f24887g3;
        if (vyVar.I0 && vyVar.f31935y0.b() > 0) {
            this.f24886f3 = true;
            vyVar.E0.h1(0, 0);
            vyVar.I0 = false;
            this.f24886f3 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        vyVar.q(true);
    }

    @Override
    public final void requestLayout() {
        if (this.f24886f3) {
            return;
        }
        super.requestLayout();
    }
}
