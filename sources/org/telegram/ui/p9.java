package org.telegram.ui;
public final class p9 implements o1.f {
    public final int f36562a;
    public final Object f36563b;

    public p9(Object obj, int i10) {
        this.f36562a = i10;
        this.f36563b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f36562a) {
            case 0:
                w9 w9Var = (w9) this.f36563b;
                o1.k kVar = w9Var.f38618x;
                if (kVar != null) {
                    kVar.c();
                    w9Var.f38618x = null;
                    return;
                }
                return;
            case 1:
                uo0 uo0Var = (uo0) this.f36563b;
                if (hVar == uo0Var.f38108c) {
                    uo0Var.f38108c = null;
                    return;
                }
                return;
            default:
                ((qu0) this.f36563b).D();
                return;
        }
    }
}
