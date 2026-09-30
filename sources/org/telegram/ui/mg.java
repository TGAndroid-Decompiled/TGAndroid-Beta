package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class mg implements Runnable {
    public final int f35645a;
    public final wn f35646b;
    public final TLRPC.User f35647c;

    public mg(wn wnVar, TLRPC.User user, int i10) {
        this.f35645a = i10;
        this.f35646b = wnVar;
        this.f35647c = user;
    }

    @Override
    public final void run() {
        switch (this.f35645a) {
            case 0:
                wn wnVar = this.f35646b;
                wnVar.getClass();
                wnVar.presentFragment(wn.R9(this.f35647c.f18499id));
                return;
            default:
                this.f35646b.ma(this.f35647c);
                return;
        }
    }
}
