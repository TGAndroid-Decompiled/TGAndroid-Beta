package org.telegram.ui.Components;
public final class ta implements r1.c {
    public final int f38286a;
    public final Object f38287b;

    public ta(Object obj, int i7) {
        this.f38286a = i7;
        this.f38287b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f38286a) {
            case 0:
                cc ccVar = (cc) this.f38287b;
                if (ccVar.d == gVar) {
                    ccVar.d = null;
                    return;
                }
                return;
            case 1:
                pa paVar = (pa) this.f38287b;
                if (!z9) {
                    paVar.run();
                    return;
                }
                return;
            case 2:
                ik ikVar = (ik) this.f38287b;
                ikVar.f34697l0 = null;
                ikVar.m0 = 1.0f;
                ikVar.m0();
                return;
            case 3:
                bn0 bn0Var = (bn0) this.f38287b;
                bn0Var.f32253q = false;
                bn0Var.dismiss();
                return;
            case 4:
                cn0 cn0Var = (cn0) this.f38287b;
                cn0Var.f32616s = false;
                cn0Var.f32615r = false;
                if (!z9) {
                    gVar.d();
                }
                if (gVar == cn0Var.f32613f) {
                    cn0Var.f32613f = null;
                    return;
                }
                return;
            case 5:
                mo0 mo0Var = (mo0) this.f38287b;
                mo0Var.f36041w1.setVisibility(8);
                mo0Var.f36032r2.setVisibility(8);
                ko0 ko0Var = mo0Var.D1;
                ko0Var.f35379f = null;
                ko0Var.f();
                mo0Var.f36036t2 = null;
                mo0Var.E2 = false;
                return;
            default:
                mo0 mo0Var2 = ((vn0) this.f38287b).d;
                mo0Var2.f36043x1.setVisibility(8);
                mo0Var2.f36045y1.setVisibility(8);
                mo0Var2.f36030q2.setVisibility(8);
                mo0Var2.f36036t2 = null;
                return;
        }
    }
}
