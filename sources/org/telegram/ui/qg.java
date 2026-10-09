package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class qg implements Runnable {
    public final int f41106a;
    public final zn f41107b;
    public final TLRPC.User f41108c;

    public qg(zn znVar, TLRPC.User user, int i10) {
        this.f41106a = i10;
        this.f41107b = znVar;
        this.f41108c = user;
    }

    @Override
    public final void run() {
        switch (this.f41106a) {
            case 0:
                zn znVar = this.f41107b;
                znVar.getClass();
                znVar.presentFragment(zn.W9(this.f41108c.f20185id));
                return;
            default:
                this.f41107b.ra(this.f41108c);
                return;
        }
    }
}
