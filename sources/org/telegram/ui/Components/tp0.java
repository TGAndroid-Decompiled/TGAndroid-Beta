package org.telegram.ui.Components;
public final class tp0 implements o1.f {
    public final int f33120a;
    public final bq0 f33121b;
    public final o1.j f33122c;

    public tp0(bq0 bq0Var, o1.j jVar, int i10) {
        this.f33120a = i10;
        this.f33121b = bq0Var;
        this.f33122c = jVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f33120a) {
            case 0:
                if (!z10) {
                    this.f33121b.f26950z.remove(this.f33122c);
                    hVar.c();
                    return;
                }
                return;
            default:
                bq0 bq0Var = this.f33121b;
                if (!z10) {
                    bq0Var.f26950z.remove(this.f33122c);
                    hVar.c();
                    return;
                }
                bq0Var.getClass();
                return;
        }
    }
}
