package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class gj0 implements Runnable {
    public final int f28895a;
    public final pj0 f28896b;
    public final TLObject f28897c;

    public gj0(pj0 pj0Var, TLObject tLObject, int i10) {
        this.f28895a = i10;
        this.f28896b = pj0Var;
        this.f28897c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f28895a) {
            case 0:
                pj0 pj0Var = this.f28896b;
                NotificationCenter.getInstance(pj0Var.f31687b).doOnIdle(new gj0(pj0Var, this.f28897c, 1));
                return;
            default:
                pj0.a(this.f28896b, this.f28897c);
                return;
        }
    }
}
