package org.telegram.ui.Components;
public final class bb0 extends km0 {
    public final hb0 d;

    public bb0(hb0 hb0Var) {
        this.d = hb0Var;
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
        hb0 hb0Var = this.d;
        org.telegram.messenger.d20 d20Var = hb0Var.f34206u0;
        if (d20Var != null) {
            return (CharSequence) d20Var.a(Integer.valueOf(hb0Var.H));
        }
        return hb0Var.d(hb0Var.H);
    }
}
