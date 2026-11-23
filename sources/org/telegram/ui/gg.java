package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class gg implements Runnable {
    public final int f48292a;
    public final bn f48293b;
    public final TLRPC.User f48294c;

    public gg(bn bnVar, TLRPC.User user, int i7) {
        this.f48292a = i7;
        this.f48293b = bnVar;
        this.f48294c = user;
    }

    @Override
    public final void run() {
        switch (this.f48292a) {
            case 0:
                bn bnVar = this.f48293b;
                bnVar.getClass();
                bnVar.presentFragment(bn.ua(this.f48294c.f28641id));
                return;
            default:
                this.f48293b.Pa(this.f48294c);
                return;
        }
    }
}
