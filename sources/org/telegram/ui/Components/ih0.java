package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
public final class ih0 implements Runnable {
    public final int f34626a;
    public final rh0 f34627b;
    public final TLObject f34628c;

    public ih0(rh0 rh0Var, TLObject tLObject, int i7) {
        this.f34626a = i7;
        this.f34627b = rh0Var;
        this.f34628c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f34626a) {
            case 0:
                rh0 rh0Var = this.f34627b;
                org.telegram.messenger.qs.f(rh0Var.f37640b).d(new ih0(rh0Var, this.f34628c, 1));
                return;
            default:
                rh0.a(this.f34627b, this.f34628c);
                return;
        }
    }
}
