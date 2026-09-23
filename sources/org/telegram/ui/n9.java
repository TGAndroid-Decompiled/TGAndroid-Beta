package org.telegram.ui;
public final class n9 implements o1.f {
    public final int f35454a;
    public final Object f35455b;

    public n9(Object obj, int i10) {
        this.f35454a = i10;
        this.f35455b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f35454a) {
            case 0:
                u9 u9Var = (u9) this.f35455b;
                o1.k kVar = u9Var.f37968x;
                if (kVar != null) {
                    kVar.c();
                    u9Var.f37968x = null;
                    return;
                }
                return;
            case 1:
                mo0 mo0Var = (mo0) this.f35455b;
                if (hVar == mo0Var.f35369c) {
                    mo0Var.f35369c = null;
                    return;
                }
                return;
            default:
                ((hu0) this.f35455b).D();
                return;
        }
    }
}
