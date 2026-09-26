package org.telegram.ui;
public final class n9 implements o1.f {
    public final int f35771a;
    public final Object f35772b;

    public n9(Object obj, int i10) {
        this.f35771a = i10;
        this.f35772b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f35771a) {
            case 0:
                u9 u9Var = (u9) this.f35772b;
                o1.k kVar = u9Var.f38368x;
                if (kVar != null) {
                    kVar.c();
                    u9Var.f38368x = null;
                    return;
                }
                return;
            case 1:
                ko0 ko0Var = (ko0) this.f35772b;
                if (hVar == ko0Var.f35118c) {
                    ko0Var.f35118c = null;
                    return;
                }
                return;
            default:
                ((gu0) this.f35772b).D();
                return;
        }
    }
}
