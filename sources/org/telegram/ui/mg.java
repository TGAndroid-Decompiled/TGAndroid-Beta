package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class mg implements Runnable {
    public final int f35559a;
    public final wn f35560b;
    public final TLRPC.User f35561c;

    public mg(wn wnVar, TLRPC.User user, int i10) {
        this.f35559a = i10;
        this.f35560b = wnVar;
        this.f35561c = user;
    }

    @Override
    public final void run() {
        switch (this.f35559a) {
            case 0:
                wn wnVar = this.f35560b;
                wnVar.getClass();
                wnVar.presentFragment(wn.R9(this.f35561c.f18484id));
                return;
            default:
                this.f35560b.ma(this.f35561c);
                return;
        }
    }
}
