package org.telegram.ui.Components;
public final class l0 implements cd0 {
    public final int f25924a;
    public final ed0 f25925b;
    public final ed0 f25926c;
    public final ed0 d;

    public l0(ed0 ed0Var, ed0 ed0Var2, ed0 ed0Var3, int i10) {
        this.f25924a = i10;
        this.f25925b = ed0Var;
        this.f25926c = ed0Var2;
        this.d = ed0Var3;
    }

    @Override
    public final void q(ed0 ed0Var, int i10) {
        switch (this.f25924a) {
            case 0:
                e5.b(this.f25925b, this.f25926c, this.d);
                return;
            case 1:
                e5.y0(this.f25925b, this.f25926c, this.d);
                return;
            default:
                e5.y0(this.f25925b, this.f25926c, this.d);
                return;
        }
    }
}
