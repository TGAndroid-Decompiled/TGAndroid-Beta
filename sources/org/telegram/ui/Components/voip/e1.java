package org.telegram.ui.Components.voip;

import di.n4;
import org.telegram.ui.Components.qh0;
public final class e1 implements Runnable {
    public final int f40858a;
    public final n4 f40859b;
    public final qh0 f40860c;

    public e1(n4 n4Var, qh0 qh0Var, int i7) {
        this.f40858a = i7;
        this.f40859b = n4Var;
        this.f40860c = qh0Var;
    }

    @Override
    public final void run() {
        switch (this.f40858a) {
            case 0:
                org.telegram.messenger.g0.g3(new e1(this.f40859b, this.f40860c, 1));
                return;
            default:
                this.f40859b.removeView(this.f40860c);
                return;
        }
    }
}
