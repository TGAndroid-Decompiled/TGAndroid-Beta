package org.telegram.ui.Components;
public final class in0 implements r1.c {
    public final int f36289a;
    public final qn0 f36290b;
    public final r1.g f36291c;

    public in0(qn0 qn0Var, r1.g gVar, int i7) {
        this.f36289a = i7;
        this.f36290b = qn0Var;
        this.f36291c = gVar;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f36289a) {
            case 0:
                if (!z10) {
                    this.f36290b.f38971z.remove(this.f36291c);
                    gVar.d();
                    return;
                }
                return;
            default:
                qn0 qn0Var = this.f36290b;
                if (!z10) {
                    qn0Var.f38971z.remove(this.f36291c);
                    gVar.d();
                    return;
                }
                qn0Var.getClass();
                return;
        }
    }
}
