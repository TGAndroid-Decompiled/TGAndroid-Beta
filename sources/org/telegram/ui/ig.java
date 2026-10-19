package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ig implements Runnable {
    public final int f37986a;
    public final qn f37987b;
    public final TLRPC.User f37988c;

    public ig(qn qnVar, TLRPC.User user, int i10) {
        this.f37986a = i10;
        this.f37987b = qnVar;
        this.f37988c = user;
    }

    @Override
    public final void run() {
        switch (this.f37986a) {
            case 0:
                qn qnVar = this.f37987b;
                qnVar.getClass();
                qnVar.presentFragment(qn.W9(this.f37988c.f20422id));
                return;
            default:
                this.f37987b.ra(this.f37988c);
                return;
        }
    }
}
