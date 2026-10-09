package org.telegram.ui.Wallet;
public final class y2 implements o1.g {
    public final int f35651a;
    public final c3 f35652b;

    public y2(c3 c3Var, int i10) {
        this.f35651a = i10;
        this.f35652b = c3Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f35651a) {
            case 0:
                c3 c3Var = this.f35652b;
                c3Var.C = f7;
                c3Var.f34708a.invalidate();
                return;
            case 1:
                c3 c3Var2 = this.f35652b;
                c3Var2.f34713c0 = f7;
                c3Var2.f34708a.invalidate();
                return;
            default:
                c3 c3Var3 = this.f35652b;
                c3Var3.f34709a0 = f7;
                c3Var3.f34708a.invalidate();
                return;
        }
    }
}
