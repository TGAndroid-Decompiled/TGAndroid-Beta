package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class gg implements Runnable {
    public final int f48099a;
    public final bn f48100b;
    public final TLRPC.User f48101c;

    public gg(bn bnVar, TLRPC.User user, int i7) {
        this.f48099a = i7;
        this.f48100b = bnVar;
        this.f48101c = user;
    }

    @Override
    public final void run() {
        switch (this.f48099a) {
            case 0:
                bn bnVar = this.f48100b;
                bnVar.getClass();
                bnVar.presentFragment(bn.ua(this.f48101c.f28554id));
                return;
            default:
                this.f48100b.Pa(this.f48101c);
                return;
        }
    }
}
