package org.telegram.ui.Wallet;
public final class j6 implements o1.g {
    public final int f34358a;
    public final p6 f34359b;

    public j6(p6 p6Var, int i10) {
        this.f34358a = i10;
        this.f34359b = p6Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f34358a) {
            case 0:
                p6 p6Var = this.f34359b;
                p6Var.f34731c.setScaleX(f7);
                p6Var.f34731c.setScaleY(f7);
                return;
            default:
                this.f34359b.P = f10;
                return;
        }
    }
}
