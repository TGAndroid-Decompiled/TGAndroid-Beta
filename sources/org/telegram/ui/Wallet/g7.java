package org.telegram.ui.Wallet;
public final class g7 implements r1.d {
    public final int f44311a;
    public final m7 f44312b;

    public g7(m7 m7Var, int i7) {
        this.f44311a = i7;
        this.f44312b = m7Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f44311a) {
            case 0:
                m7 m7Var = this.f44312b;
                m7Var.f44616c.setScaleX(f10);
                m7Var.f44616c.setScaleY(f10);
                return;
            default:
                this.f44312b.Q = f11;
                return;
        }
    }
}
