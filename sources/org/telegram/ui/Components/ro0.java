package org.telegram.ui.Components;
public final class ro0 implements o1.f {
    public final int f28503a;
    public final zo0 f28504b;
    public final o1.j f28505c;

    public ro0(zo0 zo0Var, o1.j jVar, int i10) {
        this.f28503a = i10;
        this.f28504b = zo0Var;
        this.f28505c = jVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.f28503a) {
            case 0:
                if (!z4) {
                    this.f28504b.f31423z.remove(this.f28505c);
                    hVar.c();
                    return;
                }
                return;
            default:
                zo0 zo0Var = this.f28504b;
                if (!z4) {
                    zo0Var.f31423z.remove(this.f28505c);
                    hVar.c();
                    return;
                }
                zo0Var.getClass();
                return;
        }
    }
}
