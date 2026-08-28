package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class vb0 extends mn0 {
    public final bc0 d;

    public vb0(bc0 bc0Var) {
        this.d = bc0Var;
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
        bc0 bc0Var = this.d;
        Utilities.CallbackReturn callbackReturn = bc0Var.f27165o0;
        if (callbackReturn != null) {
            return (CharSequence) callbackReturn.run(Integer.valueOf(bc0Var.C));
        }
        return bc0Var.d(bc0Var.C);
    }
}
