package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class tj0 implements Runnable {
    public final int f31164a;
    public final ck0 f31165b;
    public final TLObject f31166c;

    public tj0(ck0 ck0Var, TLObject tLObject, int i10) {
        this.f31164a = i10;
        this.f31165b = ck0Var;
        this.f31166c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f31164a) {
            case 0:
                ck0 ck0Var = this.f31165b;
                NotificationCenter.getInstance(ck0Var.f25455b).doOnIdle(new tj0(ck0Var, this.f31166c, 1));
                return;
            default:
                ck0.a(this.f31165b, this.f31166c);
                return;
        }
    }
}
