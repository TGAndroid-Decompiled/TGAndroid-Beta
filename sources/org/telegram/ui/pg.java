package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class pg implements Runnable {
    public final int f36586a;
    public final zn f36587b;
    public final TLRPC.User f36588c;

    public pg(zn znVar, TLRPC.User user, int i10) {
        this.f36586a = i10;
        this.f36587b = znVar;
        this.f36588c = user;
    }

    @Override
    public final void run() {
        switch (this.f36586a) {
            case 0:
                zn znVar = this.f36587b;
                znVar.getClass();
                znVar.presentFragment(zn.R9(this.f36588c.f18490id));
                return;
            default:
                this.f36587b.ma(this.f36588c);
                return;
        }
    }
}
