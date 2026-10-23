package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class kd0 extends ep0 {
    public final qd0 d;

    public kd0(qd0 qd0Var) {
        this.d = qd0Var;
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
        qd0 qd0Var = this.d;
        Utilities.CallbackReturn callbackReturn = qd0Var.f29883u0;
        if (callbackReturn != null) {
            return (CharSequence) callbackReturn.run(Integer.valueOf(qd0Var.H));
        }
        return qd0Var.d(qd0Var.H);
    }
}
