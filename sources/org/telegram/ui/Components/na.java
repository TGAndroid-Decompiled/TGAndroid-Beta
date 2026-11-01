package org.telegram.ui.Components;
public final class na implements o1.f {
    public final int f28758a;
    public final Object f28759b;

    public na(Object obj, int i10) {
        this.f28758a = i10;
        this.f28759b = obj;
    }

    @Override
    public final void a(o1.j jVar, boolean z10, float f7, float f10) {
        switch (this.f28758a) {
            case 0:
                wb wbVar = (wb) this.f28759b;
                if (wbVar.d == jVar) {
                    wbVar.d = null;
                    return;
                }
                return;
            case 1:
                ja jaVar = (ja) this.f28759b;
                if (!z10) {
                    jaVar.run();
                    return;
                }
                return;
            case 2:
                kk kkVar = (kk) this.f28759b;
                kkVar.f27871l0 = null;
                kkVar.m0 = 1.0f;
                kkVar.k0();
                return;
            case 3:
                do0 do0Var = (do0) this.f28759b;
                do0Var.f25528q = false;
                do0Var.dismiss();
                return;
            case 4:
                eo0 eo0Var = (eo0) this.f28759b;
                eo0Var.f25893s = false;
                eo0Var.f25892r = false;
                if (!z10) {
                    jVar.d();
                }
                if (jVar == eo0Var.f25890f) {
                    eo0Var.f25890f = null;
                    return;
                }
                return;
            case 5:
                pp0 pp0Var = (pp0) this.f28759b;
                pp0Var.f29502w1.setVisibility(8);
                pp0Var.f29493r2.setVisibility(8);
                np0 np0Var = pp0Var.D1;
                np0Var.f28933f = null;
                np0Var.f();
                pp0Var.f29497t2 = null;
                pp0Var.E2 = false;
                return;
            default:
                pp0 pp0Var2 = ((yo0) this.f28759b).d;
                pp0Var2.f29504x1.setVisibility(8);
                pp0Var2.f29506y1.setVisibility(8);
                pp0Var2.f29491q2.setVisibility(8);
                pp0Var2.f29497t2 = null;
                return;
        }
    }
}
