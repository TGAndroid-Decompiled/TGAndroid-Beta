package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class hk0 implements Runnable {
    public final int f29008a;
    public final qk0 f29009b;
    public final TLObject f29010c;

    public hk0(qk0 qk0Var, TLObject tLObject, int i10) {
        this.f29008a = i10;
        this.f29009b = qk0Var;
        this.f29010c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f29008a) {
            case 0:
                qk0 qk0Var = this.f29009b;
                NotificationCenter.getInstance(qk0Var.f31921b).doOnIdle(new hk0(qk0Var, this.f29010c, 1));
                return;
            default:
                qk0.a(this.f29009b, this.f29010c);
                return;
        }
    }
}
