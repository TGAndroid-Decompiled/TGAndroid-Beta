package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class kg implements Runnable {
    public final int f38523a;
    public final sn f38524b;
    public final TLRPC.User f38525c;

    public kg(sn snVar, TLRPC.User user, int i10) {
        this.f38523a = i10;
        this.f38524b = snVar;
        this.f38525c = user;
    }

    @Override
    public final void run() {
        switch (this.f38523a) {
            case 0:
                sn snVar = this.f38524b;
                snVar.getClass();
                snVar.presentFragment(sn.W9(this.f38525c.f20426id));
                return;
            default:
                this.f38524b.ra(this.f38525c);
                return;
        }
    }
}
