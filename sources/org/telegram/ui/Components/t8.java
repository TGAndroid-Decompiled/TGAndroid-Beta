package org.telegram.ui.Components;
public final class t8 extends org.telegram.ui.ActionBar.j {
    public final int f30754a;
    public final c9 f30755b;

    public t8(c9 c9Var, int i10) {
        this.f30754a = i10;
        this.f30755b = c9Var;
    }

    @Override
    public final void b(int i10) {
        switch (this.f30754a) {
            case 0:
                if (i10 == -1) {
                    c9.U(this.f30755b);
                    return;
                }
                return;
            default:
                c9 c9Var = this.f30755b;
                if (i10 == -1) {
                    c9.U(c9Var);
                }
                if (i10 == 1) {
                    c9Var.f0();
                    return;
                }
                return;
        }
    }
}
