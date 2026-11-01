package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
public final class ld implements org.telegram.ui.Components.hu0, org.telegram.ui.ActionBar.u1, org.telegram.messenger.p20 {
    public final le f39194a;

    public ld(le leVar) {
        this.f39194a = leVar;
    }

    @Override
    public int c() {
        return this.f39194a.R0;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        this.f39194a.m0.presentFragment(new rc1(6, null));
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        le leVar = this.f39194a;
        md mdVar = leVar.f39224s1;
        int i10 = leVar.f39215o0;
        long j10 = leVar.f39217p0;
        int i11 = ((org.telegram.ui.Components.b51) obj).d;
        if (i11 == 1) {
            if (leVar.f39221r0 < org.telegram.messenger.wp.r1(i10).A4) {
                if (leVar.f39219q0 != null) {
                    s61 s61Var = leVar.m0;
                    kg.q0 q0Var = new kg.q0(30, leVar.f39215o0, leVar.getContext(), s61Var, leVar.f39213n0);
                    q0Var.B1(j10);
                    q0Var.z1(leVar.f39219q0, true);
                    org.telegram.messenger.wp.r1(i10).G0().b(j10, leVar.f39219q0, new ag.e0(15, leVar, q0Var));
                    return;
                }
                return;
            }
            leVar.f39210j1 = !leVar.f39210j1;
            org.telegram.messenger.i0.r(mdVar);
            org.telegram.messenger.i0.h3(mdVar, 1000L);
            leVar.X0.f31183f3.O(true);
        } else if (i11 == 4) {
            leVar.m0.presentFragment(new xh.z2(j10));
        }
    }
}
