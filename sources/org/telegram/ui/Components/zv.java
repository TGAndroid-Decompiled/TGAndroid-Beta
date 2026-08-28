package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class zv extends wk0 {
    public boolean T2;
    public boolean U2;
    public final wy V2;

    public zv(wy wyVar, Context context) {
        super(context, null);
        this.V2 = wyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ht q10 = org.telegram.ui.ht.q();
        wy wyVar = this.V2;
        boolean r10 = q10.r(motionEvent, wyVar.f34394d0, wyVar.f34393c2, this.f34260l2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        wy wyVar = this.V2;
        if (wyVar.m0 && wyVar.f34414j0.C > 1) {
            this.T2 = true;
            wyVar.f34398e0.h1(0, 0);
            wyVar.f34417k0.setVisibility(0);
            wyVar.f34420l0.k(0, 0);
            wyVar.m0 = false;
            this.T2 = false;
        }
        super.onLayout(z10, i9, i10, i11, i12);
        wy.f(wyVar, true);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (!this.U2) {
            this.V2.f34414j0.l();
            this.U2 = true;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.T2) {
            return;
        }
        super.requestLayout();
    }
}
