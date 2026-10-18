package org.telegram.ui.Components;
public final class jp0 implements o1.f {
    public final int f27574a;
    public final rp0 f27575b;
    public final o1.k f27576c;

    public jp0(rp0 rp0Var, o1.k kVar, int i10) {
        this.f27574a = i10;
        this.f27575b = rp0Var;
        this.f27576c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f27574a) {
            case 0:
                if (!z10) {
                    this.f27575b.f30021z.remove(this.f27576c);
                    hVar.c();
                    return;
                }
                return;
            default:
                rp0 rp0Var = this.f27575b;
                if (!z10) {
                    rp0Var.f30021z.remove(this.f27576c);
                    hVar.c();
                    return;
                }
                rp0Var.getClass();
                return;
        }
    }
}
