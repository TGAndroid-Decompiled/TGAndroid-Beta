package org.telegram.ui.Components;
public final class oo0 implements o1.f {
    public final int f26832a;
    public final wo0 f26833b;
    public final o1.k f26834c;

    public oo0(wo0 wo0Var, o1.k kVar, int i10) {
        this.f26832a = i10;
        this.f26833b = wo0Var;
        this.f26834c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f26832a) {
            case 0:
                if (!z10) {
                    this.f26833b.f29723z.remove(this.f26834c);
                    hVar.c();
                    return;
                }
                return;
            default:
                wo0 wo0Var = this.f26833b;
                if (!z10) {
                    wo0Var.f29723z.remove(this.f26834c);
                    hVar.c();
                    return;
                }
                wo0Var.getClass();
                return;
        }
    }
}
