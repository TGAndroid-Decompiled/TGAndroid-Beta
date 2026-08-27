package org.telegram.ui.Components;

public final class l0 implements dc0 {

    public final int f30238a;

    public final fc0 f30239b;

    public final fc0 f30240c;
    public final fc0 d;

    public l0(fc0 fc0Var, fc0 fc0Var2, fc0 fc0Var3, int i10) {
        this.f30238a = i10;
        this.f30239b = fc0Var;
        this.f30240c = fc0Var2;
        this.d = fc0Var3;
    }

    @Override
    public final void m(fc0 fc0Var, int i10) {
        switch (this.f30238a) {
            case 0:
                y4.b(this.f30239b, this.f30240c, this.d);
                break;
            case 1:
                y4.y0(this.f30239b, this.f30240c, this.d);
                break;
            default:
                y4.y0(this.f30239b, this.f30240c, this.d);
                break;
        }
    }
}
