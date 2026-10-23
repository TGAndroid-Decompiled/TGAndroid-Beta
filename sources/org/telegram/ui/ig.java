package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ig implements Runnable {
    public final int f37969a;
    public final qn f37970b;
    public final TLRPC.User f37971c;

    public ig(qn qnVar, TLRPC.User user, int i10) {
        this.f37969a = i10;
        this.f37970b = qnVar;
        this.f37971c = user;
    }

    @Override
    public final void run() {
        switch (this.f37969a) {
            case 0:
                qn qnVar = this.f37970b;
                qnVar.getClass();
                qnVar.presentFragment(qn.W9(this.f37971c.f20427id));
                return;
            default:
                this.f37970b.ra(this.f37971c);
                return;
        }
    }
}
