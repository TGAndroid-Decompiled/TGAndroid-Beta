package org.telegram.ui;
public final class o9 implements o1.f {
    public final int f36209a;
    public final Object f36210b;

    public o9(Object obj, int i10) {
        this.f36209a = i10;
        this.f36210b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f36209a) {
            case 0:
                v9 v9Var = (v9) this.f36210b;
                o1.k kVar = v9Var.f38450x;
                if (kVar != null) {
                    kVar.c();
                    v9Var.f38450x = null;
                    return;
                }
                return;
            case 1:
                to0 to0Var = (to0) this.f36210b;
                if (hVar == to0Var.f37860c) {
                    to0Var.f37860c = null;
                    return;
                }
                return;
            default:
                ((ou0) this.f36210b).D();
                return;
        }
    }
}
