package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class gd0 extends jp0 {
    public final md0 d;

    public gd0(md0 md0Var) {
        this.d = md0Var;
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
        md0 md0Var = this.d;
        Utilities.CallbackReturn callbackReturn = md0Var.f30560u0;
        if (callbackReturn != null) {
            return (CharSequence) callbackReturn.run(Integer.valueOf(md0Var.H));
        }
        return md0Var.d(md0Var.H);
    }
}
