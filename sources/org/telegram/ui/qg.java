package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class qg implements Runnable {
    public final int f41152a;
    public final zn f41153b;
    public final TLRPC.User f41154c;

    public qg(zn znVar, TLRPC.User user, int i10) {
        this.f41152a = i10;
        this.f41153b = znVar;
        this.f41154c = user;
    }

    @Override
    public final void run() {
        switch (this.f41152a) {
            case 0:
                zn znVar = this.f41153b;
                znVar.getClass();
                znVar.presentFragment(zn.W9(this.f41154c.f20189id));
                return;
            default:
                this.f41153b.ra(this.f41154c);
                return;
        }
    }
}
