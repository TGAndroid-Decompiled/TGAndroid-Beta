package org.telegram.ui;
public final class jq0 extends org.telegram.ui.ActionBar.j {
    public final qq0 f37420a;

    public jq0(qq0 qq0Var) {
        this.f37420a = qq0Var;
    }

    @Override
    public final void b(int i10) {
        qq0 qq0Var = this.f37420a;
        if (i10 == -1) {
            qq0Var.finishFragment();
        } else if (i10 == 1) {
            if (qq0Var.V != null) {
                qq0Var.finishFragment(false);
                qq0Var.V.b();
            }
        } else if (i10 == 2) {
            qq0.U(qq0Var, null);
        }
    }
}
