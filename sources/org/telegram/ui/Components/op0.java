package org.telegram.ui.Components;
public final class op0 implements o1.f {
    public final int f28012a;
    public final wp0 f28013b;
    public final o1.k f28014c;

    public op0(wp0 wp0Var, o1.k kVar, int i10) {
        this.f28012a = i10;
        this.f28013b = wp0Var;
        this.f28014c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f28012a) {
            case 0:
                if (!z10) {
                    this.f28013b.f30943z.remove(this.f28014c);
                    hVar.c();
                    return;
                }
                return;
            default:
                wp0 wp0Var = this.f28013b;
                if (!z10) {
                    wp0Var.f30943z.remove(this.f28014c);
                    hVar.c();
                    return;
                }
                wp0Var.getClass();
                return;
        }
    }
}
