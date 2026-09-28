package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class mg implements Runnable {
    public final int f35555a;
    public final wn f35556b;
    public final TLRPC.User f35557c;

    public mg(wn wnVar, TLRPC.User user, int i10) {
        this.f35555a = i10;
        this.f35556b = wnVar;
        this.f35557c = user;
    }

    @Override
    public final void run() {
        switch (this.f35555a) {
            case 0:
                wn wnVar = this.f35556b;
                wnVar.getClass();
                wnVar.presentFragment(wn.R9(this.f35557c.f18482id));
                return;
            default:
                this.f35556b.ma(this.f35557c);
                return;
        }
    }
}
