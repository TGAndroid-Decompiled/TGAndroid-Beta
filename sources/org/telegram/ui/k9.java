package org.telegram.ui;
public final class k9 implements o1.g {
    public final int f39803a;
    public final Object f39804b;

    public k9(Object obj, int i10) {
        this.f39803a = i10;
        this.f39804b = obj;
    }

    @Override
    public final void a(o1.i iVar, boolean z10, float f9, float f10) {
        switch (this.f39803a) {
            case 0:
                r9 r9Var = (r9) this.f39804b;
                o1.k kVar = r9Var.f42010x;
                if (kVar != null) {
                    kVar.c();
                    r9Var.f42010x = null;
                    return;
                }
                return;
            case 1:
                xn0 xn0Var = (xn0) this.f39804b;
                if (iVar == xn0Var.f44625c) {
                    xn0Var.f44625c = null;
                    return;
                }
                return;
            default:
                ((kt0) this.f39804b).D();
                return;
        }
    }
}
