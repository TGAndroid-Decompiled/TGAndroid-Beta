package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class dk0 implements Runnable {
    public final int f25603a;
    public final mk0 f25604b;
    public final TLObject f25605c;

    public dk0(mk0 mk0Var, TLObject tLObject, int i10) {
        this.f25603a = i10;
        this.f25604b = mk0Var;
        this.f25605c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f25603a) {
            case 0:
                mk0 mk0Var = this.f25604b;
                NotificationCenter.getInstance(mk0Var.f28538b).doOnIdle(new dk0(mk0Var, this.f25605c, 1));
                return;
            default:
                mk0.a(this.f25604b, this.f25605c);
                return;
        }
    }
}
