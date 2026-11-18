package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
public final class bd implements org.telegram.ui.Components.mt0, org.telegram.ui.ActionBar.r1, org.telegram.messenger.v10 {
    public final xd f45845a;

    public bd(xd xdVar) {
        this.f45845a = xdVar;
    }

    @Override
    public int b() {
        return this.f45845a.S0;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.f45845a.f53804n0.presentFragment(new bb1(6, null));
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        xd xdVar = this.f45845a;
        cd cdVar = xdVar.f53816t1;
        int i7 = xdVar.f53807p0;
        long j3 = xdVar.f53809q0;
        int i10 = ((org.telegram.ui.Components.l41) obj).d;
        if (i10 == 1) {
            if (xdVar.f53813s0 < org.telegram.messenger.mp.u1(i7).C4) {
                if (xdVar.f53811r0 != null) {
                    c51 c51Var = xdVar.f53804n0;
                    ug.l0 l0Var = new ug.l0(30, xdVar.f53807p0, xdVar.getContext(), c51Var, xdVar.f53805o0);
                    l0Var.C1(j3);
                    l0Var.A1(xdVar.f53811r0, true);
                    org.telegram.messenger.mp.u1(i7).I0().b(j3, xdVar.f53811r0, new li.d(12, xdVar, l0Var));
                    return;
                }
                return;
            }
            xdVar.f53802k1 = !xdVar.f53802k1;
            org.telegram.messenger.g0.r(cdVar);
            org.telegram.messenger.g0.h3(cdVar, 1000L);
            xdVar.Y0.f34607g3.O(true);
        } else if (i10 == 4) {
            xdVar.f53804n0.presentFragment(new ki.i3(j3));
        }
    }
}
