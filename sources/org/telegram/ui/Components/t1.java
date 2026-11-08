package org.telegram.ui.Components;
public final class t1 implements fb0 {
    public final int f38193a;
    public final hb0 f38194b;
    public final hb0 f38195c;
    public final hb0 d;

    public t1(hb0 hb0Var, hb0 hb0Var2, hb0 hb0Var3, int i7) {
        this.f38193a = i7;
        this.f38194b = hb0Var;
        this.f38195c = hb0Var2;
        this.d = hb0Var3;
    }

    @Override
    public final void n(hb0 hb0Var, int i7) {
        switch (this.f38193a) {
            case 0:
                v4.v0(this.f38194b, this.f38195c, this.d);
                return;
            case 1:
                v4.v0(this.f38194b, this.f38195c, this.d);
                return;
            default:
                v4.b(this.f38194b, this.f38195c, this.d);
                return;
        }
    }
}
