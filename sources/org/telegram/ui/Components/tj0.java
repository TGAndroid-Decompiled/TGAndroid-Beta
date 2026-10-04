package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class tj0 implements Runnable {
    public final int f31071a;
    public final ck0 f31072b;
    public final TLObject f31073c;

    public tj0(ck0 ck0Var, TLObject tLObject, int i10) {
        this.f31071a = i10;
        this.f31072b = ck0Var;
        this.f31073c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f31071a) {
            case 0:
                ck0 ck0Var = this.f31072b;
                NotificationCenter.getInstance(ck0Var.f25402b).doOnIdle(new tj0(ck0Var, this.f31073c, 1));
                return;
            default:
                ck0.a(this.f31072b, this.f31073c);
                return;
        }
    }
}
