package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class dk0 implements Runnable {
    public final int f25574a;
    public final mk0 f25575b;
    public final TLObject f25576c;

    public dk0(mk0 mk0Var, TLObject tLObject, int i10) {
        this.f25574a = i10;
        this.f25575b = mk0Var;
        this.f25576c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f25574a) {
            case 0:
                mk0 mk0Var = this.f25575b;
                NotificationCenter.getInstance(mk0Var.f28551b).doOnIdle(new dk0(mk0Var, this.f25576c, 1));
                return;
            default:
                mk0.a(this.f25575b, this.f25576c);
                return;
        }
    }
}
