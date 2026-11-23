package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
public final class xh0 implements Runnable {
    public final int f42094a;
    public final gi0 f42095b;
    public final TLObject f42096c;

    public xh0(gi0 gi0Var, TLObject tLObject, int i7) {
        this.f42094a = i7;
        this.f42095b = gi0Var;
        this.f42096c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f42094a) {
            case 0:
                gi0 gi0Var = this.f42095b;
                org.telegram.messenger.ls.f(gi0Var.f35581b).d(new xh0(gi0Var, this.f42096c, 1));
                return;
            default:
                gi0.a(this.f42095b, this.f42096c);
                return;
        }
    }
}
