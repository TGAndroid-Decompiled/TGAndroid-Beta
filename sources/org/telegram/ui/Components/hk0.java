package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class hk0 implements Runnable {
    public final int f26969a;
    public final qk0 f26970b;
    public final TLObject f26971c;

    public hk0(qk0 qk0Var, TLObject tLObject, int i10) {
        this.f26969a = i10;
        this.f26970b = qk0Var;
        this.f26971c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f26969a) {
            case 0:
                qk0 qk0Var = this.f26970b;
                NotificationCenter.getInstance(qk0Var.f29927b).doOnIdle(new hk0(qk0Var, this.f26971c, 1));
                return;
            default:
                qk0.a(this.f26970b, this.f26971c);
                return;
        }
    }
}
