package org.telegram.ui.Components;
public final class t1 implements fb0 {
    public final int f38165a;
    public final hb0 f38166b;
    public final hb0 f38167c;
    public final hb0 d;

    public t1(hb0 hb0Var, hb0 hb0Var2, hb0 hb0Var3, int i7) {
        this.f38165a = i7;
        this.f38166b = hb0Var;
        this.f38167c = hb0Var2;
        this.d = hb0Var3;
    }

    @Override
    public final void n(hb0 hb0Var, int i7) {
        switch (this.f38165a) {
            case 0:
                v4.v0(this.f38166b, this.f38167c, this.d);
                return;
            case 1:
                v4.v0(this.f38166b, this.f38167c, this.d);
                return;
            default:
                v4.b(this.f38166b, this.f38167c, this.d);
                return;
        }
    }
}
