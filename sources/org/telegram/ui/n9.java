package org.telegram.ui;
public final class n9 implements o1.f {
    public final int f38853a;
    public final Object f38854b;

    public n9(Object obj, int i10) {
        this.f38853a = i10;
        this.f38854b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f38853a) {
            case 0:
                u9 u9Var = (u9) this.f38854b;
                o1.k kVar = u9Var.f40991x;
                if (kVar != null) {
                    kVar.c();
                    u9Var.f40991x = null;
                    return;
                }
                return;
            case 1:
                to0 to0Var = (to0) this.f38854b;
                if (hVar == to0Var.f40806c) {
                    to0Var.f40806c = null;
                    return;
                }
                return;
            default:
                ((nu0) this.f38854b).D();
                return;
        }
    }
}
