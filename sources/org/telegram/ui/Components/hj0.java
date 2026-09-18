package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class hj0 implements Runnable {
    public final int f24678a;
    public final qj0 f24679b;
    public final TLObject f24680c;

    public hj0(qj0 qj0Var, TLObject tLObject, int i10) {
        this.f24678a = i10;
        this.f24679b = qj0Var;
        this.f24680c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f24678a) {
            case 0:
                qj0 qj0Var = this.f24679b;
                NotificationCenter.getInstance(qj0Var.f27328b).doOnIdle(new hj0(qj0Var, this.f24680c, 1));
                return;
            default:
                qj0.a(this.f24679b, this.f24680c);
                return;
        }
    }
}
