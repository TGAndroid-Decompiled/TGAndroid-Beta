package org.telegram.ui.Components.voip;

import bi.m5;
import org.telegram.ui.Components.ch0;
public final class a1 implements Runnable {
    public final int f39087a;
    public final m5 f39088b;
    public final ch0 f39089c;

    public a1(m5 m5Var, ch0 ch0Var, int i7) {
        this.f39087a = i7;
        this.f39088b = m5Var;
        this.f39089c = ch0Var;
    }

    @Override
    public final void run() {
        switch (this.f39087a) {
            case 0:
                org.telegram.messenger.g0.h3(new a1(this.f39088b, this.f39089c, 1));
                return;
            default:
                this.f39088b.removeView(this.f39089c);
                return;
        }
    }
}
