package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class gg implements Runnable {
    public final int f48110a;
    public final bn f48111b;
    public final TLRPC.User f48112c;

    public gg(bn bnVar, TLRPC.User user, int i7) {
        this.f48110a = i7;
        this.f48111b = bnVar;
        this.f48112c = user;
    }

    @Override
    public final void run() {
        switch (this.f48110a) {
            case 0:
                bn bnVar = this.f48111b;
                bnVar.getClass();
                bnVar.presentFragment(bn.ua(this.f48112c.f28583id));
                return;
            default:
                this.f48111b.Pa(this.f48112c);
                return;
        }
    }
}
