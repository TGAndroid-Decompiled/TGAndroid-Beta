package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
public final class xh0 implements Runnable {
    public final int f42102a;
    public final gi0 f42103b;
    public final TLObject f42104c;

    public xh0(gi0 gi0Var, TLObject tLObject, int i7) {
        this.f42102a = i7;
        this.f42103b = gi0Var;
        this.f42104c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f42102a) {
            case 0:
                gi0 gi0Var = this.f42103b;
                org.telegram.messenger.ks.f(gi0Var.f35562b).d(new xh0(gi0Var, this.f42104c, 1));
                return;
            default:
                gi0.a(this.f42103b, this.f42104c);
                return;
        }
    }
}
