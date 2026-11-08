package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
public final class cd implements org.telegram.ui.Components.dt0, org.telegram.ui.ActionBar.r1, org.telegram.messenger.a20 {
    public final zd f44755a;

    public cd(zd zdVar) {
        this.f44755a = zdVar;
    }

    @Override
    public int b() {
        return this.f44755a.R0;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.f44755a.m0.presentFragment(new za1(6, null));
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        zd zdVar = this.f44755a;
        dd ddVar = zdVar.f52555s1;
        int i7 = zdVar.f52546o0;
        long j3 = zdVar.f52548p0;
        int i10 = ((org.telegram.ui.Components.x31) obj).d;
        if (i10 == 1) {
            if (zdVar.f52552r0 < org.telegram.messenger.qp.s1(i7).f24958z4) {
                if (zdVar.f52550q0 != null) {
                    c51 c51Var = zdVar.m0;
                    ug.i0 i0Var = new ug.i0(30, zdVar.f52546o0, zdVar.getContext(), c51Var, zdVar.f52545n0);
                    i0Var.B1(j3);
                    i0Var.z1(zdVar.f52550q0, true);
                    org.telegram.messenger.qp.s1(i7).G0().b(j3, zdVar.f52550q0, new org.telegram.messenger.voip.k(8, zdVar, i0Var));
                    return;
                }
                return;
            }
            zdVar.f52542j1 = !zdVar.f52542j1;
            org.telegram.messenger.g0.r(ddVar);
            org.telegram.messenger.g0.i3(ddVar, 1000L);
            zdVar.X0.f37190f3.O(true);
        } else if (i10 == 4) {
            zdVar.m0.presentFragment(new hi.q3(j3));
        }
    }
}
