package org.telegram.ui.Components;
public final class v8 extends org.telegram.ui.ActionBar.j {
    public final int f31679a;
    public final e9 f31680b;

    public v8(e9 e9Var, int i10) {
        this.f31679a = i10;
        this.f31680b = e9Var;
    }

    @Override
    public final void b(int i10) {
        switch (this.f31679a) {
            case 0:
                if (i10 == -1) {
                    e9.S(this.f31680b);
                    return;
                }
                return;
            default:
                e9 e9Var = this.f31680b;
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
