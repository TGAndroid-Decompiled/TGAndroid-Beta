package org.telegram.ui;

import android.view.View;
public final class pp implements org.telegram.messenger.tr, org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.cj0, org.telegram.ui.Components.dj0 {
    public final int f48816a;
    public final rq f48817b;

    public pp(rq rqVar, int i7) {
        this.f48816a = i7;
        this.f48817b = rqVar;
    }

    @Override
    public boolean c(int i7, View view) {
        rq rqVar = this.f48817b;
        if (rqVar.getParentActivity() != null) {
            v4.g0 adapter = rqVar.f49502c.getAdapter();
            nq nqVar = rqVar.f49496a;
            if (adapter == nqVar) {
                return rqVar.m0(nqVar.E(i7), false, view);
            }
        }
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        rq.a0(this.f48817b, view, i7);
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f48816a) {
            case 1:
                this.f48817b.z0();
                return;
            default:
                this.f48817b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j3) {
        rq.Z(this.f48817b, j3);
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
