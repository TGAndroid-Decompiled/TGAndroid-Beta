package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class ok0 implements Runnable {
    public final int f29232a;
    public final xk0 f29233b;
    public final TLObject f29234c;

    public ok0(xk0 xk0Var, TLObject tLObject, int i10) {
        this.f29232a = i10;
        this.f29233b = xk0Var;
        this.f29234c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f29232a) {
            case 0:
                xk0 xk0Var = this.f29233b;
                NotificationCenter.getInstance(xk0Var.f32785b).doOnIdle(new ok0(xk0Var, this.f29234c, 1));
                return;
            default:
                xk0.a(this.f29233b, this.f29234c);
                return;
        }
    }
}
