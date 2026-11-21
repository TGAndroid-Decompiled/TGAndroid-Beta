package org.telegram.ui.Wallet;
public final class g7 implements r1.d {
    public final int f44307a;
    public final m7 f44308b;

    public g7(m7 m7Var, int i7) {
        this.f44307a = i7;
        this.f44308b = m7Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f44307a) {
            case 0:
                m7 m7Var = this.f44308b;
                m7Var.f44612c.setScaleX(f10);
                m7Var.f44612c.setScaleY(f10);
                return;
            default:
                this.f44308b.Q = f11;
                return;
        }
    }
}
