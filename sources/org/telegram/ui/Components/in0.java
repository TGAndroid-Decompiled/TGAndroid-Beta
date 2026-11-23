package org.telegram.ui.Components;
public final class in0 implements r1.c {
    public final int f36282a;
    public final qn0 f36283b;
    public final r1.g f36284c;

    public in0(qn0 qn0Var, r1.g gVar, int i7) {
        this.f36282a = i7;
        this.f36283b = qn0Var;
        this.f36284c = gVar;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f36282a) {
            case 0:
                if (!z10) {
                    this.f36283b.f38964z.remove(this.f36284c);
                    gVar.d();
                    return;
                }
                return;
            default:
                qn0 qn0Var = this.f36283b;
                if (!z10) {
                    qn0Var.f38964z.remove(this.f36284c);
                    gVar.d();
                    return;
                }
                qn0Var.getClass();
                return;
        }
    }
}
