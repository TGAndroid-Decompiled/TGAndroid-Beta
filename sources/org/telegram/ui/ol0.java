package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class ol0 implements r0.m, org.telegram.ui.ActionBar.r1 {
    public final int f48544a;
    public final km0 f48545b;

    public ol0(km0 km0Var, int i7) {
        this.f48544a = i7;
        this.f48545b = km0Var;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        km0 km0Var = this.f48545b;
        km0Var.f47370b0 = I0;
        vl0 vl0Var = km0Var.h.f45383b;
        int i7 = I0.f15122a;
        int paddingTop = vl0Var.getPaddingTop();
        i0.b bVar = km0Var.f47370b0;
        vl0Var.setPadding(i7, paddingTop, bVar.f15124c, org.telegram.messenger.g0.L(72.0f) + bVar.d);
        vl0 vl0Var2 = km0Var.f47376n.f45383b;
        int i10 = km0Var.f47370b0.f15122a;
        int paddingTop2 = vl0Var2.getPaddingTop();
        i0.b bVar2 = km0Var.f47370b0;
        vl0Var2.setPadding(i10, paddingTop2, bVar2.f15124c, org.telegram.messenger.g0.L(72.0f) + bVar2.d);
        FrameLayout frameLayout = km0Var.P;
        i0.b bVar3 = km0Var.f47370b0;
        frameLayout.setPadding(bVar3.f15122a, 0, bVar3.f15124c, bVar3.d);
        return r0.k1.f54212b;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f48544a) {
            case 1:
                this.f48545b.finishFragment();
                return;
            default:
                this.f48545b.D0();
                return;
        }
    }
}
