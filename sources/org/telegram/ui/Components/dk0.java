package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class dk0 implements Runnable {
    public final int f25576a;
    public final mk0 f25577b;
    public final TLObject f25578c;

    public dk0(mk0 mk0Var, TLObject tLObject, int i10) {
        this.f25576a = i10;
        this.f25577b = mk0Var;
        this.f25578c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f25576a) {
            case 0:
                mk0 mk0Var = this.f25577b;
                NotificationCenter.getInstance(mk0Var.f28553b).doOnIdle(new dk0(mk0Var, this.f25578c, 1));
                return;
            default:
                mk0.a(this.f25577b, this.f25578c);
                return;
        }
    }
}
