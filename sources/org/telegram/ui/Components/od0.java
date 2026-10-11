package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class od0 extends ip0 {
    public final ud0 d;

    public od0(ud0 ud0Var) {
        this.d = ud0Var;
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
        ud0 ud0Var = this.d;
        Utilities.CallbackReturn callbackReturn = ud0Var.f31560s0;
        if (callbackReturn != null) {
            return (CharSequence) callbackReturn.run(Integer.valueOf(ud0Var.G));
        }
        return ud0Var.d(ud0Var.G);
    }
}
