package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ig implements Runnable {
    public final int f37968a;
    public final qn f37969b;
    public final TLRPC.User f37970c;

    public ig(qn qnVar, TLRPC.User user, int i10) {
        this.f37968a = i10;
        this.f37969b = qnVar;
        this.f37970c = user;
    }

    @Override
    public final void run() {
        switch (this.f37968a) {
            case 0:
                qn qnVar = this.f37969b;
                qnVar.getClass();
                qnVar.presentFragment(qn.W9(this.f37970c.f20426id));
                return;
            default:
                this.f37969b.ra(this.f37970c);
                return;
        }
    }
}
