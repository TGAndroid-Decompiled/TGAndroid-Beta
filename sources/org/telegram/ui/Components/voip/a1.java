package org.telegram.ui.Components.voip;

import bi.m5;
import org.telegram.ui.Components.ch0;
public final class a1 implements Runnable {
    public final int f39052a;
    public final m5 f39053b;
    public final ch0 f39054c;

    public a1(m5 m5Var, ch0 ch0Var, int i7) {
        this.f39052a = i7;
        this.f39053b = m5Var;
        this.f39054c = ch0Var;
    }

    @Override
    public final void run() {
        switch (this.f39052a) {
            case 0:
                org.telegram.messenger.g0.h3(new a1(this.f39053b, this.f39054c, 1));
                return;
            default:
                this.f39053b.removeView(this.f39054c);
                return;
        }
    }
}
