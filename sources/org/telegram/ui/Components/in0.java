package org.telegram.ui.Components;
public final class in0 implements r1.c {
    public final int f36283a;
    public final qn0 f36284b;
    public final r1.g f36285c;

    public in0(qn0 qn0Var, r1.g gVar, int i7) {
        this.f36283a = i7;
        this.f36284b = qn0Var;
        this.f36285c = gVar;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f36283a) {
            case 0:
                if (!z10) {
                    this.f36284b.f38965z.remove(this.f36285c);
                    gVar.d();
                    return;
                }
                return;
            default:
                qn0 qn0Var = this.f36284b;
                if (!z10) {
                    qn0Var.f38965z.remove(this.f36285c);
                    gVar.d();
                    return;
                }
                qn0Var.getClass();
                return;
        }
    }
}
