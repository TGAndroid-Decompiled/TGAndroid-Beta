package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class pg implements Runnable {
    public final int f36473a;
    public final zn f36474b;
    public final TLRPC.User f36475c;

    public pg(zn znVar, TLRPC.User user, int i10) {
        this.f36473a = i10;
        this.f36474b = znVar;
        this.f36475c = user;
    }

    @Override
    public final void run() {
        switch (this.f36473a) {
            case 0:
                zn znVar = this.f36474b;
                znVar.getClass();
                znVar.presentFragment(zn.R9(this.f36475c.f18443id));
                return;
            default:
                this.f36474b.ma(this.f36475c);
                return;
        }
    }
}
