package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class ek0 implements Runnable {
    public final int f25915a;
    public final nk0 f25916b;
    public final TLObject f25917c;

    public ek0(nk0 nk0Var, TLObject tLObject, int i10) {
        this.f25915a = i10;
        this.f25916b = nk0Var;
        this.f25917c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f25915a) {
            case 0:
                nk0 nk0Var = this.f25916b;
                NotificationCenter.getInstance(nk0Var.f28829b).doOnIdle(new ek0(nk0Var, this.f25917c, 1));
                return;
            default:
                nk0.a(this.f25916b, this.f25917c);
                return;
        }
    }
}
