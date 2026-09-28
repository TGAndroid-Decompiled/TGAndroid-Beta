package org.telegram.ui;
public final class n9 implements o1.f {
    public final int f35772a;
    public final Object f35773b;

    public n9(Object obj, int i10) {
        this.f35772a = i10;
        this.f35773b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f35772a) {
            case 0:
                u9 u9Var = (u9) this.f35773b;
                o1.k kVar = u9Var.f38369x;
                if (kVar != null) {
                    kVar.c();
                    u9Var.f38369x = null;
                    return;
                }
                return;
            case 1:
                ko0 ko0Var = (ko0) this.f35773b;
                if (hVar == ko0Var.f35119c) {
                    ko0Var.f35119c = null;
                    return;
                }
                return;
            default:
                ((gu0) this.f35773b).D();
                return;
        }
    }
}
