package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class rj0 implements Runnable {
    public final int f27980a;
    public final ak0 f27981b;
    public final TLObject f27982c;

    public rj0(ak0 ak0Var, TLObject tLObject, int i10) {
        this.f27980a = i10;
        this.f27981b = ak0Var;
        this.f27982c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f27980a) {
            case 0:
                ak0 ak0Var = this.f27981b;
                NotificationCenter.getInstance(ak0Var.f22714b).doOnIdle(new rj0(ak0Var, this.f27982c, 1));
                return;
            default:
                ak0.a(this.f27981b, this.f27982c);
                return;
        }
    }
}
