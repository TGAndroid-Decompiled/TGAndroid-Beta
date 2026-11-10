package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
public final class ih0 implements Runnable {
    public final int f34631a;
    public final rh0 f34632b;
    public final TLObject f34633c;

    public ih0(rh0 rh0Var, TLObject tLObject, int i7) {
        this.f34631a = i7;
        this.f34632b = rh0Var;
        this.f34633c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f34631a) {
            case 0:
                rh0 rh0Var = this.f34632b;
                org.telegram.messenger.qs.f(rh0Var.f37650b).d(new ih0(rh0Var, this.f34633c, 1));
                return;
            default:
                rh0.a(this.f34632b, this.f34633c);
                return;
        }
    }
}
