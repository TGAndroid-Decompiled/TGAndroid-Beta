package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class rj0 implements Runnable {
    public final int f27909a;
    public final ak0 f27910b;
    public final TLObject f27911c;

    public rj0(ak0 ak0Var, TLObject tLObject, int i10) {
        this.f27909a = i10;
        this.f27910b = ak0Var;
        this.f27911c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f27909a) {
            case 0:
                ak0 ak0Var = this.f27910b;
                NotificationCenter.getInstance(ak0Var.f22639b).doOnIdle(new rj0(ak0Var, this.f27911c, 1));
                return;
            default:
                ak0.a(this.f27910b, this.f27911c);
                return;
        }
    }
}
