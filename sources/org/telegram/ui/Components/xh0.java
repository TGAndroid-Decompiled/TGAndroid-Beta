package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
public final class xh0 implements Runnable {
    public final int f42095a;
    public final gi0 f42096b;
    public final TLObject f42097c;

    public xh0(gi0 gi0Var, TLObject tLObject, int i7) {
        this.f42095a = i7;
        this.f42096b = gi0Var;
        this.f42097c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f42095a) {
            case 0:
                gi0 gi0Var = this.f42096b;
                org.telegram.messenger.ls.f(gi0Var.f35581b).d(new xh0(gi0Var, this.f42097c, 1));
                return;
            default:
                gi0.a(this.f42096b, this.f42097c);
                return;
        }
    }
}
