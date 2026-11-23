package org.telegram.ui.Components;
public final class p8 extends org.telegram.ui.ActionBar.j {
    public final int f38531a;
    public final y8 f38532b;

    public p8(y8 y8Var, int i7) {
        this.f38531a = i7;
        this.f38532b = y8Var;
    }

    @Override
    public final void b(int i7) {
        switch (this.f38531a) {
            case 0:
                if (i7 == -1) {
                    y8.Z(this.f38532b);
                    return;
                }
                return;
            default:
                y8 y8Var = this.f38532b;
                if (i7 == -1) {
                    y8.Z(y8Var);
                }
                if (i7 == 1) {
                    y8Var.k0();
                    return;
                }
                return;
        }
    }
}
