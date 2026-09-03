package org.telegram.ui.Components;
public final class ro0 implements o1.f {
    public final int f30859a;
    public final zo0 f30860b;
    public final o1.j f30861c;

    public ro0(zo0 zo0Var, o1.j jVar, int i10) {
        this.f30859a = i10;
        this.f30860b = zo0Var;
        this.f30861c = jVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.f30859a) {
            case 0:
                if (!z4) {
                    this.f30860b.f33991z.remove(this.f30861c);
                    hVar.c();
                    return;
                }
                return;
            default:
                zo0 zo0Var = this.f30860b;
                if (!z4) {
                    zo0Var.f33991z.remove(this.f30861c);
                    hVar.c();
                    return;
                }
                zo0Var.getClass();
                return;
        }
    }
}
