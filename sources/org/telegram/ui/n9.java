package org.telegram.ui;
public final class n9 implements o1.f {
    public final int f35882a;
    public final Object f35883b;

    public n9(Object obj, int i10) {
        this.f35882a = i10;
        this.f35883b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f35882a) {
            case 0:
                u9 u9Var = (u9) this.f35883b;
                o1.k kVar = u9Var.f38458x;
                if (kVar != null) {
                    kVar.c();
                    u9Var.f38458x = null;
                    return;
                }
                return;
            case 1:
                jo0 jo0Var = (jo0) this.f35883b;
                if (hVar == jo0Var.f34939c) {
                    jo0Var.f34939c = null;
                    return;
                }
                return;
            default:
                ((gu0) this.f35883b).D();
                return;
        }
    }
}
