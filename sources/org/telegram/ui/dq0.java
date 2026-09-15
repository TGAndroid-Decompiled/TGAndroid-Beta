package org.telegram.ui;
public final class dq0 extends org.telegram.ui.ActionBar.j {
    public final jq0 f33108a;

    public dq0(jq0 jq0Var) {
        this.f33108a = jq0Var;
    }

    @Override
    public final void b(int i10) {
        jq0 jq0Var = this.f33108a;
        if (i10 == -1) {
            jq0Var.finishFragment();
        } else if (i10 == 1) {
            if (jq0Var.V != null) {
                jq0Var.finishFragment(false);
                jq0Var.V.b();
            }
        } else if (i10 == 2) {
            jq0.U(jq0Var, null);
        }
    }
}
