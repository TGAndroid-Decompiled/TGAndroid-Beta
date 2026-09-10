package org.telegram.ui.Components;
public final class wo0 implements o1.f {
    public final int f28806a;
    public final fp0 f28807b;
    public final o1.k f28808c;

    public wo0(fp0 fp0Var, o1.k kVar, int i10) {
        this.f28806a = i10;
        this.f28807b = fp0Var;
        this.f28808c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f28806a) {
            case 0:
                if (!z10) {
                    this.f28807b.f23064z.remove(this.f28808c);
                    hVar.c();
                    return;
                }
                return;
            default:
                fp0 fp0Var = this.f28807b;
                if (!z10) {
                    fp0Var.f23064z.remove(this.f28808c);
                    hVar.c();
                    return;
                }
                fp0Var.getClass();
                return;
        }
    }
}
