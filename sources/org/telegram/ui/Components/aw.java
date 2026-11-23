package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import j$.util.Objects;
public final class aw extends rg.d {
    public boolean f33564g3;
    public final qy f33565h3;

    public aw(qy qyVar, Context context) {
        super(context, null);
        this.f33565h3 = qyVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f33565h3.f39080o2.g();
    }

    @Override
    public final void l0(int i7) {
        int i10;
        qy qyVar = this.f33565h3;
        ly lyVar = qyVar.A0;
        if (qyVar.D0 != null) {
            ew ewVar = qyVar.C0;
            if (qyVar.E0.canScrollVertically(-1)) {
                i10 = org.telegram.messenger.g0.f1();
            } else {
                i10 = 0;
            }
            ewVar.setUnderlineHeight(i10);
        }
        if (lyVar != null && getAdapter() == lyVar && lyVar.d == 0) {
            ly lyVar2 = lyVar.P.f36929x;
            if (!lyVar2.R.H0.G && !lyVar2.E) {
                if (qyVar.F0.N0() + 50 > lyVar.b()) {
                    ky kyVar = lyVar.P;
                    Objects.requireNonNull(kyVar);
                    org.telegram.messenger.g0.g3(new zv(kyVar, 0));
                }
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        qy qyVar = this.f33565h3;
        if (!qyVar.f39052f) {
            org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
            aw awVar = qyVar.E0;
            qyVar.getMeasuredHeight();
            boolean q10 = p10.q(motionEvent, awVar, qyVar.f39061h2, this.f34767o2);
            if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        qy qyVar = this.f33565h3;
        if (qyVar.J0 && qyVar.f39116z0.b() > 0) {
            this.f33564g3 = true;
            qyVar.F0.h1(0, 0);
            qyVar.J0 = false;
            this.f33564g3 = false;
        }
        super.onLayout(z10, i7, i10, i11, i12);
        qyVar.q(true);
    }

    @Override
    public final void requestLayout() {
        if (this.f33564g3) {
            return;
        }
        super.requestLayout();
    }
}
