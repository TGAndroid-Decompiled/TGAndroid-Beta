package org.telegram.ui.Components;
public final class k8 extends org.telegram.ui.ActionBar.j {
    public final int f35231a;
    public final t8 f35232b;

    public k8(t8 t8Var, int i7) {
        this.f35231a = i7;
        this.f35232b = t8Var;
    }

    @Override
    public final void b(int i7) {
        switch (this.f35231a) {
            case 0:
                if (i7 == -1) {
                    t8.Z(this.f35232b);
                    return;
                }
                return;
            default:
                t8 t8Var = this.f35232b;
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
