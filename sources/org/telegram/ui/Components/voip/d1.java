package org.telegram.ui.Components.voip;

import di.n4;
import org.telegram.ui.Components.rh0;
public final class d1 implements Runnable {
    public final int f40952a;
    public final n4 f40953b;
    public final rh0 f40954c;

    public d1(n4 n4Var, rh0 rh0Var, int i7) {
        this.f40952a = i7;
        this.f40953b = n4Var;
        this.f40954c = rh0Var;
    }

    @Override
    public final void run() {
        switch (this.f40952a) {
            case 0:
                org.telegram.messenger.g0.g3(new d1(this.f40953b, this.f40954c, 1));
                return;
            default:
                this.f40953b.removeView(this.f40954c);
                return;
        }
    }
}
