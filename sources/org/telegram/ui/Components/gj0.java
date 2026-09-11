package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class gj0 implements Runnable {
    public final int f26412a;
    public final pj0 f26413b;
    public final TLObject f26414c;

    public gj0(pj0 pj0Var, TLObject tLObject, int i10) {
        this.f26412a = i10;
        this.f26413b = pj0Var;
        this.f26414c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f26412a) {
            case 0:
                pj0 pj0Var = this.f26413b;
                NotificationCenter.getInstance(pj0Var.f29398b).doOnIdle(new gj0(pj0Var, this.f26414c, 1));
                return;
            default:
                pj0.a(this.f26413b, this.f26414c);
                return;
        }
    }
}
