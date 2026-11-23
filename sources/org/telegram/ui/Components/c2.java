package org.telegram.ui.Components;
public final class c2 implements rb0 {
    public final int f33978a;
    public final tb0 f33979b;
    public final tb0 f33980c;
    public final tb0 d;

    public c2(tb0 tb0Var, tb0 tb0Var2, tb0 tb0Var3, int i7) {
        this.f33978a = i7;
        this.f33979b = tb0Var;
        this.f33980c = tb0Var2;
        this.d = tb0Var3;
    }

    @Override
    public final void n(tb0 tb0Var, int i7) {
        switch (this.f33978a) {
            case 0:
                c5.v0(this.f33979b, this.f33980c, this.d);
                return;
            case 1:
                c5.v0(this.f33979b, this.f33980c, this.d);
                return;
            default:
                c5.b(this.f33979b, this.f33980c, this.d);
                return;
        }
    }
}
