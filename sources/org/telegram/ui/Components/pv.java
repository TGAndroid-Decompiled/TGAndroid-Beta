package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import j$.util.Objects;
public final class pv extends rg.d {
    public boolean f37074f3;
    public final gy f37075g3;

    public pv(gy gyVar, Context context) {
        super(context, null);
        this.f37075g3 = gyVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f37075g3.f34049n2.g();
    }

    @Override
    public final void l0(int i7) {
        int i10;
        gy gyVar = this.f37075g3;
        ay ayVar = gyVar.f34088z0;
        if (gyVar.C0 != null) {
            tv tvVar = gyVar.B0;
            if (gyVar.D0.canScrollVertically(-1)) {
                i10 = org.telegram.messenger.g0.f1();
            } else {
                i10 = 0;
            }
            tvVar.setUnderlineHeight(i10);
        }
        if (ayVar != null && getAdapter() == ayVar && ayVar.d == 0) {
            ay ayVar2 = ayVar.O.f41154x;
            if (!ayVar2.Q.G0.F && !ayVar2.D) {
                if (gyVar.E0.N0() + 50 > ayVar.b()) {
                    zx zxVar = ayVar.O;
                    Objects.requireNonNull(zxVar);
                    org.telegram.messenger.g0.h3(new ov(zxVar, 0));
                }
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        gy gyVar = this.f37075g3;
        if (!gyVar.f34024f) {
            org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
            pv pvVar = gyVar.D0;
            gyVar.getMeasuredHeight();
            boolean q10 = p10.q(motionEvent, pvVar, gyVar.f34030g2, this.f36980n2);
            if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        gy gyVar = this.f37075g3;
        if (gyVar.I0 && gyVar.f34085y0.b() > 0) {
            this.f37074f3 = true;
            gyVar.E0.h1(0, 0);
            gyVar.I0 = false;
            this.f37074f3 = false;
        }
        super.onLayout(z9, i7, i10, i11, i12);
        gyVar.q(true);
    }

    @Override
    public final void requestLayout() {
        if (this.f37074f3) {
            return;
        }
        super.requestLayout();
    }
}
