package org.telegram.ui;

import android.view.View;
public final class lp implements org.telegram.messenger.lr, org.telegram.ui.ActionBar.p1, org.telegram.ui.Components.gj0, org.telegram.ui.Components.hj0 {
    public final int f47406a;
    public final nq f47407b;

    public lp(nq nqVar, int i3) {
        this.f47406a = i3;
        this.f47407b = nqVar;
    }

    @Override
    public void b(float f10, float f11, int i3, View view) {
        nq.a0(this.f47407b, view, i3);
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public boolean f(int i3, View view) {
        nq nqVar = this.f47407b;
        if (nqVar.getParentActivity() != null) {
            u4.h0 adapter = nqVar.f48052c.getAdapter();
            iq iqVar = nqVar.f48046a;
            if (adapter == iqVar) {
                return nqVar.m0(iqVar.E(i3), false, view);
            }
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f47406a) {
            case 1:
                this.f47407b.z0();
                return;
            default:
                this.f47407b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j10) {
        nq.Z(this.f47407b, j10);
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
