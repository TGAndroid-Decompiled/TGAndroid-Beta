package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class tj0 implements Runnable {
    public final int f28572a;
    public final ck0 f28573b;
    public final TLObject f28574c;

    public tj0(ck0 ck0Var, TLObject tLObject, int i10) {
        this.f28572a = i10;
        this.f28573b = ck0Var;
        this.f28574c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f28572a) {
            case 0:
                ck0 ck0Var = this.f28573b;
                NotificationCenter.getInstance(ck0Var.f23330b).doOnIdle(new tj0(ck0Var, this.f28574c, 1));
                return;
            default:
                ck0.a(this.f28573b, this.f28574c);
                return;
        }
    }
}
