package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
public final class bd implements org.telegram.ui.Components.pt0, org.telegram.ui.ActionBar.q1, org.telegram.messenger.w10 {
    public final xd f45870a;

    public bd(xd xdVar) {
        this.f45870a = xdVar;
    }

    @Override
    public int b() {
        return this.f45870a.S0;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.f45870a.f53845n0.presentFragment(new bb1(6, null));
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        xd xdVar = this.f45870a;
        cd cdVar = xdVar.f53857t1;
        int i7 = xdVar.f53848p0;
        long j3 = xdVar.f53850q0;
        int i10 = ((org.telegram.ui.Components.o41) obj).d;
        if (i10 == 1) {
            if (xdVar.f53854s0 < org.telegram.messenger.np.u1(i7).C4) {
                if (xdVar.f53852r0 != null) {
                    c51 c51Var = xdVar.f53845n0;
                    ug.k0 k0Var = new ug.k0(30, xdVar.f53848p0, xdVar.getContext(), c51Var, xdVar.f53846o0);
                    k0Var.C1(j3);
                    k0Var.A1(xdVar.f53852r0, true);
                    org.telegram.messenger.np.u1(i7).I0().b(j3, xdVar.f53852r0, new li.d(12, xdVar, k0Var));
                    return;
                }
                return;
            }
            xdVar.f53843k1 = !xdVar.f53843k1;
            org.telegram.messenger.g0.r(cdVar);
            org.telegram.messenger.g0.h3(cdVar, 1000L);
            xdVar.Y0.f35789g3.O(true);
        } else if (i10 == 4) {
            xdVar.f53845n0.presentFragment(new ki.h3(j3));
        }
    }
}
