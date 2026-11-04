package org.telegram.ui.Components;
public final class wa0 extends nm0 {
    public final cb0 d;

    public wa0(cb0 cb0Var) {
        this.d = cb0Var;
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
        cb0 cb0Var = this.d;
        org.telegram.messenger.v10 v10Var = cb0Var.f32675v0;
        if (v10Var != null) {
            return (CharSequence) v10Var.a(Integer.valueOf(cb0Var.I));
        }
        return cb0Var.d(cb0Var.I);
    }
}
