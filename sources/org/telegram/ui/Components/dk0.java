package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class dk0 implements Runnable {
    public final int f25610a;
    public final mk0 f25611b;
    public final TLObject f25612c;

    public dk0(mk0 mk0Var, TLObject tLObject, int i10) {
        this.f25610a = i10;
        this.f25611b = mk0Var;
        this.f25612c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f25610a) {
            case 0:
                mk0 mk0Var = this.f25611b;
                NotificationCenter.getInstance(mk0Var.f28545b).doOnIdle(new dk0(mk0Var, this.f25612c, 1));
                return;
            default:
                mk0.a(this.f25611b, this.f25612c);
                return;
        }
    }
}
