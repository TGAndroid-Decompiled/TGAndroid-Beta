package org.telegram.ui.Components;
public final class nb0 extends zm0 {
    public final tb0 d;

    public nb0(tb0 tb0Var) {
        this.d = tb0Var;
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
        tb0 tb0Var = this.d;
        org.telegram.messenger.y10 y10Var = tb0Var.f39850v0;
        if (y10Var != null) {
            return (CharSequence) y10Var.a(Integer.valueOf(tb0Var.I));
        }
        return tb0Var.d(tb0Var.I);
    }
}
