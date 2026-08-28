package org.telegram.ui.Components;
public final class n8 extends org.telegram.ui.ActionBar.j {
    public final int f31043a;
    public final w8 f31044b;

    public n8(w8 w8Var, int i9) {
        this.f31043a = i9;
        this.f31044b = w8Var;
    }

    @Override
    public final void b(int i9) {
        switch (this.f31043a) {
            case 0:
                if (i9 == -1) {
                    w8.T(this.f31044b);
                    return;
                }
                return;
            default:
                w8 w8Var = this.f31044b;
                if (i9 == -1) {
                    w8.T(w8Var);
                }
                if (i9 == 1) {
                    w8Var.e0();
                    return;
                }
                return;
        }
    }
}
