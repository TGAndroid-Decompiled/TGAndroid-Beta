package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class rc0 extends go0 {
    public final xc0 d;

    public rc0(xc0 xc0Var) {
        this.d = xc0Var;
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
        xc0 xc0Var = this.d;
        Utilities.CallbackReturn callbackReturn = xc0Var.f30616p0;
        if (callbackReturn != null) {
            return (CharSequence) callbackReturn.run(Integer.valueOf(xc0Var.D));
        }
        return xc0Var.d(xc0Var.D);
    }
}
