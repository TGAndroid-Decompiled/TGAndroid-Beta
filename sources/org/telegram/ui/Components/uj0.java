package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class uj0 implements Runnable {
    public final int f28872a;
    public final dk0 f28873b;
    public final TLObject f28874c;

    public uj0(dk0 dk0Var, TLObject tLObject, int i10) {
        this.f28872a = i10;
        this.f28873b = dk0Var;
        this.f28874c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f28872a) {
            case 0:
                dk0 dk0Var = this.f28873b;
                NotificationCenter.getInstance(dk0Var.f23666b).doOnIdle(new uj0(dk0Var, this.f28874c, 1));
                return;
            default:
                dk0.a(this.f28873b, this.f28874c);
                return;
        }
    }
}
