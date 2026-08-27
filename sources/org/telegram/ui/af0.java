package org.telegram.ui;

public final class af0 implements org.telegram.ui.ActionBar.a2 {

    public final int f36527a;

    public final mf0 f36528b;

    public af0(mf0 mf0Var, int i10) {
        this.f36527a = i10;
        this.f36528b = mf0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36527a) {
            case 0:
                mf0 mf0Var = this.f36528b;
                mf0Var.c(true);
                mf0Var.f40497o0.u1(0, true, null, true);
                break;
            default:
                this.f36528b.f40497o0.u1(0, true, null, true);
                break;
        }
    }
}
