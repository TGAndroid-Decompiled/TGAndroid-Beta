package org.telegram.ui.Components.voip;

import ci.t4;
import org.telegram.ui.Components.fh0;
public final class t0 implements Runnable {
    public final int f39608a;
    public final t4 f39609b;
    public final fh0 f39610c;

    public t0(t4 t4Var, fh0 fh0Var, int i3) {
        this.f39608a = i3;
        this.f39609b = t4Var;
        this.f39610c = fh0Var;
    }

    @Override
    public final void run() {
        switch (this.f39608a) {
            case 0:
                org.telegram.messenger.g0.h3(new t0(this.f39609b, this.f39610c, 1));
                return;
            default:
                this.f39609b.removeView(this.f39610c);
                return;
        }
    }
}
