package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import j$.util.Objects;
public final class vv extends rg.d {
    public boolean f41160g3;
    public final ly f41161h3;

    public vv(ly lyVar, Context context) {
        super(context, null);
        this.f41161h3 = lyVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f41161h3.f36974o2.g();
    }

    @Override
    public final void l0(int i7) {
        int i10;
        ly lyVar = this.f41161h3;
        gy gyVar = lyVar.A0;
        if (lyVar.D0 != null) {
            zv zvVar = lyVar.C0;
            if (lyVar.E0.canScrollVertically(-1)) {
                i10 = org.telegram.messenger.g0.f1();
            } else {
                i10 = 0;
            }
            zvVar.setUnderlineHeight(i10);
        }
        if (gyVar != null && getAdapter() == gyVar && gyVar.d == 0) {
            gy gyVar2 = gyVar.P.f34748x;
            if (!gyVar2.R.H0.G && !gyVar2.E) {
                if (lyVar.F0.N0() + 50 > gyVar.b()) {
                    fy fyVar = gyVar.P;
                    Objects.requireNonNull(fyVar);
                    org.telegram.messenger.g0.h3(new uv(fyVar, 0));
                }
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ly lyVar = this.f41161h3;
        if (!lyVar.f36946f) {
            org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
            vv vvVar = lyVar.E0;
            lyVar.getMeasuredHeight();
            boolean q10 = p10.q(motionEvent, vvVar, lyVar.f36955h2, this.f40069o2);
            if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        ly lyVar = this.f41161h3;
        if (lyVar.J0 && lyVar.f37010z0.b() > 0) {
            this.f41160g3 = true;
            lyVar.F0.h1(0, 0);
            lyVar.J0 = false;
            this.f41160g3 = false;
        }
        super.onLayout(z10, i7, i10, i11, i12);
        lyVar.q(true);
    }

    @Override
    public final void requestLayout() {
        if (this.f41160g3) {
            return;
        }
        super.requestLayout();
    }
}
