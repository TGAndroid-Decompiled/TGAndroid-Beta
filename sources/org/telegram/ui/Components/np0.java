package org.telegram.ui.Components;
public final class np0 implements o1.f {
    public final int f28989a;
    public final vp0 f28990b;
    public final o1.k f28991c;

    public np0(vp0 vp0Var, o1.k kVar, int i10) {
        this.f28989a = i10;
        this.f28990b = vp0Var;
        this.f28991c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f28989a) {
            case 0:
                if (!z10) {
                    this.f28990b.f32018z.remove(this.f28991c);
                    hVar.c();
                    return;
                }
                return;
            default:
                vp0 vp0Var = this.f28990b;
                if (!z10) {
                    vp0Var.f32018z.remove(this.f28991c);
                    hVar.c();
                    return;
                }
                vp0Var.getClass();
                return;
        }
    }
}
