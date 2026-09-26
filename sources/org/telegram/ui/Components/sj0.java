package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class sj0 implements Runnable {
    public final int f28289a;
    public final bk0 f28290b;
    public final TLObject f28291c;

    public sj0(bk0 bk0Var, TLObject tLObject, int i10) {
        this.f28289a = i10;
        this.f28290b = bk0Var;
        this.f28291c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f28289a) {
            case 0:
                bk0 bk0Var = this.f28290b;
                NotificationCenter.getInstance(bk0Var.f23047b).doOnIdle(new sj0(bk0Var, this.f28291c, 1));
                return;
            default:
                bk0.a(this.f28290b, this.f28291c);
                return;
        }
    }
}
