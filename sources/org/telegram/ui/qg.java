package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class qg implements Runnable {
    public final int f41108a;
    public final zn f41109b;
    public final TLRPC.User f41110c;

    public qg(zn znVar, TLRPC.User user, int i10) {
        this.f41108a = i10;
        this.f41109b = znVar;
        this.f41110c = user;
    }

    @Override
    public final void run() {
        switch (this.f41108a) {
            case 0:
                zn znVar = this.f41109b;
                znVar.getClass();
                znVar.presentFragment(zn.W9(this.f41110c.f20185id));
                return;
            default:
                this.f41109b.ra(this.f41110c);
                return;
        }
    }
}
