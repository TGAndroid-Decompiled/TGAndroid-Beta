package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class gg implements Runnable {
    public final int f48106a;
    public final bn f48107b;
    public final TLRPC.User f48108c;

    public gg(bn bnVar, TLRPC.User user, int i7) {
        this.f48106a = i7;
        this.f48107b = bnVar;
        this.f48108c = user;
    }

    @Override
    public final void run() {
        switch (this.f48106a) {
            case 0:
                bn bnVar = this.f48107b;
                bnVar.getClass();
                bnVar.presentFragment(bn.ua(this.f48108c.f28580id));
                return;
            default:
                this.f48107b.Pa(this.f48108c);
                return;
        }
    }
}
