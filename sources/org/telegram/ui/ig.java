package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ig implements Runnable {
    public final int f37965a;
    public final qn f37966b;
    public final TLRPC.User f37967c;

    public ig(qn qnVar, TLRPC.User user, int i10) {
        this.f37965a = i10;
        this.f37966b = qnVar;
        this.f37967c = user;
    }

    @Override
    public final void run() {
        switch (this.f37965a) {
            case 0:
                qn qnVar = this.f37966b;
                qnVar.getClass();
                qnVar.presentFragment(qn.W9(this.f37967c.f20423id));
                return;
            default:
                this.f37966b.ra(this.f37967c);
                return;
        }
    }
}
