package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class yv extends ek0 {
    public boolean f42574f3;
    public boolean f42575g3;
    public final ty f42576h3;

    public yv(ty tyVar, Context context) {
        super(context, null);
        this.f42576h3 = tyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        ty tyVar = this.f42576h3;
        boolean q10 = p10.q(motionEvent, tyVar.f40107i0, tyVar.f40106h2, this.f34873o2);
        if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        ty tyVar = this.f42576h3;
        if (tyVar.f40133r0 && tyVar.f40123o0.H > 1) {
            this.f42574f3 = true;
            tyVar.f40110j0.h1(0, 0);
            tyVar.f40126p0.setVisibility(0);
            tyVar.f40129q0.k(0, 0);
            tyVar.f40133r0 = false;
            this.f42574f3 = false;
        }
        super.onLayout(z10, i7, i10, i11, i12);
        ty.f(tyVar, true);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (!this.f42575g3) {
            this.f42576h3.f40123o0.f();
            this.f42575g3 = true;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f42574f3) {
            return;
        }
        super.requestLayout();
    }
}
