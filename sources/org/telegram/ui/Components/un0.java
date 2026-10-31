package org.telegram.ui.Components;
public final class un0 implements o1.f {
    public final int f30998a;
    public final co0 f30999b;
    public final o1.j f31000c;

    public un0(co0 co0Var, o1.j jVar, int i10) {
        this.f30998a = i10;
        this.f30999b = co0Var;
        this.f31000c = jVar;
    }

    @Override
    public final void a(o1.j jVar, boolean z10, float f7, float f10) {
        switch (this.f30998a) {
            case 0:
                if (!z10) {
                    this.f30999b.f25122z.remove(this.f31000c);
                    jVar.d();
                    return;
                }
                return;
            default:
                co0 co0Var = this.f30999b;
                if (!z10) {
                    co0Var.f25122z.remove(this.f31000c);
                    jVar.d();
                    return;
                }
                co0Var.getClass();
                return;
        }
    }
}
