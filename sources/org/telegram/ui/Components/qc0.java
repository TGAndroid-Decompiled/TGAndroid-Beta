package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class qc0 extends ho0 {
    public final wc0 d;

    public qc0(wc0 wc0Var) {
        this.d = wc0Var;
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
    public final void c(boolean z4) {
        this.d.a(!z4);
    }

    @Override
    public final CharSequence d() {
        wc0 wc0Var = this.d;
        Utilities.CallbackReturn callbackReturn = wc0Var.f30326p0;
        if (callbackReturn != null) {
            return (CharSequence) callbackReturn.run(Integer.valueOf(wc0Var.D));
        }
        return wc0Var.d(wc0Var.D);
    }
}
