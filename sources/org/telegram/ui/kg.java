package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class kg implements Runnable {
    public final int f38514a;
    public final sn f38515b;
    public final TLRPC.User f38516c;

    public kg(sn snVar, TLRPC.User user, int i10) {
        this.f38514a = i10;
        this.f38515b = snVar;
        this.f38516c = user;
    }

    @Override
    public final void run() {
        switch (this.f38514a) {
            case 0:
                sn snVar = this.f38515b;
                snVar.getClass();
                snVar.presentFragment(sn.W9(this.f38516c.f20419id));
                return;
            default:
                this.f38515b.ra(this.f38516c);
                return;
        }
    }
}
