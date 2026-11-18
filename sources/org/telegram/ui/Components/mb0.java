package org.telegram.ui.Components;
public final class mb0 extends wm0 {
    public final sb0 d;

    public mb0(sb0 sb0Var) {
        this.d = sb0Var;
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
        sb0 sb0Var = this.d;
        org.telegram.messenger.y10 y10Var = sb0Var.f39586v0;
        if (y10Var != null) {
            return (CharSequence) y10Var.a(Integer.valueOf(sb0Var.I));
        }
        return sb0Var.d(sb0Var.I);
    }
}
