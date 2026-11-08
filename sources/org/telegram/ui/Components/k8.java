package org.telegram.ui.Components;
public final class k8 extends org.telegram.ui.ActionBar.j {
    public final int f35251a;
    public final t8 f35252b;

    public k8(t8 t8Var, int i7) {
        this.f35251a = i7;
        this.f35252b = t8Var;
    }

    @Override
    public final void b(int i7) {
        switch (this.f35251a) {
            case 0:
                if (i7 == -1) {
                    t8.Z(this.f35252b);
                    return;
                }
                return;
            default:
                t8 t8Var = this.f35252b;
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
