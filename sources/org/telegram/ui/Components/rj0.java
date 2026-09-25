package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class rj0 implements Runnable {
    public final int f27981a;
    public final ak0 f27982b;
    public final TLObject f27983c;

    public rj0(ak0 ak0Var, TLObject tLObject, int i10) {
        this.f27981a = i10;
        this.f27982b = ak0Var;
        this.f27983c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f27981a) {
            case 0:
                ak0 ak0Var = this.f27982b;
                NotificationCenter.getInstance(ak0Var.f22715b).doOnIdle(new rj0(ak0Var, this.f27983c, 1));
                return;
            default:
                ak0.a(this.f27982b, this.f27983c);
                return;
        }
    }
}
