package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
public final class xh0 implements Runnable {
    public final int f42003a;
    public final gi0 f42004b;
    public final TLObject f42005c;

    public xh0(gi0 gi0Var, TLObject tLObject, int i7) {
        this.f42003a = i7;
        this.f42004b = gi0Var;
        this.f42005c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f42003a) {
            case 0:
                gi0 gi0Var = this.f42004b;
                org.telegram.messenger.ks.f(gi0Var.f35441b).d(new xh0(gi0Var, this.f42005c, 1));
                return;
            default:
                gi0.a(this.f42004b, this.f42005c);
                return;
        }
    }
}
