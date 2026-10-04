package org.telegram.ui.Components;
public final class gp0 implements o1.f {
    public final int f26909a;
    public final op0 f26910b;
    public final o1.k f26911c;

    public gp0(op0 op0Var, o1.k kVar, int i10) {
        this.f26909a = i10;
        this.f26910b = op0Var;
        this.f26911c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f26909a) {
            case 0:
                if (!z10) {
                    this.f26910b.f29442z.remove(this.f26911c);
                    hVar.c();
                    return;
                }
                return;
            default:
                op0 op0Var = this.f26910b;
                if (!z10) {
                    op0Var.f29442z.remove(this.f26911c);
                    hVar.c();
                    return;
                }
                op0Var.getClass();
                return;
        }
    }
}
