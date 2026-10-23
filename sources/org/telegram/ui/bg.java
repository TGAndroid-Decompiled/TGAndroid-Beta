package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class bg implements Runnable {
    public final int f36075a;
    public final sn f36076b;
    public final TLRPC.User f36077c;

    public bg(sn snVar, TLRPC.User user, int i10) {
        this.f36075a = i10;
        this.f36076b = snVar;
        this.f36077c = user;
    }

    @Override
    public final void run() {
        switch (this.f36075a) {
            case 0:
                sn snVar = this.f36076b;
                snVar.getClass();
                snVar.presentFragment(sn.W9(this.f36077c.f20490id));
                return;
            default:
                this.f36076b.ra(this.f36077c);
                return;
        }
    }
}
