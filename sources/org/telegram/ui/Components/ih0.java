package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
public final class ih0 implements Runnable {
    public final int f34670a;
    public final rh0 f34671b;
    public final TLObject f34672c;

    public ih0(rh0 rh0Var, TLObject tLObject, int i7) {
        this.f34670a = i7;
        this.f34671b = rh0Var;
        this.f34672c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f34670a) {
            case 0:
                rh0 rh0Var = this.f34671b;
                org.telegram.messenger.qs.f(rh0Var.f37661b).d(new ih0(rh0Var, this.f34672c, 1));
                return;
            default:
                rh0.a(this.f34671b, this.f34672c);
                return;
        }
    }
}
