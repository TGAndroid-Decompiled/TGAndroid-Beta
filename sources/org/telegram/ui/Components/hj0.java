package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class hj0 implements Runnable {
    public final int f24702a;
    public final qj0 f24703b;
    public final TLObject f24704c;

    public hj0(qj0 qj0Var, TLObject tLObject, int i10) {
        this.f24702a = i10;
        this.f24703b = qj0Var;
        this.f24704c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f24702a) {
            case 0:
                qj0 qj0Var = this.f24703b;
                NotificationCenter.getInstance(qj0Var.f27365b).doOnIdle(new hj0(qj0Var, this.f24704c, 1));
                return;
            default:
                qj0.a(this.f24703b, this.f24704c);
                return;
        }
    }
}
