package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class lk0 implements Runnable {
    public final int f28470a;
    public final uk0 f28471b;
    public final TLObject f28472c;

    public lk0(uk0 uk0Var, TLObject tLObject, int i10) {
        this.f28470a = i10;
        this.f28471b = uk0Var;
        this.f28472c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f28470a) {
            case 0:
                uk0 uk0Var = this.f28471b;
                NotificationCenter.getInstance(uk0Var.f31522b).doOnIdle(new lk0(uk0Var, this.f28472c, 1));
                return;
            default:
                uk0.a(this.f28471b, this.f28472c);
                return;
        }
    }
}
