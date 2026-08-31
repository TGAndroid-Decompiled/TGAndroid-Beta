package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class sc0 extends io0 {
    public final yc0 d;

    public sc0(yc0 yc0Var) {
        this.d = yc0Var;
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
        yc0 yc0Var = this.d;
        Utilities.CallbackReturn callbackReturn = yc0Var.f33486p0;
        if (callbackReturn != null) {
            return (CharSequence) callbackReturn.run(Integer.valueOf(yc0Var.D));
        }
        return yc0Var.d(yc0Var.D);
    }
}
