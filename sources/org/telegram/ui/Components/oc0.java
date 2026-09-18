package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class oc0 extends do0 {
    public final uc0 d;

    public oc0(uc0 uc0Var) {
        this.d = uc0Var;
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
        uc0 uc0Var = this.d;
        Utilities.CallbackReturn callbackReturn = uc0Var.f28359s0;
        if (callbackReturn != null) {
            return (CharSequence) callbackReturn.run(Integer.valueOf(uc0Var.G));
        }
        return uc0Var.d(uc0Var.G);
    }
}
