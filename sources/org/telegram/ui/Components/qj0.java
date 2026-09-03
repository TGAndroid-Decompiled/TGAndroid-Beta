package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class qj0 implements Runnable {
    public final int f30416a;
    public final zj0 f30417b;
    public final TLObject f30418c;

    public qj0(zj0 zj0Var, TLObject tLObject, int i10) {
        this.f30416a = i10;
        this.f30417b = zj0Var;
        this.f30418c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f30416a) {
            case 0:
                zj0 zj0Var = this.f30417b;
                NotificationCenter.getInstance(zj0Var.f33950b).doOnIdle(new qj0(zj0Var, this.f30418c, 1));
                return;
            default:
                zj0.a(this.f30417b, this.f30418c);
                return;
        }
    }
}
