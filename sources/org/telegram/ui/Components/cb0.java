package org.telegram.ui.Components;
public final class cb0 extends om0 {
    public final ib0 d;

    public cb0(ib0 ib0Var) {
        this.d = ib0Var;
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final void c(boolean z10) {
        this.d.a(!z10);
    }

    @Override
    public final CharSequence d() {
        ib0 ib0Var = this.d;
        org.telegram.messenger.a20 a20Var = ib0Var.f35561v0;
        if (a20Var != null) {
            return (CharSequence) a20Var.a(Integer.valueOf(ib0Var.I));
        }
        return ib0Var.d(ib0Var.I);
    }
}
