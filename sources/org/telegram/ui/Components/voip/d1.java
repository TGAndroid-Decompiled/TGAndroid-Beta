package org.telegram.ui.Components.voip;

import di.n4;
import org.telegram.ui.Components.rh0;
public final class d1 implements Runnable {
    public final int f40951a;
    public final n4 f40952b;
    public final rh0 f40953c;

    public d1(n4 n4Var, rh0 rh0Var, int i7) {
        this.f40951a = i7;
        this.f40952b = n4Var;
        this.f40953c = rh0Var;
    }

    @Override
    public final void run() {
        switch (this.f40951a) {
            case 0:
                org.telegram.messenger.g0.g3(new d1(this.f40952b, this.f40953c, 1));
                return;
            default:
                this.f40952b.removeView(this.f40953c);
                return;
        }
    }
}
