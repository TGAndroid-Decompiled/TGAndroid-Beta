package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
public final class ih0 implements Runnable {
    public final int f34633a;
    public final rh0 f34634b;
    public final TLObject f34635c;

    public ih0(rh0 rh0Var, TLObject tLObject, int i7) {
        this.f34633a = i7;
        this.f34634b = rh0Var;
        this.f34635c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f34633a) {
            case 0:
                rh0 rh0Var = this.f34634b;
                org.telegram.messenger.qs.f(rh0Var.f37737b).d(new ih0(rh0Var, this.f34635c, 1));
                return;
            default:
                rh0.a(this.f34634b, this.f34635c);
                return;
        }
    }
}
