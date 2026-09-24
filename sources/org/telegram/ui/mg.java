package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class mg implements Runnable {
    public final int f35543a;
    public final wn f35544b;
    public final TLRPC.User f35545c;

    public mg(wn wnVar, TLRPC.User user, int i10) {
        this.f35543a = i10;
        this.f35544b = wnVar;
        this.f35545c = user;
    }

    @Override
    public final void run() {
        switch (this.f35543a) {
            case 0:
                wn wnVar = this.f35544b;
                wnVar.getClass();
                wnVar.presentFragment(wn.R9(this.f35545c.f18468id));
                return;
            default:
                this.f35544b.ma(this.f35545c);
                return;
        }
    }
}
