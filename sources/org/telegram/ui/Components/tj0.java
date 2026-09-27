package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class tj0 implements Runnable {
    public final int f28613a;
    public final ck0 f28614b;
    public final TLObject f28615c;

    public tj0(ck0 ck0Var, TLObject tLObject, int i10) {
        this.f28613a = i10;
        this.f28614b = ck0Var;
        this.f28615c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f28613a) {
            case 0:
                ck0 ck0Var = this.f28614b;
                NotificationCenter.getInstance(ck0Var.f23348b).doOnIdle(new tj0(ck0Var, this.f28615c, 1));
                return;
            default:
                ck0.a(this.f28614b, this.f28615c);
                return;
        }
    }
}
