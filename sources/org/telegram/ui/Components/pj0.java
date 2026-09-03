package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class pj0 implements Runnable {
    public final int f27873a;
    public final yj0 f27874b;
    public final TLObject f27875c;

    public pj0(yj0 yj0Var, TLObject tLObject, int i10) {
        this.f27873a = i10;
        this.f27874b = yj0Var;
        this.f27875c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f27873a) {
            case 0:
                yj0 yj0Var = this.f27874b;
                NotificationCenter.getInstance(yj0Var.f31033b).doOnIdle(new pj0(yj0Var, this.f27875c, 1));
                return;
            default:
                yj0.a(this.f27874b, this.f27875c);
                return;
        }
    }
}
