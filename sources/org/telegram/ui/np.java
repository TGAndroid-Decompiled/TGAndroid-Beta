package org.telegram.ui;

import android.view.View;
public final class np implements org.telegram.messenger.tr, org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.cj0, org.telegram.ui.Components.dj0 {
    public final int f48102a;
    public final oq f48103b;

    public np(oq oqVar, int i7) {
        this.f48102a = i7;
        this.f48103b = oqVar;
    }

    @Override
    public boolean c(int i7, View view) {
        oq oqVar = this.f48103b;
        if (oqVar.getParentActivity() != null) {
            v4.g0 adapter = oqVar.f48474c.getAdapter();
            kq kqVar = oqVar.f48468a;
            if (adapter == kqVar) {
                return oqVar.m0(kqVar.E(i7), false, view);
            }
        }
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        oq.a0(this.f48103b, view, i7);
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f48102a) {
            case 1:
                this.f48103b.z0();
                return;
            default:
                this.f48103b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j3) {
        oq.Z(this.f48103b, j3);
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
