package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class gj0 implements Runnable {
    public final int f26413a;
    public final pj0 f26414b;
    public final TLObject f26415c;

    public gj0(pj0 pj0Var, TLObject tLObject, int i10) {
        this.f26413a = i10;
        this.f26414b = pj0Var;
        this.f26415c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f26413a) {
            case 0:
                pj0 pj0Var = this.f26414b;
                NotificationCenter.getInstance(pj0Var.f29399b).doOnIdle(new gj0(pj0Var, this.f26415c, 1));
                return;
            default:
                pj0.a(this.f26414b, this.f26415c);
                return;
        }
    }
}
