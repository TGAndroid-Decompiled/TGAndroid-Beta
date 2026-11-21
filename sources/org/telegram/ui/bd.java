package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
public final class bd implements org.telegram.ui.Components.pt0, org.telegram.ui.ActionBar.q1, org.telegram.messenger.v10 {
    public final xd f45866a;

    public bd(xd xdVar) {
        this.f45866a = xdVar;
    }

    @Override
    public int b() {
        return this.f45866a.S0;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.f45866a.f53841n0.presentFragment(new bb1(6, null));
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        xd xdVar = this.f45866a;
        cd cdVar = xdVar.f53853t1;
        int i7 = xdVar.f53844p0;
        long j3 = xdVar.f53846q0;
        int i10 = ((org.telegram.ui.Components.o41) obj).d;
        if (i10 == 1) {
            if (xdVar.f53850s0 < org.telegram.messenger.mp.u1(i7).C4) {
                if (xdVar.f53848r0 != null) {
                    c51 c51Var = xdVar.f53841n0;
                    ug.k0 k0Var = new ug.k0(30, xdVar.f53844p0, xdVar.getContext(), c51Var, xdVar.f53842o0);
                    k0Var.C1(j3);
                    k0Var.A1(xdVar.f53848r0, true);
                    org.telegram.messenger.mp.u1(i7).I0().b(j3, xdVar.f53848r0, new li.d(12, xdVar, k0Var));
                    return;
                }
                return;
            }
            xdVar.f53839k1 = !xdVar.f53839k1;
            org.telegram.messenger.g0.r(cdVar);
            org.telegram.messenger.g0.h3(cdVar, 1000L);
            xdVar.Y0.f35796g3.O(true);
        } else if (i10 == 4) {
            xdVar.f53841n0.presentFragment(new ki.h3(j3));
        }
    }
}
