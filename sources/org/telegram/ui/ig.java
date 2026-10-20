package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ig implements Runnable {
    public final int f37964a;
    public final qn f37965b;
    public final TLRPC.User f37966c;

    public ig(qn qnVar, TLRPC.User user, int i10) {
        this.f37964a = i10;
        this.f37965b = qnVar;
        this.f37966c = user;
    }

    @Override
    public final void run() {
        switch (this.f37964a) {
            case 0:
                qn qnVar = this.f37965b;
                qnVar.getClass();
                qnVar.presentFragment(qn.W9(this.f37966c.f20423id));
                return;
            default:
                this.f37965b.ra(this.f37966c);
                return;
        }
    }
}
