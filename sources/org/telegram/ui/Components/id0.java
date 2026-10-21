package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class id0 extends ap0 {
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
        Utilities.CallbackReturn callbackReturn = od0Var.f29024s0;
        if (callbackReturn != null) {
            return (CharSequence) callbackReturn.run(Integer.valueOf(od0Var.G));
        }
        return od0Var.d(od0Var.G);
    }
}
