package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class xv extends ek0 {
    public boolean f42203f3;
    public boolean f42204g3;
    public final ty f42205h3;

    public xv(ty tyVar, Context context) {
        super(context, null);
        this.f42205h3 = tyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        ty tyVar = this.f42205h3;
        boolean q10 = p10.q(motionEvent, tyVar.f40089i0, tyVar.f40088h2, this.f34859o2);
        if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        ty tyVar = this.f42205h3;
        if (tyVar.f40115r0 && tyVar.f40105o0.H > 1) {
            this.f42203f3 = true;
            tyVar.f40092j0.h1(0, 0);
            tyVar.f40108p0.setVisibility(0);
            tyVar.f40111q0.k(0, 0);
            tyVar.f40115r0 = false;
            this.f42203f3 = false;
        }
        super.onLayout(z10, i7, i10, i11, i12);
        ty.f(tyVar, true);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (!this.f42204g3) {
            this.f42205h3.f40105o0.f();
            this.f42204g3 = true;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f42203f3) {
            return;
        }
        super.requestLayout();
    }
}
