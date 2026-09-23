package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class nc0 extends co0 {
    public final tc0 d;

    public nc0(tc0 tc0Var) {
        this.d = tc0Var;
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
        tc0 tc0Var = this.d;
        Utilities.CallbackReturn callbackReturn = tc0Var.f28172s0;
        if (callbackReturn != null) {
            return (CharSequence) callbackReturn.run(Integer.valueOf(tc0Var.G));
        }
        return tc0Var.d(tc0Var.G);
    }
}
