package org.telegram.ui.Wallet;
public final class f6 implements o1.g {
    public final int f36573a;
    public final l6 f36574b;

    public f6(l6 l6Var, int i10) {
        this.f36573a = i10;
        this.f36574b = l6Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f36573a) {
            case 0:
                l6 l6Var = this.f36574b;
                l6Var.f36850c.setScaleX(f7);
                l6Var.f36850c.setScaleY(f7);
                return;
            default:
                this.f36574b.P = f10;
                return;
        }
    }
}
