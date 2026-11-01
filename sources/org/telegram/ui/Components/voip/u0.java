package org.telegram.ui.Components.voip;

import org.telegram.ui.Components.fi0;
public final class u0 implements Runnable {
    public final int f31743a;
    public final jg.b1 f31744b;
    public final fi0 f31745c;

    public u0(jg.b1 b1Var, fi0 fi0Var, int i10) {
        this.f31743a = i10;
        this.f31744b = b1Var;
        this.f31745c = fi0Var;
    }

    @Override
    public final void run() {
        switch (this.f31743a) {
            case 0:
                org.telegram.messenger.i0.g3(new u0(this.f31744b, this.f31745c, 1));
                return;
            default:
                this.f31744b.removeView(this.f31745c);
                return;
        }
    }
}
