package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class kc0 extends xn0 {
    public final qc0 d;

    public kc0(qc0 qc0Var) {
        this.d = qc0Var;
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
        qc0 qc0Var = this.d;
        Utilities.CallbackReturn callbackReturn = qc0Var.f31913o0;
        if (callbackReturn != null) {
            return (CharSequence) callbackReturn.run(Integer.valueOf(qc0Var.C));
        }
        return qc0Var.d(qc0Var.C);
    }
}
