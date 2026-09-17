package org.telegram.ui;
public final class n9 implements o1.f {
    public final int f38854a;
    public final Object f38855b;

    public n9(Object obj, int i10) {
        this.f38854a = i10;
        this.f38855b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f38854a) {
            case 0:
                u9 u9Var = (u9) this.f38855b;
                o1.k kVar = u9Var.f40992x;
                if (kVar != null) {
                    kVar.c();
                    u9Var.f40992x = null;
                    return;
                }
                return;
            case 1:
                to0 to0Var = (to0) this.f38855b;
                if (hVar == to0Var.f40807c) {
                    to0Var.f40807c = null;
                    return;
                }
                return;
            default:
                ((nu0) this.f38855b).D();
                return;
        }
    }
}
