package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
public final class cd implements org.telegram.ui.Components.ft0, org.telegram.ui.ActionBar.r1, org.telegram.messenger.a20 {
    public final zd f44280a;

    public cd(zd zdVar) {
        this.f44280a = zdVar;
    }

    @Override
    public int b() {
        return this.f44280a.R0;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.f44280a.m0.presentFragment(new bb1(6, null));
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        zd zdVar = this.f44280a;
        dd ddVar = zdVar.f52526s1;
        int i7 = zdVar.f52517o0;
        long j3 = zdVar.f52519p0;
        int i10 = ((org.telegram.ui.Components.y31) obj).d;
        if (i10 == 1) {
            if (zdVar.f52523r0 < org.telegram.messenger.qp.s1(i7).f24958z4) {
                if (zdVar.f52521q0 != null) {
                    d51 d51Var = zdVar.m0;
                    ug.i0 i0Var = new ug.i0(30, zdVar.f52517o0, zdVar.getContext(), d51Var, zdVar.f52516n0);
                    i0Var.B1(j3);
                    i0Var.z1(zdVar.f52521q0, true);
                    org.telegram.messenger.qp.s1(i7).G0().b(j3, zdVar.f52521q0, new org.telegram.messenger.voip.k(8, zdVar, i0Var));
                    return;
                }
                return;
            }
            zdVar.f52513j1 = !zdVar.f52513j1;
            org.telegram.messenger.g0.r(ddVar);
            org.telegram.messenger.g0.i3(ddVar, 1000L);
            zdVar.X0.f37556f3.O(true);
        } else if (i10 == 4) {
            zdVar.m0.presentFragment(new hi.q3(j3));
        }
    }
}
