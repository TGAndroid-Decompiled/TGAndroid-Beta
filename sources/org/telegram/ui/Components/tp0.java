package org.telegram.ui.Components;
public final class tp0 implements o1.f {
    public final int f31316a;
    public final bq0 f31317b;
    public final o1.k f31318c;

    public tp0(bq0 bq0Var, o1.k kVar, int i10) {
        this.f31316a = i10;
        this.f31317b = bq0Var;
        this.f31318c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f31316a) {
            case 0:
                if (!z10) {
                    this.f31317b.f25072z.remove(this.f31318c);
                    hVar.c();
                    return;
                }
                return;
            default:
                bq0 bq0Var = this.f31317b;
                if (!z10) {
                    bq0Var.f25072z.remove(this.f31318c);
                    hVar.c();
                    return;
                }
                bq0Var.getClass();
                return;
        }
    }
}
