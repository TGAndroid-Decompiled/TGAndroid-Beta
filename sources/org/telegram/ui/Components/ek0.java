package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class ek0 implements Runnable {
    public final int f25918a;
    public final nk0 f25919b;
    public final TLObject f25920c;

    public ek0(nk0 nk0Var, TLObject tLObject, int i10) {
        this.f25918a = i10;
        this.f25919b = nk0Var;
        this.f25920c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f25918a) {
            case 0:
                nk0 nk0Var = this.f25919b;
                NotificationCenter.getInstance(nk0Var.f28832b).doOnIdle(new ek0(nk0Var, this.f25920c, 1));
                return;
            default:
                nk0.a(this.f25919b, this.f25920c);
                return;
        }
    }
}
