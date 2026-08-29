package org.telegram.ui;
public final class bp0 extends org.telegram.ui.ActionBar.k {
    public final hp0 f36879a;

    public bp0(hp0 hp0Var) {
        this.f36879a = hp0Var;
    }

    @Override
    public final void b(int i10) {
        hp0 hp0Var = this.f36879a;
        if (i10 == -1) {
            hp0Var.finishFragment();
        } else if (i10 == 1) {
            if (hp0Var.R != null) {
                hp0Var.finishFragment(false);
                hp0Var.R.b();
            }
        } else if (i10 == 2) {
            hp0.U(hp0Var, null);
        }
    }
}
