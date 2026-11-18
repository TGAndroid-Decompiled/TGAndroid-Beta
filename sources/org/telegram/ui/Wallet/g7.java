package org.telegram.ui.Wallet;
public final class g7 implements r1.d {
    public final int f44267a;
    public final m7 f44268b;

    public g7(m7 m7Var, int i7) {
        this.f44267a = i7;
        this.f44268b = m7Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f44267a) {
            case 0:
                m7 m7Var = this.f44268b;
                m7Var.f44572c.setScaleX(f10);
                m7Var.f44572c.setScaleY(f10);
                return;
            default:
                this.f44268b.Q = f11;
                return;
        }
    }
}
