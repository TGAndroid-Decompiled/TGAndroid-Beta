package org.telegram.ui.Components;
public final class hn0 implements r1.c {
    public final int f35773a;
    public final pn0 f35774b;
    public final r1.g f35775c;

    public hn0(pn0 pn0Var, r1.g gVar, int i7) {
        this.f35773a = i7;
        this.f35774b = pn0Var;
        this.f35775c = gVar;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f35773a) {
            case 0:
                if (!z10) {
                    this.f35774b.f38525z.remove(this.f35775c);
                    gVar.d();
                    return;
                }
                return;
            default:
                pn0 pn0Var = this.f35774b;
                if (!z10) {
                    pn0Var.f38525z.remove(this.f35775c);
                    gVar.d();
                    return;
                }
                pn0Var.getClass();
                return;
        }
    }
}
