package org.telegram.ui.Components;
public final class yp0 implements o1.f {
    public final int f33149a;
    public final gq0 f33150b;
    public final o1.k f33151c;

    public yp0(gq0 gq0Var, o1.k kVar, int i10) {
        this.f33149a = i10;
        this.f33150b = gq0Var;
        this.f33151c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f33149a) {
            case 0:
                if (!z10) {
                    this.f33150b.f26496z.remove(this.f33151c);
                    hVar.c();
                    return;
                }
                return;
            default:
                gq0 gq0Var = this.f33150b;
                if (!z10) {
                    gq0Var.f26496z.remove(this.f33151c);
                    hVar.c();
                    return;
                }
                gq0Var.getClass();
                return;
        }
    }
}
