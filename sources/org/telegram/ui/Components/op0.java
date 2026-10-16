package org.telegram.ui.Components;
public final class op0 implements o1.f {
    public final int f27703a;
    public final wp0 f27704b;
    public final o1.k f27705c;

    public op0(wp0 wp0Var, o1.k kVar, int i10) {
        this.f27703a = i10;
        this.f27704b = wp0Var;
        this.f27705c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f27703a) {
            case 0:
                if (!z10) {
                    this.f27704b.f30631z.remove(this.f27705c);
                    hVar.c();
                    return;
                }
                return;
            default:
                wp0 wp0Var = this.f27704b;
                if (!z10) {
                    wp0Var.f30631z.remove(this.f27705c);
                    hVar.c();
                    return;
                }
                wp0Var.getClass();
                return;
        }
    }
}
