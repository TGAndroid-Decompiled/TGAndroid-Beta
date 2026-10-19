package org.telegram.ui.Components;
public final class jp0 implements o1.f {
    public final int f27568a;
    public final rp0 f27569b;
    public final o1.k f27570c;

    public jp0(rp0 rp0Var, o1.k kVar, int i10) {
        this.f27568a = i10;
        this.f27569b = rp0Var;
        this.f27570c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f27568a) {
            case 0:
                if (!z10) {
                    this.f27569b.f30019z.remove(this.f27570c);
                    hVar.c();
                    return;
                }
                return;
            default:
                rp0 rp0Var = this.f27569b;
                if (!z10) {
                    rp0Var.f30019z.remove(this.f27570c);
                    hVar.c();
                    return;
                }
                rp0Var.getClass();
                return;
        }
    }
}
