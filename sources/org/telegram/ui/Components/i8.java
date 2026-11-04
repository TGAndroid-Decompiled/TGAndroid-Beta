package org.telegram.ui.Components;
public final class i8 extends org.telegram.ui.ActionBar.j {
    public final int f34632a;
    public final r8 f34633b;

    public i8(r8 r8Var, int i3) {
        this.f34632a = i3;
        this.f34633b = r8Var;
    }

    @Override
    public final void b(int i3) {
        switch (this.f34632a) {
            case 0:
                if (i3 == -1) {
                    r8.Z(this.f34633b);
                    return;
                }
                return;
            default:
                r8 r8Var = this.f34633b;
                if (i3 == -1) {
                    r8.Z(r8Var);
                }
                if (i3 == 1) {
                    r8Var.k0();
                    return;
                }
                return;
        }
    }
}
