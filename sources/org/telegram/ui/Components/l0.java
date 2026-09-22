package org.telegram.ui.Components;
public final class l0 implements sc0 {
    public final int f25787a;
    public final uc0 f25788b;
    public final uc0 f25789c;
    public final uc0 d;

    public l0(uc0 uc0Var, uc0 uc0Var2, uc0 uc0Var3, int i10) {
        this.f25787a = i10;
        this.f25788b = uc0Var;
        this.f25789c = uc0Var2;
        this.d = uc0Var3;
    }

    @Override
    public final void q(uc0 uc0Var, int i10) {
        switch (this.f25787a) {
            case 0:
                c5.b(this.f25788b, this.f25789c, this.d);
                return;
            case 1:
                c5.y0(this.f25788b, this.f25789c, this.d);
                return;
            default:
                c5.y0(this.f25788b, this.f25789c, this.d);
                return;
        }
    }
}
