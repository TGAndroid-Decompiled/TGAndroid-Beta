package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class qj0 implements Runnable {
    public final int f26428a;
    public final zj0 f26429b;
    public final TLObject f26430c;

    public qj0(zj0 zj0Var, TLObject tLObject, int i10) {
        this.f26428a = i10;
        this.f26429b = zj0Var;
        this.f26430c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f26428a) {
            case 0:
                zj0 zj0Var = this.f26429b;
                NotificationCenter.getInstance(zj0Var.f29702b).doOnIdle(new qj0(zj0Var, this.f26430c, 1));
                return;
            default:
                zj0.a(this.f26429b, this.f26430c);
                return;
        }
    }
}
