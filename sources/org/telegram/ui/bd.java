package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
public final class bd implements org.telegram.ui.Components.et0, org.telegram.ui.ActionBar.q1, org.telegram.messenger.x10 {
    public final xd f45677a;

    public bd(xd xdVar) {
        this.f45677a = xdVar;
    }

    @Override
    public int b() {
        return this.f45677a.S0;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.f45677a.f53189n0.presentFragment(new xa1(6, null));
    }

    @Override
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        xd xdVar = this.f45677a;
        cd cdVar = xdVar.f53201t1;
        int i7 = xdVar.f53192p0;
        long j3 = xdVar.f53194q0;
        int i10 = ((org.telegram.ui.Components.b41) obj).d;
        if (i10 == 1) {
            if (xdVar.f53198s0 < org.telegram.messenger.np.s1(i7).A4) {
                if (xdVar.f53196r0 != null) {
                    z41 z41Var = xdVar.f53189n0;
                    ug.j0 j0Var = new ug.j0(30, xdVar.f53192p0, xdVar.getContext(), z41Var, xdVar.f53190o0);
                    j0Var.B1(j3);
                    j0Var.z1(xdVar.f53196r0, true);
                    org.telegram.messenger.np.s1(i7).G0().b(j3, xdVar.f53196r0, new li.v(13, xdVar, j0Var));
                    return;
                }
                return;
            }
            xdVar.f53187k1 = !xdVar.f53187k1;
            org.telegram.messenger.g0.r(cdVar);
            org.telegram.messenger.g0.i3(cdVar, 1000L);
            xdVar.Y0.f39892g3.O(true);
        } else if (i10 == 4) {
            xdVar.f53189n0.presentFragment(new ki.n3(j3));
        }
    }
}
