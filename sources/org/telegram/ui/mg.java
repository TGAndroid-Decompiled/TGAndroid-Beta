package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class mg implements Runnable {
    public final int f35556a;
    public final wn f35557b;
    public final TLRPC.User f35558c;

    public mg(wn wnVar, TLRPC.User user, int i10) {
        this.f35556a = i10;
        this.f35557b = wnVar;
        this.f35558c = user;
    }

    @Override
    public final void run() {
        switch (this.f35556a) {
            case 0:
                wn wnVar = this.f35557b;
                wnVar.getClass();
                wnVar.presentFragment(wn.R9(this.f35558c.f18483id));
                return;
            default:
                this.f35557b.ma(this.f35558c);
                return;
        }
    }
}
