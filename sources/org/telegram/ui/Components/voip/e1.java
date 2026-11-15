package org.telegram.ui.Components.voip;

import di.k4;
import org.telegram.ui.Components.fh0;
public final class e1 implements Runnable {
    public final int f40579a;
    public final k4 f40580b;
    public final fh0 f40581c;

    public e1(k4 k4Var, fh0 fh0Var, int i7) {
        this.f40579a = i7;
        this.f40580b = k4Var;
        this.f40581c = fh0Var;
    }

    @Override
    public final void run() {
        switch (this.f40579a) {
            case 0:
                org.telegram.messenger.g0.h3(new e1(this.f40580b, this.f40581c, 1));
                return;
            default:
                this.f40580b.removeView(this.f40581c);
                return;
        }
    }
}
