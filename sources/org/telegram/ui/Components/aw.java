package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import j$.util.Objects;
public final class aw extends rg.d {
    public boolean f33472g3;
    public final ry f33473h3;

    public aw(ry ryVar, Context context) {
        super(context, null);
        this.f33473h3 = ryVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f33473h3.f39378o2.g();
    }

    @Override
    public final void l0(int i7) {
        int i10;
        ry ryVar = this.f33473h3;
        my myVar = ryVar.A0;
        if (ryVar.D0 != null) {
            fw fwVar = ryVar.C0;
            if (ryVar.E0.canScrollVertically(-1)) {
                i10 = org.telegram.messenger.g0.f1();
            } else {
                i10 = 0;
            }
            fwVar.setUnderlineHeight(i10);
        }
        if (myVar != null && getAdapter() == myVar && myVar.d == 0) {
            my myVar2 = myVar.P.f37268x;
            if (!myVar2.R.H0.G && !myVar2.E) {
                if (ryVar.F0.N0() + 50 > myVar.b()) {
                    ly lyVar = myVar.P;
                    Objects.requireNonNull(lyVar);
                    org.telegram.messenger.g0.g3(new zv(lyVar, 0));
                }
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ry ryVar = this.f33473h3;
        if (!ryVar.f39350f) {
            org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
            aw awVar = ryVar.E0;
            ryVar.getMeasuredHeight();
            boolean q10 = p10.q(motionEvent, awVar, ryVar.f39359h2, this.f34074o2);
            if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        ry ryVar = this.f33473h3;
        if (ryVar.J0 && ryVar.f39414z0.b() > 0) {
            this.f33472g3 = true;
            ryVar.F0.h1(0, 0);
            ryVar.J0 = false;
            this.f33472g3 = false;
        }
        super.onLayout(z10, i7, i10, i11, i12);
        ryVar.q(true);
    }

    @Override
    public final void requestLayout() {
        if (this.f33472g3) {
            return;
        }
        super.requestLayout();
    }
}
