package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class wc0 extends po0 {
    public final cd0 d;

    public wc0(cd0 cd0Var) {
        this.d = cd0Var;
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
        cd0 cd0Var = this.d;
        Utilities.CallbackReturn callbackReturn = cd0Var.f23264s0;
        if (callbackReturn != null) {
            return (CharSequence) callbackReturn.run(Integer.valueOf(cd0Var.G));
        }
        return cd0Var.d(cd0Var.G);
    }
}
