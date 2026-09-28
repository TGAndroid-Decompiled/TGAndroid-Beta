package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class tj0 implements Runnable {
    public final int f28571a;
    public final ck0 f28572b;
    public final TLObject f28573c;

    public tj0(ck0 ck0Var, TLObject tLObject, int i10) {
        this.f28571a = i10;
        this.f28572b = ck0Var;
        this.f28573c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f28571a) {
            case 0:
                ck0 ck0Var = this.f28572b;
                NotificationCenter.getInstance(ck0Var.f23329b).doOnIdle(new tj0(ck0Var, this.f28573c, 1));
                return;
            default:
                ck0.a(this.f28572b, this.f28573c);
                return;
        }
    }
}
