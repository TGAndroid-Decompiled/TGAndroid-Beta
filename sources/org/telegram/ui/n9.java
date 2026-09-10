package org.telegram.ui;
public final class n9 implements o1.f {
    public final int f35154a;
    public final Object f35155b;

    public n9(Object obj, int i10) {
        this.f35154a = i10;
        this.f35155b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f35154a) {
            case 0:
                u9 u9Var = (u9) this.f35155b;
                o1.k kVar = u9Var.f37173x;
                if (kVar != null) {
                    kVar.c();
                    u9Var.f37173x = null;
                    return;
                }
                return;
            case 1:
                so0 so0Var = (so0) this.f35155b;
                if (hVar == so0Var.f36737c) {
                    so0Var.f36737c = null;
                    return;
                }
                return;
            default:
                ((ou0) this.f35155b).D();
                return;
        }
    }
}
