package org.telegram.ui;
public final class n9 implements o1.f {
    public final int f35775a;
    public final Object f35776b;

    public n9(Object obj, int i10) {
        this.f35775a = i10;
        this.f35776b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f35775a) {
            case 0:
                u9 u9Var = (u9) this.f35776b;
                o1.k kVar = u9Var.f38368x;
                if (kVar != null) {
                    kVar.c();
                    u9Var.f38368x = null;
                    return;
                }
                return;
            case 1:
                ko0 ko0Var = (ko0) this.f35776b;
                if (hVar == ko0Var.f35101c) {
                    ko0Var.f35101c = null;
                    return;
                }
                return;
            default:
                ((gu0) this.f35776b).D();
                return;
        }
    }
}
