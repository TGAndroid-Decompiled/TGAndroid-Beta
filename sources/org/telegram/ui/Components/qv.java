package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import j$.util.Objects;
public final class qv extends rg.d {
    public boolean f37421f3;
    public final hy f37422g3;

    public qv(hy hyVar, Context context) {
        super(context, null);
        this.f37422g3 = hyVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f37422g3.f34433n2.g();
    }

    @Override
    public final void l0(int i7) {
        int i10;
        hy hyVar = this.f37422g3;
        cy cyVar = hyVar.f34472z0;
        if (hyVar.C0 != null) {
            uv uvVar = hyVar.B0;
            if (hyVar.D0.canScrollVertically(-1)) {
                i10 = org.telegram.messenger.g0.f1();
            } else {
                i10 = 0;
            }
            uvVar.setUnderlineHeight(i10);
        }
        if (cyVar != null && getAdapter() == cyVar && cyVar.d == 0) {
            cy cyVar2 = cyVar.O.f31950x;
            if (!cyVar2.Q.G0.F && !cyVar2.D) {
                if (hyVar.E0.N0() + 50 > cyVar.b()) {
                    ay ayVar = cyVar.O;
                    Objects.requireNonNull(ayVar);
                    org.telegram.messenger.g0.h3(new pv(ayVar, 0));
                }
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        hy hyVar = this.f37422g3;
        if (!hyVar.f34408f) {
            org.telegram.ui.ks p10 = org.telegram.ui.ks.p();
            qv qvVar = hyVar.D0;
            hyVar.getMeasuredHeight();
            boolean q10 = p10.q(motionEvent, qvVar, hyVar.f34414g2, this.f36981n2);
            if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        hy hyVar = this.f37422g3;
        if (hyVar.I0 && hyVar.f34469y0.b() > 0) {
            this.f37421f3 = true;
            hyVar.E0.h1(0, 0);
            hyVar.I0 = false;
            this.f37421f3 = false;
        }
        super.onLayout(z9, i7, i10, i11, i12);
        hyVar.q(true);
    }

    @Override
    public final void requestLayout() {
        if (this.f37421f3) {
            return;
        }
        super.requestLayout();
    }
}
