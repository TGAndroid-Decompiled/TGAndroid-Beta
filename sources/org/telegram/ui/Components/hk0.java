package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class hk0 implements Runnable {
    public final int f25345a;
    public final qk0 f25346b;
    public final TLObject f25347c;

    public hk0(qk0 qk0Var, TLObject tLObject, int i10) {
        this.f25345a = i10;
        this.f25346b = qk0Var;
        this.f25347c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f25345a) {
            case 0:
                qk0 qk0Var = this.f25346b;
                NotificationCenter.getInstance(qk0Var.f28311b).doOnIdle(new hk0(qk0Var, this.f25347c, 1));
                return;
            default:
                qk0.a(this.f25346b, this.f25347c);
                return;
        }
    }
}
