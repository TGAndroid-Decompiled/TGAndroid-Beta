package org.telegram.ui;
public final class cc0 implements org.telegram.ui.ActionBar.u1 {
    public final int f36437a;
    public final hf0 f36438b;

    public cc0(hf0 hf0Var, int i10) {
        this.f36437a = i10;
        this.f36438b = hf0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f36437a) {
            case 0:
                hf0 hf0Var = this.f36438b;
                hf0Var.f37920b[hf0Var.f37918a].d();
                hf0Var.s1(true, true);
                return;
            default:
                hf0 hf0Var2 = this.f36438b;
                hf0Var2.f37933l0 = true;
                if (hf0Var2.f37918a != 0) {
                    hf0Var2.C1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
