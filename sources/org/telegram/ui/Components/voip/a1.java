package org.telegram.ui.Components.voip;

import bi.m5;
import org.telegram.ui.Components.dh0;
public final class a1 implements Runnable {
    public final int f39176a;
    public final m5 f39177b;
    public final dh0 f39178c;

    public a1(m5 m5Var, dh0 dh0Var, int i7) {
        this.f39176a = i7;
        this.f39177b = m5Var;
        this.f39178c = dh0Var;
    }

    @Override
    public final void run() {
        switch (this.f39176a) {
            case 0:
                org.telegram.messenger.g0.h3(new a1(this.f39177b, this.f39178c, 1));
                return;
            default:
                this.f39177b.removeView(this.f39178c);
                return;
        }
    }
}
