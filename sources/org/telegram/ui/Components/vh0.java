package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
public final class vh0 implements Runnable {
    public final int f40631a;
    public final ei0 f40632b;
    public final TLObject f40633c;

    public vh0(ei0 ei0Var, TLObject tLObject, int i7) {
        this.f40631a = i7;
        this.f40632b = ei0Var;
        this.f40633c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f40631a) {
            case 0:
                ei0 ei0Var = this.f40632b;
                org.telegram.messenger.ks.f(ei0Var.f34711b).d(new vh0(ei0Var, this.f40633c, 1));
                return;
            default:
                ei0.a(this.f40632b, this.f40633c);
                return;
        }
    }
}
