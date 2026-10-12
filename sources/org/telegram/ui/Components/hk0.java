package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class hk0 implements Runnable {
    public final int f25694a;
    public final qk0 f25695b;
    public final TLObject f25696c;

    public hk0(qk0 qk0Var, TLObject tLObject, int i10) {
        this.f25694a = i10;
        this.f25695b = qk0Var;
        this.f25696c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f25694a) {
            case 0:
                qk0 qk0Var = this.f25695b;
                NotificationCenter.getInstance(qk0Var.f28629b).doOnIdle(new hk0(qk0Var, this.f25696c, 1));
                return;
            default:
                qk0.a(this.f25695b, this.f25696c);
                return;
        }
    }
}
