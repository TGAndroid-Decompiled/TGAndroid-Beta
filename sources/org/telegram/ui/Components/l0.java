package org.telegram.ui.Components;
public final class l0 implements sd0 {
    public final int f28165a;
    public final ud0 f28166b;
    public final ud0 f28167c;
    public final ud0 d;

    public l0(ud0 ud0Var, ud0 ud0Var2, ud0 ud0Var3, int i10) {
        this.f28165a = i10;
        this.f28166b = ud0Var;
        this.f28167c = ud0Var2;
        this.d = ud0Var3;
    }

    @Override
    public final void q(ud0 ud0Var, int i10) {
        switch (this.f28165a) {
            case 0:
                g5.a(this.f28166b, this.f28167c, this.d);
                return;
            case 1:
                g5.x0(this.f28166b, this.f28167c, this.d);
                return;
            default:
                g5.x0(this.f28166b, this.f28167c, this.d);
                return;
        }
    }
}
