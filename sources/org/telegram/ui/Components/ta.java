package org.telegram.ui.Components;
public final class ta implements r1.c {
    public final int f38306a;
    public final Object f38307b;

    public ta(Object obj, int i7) {
        this.f38306a = i7;
        this.f38307b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f38306a) {
            case 0:
                cc ccVar = (cc) this.f38307b;
                if (ccVar.d == gVar) {
                    ccVar.d = null;
                    return;
                }
                return;
            case 1:
                pa paVar = (pa) this.f38307b;
                if (!z9) {
                    paVar.run();
                    return;
                }
                return;
            case 2:
                ik ikVar = (ik) this.f38307b;
                ikVar.f34704l0 = null;
                ikVar.m0 = 1.0f;
                ikVar.m0();
                return;
            case 3:
                bn0 bn0Var = (bn0) this.f38307b;
                bn0Var.f32225q = false;
                bn0Var.dismiss();
                return;
            case 4:
                cn0 cn0Var = (cn0) this.f38307b;
                cn0Var.f32625s = false;
                cn0Var.f32624r = false;
                if (!z9) {
                    gVar.d();
                }
                if (gVar == cn0Var.f32622f) {
                    cn0Var.f32622f = null;
                    return;
                }
                return;
            case 5:
                mo0 mo0Var = (mo0) this.f38307b;
                mo0Var.f36087w1.setVisibility(8);
                mo0Var.f36078r2.setVisibility(8);
                ko0 ko0Var = mo0Var.D1;
                ko0Var.f35385f = null;
                ko0Var.f();
                mo0Var.f36082t2 = null;
                mo0Var.E2 = false;
                return;
            default:
                mo0 mo0Var2 = ((vn0) this.f38307b).d;
                mo0Var2.f36089x1.setVisibility(8);
                mo0Var2.f36091y1.setVisibility(8);
                mo0Var2.f36076q2.setVisibility(8);
                mo0Var2.f36082t2 = null;
                return;
        }
    }
}
