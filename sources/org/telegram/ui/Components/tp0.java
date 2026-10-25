package org.telegram.ui.Components;
public final class tp0 implements o1.f {
    public final int f33117a;
    public final bq0 f33118b;
    public final o1.j f33119c;

    public tp0(bq0 bq0Var, o1.j jVar, int i10) {
        this.f33117a = i10;
        this.f33118b = bq0Var;
        this.f33119c = jVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f33117a) {
            case 0:
                if (!z10) {
                    this.f33118b.f26948z.remove(this.f33119c);
                    hVar.c();
                    return;
                }
                return;
            default:
                bq0 bq0Var = this.f33118b;
                if (!z10) {
                    bq0Var.f26948z.remove(this.f33119c);
                    hVar.c();
                    return;
                }
                bq0Var.getClass();
                return;
        }
    }
}
