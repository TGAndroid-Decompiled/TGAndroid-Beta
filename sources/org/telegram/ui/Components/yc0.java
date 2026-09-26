package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class yc0 extends po0 {
    public final ed0 d;

    public yc0(ed0 ed0Var) {
        this.d = ed0Var;
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
        ed0 ed0Var = this.d;
        Utilities.CallbackReturn callbackReturn = ed0Var.f23934s0;
        if (callbackReturn != null) {
            return (CharSequence) callbackReturn.run(Integer.valueOf(ed0Var.G));
        }
        return ed0Var.d(ed0Var.G);
    }
}
