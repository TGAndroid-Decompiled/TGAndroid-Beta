package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class tj0 implements Runnable {
    public final int f28570a;
    public final ck0 f28571b;
    public final TLObject f28572c;

    public tj0(ck0 ck0Var, TLObject tLObject, int i10) {
        this.f28570a = i10;
        this.f28571b = ck0Var;
        this.f28572c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f28570a) {
            case 0:
                ck0 ck0Var = this.f28571b;
                NotificationCenter.getInstance(ck0Var.f23328b).doOnIdle(new tj0(ck0Var, this.f28572c, 1));
                return;
            default:
                ck0.a(this.f28571b, this.f28572c);
                return;
        }
    }
}
