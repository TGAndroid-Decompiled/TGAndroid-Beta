package org.telegram.ui.Components;

public final class xn0 implements o1.f {

    public final int f34658a;

    public final fo0 f34659b;

    public final o1.j f34660c;

    public xn0(fo0 fo0Var, o1.j jVar, int i10) {
        this.f34658a = i10;
        this.f34659b = fo0Var;
        this.f34660c = jVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        switch (this.f34658a) {
            case 0:
                if (!z10) {
                    this.f34659b.f28421z.remove(this.f34660c);
                    hVar.c();
                }
                break;
            default:
                fo0 fo0Var = this.f34659b;
                if (!z10) {
                    fo0Var.f28421z.remove(this.f34660c);
                    hVar.c();
                } else {
                    fo0Var.getClass();
                }
                break;
        }
    }
}
