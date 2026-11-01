package org.telegram.ui.Components;
public final class ub0 extends mn0 {
    public final ac0 d;

    public ub0(ac0 ac0Var) {
        this.d = ac0Var;
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
        ac0 ac0Var = this.d;
        org.telegram.messenger.s20 s20Var = ac0Var.f24378u0;
        if (s20Var != null) {
            return (CharSequence) s20Var.a(Integer.valueOf(ac0Var.H));
        }
        return ac0Var.d(ac0Var.H);
    }
}
