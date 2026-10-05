package org.telegram.ui.Components;
public final class hp0 implements o1.f {
    public final int f27304a;
    public final pp0 f27305b;
    public final o1.k f27306c;

    public hp0(pp0 pp0Var, o1.k kVar, int i10) {
        this.f27304a = i10;
        this.f27305b = pp0Var;
        this.f27306c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f27304a) {
            case 0:
                if (!z10) {
                    this.f27305b.f29808z.remove(this.f27306c);
                    hVar.c();
                    return;
                }
                return;
            default:
                pp0 pp0Var = this.f27305b;
                if (!z10) {
                    pp0Var.f29808z.remove(this.f27306c);
                    hVar.c();
                    return;
                }
                pp0Var.getClass();
                return;
        }
    }
}
