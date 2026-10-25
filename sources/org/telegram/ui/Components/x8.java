package org.telegram.ui.Components;
public final class x8 extends org.telegram.ui.ActionBar.j {
    public final int f34656a;
    public final g9 f34657b;

    public x8(g9 g9Var, int i10) {
        this.f34656a = i10;
        this.f34657b = g9Var;
    }

    @Override
    public final void b(int i10) {
        switch (this.f34656a) {
            case 0:
                if (i10 == -1) {
                    g9.V(this.f34657b);
                    return;
                }
                return;
            default:
                g9 g9Var = this.f34657b;
                if (i10 == -1) {
                    g9.V(g9Var);
                }
                if (i10 == 1) {
                    g9Var.g0();
                    return;
                }
                return;
        }
    }
}
