package org.telegram.ui.Wallet;
public final class p6 implements q1.c {
    public final int f43046a;
    public final Object f43047b;

    public p6(Object obj, int i3) {
        this.f43046a = i3;
        this.f43047b = obj;
    }

    @Override
    public final void a(q1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f43046a) {
            case 0:
                u6.b((u6) this.f43047b, z10, f10);
                return;
            default:
                m9 m9Var = (m9) this.f43047b;
                m9Var.f42870b0 = null;
                m9Var.f42871c0 = 1.0f;
                m9Var.G0();
                return;
        }
    }
}
