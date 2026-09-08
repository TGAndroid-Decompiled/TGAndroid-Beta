package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class pc0 extends co0 {
    public final vc0 d;

    public pc0(vc0 vc0Var) {
        this.d = vc0Var;
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
        vc0 vc0Var = this.d;
        Utilities.CallbackReturn callbackReturn = vc0Var.f31222s0;
        if (callbackReturn != null) {
            return (CharSequence) callbackReturn.run(Integer.valueOf(vc0Var.G));
        }
        return vc0Var.d(vc0Var.G);
    }
}
