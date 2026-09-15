package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class gj0 implements Runnable {
    public final int f24373a;
    public final pj0 f24374b;
    public final TLObject f24375c;

    public gj0(pj0 pj0Var, TLObject tLObject, int i10) {
        this.f24373a = i10;
        this.f24374b = pj0Var;
        this.f24375c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f24373a) {
            case 0:
                pj0 pj0Var = this.f24374b;
                NotificationCenter.getInstance(pj0Var.f27060b).doOnIdle(new gj0(pj0Var, this.f24375c, 1));
                return;
            default:
                pj0.a(this.f24374b, this.f24375c);
                return;
        }
    }
}
