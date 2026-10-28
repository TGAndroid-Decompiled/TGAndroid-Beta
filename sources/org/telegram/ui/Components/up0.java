package org.telegram.ui.Components;
public final class up0 implements o1.f {
    public final int f33438a;
    public final cq0 f33439b;
    public final o1.j f33440c;

    public up0(cq0 cq0Var, o1.j jVar, int i10) {
        this.f33438a = i10;
        this.f33439b = cq0Var;
        this.f33440c = jVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f33438a) {
            case 0:
                if (!z10) {
                    this.f33439b.f27236z.remove(this.f33440c);
                    hVar.c();
                    return;
                }
                return;
            default:
                cq0 cq0Var = this.f33439b;
                if (!z10) {
                    cq0Var.f27236z.remove(this.f33440c);
                    hVar.c();
                    return;
                }
                cq0Var.getClass();
                return;
        }
    }
}
