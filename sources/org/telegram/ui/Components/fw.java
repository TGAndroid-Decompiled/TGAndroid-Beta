package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class fw extends jl0 {
    public boolean T2;
    public boolean U2;
    public final fz V2;

    public fw(fz fzVar, Context context) {
        super(context, null);
        this.V2 = fzVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ht q6 = org.telegram.ui.ht.q();
        fz fzVar = this.V2;
        boolean r6 = q6.r(motionEvent, fzVar.f28585d0, fzVar.f28584c2, this.f29709l2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r6) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        fz fzVar = this.V2;
        if (fzVar.m0 && fzVar.f28605j0.C > 1) {
            this.T2 = true;
            fzVar.f28589e0.h1(0, 0);
            fzVar.f28608k0.setVisibility(0);
            fzVar.f28611l0.k(0, 0);
            fzVar.m0 = false;
            this.T2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        fz.f(fzVar, true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.U2) {
            this.V2.f28605j0.l();
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
