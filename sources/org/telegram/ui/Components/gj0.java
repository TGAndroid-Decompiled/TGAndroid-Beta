package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class gj0 implements Runnable {
    public final int f24370a;
    public final pj0 f24371b;
    public final TLObject f24372c;

    public gj0(pj0 pj0Var, TLObject tLObject, int i10) {
        this.f24370a = i10;
        this.f24371b = pj0Var;
        this.f24372c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f24370a) {
            case 0:
                pj0 pj0Var = this.f24371b;
                NotificationCenter.getInstance(pj0Var.f27057b).doOnIdle(new gj0(pj0Var, this.f24372c, 1));
                return;
            default:
                pj0.a(this.f24371b, this.f24372c);
                return;
        }
    }
}
