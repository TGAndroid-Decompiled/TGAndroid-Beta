package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class id0 extends dp0 {
    public final od0 d;

    public id0(od0 od0Var) {
        this.d = od0Var;
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
        od0 od0Var = this.d;
        Utilities.CallbackReturn callbackReturn = od0Var.f29254u0;
        if (callbackReturn != null) {
            return (CharSequence) callbackReturn.run(Integer.valueOf(od0Var.H));
        }
        return od0Var.d(od0Var.H);
    }
}
