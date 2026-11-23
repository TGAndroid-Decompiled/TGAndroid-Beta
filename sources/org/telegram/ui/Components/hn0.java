package org.telegram.ui.Components;
public final class hn0 implements r1.c {
    public final int f35895a;
    public final qn0 f35896b;
    public final r1.g f35897c;

    public hn0(qn0 qn0Var, r1.g gVar, int i7) {
        this.f35895a = i7;
        this.f35896b = qn0Var;
        this.f35897c = gVar;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f35895a) {
            case 0:
                if (!z10) {
                    this.f35896b.f38918z.remove(this.f35897c);
                    gVar.d();
                    return;
                }
                return;
            default:
                qn0 qn0Var = this.f35896b;
                if (!z10) {
                    qn0Var.f38918z.remove(this.f35897c);
                    gVar.d();
                    return;
                }
                qn0Var.getClass();
                return;
        }
    }
}
