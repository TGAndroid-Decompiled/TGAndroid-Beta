package org.telegram.ui.Components;
public final class wn0 implements o1.f {
    public final int f34299a;
    public final eo0 f34300b;
    public final o1.j f34301c;

    public wn0(eo0 eo0Var, o1.j jVar, int i9) {
        this.f34299a = i9;
        this.f34300b = eo0Var;
        this.f34301c = jVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        switch (this.f34299a) {
            case 0:
                if (!z10) {
                    this.f34300b.f28101z.remove(this.f34301c);
                    hVar.c();
                    return;
                }
                return;
            default:
                eo0 eo0Var = this.f34300b;
                if (!z10) {
                    eo0Var.f28101z.remove(this.f34301c);
                    hVar.c();
                    return;
                }
                eo0Var.getClass();
                return;
        }
    }
}
