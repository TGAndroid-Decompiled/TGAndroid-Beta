package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class hg implements Runnable {
    public final int f46306a;
    public final cn f46307b;
    public final TLRPC.User f46308c;

    public hg(cn cnVar, TLRPC.User user, int i7) {
        this.f46306a = i7;
        this.f46307b = cnVar;
        this.f46308c = user;
    }

    @Override
    public final void run() {
        switch (this.f46306a) {
            case 0:
                cn cnVar = this.f46307b;
                cnVar.getClass();
                cnVar.presentFragment(cn.ta(this.f46308c.f27105id));
                return;
            default:
                this.f46307b.Oa(this.f46308c);
                return;
        }
    }
}
