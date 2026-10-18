package org.telegram.ui.Wallet;
public final class m6 implements o1.g {
    public final int f34599a;
    public final s6 f34600b;

    public m6(s6 s6Var, int i10) {
        this.f34599a = i10;
        this.f34600b = s6Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f34599a) {
            case 0:
                s6 s6Var = this.f34600b;
                s6Var.f34901c.setScaleX(f7);
                s6Var.f34901c.setScaleY(f7);
                return;
            default:
                this.f34600b.P = f10;
                return;
        }
    }
}
