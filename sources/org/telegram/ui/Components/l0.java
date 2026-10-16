package org.telegram.ui.Components;
public final class l0 implements sd0 {
    public final int f26513a;
    public final ud0 f26514b;
    public final ud0 f26515c;
    public final ud0 d;

    public l0(ud0 ud0Var, ud0 ud0Var2, ud0 ud0Var3, int i10) {
        this.f26513a = i10;
        this.f26514b = ud0Var;
        this.f26515c = ud0Var2;
        this.d = ud0Var3;
    }

    @Override
    public final void r(ud0 ud0Var, int i10) {
        switch (this.f26513a) {
            case 0:
                g5.a(this.f26514b, this.f26515c, this.d);
                return;
            case 1:
                g5.x0(this.f26514b, this.f26515c, this.d);
                return;
            default:
                g5.x0(this.f26514b, this.f26515c, this.d);
                return;
        }
    }
}
