package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import j$.util.Objects;
public final class cw extends rg.d {
    public boolean f34272g3;
    public final ty f34273h3;

    public cw(ty tyVar, Context context) {
        super(context, null);
        this.f34273h3 = tyVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f34273h3.f40107o2.g();
    }

    @Override
    public final void l0(int i7) {
        int i10;
        ty tyVar = this.f34273h3;
        oy oyVar = tyVar.A0;
        if (tyVar.D0 != null) {
            hw hwVar = tyVar.C0;
            if (tyVar.E0.canScrollVertically(-1)) {
                i10 = org.telegram.messenger.g0.f1();
            } else {
                i10 = 0;
            }
            hwVar.setUnderlineHeight(i10);
        }
        if (oyVar != null && getAdapter() == oyVar && oyVar.d == 0) {
            oy oyVar2 = oyVar.P.f37982x;
            if (!oyVar2.R.H0.G && !oyVar2.E) {
                if (tyVar.F0.N0() + 50 > oyVar.b()) {
                    ny nyVar = oyVar.P;
                    Objects.requireNonNull(nyVar);
                    org.telegram.messenger.g0.g3(new bw(nyVar, 0));
                }
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ty tyVar = this.f34273h3;
        if (!tyVar.f40079f) {
            org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
            cw cwVar = tyVar.E0;
            tyVar.getMeasuredHeight();
            boolean q10 = p10.q(motionEvent, cwVar, tyVar.f40088h2, this.f34859o2);
            if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        ty tyVar = this.f34273h3;
        if (tyVar.J0 && tyVar.f40143z0.b() > 0) {
            this.f34272g3 = true;
            tyVar.F0.h1(0, 0);
            tyVar.J0 = false;
            this.f34272g3 = false;
        }
        super.onLayout(z10, i7, i10, i11, i12);
        tyVar.q(true);
    }

    @Override
    public final void requestLayout() {
        if (this.f34272g3) {
            return;
        }
        super.requestLayout();
    }
}
