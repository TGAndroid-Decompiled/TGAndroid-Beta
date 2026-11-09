package org.telegram.ui.Components;
public final class cb0 extends lm0 {
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
    public final void c(boolean z9) {
        this.d.a(!z9);
    }

    @Override
    public final CharSequence d() {
        ib0 ib0Var = this.d;
        org.telegram.messenger.d20 d20Var = ib0Var.f34690u0;
        if (d20Var != null) {
            return (CharSequence) d20Var.a(Integer.valueOf(ib0Var.H));
        }
        return ib0Var.d(ib0Var.H);
    }
}
