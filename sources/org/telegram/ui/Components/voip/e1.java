package org.telegram.ui.Components.voip;

import di.k4;
import org.telegram.ui.Components.fh0;
public final class e1 implements Runnable {
    public final int f40582a;
    public final k4 f40583b;
    public final fh0 f40584c;

    public e1(k4 k4Var, fh0 fh0Var, int i7) {
        this.f40582a = i7;
        this.f40583b = k4Var;
        this.f40584c = fh0Var;
    }

    @Override
    public final void run() {
        switch (this.f40582a) {
            case 0:
                org.telegram.messenger.g0.h3(new e1(this.f40583b, this.f40584c, 1));
                return;
            default:
                this.f40583b.removeView(this.f40584c);
                return;
        }
    }
}
