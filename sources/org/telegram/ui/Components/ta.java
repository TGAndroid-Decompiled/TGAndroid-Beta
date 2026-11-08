package org.telegram.ui.Components;
public final class ta implements r1.c {
    public final int f38314a;
    public final Object f38315b;

    public ta(Object obj, int i7) {
        this.f38314a = i7;
        this.f38315b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f38314a) {
            case 0:
                cc ccVar = (cc) this.f38315b;
                if (ccVar.d == gVar) {
                    ccVar.d = null;
                    return;
                }
                return;
            case 1:
                pa paVar = (pa) this.f38315b;
                if (!z9) {
                    paVar.run();
                    return;
                }
                return;
            case 2:
                ik ikVar = (ik) this.f38315b;
                ikVar.f34741l0 = null;
                ikVar.m0 = 1.0f;
                ikVar.m0();
                return;
            case 3:
                bn0 bn0Var = (bn0) this.f38315b;
                bn0Var.f32274q = false;
                bn0Var.dismiss();
                return;
            case 4:
                cn0 cn0Var = (cn0) this.f38315b;
                cn0Var.f32647s = false;
                cn0Var.f32646r = false;
                if (!z9) {
                    gVar.d();
                }
                if (gVar == cn0Var.f32644f) {
                    cn0Var.f32644f = null;
                    return;
                }
                return;
            case 5:
                mo0 mo0Var = (mo0) this.f38315b;
                mo0Var.f36069w1.setVisibility(8);
                mo0Var.f36060r2.setVisibility(8);
                ko0 ko0Var = mo0Var.D1;
                ko0Var.f35405f = null;
                ko0Var.f();
                mo0Var.f36064t2 = null;
                mo0Var.E2 = false;
                return;
            default:
                mo0 mo0Var2 = ((vn0) this.f38315b).d;
                mo0Var2.f36071x1.setVisibility(8);
                mo0Var2.f36073y1.setVisibility(8);
                mo0Var2.f36058q2.setVisibility(8);
                mo0Var2.f36064t2 = null;
                return;
        }
    }
}
