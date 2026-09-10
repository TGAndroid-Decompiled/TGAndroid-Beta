package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class xc0 extends lo0 {
    public final dd0 d;

    public xc0(dd0 dd0Var) {
        this.d = dd0Var;
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
        dd0 dd0Var = this.d;
        Utilities.CallbackReturn callbackReturn = dd0Var.f22390s0;
        if (callbackReturn != null) {
            return (CharSequence) callbackReturn.run(Integer.valueOf(dd0Var.G));
        }
        return dd0Var.d(dd0Var.G);
    }
}
