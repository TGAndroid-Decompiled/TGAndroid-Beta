package org.telegram.ui.Wallet;
public final class h7 implements r1.d {
    public final int f44439a;
    public final n7 f44440b;

    public h7(n7 n7Var, int i7) {
        this.f44439a = i7;
        this.f44440b = n7Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f44439a) {
            case 0:
                n7 n7Var = this.f44440b;
                n7Var.f44756c.setScaleX(f10);
                n7Var.f44756c.setScaleY(f10);
                return;
            default:
                this.f44440b.Q = f11;
                return;
        }
    }
}
