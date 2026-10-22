package org.telegram.ui.Components;
public final class kp0 implements o1.f {
    public final int f27912a;
    public final sp0 f27913b;
    public final o1.k f27914c;

    public kp0(sp0 sp0Var, o1.k kVar, int i10) {
        this.f27912a = i10;
        this.f27913b = sp0Var;
        this.f27914c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f27912a) {
            case 0:
                if (!z10) {
                    this.f27913b.f30342z.remove(this.f27914c);
                    hVar.c();
                    return;
                }
                return;
            default:
                sp0 sp0Var = this.f27913b;
                if (!z10) {
                    sp0Var.f30342z.remove(this.f27914c);
                    hVar.c();
                    return;
                }
                sp0Var.getClass();
                return;
        }
    }
}
