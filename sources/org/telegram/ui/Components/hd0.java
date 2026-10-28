package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class hd0 extends kp0 {
    public final nd0 d;

    public hd0(nd0 nd0Var) {
        this.d = nd0Var;
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
        nd0 nd0Var = this.d;
        Utilities.CallbackReturn callbackReturn = nd0Var.f30894u0;
        if (callbackReturn != null) {
            return (CharSequence) callbackReturn.run(Integer.valueOf(nd0Var.H));
        }
        return nd0Var.d(nd0Var.H);
    }
}
