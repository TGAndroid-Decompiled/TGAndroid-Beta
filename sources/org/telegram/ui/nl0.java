package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class nl0 implements r0.m, org.telegram.ui.ActionBar.q1 {
    public final int f50330a;
    public final jm0 f50331b;

    public nl0(jm0 jm0Var, int i7) {
        this.f50330a = i7;
        this.f50331b = jm0Var;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f50330a) {
            case 1:
                this.f50331b.finishFragment();
                return;
            default:
                this.f50331b.D0();
                return;
        }
    }

    @Override
    public r0.l1 l1(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        jm0 jm0Var = this.f50331b;
        jm0Var.f49159c0 = I0;
        ul0 ul0Var = jm0Var.h.f47166b;
        int i7 = I0.f15978a;
        int paddingTop = ul0Var.getPaddingTop();
        i0.b bVar = jm0Var.f49159c0;
        ul0Var.setPadding(i7, paddingTop, bVar.f15980c, org.telegram.messenger.g0.L(72.0f) + bVar.d);
        ul0 ul0Var2 = jm0Var.f49164n.f47166b;
        int i10 = jm0Var.f49159c0.f15978a;
        int paddingTop2 = ul0Var2.getPaddingTop();
        i0.b bVar2 = jm0Var.f49159c0;
        ul0Var2.setPadding(i10, paddingTop2, bVar2.f15980c, org.telegram.messenger.g0.L(72.0f) + bVar2.d);
        FrameLayout frameLayout = jm0Var.Q;
        i0.b bVar3 = jm0Var.f49159c0;
        frameLayout.setPadding(bVar3.f15978a, 0, bVar3.f15980c, bVar3.d);
        return r0.l1.f56380b;
    }
}
