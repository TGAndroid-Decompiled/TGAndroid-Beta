package org.telegram.ui.Components;
public final class kb0 extends ym0 {
    public final qb0 d;

    public kb0(qb0 qb0Var) {
        this.d = qb0Var;
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
        qb0 qb0Var = this.d;
        org.telegram.messenger.x10 x10Var = qb0Var.f38785v0;
        if (x10Var != null) {
            return (CharSequence) x10Var.a(Integer.valueOf(qb0Var.I));
        }
        return qb0Var.d(qb0Var.I);
    }
}
