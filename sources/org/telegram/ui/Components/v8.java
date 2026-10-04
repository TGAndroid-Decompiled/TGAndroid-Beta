package org.telegram.ui.Components;
public final class v8 extends org.telegram.ui.ActionBar.j {
    public final int f31604a;
    public final e9 f31605b;

    public v8(e9 e9Var, int i10) {
        this.f31604a = i10;
        this.f31605b = e9Var;
    }

    @Override
    public final void b(int i10) {
        switch (this.f31604a) {
            case 0:
                if (i10 == -1) {
                    e9.S(this.f31605b);
                    return;
                }
                return;
            default:
                e9 e9Var = this.f31605b;
                if (i10 == -1) {
                    e9.S(e9Var);
                }
                if (i10 == 1) {
                    e9Var.f0();
                    return;
                }
                return;
        }
    }
}
