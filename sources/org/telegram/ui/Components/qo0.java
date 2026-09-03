package org.telegram.ui.Components;
public final class qo0 implements o1.f {
    public final int f28222a;
    public final yo0 f28223b;
    public final o1.j f28224c;

    public qo0(yo0 yo0Var, o1.j jVar, int i10) {
        this.f28222a = i10;
        this.f28223b = yo0Var;
        this.f28224c = jVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.f28222a) {
            case 0:
                if (!z4) {
                    this.f28223b.f31094z.remove(this.f28224c);
                    hVar.c();
                    return;
                }
                return;
            default:
                yo0 yo0Var = this.f28223b;
                if (!z4) {
                    yo0Var.f31094z.remove(this.f28224c);
                    hVar.c();
                    return;
                }
                yo0Var.getClass();
                return;
        }
    }
}
