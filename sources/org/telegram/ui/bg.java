package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class bg implements Runnable {
    public final int f36065a;
    public final sn f36066b;
    public final TLRPC.User f36067c;

    public bg(sn snVar, TLRPC.User user, int i10) {
        this.f36065a = i10;
        this.f36066b = snVar;
        this.f36067c = user;
    }

    @Override
    public final void run() {
        switch (this.f36065a) {
            case 0:
                sn snVar = this.f36066b;
                snVar.getClass();
                snVar.presentFragment(sn.W9(this.f36067c.f20491id));
                return;
            default:
                this.f36066b.ra(this.f36067c);
                return;
        }
    }
}
