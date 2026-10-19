package org.telegram.ui.Components;
public final class jp0 implements o1.f {
    public final int f27570a;
    public final rp0 f27571b;
    public final o1.k f27572c;

    public jp0(rp0 rp0Var, o1.k kVar, int i10) {
        this.f27570a = i10;
        this.f27571b = rp0Var;
        this.f27572c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f27570a) {
            case 0:
                if (!z10) {
                    this.f27571b.f30022z.remove(this.f27572c);
                    hVar.c();
                    return;
                }
                return;
            default:
                rp0 rp0Var = this.f27571b;
                if (!z10) {
                    rp0Var.f30022z.remove(this.f27572c);
                    hVar.c();
                    return;
                }
                rp0Var.getClass();
                return;
        }
    }
}
