package org.telegram.ui.Components;
public final class v8 extends org.telegram.ui.ActionBar.j {
    public final int f31195a;
    public final e9 f31196b;

    public v8(e9 e9Var, int i10) {
        this.f31195a = i10;
        this.f31196b = e9Var;
    }

    @Override
    public final void b(int i10) {
        switch (this.f31195a) {
            case 0:
                if (i10 == -1) {
                    e9.U(this.f31196b);
                    return;
                }
                return;
            default:
                e9 e9Var = this.f31196b;
                if (i10 == -1) {
                    e9.U(e9Var);
                }
                if (i10 == 1) {
                    e9Var.f0();
                    return;
                }
                return;
        }
    }
}
