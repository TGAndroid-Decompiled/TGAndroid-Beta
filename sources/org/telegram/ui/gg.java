package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class gg implements Runnable {
    public final int f48047a;
    public final bn f48048b;
    public final TLRPC.User f48049c;

    public gg(bn bnVar, TLRPC.User user, int i7) {
        this.f48047a = i7;
        this.f48048b = bnVar;
        this.f48049c = user;
    }

    @Override
    public final void run() {
        switch (this.f48047a) {
            case 0:
                bn bnVar = this.f48048b;
                bnVar.getClass();
                bnVar.presentFragment(bn.ua(this.f48049c.f28547id));
                return;
            default:
                this.f48048b.Pa(this.f48049c);
                return;
        }
    }
}
