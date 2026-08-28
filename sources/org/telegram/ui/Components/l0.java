package org.telegram.ui.Components;
public final class l0 implements zb0 {
    public final int f30283a;
    public final bc0 f30284b;
    public final bc0 f30285c;
    public final bc0 d;

    public l0(bc0 bc0Var, bc0 bc0Var2, bc0 bc0Var3, int i9) {
        this.f30283a = i9;
        this.f30284b = bc0Var;
        this.f30285c = bc0Var2;
        this.d = bc0Var3;
    }

    @Override
    public final void m(bc0 bc0Var, int i9) {
        switch (this.f30283a) {
            case 0:
                y4.b(this.f30284b, this.f30285c, this.d);
                return;
            case 1:
                y4.y0(this.f30284b, this.f30285c, this.d);
                return;
            default:
                y4.y0(this.f30284b, this.f30285c, this.d);
                return;
        }
    }
}
