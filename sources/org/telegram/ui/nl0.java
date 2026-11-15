package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class nl0 implements r0.m, org.telegram.ui.ActionBar.q1 {
    public final int f49579a;
    public final jm0 f49580b;

    public nl0(jm0 jm0Var, int i7) {
        this.f49579a = i7;
        this.f49580b = jm0Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        i0.c I0 = org.telegram.messenger.g0.I0(k1Var, false);
        jm0 jm0Var = this.f49580b;
        jm0Var.f48373c0 = I0;
        ul0 ul0Var = jm0Var.h.f46400b;
        int i7 = I0.f15574a;
        int paddingTop = ul0Var.getPaddingTop();
        i0.c cVar = jm0Var.f48373c0;
        ul0Var.setPadding(i7, paddingTop, cVar.f15576c, org.telegram.messenger.g0.L(72.0f) + cVar.d);
        ul0 ul0Var2 = jm0Var.f48378n.f46400b;
        int i10 = jm0Var.f48373c0.f15574a;
        int paddingTop2 = ul0Var2.getPaddingTop();
        i0.c cVar2 = jm0Var.f48373c0;
        ul0Var2.setPadding(i10, paddingTop2, cVar2.f15576c, org.telegram.messenger.g0.L(72.0f) + cVar2.d);
        FrameLayout frameLayout = jm0Var.Q;
        i0.c cVar3 = jm0Var.f48373c0;
        frameLayout.setPadding(cVar3.f15574a, 0, cVar3.f15576c, cVar3.d);
        return r0.k1.f55681b;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f49579a) {
            case 1:
                this.f49580b.finishFragment();
                return;
            default:
                this.f49580b.D0();
                return;
        }
    }
}
