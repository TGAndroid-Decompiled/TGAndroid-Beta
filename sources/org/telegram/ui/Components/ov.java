package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import j$.util.Objects;
public final class ov extends sg.d {
    public boolean f36947g3;
    public final ey f36948h3;

    public ov(ey eyVar, Context context) {
        super(context, null);
        this.f36948h3 = eyVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f36948h3.f33563o2.g();
    }

    @Override
    public final void l0(int i3) {
        int i10;
        ey eyVar = this.f36948h3;
        yx yxVar = eyVar.A0;
        if (eyVar.D0 != null) {
            sv svVar = eyVar.C0;
            if (eyVar.E0.canScrollVertically(-1)) {
                i10 = org.telegram.messenger.g0.f1();
            } else {
                i10 = 0;
            }
            svVar.setUnderlineHeight(i10);
        }
        if (yxVar != null && getAdapter() == yxVar && yxVar.d == 0) {
            yx yxVar2 = yxVar.P.f40548x;
            if (!yxVar2.R.H0.G && !yxVar2.E) {
                if (eyVar.F0.N0() + 50 > yxVar.b()) {
                    xx xxVar = yxVar.P;
                    Objects.requireNonNull(xxVar);
                    org.telegram.messenger.g0.h3(new nv(xxVar, 0));
                }
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ey eyVar = this.f36948h3;
        if (!eyVar.f33535f) {
            org.telegram.ui.is p10 = org.telegram.ui.is.p();
            ov ovVar = eyVar.E0;
            eyVar.getMeasuredHeight();
            boolean q10 = p10.q(motionEvent, ovVar, eyVar.f33544h2, this.f38460o2);
            if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        ey eyVar = this.f36948h3;
        if (eyVar.J0 && eyVar.f33599z0.b() > 0) {
            this.f36947g3 = true;
            eyVar.F0.h1(0, 0);
            eyVar.J0 = false;
            this.f36947g3 = false;
        }
        super.onLayout(z10, i3, i10, i11, i12);
        eyVar.q(true);
    }

    @Override
    public final void requestLayout() {
        if (this.f36947g3) {
            return;
        }
        super.requestLayout();
    }
}
