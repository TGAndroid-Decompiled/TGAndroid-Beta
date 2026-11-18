package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
public final class bd implements org.telegram.ui.Components.mt0, org.telegram.ui.ActionBar.r1, org.telegram.messenger.v10 {
    public final xd f45834a;

    public bd(xd xdVar) {
        this.f45834a = xdVar;
    }

    @Override
    public int b() {
        return this.f45834a.S0;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.f45834a.f53798n0.presentFragment(new bb1(6, null));
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        xd xdVar = this.f45834a;
        cd cdVar = xdVar.f53810t1;
        int i7 = xdVar.f53801p0;
        long j3 = xdVar.f53803q0;
        int i10 = ((org.telegram.ui.Components.l41) obj).d;
        if (i10 == 1) {
            if (xdVar.f53807s0 < org.telegram.messenger.mp.u1(i7).C4) {
                if (xdVar.f53805r0 != null) {
                    c51 c51Var = xdVar.f53798n0;
                    ug.l0 l0Var = new ug.l0(30, xdVar.f53801p0, xdVar.getContext(), c51Var, xdVar.f53799o0);
                    l0Var.C1(j3);
                    l0Var.A1(xdVar.f53805r0, true);
                    org.telegram.messenger.mp.u1(i7).I0().b(j3, xdVar.f53805r0, new li.d(12, xdVar, l0Var));
                    return;
                }
                return;
            }
            xdVar.f53796k1 = !xdVar.f53796k1;
            org.telegram.messenger.g0.r(cdVar);
            org.telegram.messenger.g0.h3(cdVar, 1000L);
            xdVar.Y0.f34607g3.O(true);
        } else if (i10 == 4) {
            xdVar.f53798n0.presentFragment(new ki.i3(j3));
        }
    }
}
