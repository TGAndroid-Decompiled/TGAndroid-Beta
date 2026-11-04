package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
public final class bd implements org.telegram.ui.Components.ct0, org.telegram.ui.ActionBar.p1, org.telegram.messenger.s10 {
    public final xd f44024a;

    public bd(xd xdVar) {
        this.f44024a = xdVar;
    }

    @Override
    public int c() {
        return this.f44024a.S0;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        this.f44024a.f51925n0.presentFragment(new ra1(6, null));
    }

    @Override
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        xd xdVar = this.f44024a;
        cd cdVar = xdVar.f51938t1;
        int i3 = xdVar.f51929p0;
        long j10 = xdVar.f51931q0;
        int i10 = ((org.telegram.ui.Components.r31) obj).d;
        if (i10 == 1) {
            if (xdVar.f51935s0 < org.telegram.messenger.hp.s1(i3).f23183z4) {
                if (xdVar.f51933r0 != null) {
                    r41 r41Var = xdVar.f51925n0;
                    vg.i0 i0Var = new vg.i0(30, xdVar.f51929p0, xdVar.getContext(), r41Var, xdVar.f51927o0);
                    i0Var.B1(j10);
                    i0Var.z1(xdVar.f51933r0, true);
                    org.telegram.messenger.hp.s1(i3).G0().b(j10, xdVar.f51933r0, new mi.f(12, xdVar, i0Var));
                    return;
                }
                return;
            }
            xdVar.k1 = !xdVar.k1;
            org.telegram.messenger.g0.r(cdVar);
            org.telegram.messenger.g0.i3(cdVar, 1000L);
            xdVar.Y0.f35594g3.O(true);
        } else if (i10 == 4) {
            xdVar.f51925n0.presentFragment(new ii.q3(j10));
        }
    }
}
