package org.telegram.ui.Components;
public final class gp0 implements o1.f {
    public final int f26904a;
    public final op0 f26905b;
    public final o1.k f26906c;

    public gp0(op0 op0Var, o1.k kVar, int i10) {
        this.f26904a = i10;
        this.f26905b = op0Var;
        this.f26906c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f26904a) {
            case 0:
                if (!z10) {
                    this.f26905b.f29437z.remove(this.f26906c);
                    hVar.c();
                    return;
                }
                return;
            default:
                op0 op0Var = this.f26905b;
                if (!z10) {
                    op0Var.f29437z.remove(this.f26906c);
                    hVar.c();
                    return;
                }
                op0Var.getClass();
                return;
        }
    }
}
