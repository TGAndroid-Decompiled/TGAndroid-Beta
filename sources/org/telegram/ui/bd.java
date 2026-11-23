package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
public final class bd implements org.telegram.ui.Components.ot0, org.telegram.ui.ActionBar.q1, org.telegram.messenger.u10 {
    public final xd f46018a;

    public bd(xd xdVar) {
        this.f46018a = xdVar;
    }

    @Override
    public int b() {
        return this.f46018a.S0;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.f46018a.f53932n0.presentFragment(new za1(6, null));
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        xd xdVar = this.f46018a;
        cd cdVar = xdVar.f53944t1;
        int i7 = xdVar.f53935p0;
        long j3 = xdVar.f53937q0;
        int i10 = ((org.telegram.ui.Components.n41) obj).d;
        if (i10 == 1) {
            if (xdVar.f53941s0 < org.telegram.messenger.mp.u1(i7).C4) {
                if (xdVar.f53939r0 != null) {
                    b51 b51Var = xdVar.f53932n0;
                    ug.k0 k0Var = new ug.k0(30, xdVar.f53935p0, xdVar.getContext(), b51Var, xdVar.f53933o0);
                    k0Var.C1(j3);
                    k0Var.A1(xdVar.f53939r0, true);
                    org.telegram.messenger.mp.u1(i7).I0().b(j3, xdVar.f53939r0, new ki.n2(13, xdVar, k0Var));
                    return;
                }
                return;
            }
            xdVar.f53930k1 = !xdVar.f53930k1;
            org.telegram.messenger.g0.r(cdVar);
            org.telegram.messenger.g0.h3(cdVar, 1000L);
            xdVar.Y0.f35323g3.O(true);
        } else if (i10 == 4) {
            xdVar.f53932n0.presentFragment(new ki.i3(j3));
        }
    }
}
