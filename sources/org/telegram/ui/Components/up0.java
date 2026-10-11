package org.telegram.ui.Components;
public final class up0 implements o1.f {
    public final int f31542a;
    public final cq0 f31543b;
    public final o1.k f31544c;

    public up0(cq0 cq0Var, o1.k kVar, int i10) {
        this.f31542a = i10;
        this.f31543b = cq0Var;
        this.f31544c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f31542a) {
            case 0:
                if (!z10) {
                    this.f31543b.f25289z.remove(this.f31544c);
                    hVar.c();
                    return;
                }
                return;
            default:
                cq0 cq0Var = this.f31543b;
                if (!z10) {
                    cq0Var.f25289z.remove(this.f31544c);
                    hVar.c();
                    return;
                }
                cq0Var.getClass();
                return;
        }
    }
}
