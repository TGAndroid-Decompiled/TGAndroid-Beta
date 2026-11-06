package org.telegram.ui.Components.voip;

import bi.m5;
import org.telegram.ui.Components.ch0;
public final class a1 implements Runnable {
    public final int f39031a;
    public final m5 f39032b;
    public final ch0 f39033c;

    public a1(m5 m5Var, ch0 ch0Var, int i7) {
        this.f39031a = i7;
        this.f39032b = m5Var;
        this.f39033c = ch0Var;
    }

    @Override
    public final void run() {
        switch (this.f39031a) {
            case 0:
                org.telegram.messenger.g0.h3(new a1(this.f39032b, this.f39033c, 1));
                return;
            default:
                this.f39032b.removeView(this.f39033c);
                return;
        }
    }
}
