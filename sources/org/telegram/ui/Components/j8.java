package org.telegram.ui.Components;
public final class j8 extends org.telegram.ui.ActionBar.k {
    public final int f34861a;
    public final s8 f34862b;

    public j8(s8 s8Var, int i7) {
        this.f34861a = i7;
        this.f34862b = s8Var;
    }

    @Override
    public final void b(int i7) {
        switch (this.f34861a) {
            case 0:
                if (i7 == -1) {
                    s8.Z(this.f34862b);
                    return;
                }
                return;
            default:
                s8 s8Var = this.f34862b;
                if (i7 == -1) {
                    s8.Z(s8Var);
                }
                if (i7 == 1) {
                    s8Var.k0();
                    return;
                }
                return;
        }
    }
}
