package org.telegram.ui.Components;
public final class o8 extends org.telegram.ui.ActionBar.j {
    public final int f38060a;
    public final x8 f38061b;

    public o8(x8 x8Var, int i7) {
        this.f38060a = i7;
        this.f38061b = x8Var;
    }

    @Override
    public final void b(int i7) {
        switch (this.f38060a) {
            case 0:
                if (i7 == -1) {
                    x8.Z(this.f38061b);
                    return;
                }
                return;
            default:
                x8 x8Var = this.f38061b;
                if (i7 == -1) {
                    x8.Z(x8Var);
                }
                if (i7 == 1) {
                    x8Var.k0();
                    return;
                }
                return;
        }
    }
}
