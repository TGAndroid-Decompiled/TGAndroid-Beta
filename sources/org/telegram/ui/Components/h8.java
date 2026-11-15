package org.telegram.ui.Components;
public final class h8 extends org.telegram.ui.ActionBar.j {
    public final int f35192a;
    public final q8 f35193b;

    public h8(q8 q8Var, int i7) {
        this.f35192a = i7;
        this.f35193b = q8Var;
    }

    @Override
    public final void b(int i7) {
        switch (this.f35192a) {
            case 0:
                if (i7 == -1) {
                    q8.Z(this.f35193b);
                    return;
                }
                return;
            default:
                q8 q8Var = this.f35193b;
                if (i7 == -1) {
                    q8.Z(q8Var);
                }
                if (i7 == 1) {
                    q8Var.k0();
                    return;
                }
                return;
        }
    }
}
