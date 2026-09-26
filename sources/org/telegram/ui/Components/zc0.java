package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class zc0 extends qo0 {
    public final fd0 d;

    public zc0(fd0 fd0Var) {
        this.d = fd0Var;
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
        fd0 fd0Var = this.d;
        Utilities.CallbackReturn callbackReturn = fd0Var.f24250s0;
        if (callbackReturn != null) {
            return (CharSequence) callbackReturn.run(Integer.valueOf(fd0Var.G));
        }
        return fd0Var.d(fd0Var.G);
    }
}
