package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
public final class lh0 implements Runnable {
    public final int f35729a;
    public final uh0 f35730b;
    public final TLObject f35731c;

    public lh0(uh0 uh0Var, TLObject tLObject, int i3) {
        this.f35729a = i3;
        this.f35730b = uh0Var;
        this.f35731c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f35729a) {
            case 0:
                uh0 uh0Var = this.f35730b;
                org.telegram.messenger.hs.f(uh0Var.f38749b).d(new lh0(uh0Var, this.f35731c, 1));
                return;
            default:
                uh0.a(this.f35730b, this.f35731c);
                return;
        }
    }
}
