package org.telegram.ui;

import android.view.View;
public final class np implements org.telegram.messenger.tr, org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.cj0, org.telegram.ui.Components.dj0 {
    public final int f48103a;
    public final oq f48104b;

    public np(oq oqVar, int i7) {
        this.f48103a = i7;
        this.f48104b = oqVar;
    }

    @Override
    public boolean c(int i7, View view) {
        oq oqVar = this.f48104b;
        if (oqVar.getParentActivity() != null) {
            v4.g0 adapter = oqVar.f48475c.getAdapter();
            kq kqVar = oqVar.f48469a;
            if (adapter == kqVar) {
                return oqVar.m0(kqVar.E(i7), false, view);
            }
        }
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        oq.a0(this.f48104b, view, i7);
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f48103a) {
            case 1:
                this.f48104b.z0();
                return;
            default:
                this.f48104b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j3) {
        oq.Z(this.f48104b, j3);
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
