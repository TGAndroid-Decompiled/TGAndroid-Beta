package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class qg implements Runnable {
    public final int f41207a;
    public final zn f41208b;
    public final TLRPC.User f41209c;

    public qg(zn znVar, TLRPC.User user, int i10) {
        this.f41207a = i10;
        this.f41208b = znVar;
        this.f41209c = user;
    }

    @Override
    public final void run() {
        switch (this.f41207a) {
            case 0:
                zn znVar = this.f41208b;
                znVar.getClass();
                znVar.presentFragment(zn.W9(this.f41209c.f20215id));
                return;
            default:
                this.f41208b.ra(this.f41209c);
                return;
        }
    }
}
