package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class bd0 extends so0 {
    public final hd0 d;

    public bd0(hd0 hd0Var) {
        this.d = hd0Var;
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
        hd0 hd0Var = this.d;
        Utilities.CallbackReturn callbackReturn = hd0Var.f24838s0;
        if (callbackReturn != null) {
            return (CharSequence) callbackReturn.run(Integer.valueOf(hd0Var.G));
        }
        return hd0Var.d(hd0Var.G);
    }
}
