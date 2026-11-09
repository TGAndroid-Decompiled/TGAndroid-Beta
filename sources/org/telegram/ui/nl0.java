package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class nl0 implements r0.m, org.telegram.ui.ActionBar.r1 {
    public final int f48205a;
    public final jm0 f48206b;

    public nl0(jm0 jm0Var, int i7) {
        this.f48205a = i7;
        this.f48206b = jm0Var;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        jm0 jm0Var = this.f48206b;
        jm0Var.f47039b0 = I0;
        ul0 ul0Var = jm0Var.h.f45060b;
        int i7 = I0.f15120a;
        int paddingTop = ul0Var.getPaddingTop();
        i0.b bVar = jm0Var.f47039b0;
        ul0Var.setPadding(i7, paddingTop, bVar.f15122c, org.telegram.messenger.g0.L(72.0f) + bVar.d);
        ul0 ul0Var2 = jm0Var.f47045n.f45060b;
        int i10 = jm0Var.f47039b0.f15120a;
        int paddingTop2 = ul0Var2.getPaddingTop();
        i0.b bVar2 = jm0Var.f47039b0;
        ul0Var2.setPadding(i10, paddingTop2, bVar2.f15122c, org.telegram.messenger.g0.L(72.0f) + bVar2.d);
        FrameLayout frameLayout = jm0Var.P;
        i0.b bVar3 = jm0Var.f47039b0;
        frameLayout.setPadding(bVar3.f15120a, 0, bVar3.f15122c, bVar3.d);
        return r0.k1.f54213b;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f48205a) {
            case 1:
                this.f48206b.finishFragment();
                return;
            default:
                this.f48206b.D0();
                return;
        }
    }
}
