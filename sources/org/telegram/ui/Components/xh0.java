package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
public final class xh0 implements Runnable {
    public final int f42049a;
    public final gi0 f42050b;
    public final TLObject f42051c;

    public xh0(gi0 gi0Var, TLObject tLObject, int i7) {
        this.f42049a = i7;
        this.f42050b = gi0Var;
        this.f42051c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f42049a) {
            case 0:
                gi0 gi0Var = this.f42050b;
                org.telegram.messenger.ls.f(gi0Var.f35540b).d(new xh0(gi0Var, this.f42051c, 1));
                return;
            default:
                gi0.a(this.f42050b, this.f42051c);
                return;
        }
    }
}
