package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class pd0 extends ip0 {
    public final vd0 d;

    public pd0(vd0 vd0Var) {
        this.d = vd0Var;
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
        vd0 vd0Var = this.d;
        Utilities.CallbackReturn callbackReturn = vd0Var.f31825s0;
        if (callbackReturn != null) {
            return (CharSequence) callbackReturn.run(Integer.valueOf(vd0Var.G));
        }
        return vd0Var.d(vd0Var.G);
    }
}
