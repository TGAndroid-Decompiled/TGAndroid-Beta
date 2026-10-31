package org.telegram.ui.Components;
public final class na implements o1.f {
    public final int f28732a;
    public final Object f28733b;

    public na(Object obj, int i10) {
        this.f28732a = i10;
        this.f28733b = obj;
    }

    @Override
    public final void a(o1.j jVar, boolean z10, float f7, float f10) {
        switch (this.f28732a) {
            case 0:
                wb wbVar = (wb) this.f28733b;
                if (wbVar.d == jVar) {
                    wbVar.d = null;
                    return;
                }
                return;
            case 1:
                ja jaVar = (ja) this.f28733b;
                if (!z10) {
                    jaVar.run();
                    return;
                }
                return;
            case 2:
                kk kkVar = (kk) this.f28733b;
                kkVar.f27792l0 = null;
                kkVar.m0 = 1.0f;
                kkVar.k0();
                return;
            case 3:
                co0 co0Var = (co0) this.f28733b;
                co0Var.f25114q = false;
                co0Var.dismiss();
                return;
            case 4:
                do0 do0Var = (do0) this.f28733b;
                do0Var.f25479s = false;
                do0Var.f25478r = false;
                if (!z10) {
                    jVar.d();
                }
                if (jVar == do0Var.f25476f) {
                    do0Var.f25476f = null;
                    return;
                }
                return;
            case 5:
                op0 op0Var = (op0) this.f28733b;
                op0Var.f29147w1.setVisibility(8);
                op0Var.f29138r2.setVisibility(8);
                mp0 mp0Var = op0Var.D1;
                mp0Var.f28569f = null;
                mp0Var.f();
                op0Var.f29142t2 = null;
                op0Var.E2 = false;
                return;
            default:
                op0 op0Var2 = ((xo0) this.f28733b).d;
                op0Var2.f29149x1.setVisibility(8);
                op0Var2.f29151y1.setVisibility(8);
                op0Var2.f29136q2.setVisibility(8);
                op0Var2.f29142t2 = null;
                return;
        }
    }
}
