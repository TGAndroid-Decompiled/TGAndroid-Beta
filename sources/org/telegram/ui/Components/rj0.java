package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class rj0 implements Runnable {
    public final int f30745a;
    public final ak0 f30746b;
    public final TLObject f30747c;

    public rj0(ak0 ak0Var, TLObject tLObject, int i10) {
        this.f30745a = i10;
        this.f30746b = ak0Var;
        this.f30747c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f30745a) {
            case 0:
                ak0 ak0Var = this.f30746b;
                NotificationCenter.getInstance(ak0Var.f25272b).doOnIdle(new rj0(ak0Var, this.f30747c, 1));
                return;
            default:
                ak0.a(this.f30746b, this.f30747c);
                return;
        }
    }
}
