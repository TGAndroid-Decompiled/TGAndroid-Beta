package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class tj0 implements Runnable {
    public final int f31077a;
    public final ck0 f31078b;
    public final TLObject f31079c;

    public tj0(ck0 ck0Var, TLObject tLObject, int i10) {
        this.f31077a = i10;
        this.f31078b = ck0Var;
        this.f31079c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f31077a) {
            case 0:
                ck0 ck0Var = this.f31078b;
                NotificationCenter.getInstance(ck0Var.f25407b).doOnIdle(new tj0(ck0Var, this.f31079c, 1));
                return;
            default:
                ck0.a(this.f31078b, this.f31079c);
                return;
        }
    }
}
