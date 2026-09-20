package org.telegram.ui.Components;
public final class l0 implements ad0 {
    public final int f25977a;
    public final cd0 f25978b;
    public final cd0 f25979c;
    public final cd0 d;

    public l0(cd0 cd0Var, cd0 cd0Var2, cd0 cd0Var3, int i10) {
        this.f25977a = i10;
        this.f25978b = cd0Var;
        this.f25979c = cd0Var2;
        this.d = cd0Var3;
    }

    @Override
    public final void q(cd0 cd0Var, int i10) {
        switch (this.f25977a) {
            case 0:
                d5.b(this.f25978b, this.f25979c, this.d);
                return;
            case 1:
                d5.y0(this.f25978b, this.f25979c, this.d);
                return;
            default:
                d5.y0(this.f25978b, this.f25979c, this.d);
                return;
        }
    }
}
