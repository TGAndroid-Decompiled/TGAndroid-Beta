package org.telegram.ui.Components.voip;

import di.n4;
import org.telegram.ui.Components.ph0;
public final class d1 implements Runnable {
    public final int f40815a;
    public final n4 f40816b;
    public final ph0 f40817c;

    public d1(n4 n4Var, ph0 ph0Var, int i7) {
        this.f40815a = i7;
        this.f40816b = n4Var;
        this.f40817c = ph0Var;
    }

    @Override
    public final void run() {
        switch (this.f40815a) {
            case 0:
                org.telegram.messenger.g0.g3(new d1(this.f40816b, this.f40817c, 1));
                return;
            default:
                this.f40816b.removeView(this.f40817c);
                return;
        }
    }
}
