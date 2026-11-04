package org.telegram.ui.Wallet;
public final class o6 implements q1.d {
    public final int f43009a;
    public final u6 f43010b;

    public o6(u6 u6Var, int i3) {
        this.f43009a = i3;
        this.f43010b = u6Var;
    }

    @Override
    public final void a(q1.g gVar, float f10, float f11) {
        switch (this.f43009a) {
            case 0:
                u6 u6Var = this.f43010b;
                u6Var.f43249c.setScaleX(f10);
                u6Var.f43249c.setScaleY(f10);
                return;
            default:
                this.f43010b.Q = f11;
                return;
        }
    }
}
