package org.telegram.ui.Components;
public final class ta implements r1.c {
    public final int f38297a;
    public final Object f38298b;

    public ta(Object obj, int i7) {
        this.f38297a = i7;
        this.f38298b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f38297a) {
            case 0:
                cc ccVar = (cc) this.f38298b;
                if (ccVar.d == gVar) {
                    ccVar.d = null;
                    return;
                }
                return;
            case 1:
                pa paVar = (pa) this.f38298b;
                if (!z9) {
                    paVar.run();
                    return;
                }
                return;
            case 2:
                ik ikVar = (ik) this.f38298b;
                ikVar.f34667l0 = null;
                ikVar.m0 = 1.0f;
                ikVar.m0();
                return;
            case 3:
                bn0 bn0Var = (bn0) this.f38298b;
                bn0Var.f32219q = false;
                bn0Var.dismiss();
                return;
            case 4:
                cn0 cn0Var = (cn0) this.f38298b;
                cn0Var.f32629s = false;
                cn0Var.f32628r = false;
                if (!z9) {
                    gVar.d();
                }
                if (gVar == cn0Var.f32626f) {
                    cn0Var.f32626f = null;
                    return;
                }
                return;
            case 5:
                mo0 mo0Var = (mo0) this.f38298b;
                mo0Var.f36025w1.setVisibility(8);
                mo0Var.f36016r2.setVisibility(8);
                ko0 ko0Var = mo0Var.D1;
                ko0Var.f35388f = null;
                ko0Var.f();
                mo0Var.f36020t2 = null;
                mo0Var.E2 = false;
                return;
            default:
                mo0 mo0Var2 = ((vn0) this.f38298b).d;
                mo0Var2.f36027x1.setVisibility(8);
                mo0Var2.f36029y1.setVisibility(8);
                mo0Var2.f36014q2.setVisibility(8);
                mo0Var2.f36020t2 = null;
                return;
        }
    }
}
