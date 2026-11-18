package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class gg implements Runnable {
    public final int f48029a;
    public final bn f48030b;
    public final TLRPC.User f48031c;

    public gg(bn bnVar, TLRPC.User user, int i7) {
        this.f48029a = i7;
        this.f48030b = bnVar;
        this.f48031c = user;
    }

    @Override
    public final void run() {
        switch (this.f48029a) {
            case 0:
                bn bnVar = this.f48030b;
                bnVar.getClass();
                bnVar.presentFragment(bn.ua(this.f48031c.f28552id));
                return;
            default:
                this.f48030b.Pa(this.f48031c);
                return;
        }
    }
}
