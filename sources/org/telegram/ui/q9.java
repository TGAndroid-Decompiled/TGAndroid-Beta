package org.telegram.ui;
public final class q9 implements o1.f {
    public final int f36630a;
    public final Object f36631b;

    public q9(Object obj, int i10) {
        this.f36630a = i10;
        this.f36631b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f36630a) {
            case 0:
                x9 x9Var = (x9) this.f36631b;
                o1.k kVar = x9Var.f39581x;
                if (kVar != null) {
                    kVar.c();
                    x9Var.f39581x = null;
                    return;
                }
                return;
            case 1:
                no0 no0Var = (no0) this.f36631b;
                if (hVar == no0Var.f36067c) {
                    no0Var.f36067c = null;
                    return;
                }
                return;
            default:
                ((ju0) this.f36631b).D();
                return;
        }
    }
}
