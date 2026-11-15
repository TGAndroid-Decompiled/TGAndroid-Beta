package org.telegram.ui.Components;
public final class pa implements r1.c {
    public final int f38252a;
    public final Object f38253b;

    public pa(Object obj, int i7) {
        this.f38252a = i7;
        this.f38253b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f38252a) {
            case 0:
                xb xbVar = (xb) this.f38253b;
                if (xbVar.d == gVar) {
                    xbVar.d = null;
                    return;
                }
                return;
            case 1:
                la laVar = (la) this.f38253b;
                if (!z10) {
                    laVar.run();
                    return;
                }
                return;
            case 2:
                qk qkVar = (qk) this.f38253b;
                qkVar.m0 = null;
                qkVar.f38679n0 = 1.0f;
                qkVar.m0();
                return;
            case 3:
                fn0 fn0Var = (fn0) this.f38253b;
                fn0Var.f34652q = false;
                fn0Var.dismiss();
                return;
            case 4:
                gn0 gn0Var = (gn0) this.f38253b;
                gn0Var.f35035s = false;
                gn0Var.f35034r = false;
                if (!z10) {
                    gVar.d();
                }
                if (gVar == gn0Var.f35032f) {
                    gn0Var.f35032f = null;
                    return;
                }
                return;
            case 5:
                po0 po0Var = (po0) this.f38253b;
                po0Var.A1.setVisibility(8);
                po0Var.f38369v2.setVisibility(8);
                no0 no0Var = po0Var.H1;
                no0Var.f37668f = null;
                no0Var.f();
                po0Var.f38373x2 = null;
                po0Var.I2 = false;
                return;
            default:
                po0 po0Var2 = ((yn0) this.f38253b).d;
                po0Var2.B1.setVisibility(8);
                po0Var2.C1.setVisibility(8);
                po0Var2.f38367u2.setVisibility(8);
                po0Var2.f38373x2 = null;
                return;
        }
    }
}
