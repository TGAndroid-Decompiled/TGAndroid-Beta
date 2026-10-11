package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class qg implements Runnable {
    public final int f41173a;
    public final zn f41174b;
    public final TLRPC.User f41175c;

    public qg(zn znVar, TLRPC.User user, int i10) {
        this.f41173a = i10;
        this.f41174b = znVar;
        this.f41175c = user;
    }

    @Override
    public final void run() {
        switch (this.f41173a) {
            case 0:
                zn znVar = this.f41174b;
                znVar.getClass();
                znVar.presentFragment(zn.W9(this.f41175c.f20179id));
                return;
            default:
                this.f41174b.ra(this.f41175c);
                return;
        }
    }
}
