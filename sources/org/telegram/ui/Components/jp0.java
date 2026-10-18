package org.telegram.ui.Components;
public final class jp0 implements o1.f {
    public final int f27567a;
    public final rp0 f27568b;
    public final o1.k f27569c;

    public jp0(rp0 rp0Var, o1.k kVar, int i10) {
        this.f27567a = i10;
        this.f27568b = rp0Var;
        this.f27569c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f27567a) {
            case 0:
                if (!z10) {
                    this.f27568b.f30015z.remove(this.f27569c);
                    hVar.c();
                    return;
                }
                return;
            default:
                rp0 rp0Var = this.f27568b;
                if (!z10) {
                    rp0Var.f30015z.remove(this.f27569c);
                    hVar.c();
                    return;
                }
                rp0Var.getClass();
                return;
        }
    }
}
