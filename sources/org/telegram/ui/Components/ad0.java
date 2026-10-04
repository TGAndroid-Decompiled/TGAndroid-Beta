package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class ad0 extends vo0 {
    public final gd0 d;

    public ad0(gd0 gd0Var) {
        this.d = gd0Var;
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
        gd0 gd0Var = this.d;
        Utilities.CallbackReturn callbackReturn = gd0Var.f26844s0;
        if (callbackReturn != null) {
            return (CharSequence) callbackReturn.run(Integer.valueOf(gd0Var.G));
        }
        return gd0Var.d(gd0Var.G);
    }
}
