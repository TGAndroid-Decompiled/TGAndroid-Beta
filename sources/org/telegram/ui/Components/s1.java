package org.telegram.ui.Components;
public final class s1 implements fb0 {
    public final int f37814a;
    public final hb0 f37815b;
    public final hb0 f37816c;
    public final hb0 d;

    public s1(hb0 hb0Var, hb0 hb0Var2, hb0 hb0Var3, int i7) {
        this.f37814a = i7;
        this.f37815b = hb0Var;
        this.f37816c = hb0Var2;
        this.d = hb0Var3;
    }

    @Override
    public final void n(hb0 hb0Var, int i7) {
        switch (this.f37814a) {
            case 0:
                u4.v0(this.f37815b, this.f37816c, this.d);
                return;
            case 1:
                u4.v0(this.f37815b, this.f37816c, this.d);
                return;
            default:
                u4.b(this.f37815b, this.f37816c, this.d);
                return;
        }
    }
}
