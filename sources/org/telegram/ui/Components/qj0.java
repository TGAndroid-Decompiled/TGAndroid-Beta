package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class qj0 implements Runnable {
    public final int f27588a;
    public final zj0 f27589b;
    public final TLObject f27590c;

    public qj0(zj0 zj0Var, TLObject tLObject, int i10) {
        this.f27588a = i10;
        this.f27589b = zj0Var;
        this.f27590c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f27588a) {
            case 0:
                zj0 zj0Var = this.f27589b;
                NotificationCenter.getInstance(zj0Var.f30841b).doOnIdle(new qj0(zj0Var, this.f27590c, 1));
                return;
            default:
                zj0.a(this.f27589b, this.f27590c);
                return;
        }
    }
}
