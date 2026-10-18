package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class kg implements Runnable {
    public final int f38508a;
    public final sn f38509b;
    public final TLRPC.User f38510c;

    public kg(sn snVar, TLRPC.User user, int i10) {
        this.f38508a = i10;
        this.f38509b = snVar;
        this.f38510c = user;
    }

    @Override
    public final void run() {
        switch (this.f38508a) {
            case 0:
                sn snVar = this.f38509b;
                snVar.getClass();
                snVar.presentFragment(sn.W9(this.f38510c.f20419id));
                return;
            default:
                this.f38509b.ra(this.f38510c);
                return;
        }
    }
}
