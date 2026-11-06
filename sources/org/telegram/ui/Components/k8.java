package org.telegram.ui.Components;
public final class k8 extends org.telegram.ui.ActionBar.j {
    public final int f35234a;
    public final t8 f35235b;

    public k8(t8 t8Var, int i7) {
        this.f35234a = i7;
        this.f35235b = t8Var;
    }

    @Override
    public final void b(int i7) {
        switch (this.f35234a) {
            case 0:
                if (i7 == -1) {
                    t8.Z(this.f35235b);
                    return;
                }
                return;
            default:
                t8 t8Var = this.f35235b;
                if (i7 == -1) {
                    t8.Z(t8Var);
                }
                if (i7 == 1) {
                    t8Var.k0();
                    return;
                }
                return;
        }
    }
}
