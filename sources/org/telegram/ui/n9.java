package org.telegram.ui;
public final class n9 implements o1.f {
    public final int f35907a;
    public final Object f35908b;

    public n9(Object obj, int i10) {
        this.f35907a = i10;
        this.f35908b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f35907a) {
            case 0:
                u9 u9Var = (u9) this.f35908b;
                o1.k kVar = u9Var.f37906x;
                if (kVar != null) {
                    kVar.c();
                    u9Var.f37906x = null;
                    return;
                }
                return;
            case 1:
                so0 so0Var = (so0) this.f35908b;
                if (hVar == so0Var.f37420c) {
                    so0Var.f37420c = null;
                    return;
                }
                return;
            default:
                ((ou0) this.f35908b).D();
                return;
        }
    }
}
