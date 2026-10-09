package org.telegram.ui.Components;
public final class sp0 implements o1.f {
    public final int f30866a;
    public final aq0 f30867b;
    public final o1.k f30868c;

    public sp0(aq0 aq0Var, o1.k kVar, int i10) {
        this.f30866a = i10;
        this.f30867b = aq0Var;
        this.f30868c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f30866a) {
            case 0:
                if (!z10) {
                    this.f30867b.f24748z.remove(this.f30868c);
                    hVar.c();
                    return;
                }
                return;
            default:
                aq0 aq0Var = this.f30867b;
                if (!z10) {
                    aq0Var.f24748z.remove(this.f30868c);
                    hVar.c();
                    return;
                }
                aq0Var.getClass();
                return;
        }
    }
}
