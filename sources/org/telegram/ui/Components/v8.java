package org.telegram.ui.Components;
public final class v8 extends org.telegram.ui.ActionBar.j {
    public final int f31196a;
    public final e9 f31197b;

    public v8(e9 e9Var, int i10) {
        this.f31196a = i10;
        this.f31197b = e9Var;
    }

    @Override
    public final void b(int i10) {
        switch (this.f31196a) {
            case 0:
                if (i10 == -1) {
                    e9.U(this.f31197b);
                    return;
                }
                return;
            default:
                e9 e9Var = this.f31197b;
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
