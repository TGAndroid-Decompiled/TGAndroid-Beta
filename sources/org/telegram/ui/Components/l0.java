package org.telegram.ui.Components;
public final class l0 implements sd0 {
    public final int f26842a;
    public final ud0 f26843b;
    public final ud0 f26844c;
    public final ud0 d;

    public l0(ud0 ud0Var, ud0 ud0Var2, ud0 ud0Var3, int i10) {
        this.f26842a = i10;
        this.f26843b = ud0Var;
        this.f26844c = ud0Var2;
        this.d = ud0Var3;
    }

    @Override
    public final void r(ud0 ud0Var, int i10) {
        switch (this.f26842a) {
            case 0:
                g5.a(this.f26843b, this.f26844c, this.d);
                return;
            case 1:
                g5.x0(this.f26843b, this.f26844c, this.d);
                return;
            default:
                g5.x0(this.f26843b, this.f26844c, this.d);
                return;
        }
    }
}
