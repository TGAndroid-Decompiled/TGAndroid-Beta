package org.telegram.ui.Components;
public final class gp0 implements o1.f {
    public final int f26903a;
    public final op0 f26904b;
    public final o1.k f26905c;

    public gp0(op0 op0Var, o1.k kVar, int i10) {
        this.f26903a = i10;
        this.f26904b = op0Var;
        this.f26905c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f26903a) {
            case 0:
                if (!z10) {
                    this.f26904b.f29436z.remove(this.f26905c);
                    hVar.c();
                    return;
                }
                return;
            default:
                op0 op0Var = this.f26904b;
                if (!z10) {
                    op0Var.f29436z.remove(this.f26905c);
                    hVar.c();
                    return;
                }
                op0Var.getClass();
                return;
        }
    }
}
