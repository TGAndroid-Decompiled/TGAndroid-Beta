package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class gl0 implements r0.m, org.telegram.ui.ActionBar.p1 {
    public final int f45679a;
    public final cm0 f45680b;

    public gl0(cm0 cm0Var, int i3) {
        this.f45679a = i3;
        this.f45680b = cm0Var;
    }

    @Override
    public r0.k1 R0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        cm0 cm0Var = this.f45680b;
        cm0Var.f44393c0 = I0;
        nl0 nl0Var = cm0Var.h.f51202b;
        int i3 = I0.f14495a;
        int paddingTop = nl0Var.getPaddingTop();
        i0.b bVar = cm0Var.f44393c0;
        nl0Var.setPadding(i3, paddingTop, bVar.f14497c, org.telegram.messenger.g0.L(72.0f) + bVar.d);
        nl0 nl0Var2 = cm0Var.f44398n.f51202b;
        int i10 = cm0Var.f44393c0.f14495a;
        int paddingTop2 = nl0Var2.getPaddingTop();
        i0.b bVar2 = cm0Var.f44393c0;
        nl0Var2.setPadding(i10, paddingTop2, bVar2.f14497c, org.telegram.messenger.g0.L(72.0f) + bVar2.d);
        FrameLayout frameLayout = cm0Var.Q;
        i0.b bVar3 = cm0Var.f44393c0;
        frameLayout.setPadding(bVar3.f14495a, 0, bVar3.f14497c, bVar3.d);
        return r0.k1.f54025b;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f45679a) {
            case 1:
                this.f45680b.finishFragment();
                return;
            default:
                this.f45680b.D0();
                return;
        }
    }
}
