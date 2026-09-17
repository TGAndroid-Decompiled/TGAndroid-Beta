package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class gj0 implements Runnable {
    public final int f26440a;
    public final pj0 f26441b;
    public final TLObject f26442c;

    public gj0(pj0 pj0Var, TLObject tLObject, int i10) {
        this.f26440a = i10;
        this.f26441b = pj0Var;
        this.f26442c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f26440a) {
            case 0:
                pj0 pj0Var = this.f26441b;
                NotificationCenter.getInstance(pj0Var.f29426b).doOnIdle(new gj0(pj0Var, this.f26442c, 1));
                return;
            default:
                pj0.a(this.f26441b, this.f26442c);
                return;
        }
    }
}
