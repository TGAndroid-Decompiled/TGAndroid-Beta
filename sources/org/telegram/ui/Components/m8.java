package org.telegram.ui.Components;

public final class m8 extends org.telegram.ui.ActionBar.j {

    public final int f30616a;

    public final v8 f30617b;

    public m8(v8 v8Var, int i10) {
        this.f30616a = i10;
        this.f30617b = v8Var;
    }

    @Override
    public final void b(int i10) {
        switch (this.f30616a) {
            case 0:
                if (i10 == -1) {
                    v8.U(this.f30617b);
                }
                break;
            default:
                v8 v8Var = this.f30617b;
                if (i10 == -1) {
                    v8.U(v8Var);
                }
                if (i10 == 1) {
                    v8Var.f0();
                }
                break;
        }
    }
}
