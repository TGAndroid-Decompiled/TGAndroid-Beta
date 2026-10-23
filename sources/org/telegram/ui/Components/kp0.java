package org.telegram.ui.Components;
public final class kp0 implements o1.f {
    public final int f27913a;
    public final sp0 f27914b;
    public final o1.k f27915c;

    public kp0(sp0 sp0Var, o1.k kVar, int i10) {
        this.f27913a = i10;
        this.f27914b = sp0Var;
        this.f27915c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f27913a) {
            case 0:
                if (!z10) {
                    this.f27914b.f30343z.remove(this.f27915c);
                    hVar.c();
                    return;
                }
                return;
            default:
                sp0 sp0Var = this.f27914b;
                if (!z10) {
                    sp0Var.f30343z.remove(this.f27915c);
                    hVar.c();
                    return;
                }
                sp0Var.getClass();
                return;
        }
    }
}
