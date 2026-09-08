package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class gj0 implements Runnable {
    public final int f26439a;
    public final pj0 f26440b;
    public final TLObject f26441c;

    public gj0(pj0 pj0Var, TLObject tLObject, int i10) {
        this.f26439a = i10;
        this.f26440b = pj0Var;
        this.f26441c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f26439a) {
            case 0:
                pj0 pj0Var = this.f26440b;
                NotificationCenter.getInstance(pj0Var.f29425b).doOnIdle(new gj0(pj0Var, this.f26441c, 1));
                return;
            default:
                pj0.a(this.f26440b, this.f26441c);
                return;
        }
    }
}
