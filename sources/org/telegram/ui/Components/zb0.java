package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

public final class zb0 extends nn0 {
    public final fc0 d;

    public zb0(fc0 fc0Var) {
        this.d = fc0Var;
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
        fc0 fc0Var = this.d;
        Utilities.CallbackReturn callbackReturn = fc0Var.f28367o0;
        return callbackReturn != null ? (CharSequence) callbackReturn.run(Integer.valueOf(fc0Var.C)) : fc0Var.d(fc0Var.C);
    }
}
