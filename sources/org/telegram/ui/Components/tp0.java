package org.telegram.ui.Components;
public final class tp0 implements o1.f {
    public final int f31197a;
    public final bq0 f31198b;
    public final o1.k f31199c;

    public tp0(bq0 bq0Var, o1.k kVar, int i10) {
        this.f31197a = i10;
        this.f31198b = bq0Var;
        this.f31199c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f31197a) {
            case 0:
                if (!z10) {
                    this.f31198b.f25033z.remove(this.f31199c);
                    hVar.c();
                    return;
                }
                return;
            default:
                bq0 bq0Var = this.f31198b;
                if (!z10) {
                    bq0Var.f25033z.remove(this.f31199c);
                    hVar.c();
                    return;
                }
                bq0Var.getClass();
                return;
        }
    }
}
