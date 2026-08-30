package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class pj0 implements Runnable {
    public final int f27878a;
    public final yj0 f27879b;
    public final TLObject f27880c;

    public pj0(yj0 yj0Var, TLObject tLObject, int i10) {
        this.f27878a = i10;
        this.f27879b = yj0Var;
        this.f27880c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f27878a) {
            case 0:
                yj0 yj0Var = this.f27879b;
                NotificationCenter.getInstance(yj0Var.f31029b).doOnIdle(new pj0(yj0Var, this.f27880c, 1));
                return;
            default:
                yj0.a(this.f27879b, this.f27880c);
                return;
        }
    }
}
