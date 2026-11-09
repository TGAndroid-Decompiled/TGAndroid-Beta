package org.telegram.ui.Components;
public final class ta implements r1.c {
    public final int f38333a;
    public final Object f38334b;

    public ta(Object obj, int i7) {
        this.f38333a = i7;
        this.f38334b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f38333a) {
            case 0:
                cc ccVar = (cc) this.f38334b;
                if (ccVar.d == gVar) {
                    ccVar.d = null;
                    return;
                }
                return;
            case 1:
                pa paVar = (pa) this.f38334b;
                if (!z9) {
                    paVar.run();
                    return;
                }
                return;
            case 2:
                ik ikVar = (ik) this.f38334b;
                ikVar.f34779l0 = null;
                ikVar.m0 = 1.0f;
                ikVar.m0();
                return;
            case 3:
                cn0 cn0Var = (cn0) this.f38334b;
                cn0Var.f32718q = false;
                cn0Var.dismiss();
                return;
            case 4:
                dn0 dn0Var = (dn0) this.f38334b;
                dn0Var.f33120s = false;
                dn0Var.f33119r = false;
                if (!z9) {
                    gVar.d();
                }
                if (gVar == dn0Var.f33117f) {
                    dn0Var.f33117f = null;
                    return;
                }
                return;
            case 5:
                no0 no0Var = (no0) this.f38334b;
                no0Var.f36463w1.setVisibility(8);
                no0Var.f36454r2.setVisibility(8);
                lo0 lo0Var = no0Var.D1;
                lo0Var.f35780f = null;
                lo0Var.f();
                no0Var.f36458t2 = null;
                no0Var.E2 = false;
                return;
            default:
                no0 no0Var2 = ((wn0) this.f38334b).d;
                no0Var2.f36465x1.setVisibility(8);
                no0Var2.f36467y1.setVisibility(8);
                no0Var2.f36452q2.setVisibility(8);
                no0Var2.f36458t2 = null;
                return;
        }
    }
}
