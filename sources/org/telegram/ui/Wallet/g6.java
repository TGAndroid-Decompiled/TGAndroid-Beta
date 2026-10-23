package org.telegram.ui.Wallet;
public final class g6 implements o1.g {
    public final int f34257a;
    public final m6 f34258b;

    public g6(m6 m6Var, int i10) {
        this.f34257a = i10;
        this.f34258b = m6Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f34257a) {
            case 0:
                m6 m6Var = this.f34258b;
                m6Var.f34524c.setScaleX(f7);
                m6Var.f34524c.setScaleY(f7);
                return;
            default:
                this.f34258b.P = f10;
                return;
        }
    }
}
