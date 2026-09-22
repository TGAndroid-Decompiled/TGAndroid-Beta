package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class tj0 implements Runnable {
    public final int f28479a;
    public final ck0 f28480b;
    public final TLObject f28481c;

    public tj0(ck0 ck0Var, TLObject tLObject, int i10) {
        this.f28479a = i10;
        this.f28480b = ck0Var;
        this.f28481c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f28479a) {
            case 0:
                ck0 ck0Var = this.f28480b;
                NotificationCenter.getInstance(ck0Var.f23387b).doOnIdle(new tj0(ck0Var, this.f28481c, 1));
                return;
            default:
                ck0.a(this.f28480b, this.f28481c);
                return;
        }
    }
}
