package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class vv extends ck0 {
    public boolean f41461f3;
    public boolean f41462g3;
    public final ry f41463h3;

    public vv(ry ryVar, Context context) {
        super(context, null);
        this.f41463h3 = ryVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        ry ryVar = this.f41463h3;
        boolean q10 = p10.q(motionEvent, ryVar.f39360i0, ryVar.f39359h2, this.f34074o2);
        if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        ry ryVar = this.f41463h3;
        if (ryVar.f39386r0 && ryVar.f39376o0.H > 1) {
            this.f41461f3 = true;
            ryVar.f39363j0.h1(0, 0);
            ryVar.f39379p0.setVisibility(0);
            ryVar.f39382q0.k(0, 0);
            ryVar.f39386r0 = false;
            this.f41461f3 = false;
        }
        super.onLayout(z10, i7, i10, i11, i12);
        ry.f(ryVar, true);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (!this.f41462g3) {
            this.f41463h3.f39376o0.f();
            this.f41462g3 = true;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f41461f3) {
            return;
        }
        super.requestLayout();
    }
}
