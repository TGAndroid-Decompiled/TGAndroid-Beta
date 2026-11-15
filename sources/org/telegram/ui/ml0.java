package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class ml0 implements r0.m, org.telegram.ui.ActionBar.q1 {
    public final int f49250a;
    public final im0 f49251b;

    public ml0(im0 im0Var, int i7) {
        this.f49250a = i7;
        this.f49251b = im0Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        i0.c I0 = org.telegram.messenger.g0.I0(k1Var, false);
        im0 im0Var = this.f49251b;
        im0Var.f48089c0 = I0;
        tl0 tl0Var = im0Var.h.f46191b;
        int i7 = I0.f15574a;
        int paddingTop = tl0Var.getPaddingTop();
        i0.c cVar = im0Var.f48089c0;
        tl0Var.setPadding(i7, paddingTop, cVar.f15576c, org.telegram.messenger.g0.L(72.0f) + cVar.d);
        tl0 tl0Var2 = im0Var.f48094n.f46191b;
        int i10 = im0Var.f48089c0.f15574a;
        int paddingTop2 = tl0Var2.getPaddingTop();
        i0.c cVar2 = im0Var.f48089c0;
        tl0Var2.setPadding(i10, paddingTop2, cVar2.f15576c, org.telegram.messenger.g0.L(72.0f) + cVar2.d);
        FrameLayout frameLayout = im0Var.Q;
        i0.c cVar3 = im0Var.f48089c0;
        frameLayout.setPadding(cVar3.f15574a, 0, cVar3.f15576c, cVar3.d);
        return r0.k1.f55681b;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f49250a) {
            case 1:
                this.f49251b.finishFragment();
                return;
            default:
                this.f49251b.D0();
                return;
        }
    }
}
