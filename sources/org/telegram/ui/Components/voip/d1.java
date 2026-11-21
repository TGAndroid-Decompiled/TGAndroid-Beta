package org.telegram.ui.Components.voip;

import di.n4;
import org.telegram.ui.Components.rh0;
public final class d1 implements Runnable {
    public final int f40950a;
    public final n4 f40951b;
    public final rh0 f40952c;

    public d1(n4 n4Var, rh0 rh0Var, int i7) {
        this.f40950a = i7;
        this.f40951b = n4Var;
        this.f40952c = rh0Var;
    }

    @Override
    public final void run() {
        switch (this.f40950a) {
            case 0:
                org.telegram.messenger.g0.g3(new d1(this.f40951b, this.f40952c, 1));
                return;
            default:
                this.f40951b.removeView(this.f40952c);
                return;
        }
    }
}
