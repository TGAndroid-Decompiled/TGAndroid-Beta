package org.telegram.ui.Components;
public final class sa implements r1.c {
    public final int f37907a;
    public final Object f37908b;

    public sa(Object obj, int i7) {
        this.f37907a = i7;
        this.f37908b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f37907a) {
            case 0:
                bc bcVar = (bc) this.f37908b;
                if (bcVar.d == gVar) {
                    bcVar.d = null;
                    return;
                }
                return;
            case 1:
                oa oaVar = (oa) this.f37908b;
                if (!z9) {
                    oaVar.run();
                    return;
                }
                return;
            case 2:
                hk hkVar = (hk) this.f37908b;
                hkVar.f34379l0 = null;
                hkVar.m0 = 1.0f;
                hkVar.m0();
                return;
            case 3:
                bn0 bn0Var = (bn0) this.f37908b;
                bn0Var.f32293q = false;
                bn0Var.dismiss();
                return;
            case 4:
                cn0 cn0Var = (cn0) this.f37908b;
                cn0Var.f32721s = false;
                cn0Var.f32720r = false;
                if (!z9) {
                    gVar.d();
                }
                if (gVar == cn0Var.f32718f) {
                    cn0Var.f32718f = null;
                    return;
                }
                return;
            case 5:
                mo0 mo0Var = (mo0) this.f37908b;
                mo0Var.f36063z1.setVisibility(8);
                mo0Var.f36054u2.setVisibility(8);
                ko0 ko0Var = mo0Var.G1;
                ko0Var.f35382f = null;
                ko0Var.f();
                mo0Var.f36058w2 = null;
                mo0Var.H2 = false;
                return;
            default:
                mo0 mo0Var2 = ((vn0) this.f37908b).d;
                mo0Var2.A1.setVisibility(8);
                mo0Var2.B1.setVisibility(8);
                mo0Var2.f36052t2.setVisibility(8);
                mo0Var2.f36058w2 = null;
                return;
        }
    }
}
