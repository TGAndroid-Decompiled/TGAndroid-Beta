package org.telegram.ui.Components;
public final class l0 implements dd0 {
    public final int f25935a;
    public final fd0 f25936b;
    public final fd0 f25937c;
    public final fd0 d;

    public l0(fd0 fd0Var, fd0 fd0Var2, fd0 fd0Var3, int i10) {
        this.f25935a = i10;
        this.f25936b = fd0Var;
        this.f25937c = fd0Var2;
        this.d = fd0Var3;
    }

    @Override
    public final void q(fd0 fd0Var, int i10) {
        switch (this.f25935a) {
            case 0:
                d5.b(this.f25936b, this.f25937c, this.d);
                return;
            case 1:
                d5.y0(this.f25936b, this.f25937c, this.d);
                return;
            default:
                d5.y0(this.f25936b, this.f25937c, this.d);
                return;
        }
    }
}
