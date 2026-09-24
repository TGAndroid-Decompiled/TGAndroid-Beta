package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class rj0 implements Runnable {
    public final int f27972a;
    public final ak0 f27973b;
    public final TLObject f27974c;

    public rj0(ak0 ak0Var, TLObject tLObject, int i10) {
        this.f27972a = i10;
        this.f27973b = ak0Var;
        this.f27974c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f27972a) {
            case 0:
                ak0 ak0Var = this.f27973b;
                NotificationCenter.getInstance(ak0Var.f22696b).doOnIdle(new rj0(ak0Var, this.f27974c, 1));
                return;
            default:
                ak0.a(this.f27973b, this.f27974c);
                return;
        }
    }
}
