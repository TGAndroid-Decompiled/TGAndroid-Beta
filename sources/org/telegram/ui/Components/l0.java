package org.telegram.ui.Components;
public final class l0 implements sd0 {
    public final int f28185a;
    public final ud0 f28186b;
    public final ud0 f28187c;
    public final ud0 d;

    public l0(ud0 ud0Var, ud0 ud0Var2, ud0 ud0Var3, int i10) {
        this.f28185a = i10;
        this.f28186b = ud0Var;
        this.f28187c = ud0Var2;
        this.d = ud0Var3;
    }

    @Override
    public final void r(ud0 ud0Var, int i10) {
        switch (this.f28185a) {
            case 0:
                g5.a(this.f28186b, this.f28187c, this.d);
                return;
            case 1:
                g5.x0(this.f28186b, this.f28187c, this.d);
                return;
            default:
                g5.x0(this.f28186b, this.f28187c, this.d);
                return;
        }
    }
}
