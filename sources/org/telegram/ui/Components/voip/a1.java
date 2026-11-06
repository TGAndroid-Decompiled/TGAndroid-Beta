package org.telegram.ui.Components.voip;

import bi.m5;
import org.telegram.ui.Components.ch0;
public final class a1 implements Runnable {
    public final int f39034a;
    public final m5 f39035b;
    public final ch0 f39036c;

    public a1(m5 m5Var, ch0 ch0Var, int i7) {
        this.f39034a = i7;
        this.f39035b = m5Var;
        this.f39036c = ch0Var;
    }

    @Override
    public final void run() {
        switch (this.f39034a) {
            case 0:
                org.telegram.messenger.g0.h3(new a1(this.f39035b, this.f39036c, 1));
                return;
            default:
                this.f39035b.removeView(this.f39036c);
                return;
        }
    }
}
