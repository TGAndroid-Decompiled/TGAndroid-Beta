package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ig implements Runnable {
    public final int f37958a;
    public final qn f37959b;
    public final TLRPC.User f37960c;

    public ig(qn qnVar, TLRPC.User user, int i10) {
        this.f37958a = i10;
        this.f37959b = qnVar;
        this.f37960c = user;
    }

    @Override
    public final void run() {
        switch (this.f37958a) {
            case 0:
                qn qnVar = this.f37959b;
                qnVar.getClass();
                qnVar.presentFragment(qn.W9(this.f37960c.f20420id));
                return;
            default:
                this.f37959b.ra(this.f37960c);
                return;
        }
    }
}
