package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class pl0 implements r0.m, org.telegram.ui.ActionBar.q1 {
    public final int f50909a;
    public final lm0 f50910b;

    public pl0(lm0 lm0Var, int i7) {
        this.f50909a = i7;
        this.f50910b = lm0Var;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        lm0 lm0Var = this.f50910b;
        lm0Var.f49647c0 = I0;
        wl0 wl0Var = lm0Var.h.f47763b;
        int i7 = I0.f15914a;
        int paddingTop = wl0Var.getPaddingTop();
        i0.b bVar = lm0Var.f49647c0;
        wl0Var.setPadding(i7, paddingTop, bVar.f15916c, org.telegram.messenger.g0.L(72.0f) + bVar.d);
        wl0 wl0Var2 = lm0Var.f49652n.f47763b;
        int i10 = lm0Var.f49647c0.f15914a;
        int paddingTop2 = wl0Var2.getPaddingTop();
        i0.b bVar2 = lm0Var.f49647c0;
        wl0Var2.setPadding(i10, paddingTop2, bVar2.f15916c, org.telegram.messenger.g0.L(72.0f) + bVar2.d);
        FrameLayout frameLayout = lm0Var.Q;
        i0.b bVar3 = lm0Var.f49647c0;
        frameLayout.setPadding(bVar3.f15914a, 0, bVar3.f15916c, bVar3.d);
        return r0.l1.f56298b;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f50909a) {
            case 1:
                this.f50910b.finishFragment();
                return;
            default:
                this.f50910b.D0();
                return;
        }
    }
}
