package org.telegram.ui.Components;
public final class kp0 implements o1.f {
    public final int f27909a;
    public final sp0 f27910b;
    public final o1.k f27911c;

    public kp0(sp0 sp0Var, o1.k kVar, int i10) {
        this.f27909a = i10;
        this.f27910b = sp0Var;
        this.f27911c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f27909a) {
            case 0:
                if (!z10) {
                    this.f27910b.f30338z.remove(this.f27911c);
                    hVar.c();
                    return;
                }
                return;
            default:
                sp0 sp0Var = this.f27910b;
                if (!z10) {
                    sp0Var.f30338z.remove(this.f27911c);
                    hVar.c();
                    return;
                }
                sp0Var.getClass();
                return;
        }
    }
}
