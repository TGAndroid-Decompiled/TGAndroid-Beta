package org.telegram.ui.Components;
public final class yp0 implements o1.f {
    public final int f33157a;
    public final gq0 f33158b;
    public final o1.k f33159c;

    public yp0(gq0 gq0Var, o1.k kVar, int i10) {
        this.f33157a = i10;
        this.f33158b = gq0Var;
        this.f33159c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f33157a) {
            case 0:
                if (!z10) {
                    this.f33158b.f26498z.remove(this.f33159c);
                    hVar.c();
                    return;
                }
                return;
            default:
                gq0 gq0Var = this.f33158b;
                if (!z10) {
                    gq0Var.f26498z.remove(this.f33159c);
                    hVar.c();
                    return;
                }
                gq0Var.getClass();
                return;
        }
    }
}
