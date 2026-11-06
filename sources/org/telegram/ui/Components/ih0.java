package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
public final class ih0 implements Runnable {
    public final int f34596a;
    public final rh0 f34597b;
    public final TLObject f34598c;

    public ih0(rh0 rh0Var, TLObject tLObject, int i7) {
        this.f34596a = i7;
        this.f34597b = rh0Var;
        this.f34598c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f34596a) {
            case 0:
                rh0 rh0Var = this.f34597b;
                org.telegram.messenger.qs.f(rh0Var.f37680b).d(new ih0(rh0Var, this.f34598c, 1));
                return;
            default:
                rh0.a(this.f34597b, this.f34598c);
                return;
        }
    }
}
