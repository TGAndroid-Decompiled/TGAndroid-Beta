package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class sd0 extends np0 {
    public final yd0 d;

    public sd0(yd0 yd0Var) {
        this.d = yd0Var;
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
        yd0 yd0Var = this.d;
        Utilities.CallbackReturn callbackReturn = yd0Var.f33084s0;
        if (callbackReturn != null) {
            return (CharSequence) callbackReturn.run(Integer.valueOf(yd0Var.G));
        }
        return yd0Var.d(yd0Var.G);
    }
}
