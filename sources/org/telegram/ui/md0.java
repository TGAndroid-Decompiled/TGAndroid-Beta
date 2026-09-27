package org.telegram.ui;
public final class md0 implements org.telegram.ui.ActionBar.b2 {
    public final int f35636a;
    public final tg0 f35637b;

    public md0(tg0 tg0Var, int i10) {
        this.f35636a = i10;
        this.f35637b = tg0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f35636a) {
            case 0:
                tg0 tg0Var = this.f35637b;
                tg0Var.f37786b[tg0Var.f37784a].d();
                tg0Var.k1(true, true);
                return;
            default:
                tg0 tg0Var2 = this.f35637b;
                tg0Var2.f37799l0 = true;
                if (tg0Var2.f37784a != 0) {
                    tg0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
