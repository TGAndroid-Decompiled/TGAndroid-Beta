package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class mg implements Runnable {
    public final int f35554a;
    public final wn f35555b;
    public final TLRPC.User f35556c;

    public mg(wn wnVar, TLRPC.User user, int i10) {
        this.f35554a = i10;
        this.f35555b = wnVar;
        this.f35556c = user;
    }

    @Override
    public final void run() {
        switch (this.f35554a) {
            case 0:
                wn wnVar = this.f35555b;
                wnVar.getClass();
                wnVar.presentFragment(wn.R9(this.f35556c.f18482id));
                return;
            default:
                this.f35555b.ma(this.f35556c);
                return;
        }
    }
}
