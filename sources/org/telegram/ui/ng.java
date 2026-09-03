package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ng implements Runnable {
    public final int f36508a;
    public final zn f36509b;
    public final TLRPC.User f36510c;

    public ng(zn znVar, TLRPC.User user, int i10) {
        this.f36508a = i10;
        this.f36509b = znVar;
        this.f36510c = user;
    }

    @Override
    public final void run() {
        switch (this.f36508a) {
            case 0:
                zn znVar = this.f36509b;
                znVar.getClass();
                znVar.presentFragment(zn.R9(this.f36510c.f19306id));
                return;
            default:
                this.f36509b.ma(this.f36510c);
                return;
        }
    }
}
