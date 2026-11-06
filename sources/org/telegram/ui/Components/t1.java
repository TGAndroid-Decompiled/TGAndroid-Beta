package org.telegram.ui.Components;
public final class t1 implements fb0 {
    public final int f38215a;
    public final hb0 f38216b;
    public final hb0 f38217c;
    public final hb0 d;

    public t1(hb0 hb0Var, hb0 hb0Var2, hb0 hb0Var3, int i7) {
        this.f38215a = i7;
        this.f38216b = hb0Var;
        this.f38217c = hb0Var2;
        this.d = hb0Var3;
    }

    @Override
    public final void n(hb0 hb0Var, int i7) {
        switch (this.f38215a) {
            case 0:
                v4.v0(this.f38216b, this.f38217c, this.d);
                return;
            case 1:
                v4.v0(this.f38216b, this.f38217c, this.d);
                return;
            default:
                v4.b(this.f38216b, this.f38217c, this.d);
                return;
        }
    }
}
