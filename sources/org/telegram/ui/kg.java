package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class kg implements Runnable {
    public final int f38873a;
    public final un f38874b;
    public final TLRPC.User f38875c;

    public kg(un unVar, TLRPC.User user, int i10) {
        this.f38873a = i10;
        this.f38874b = unVar;
        this.f38875c = user;
    }

    @Override
    public final void run() {
        switch (this.f38873a) {
            case 0:
                un unVar = this.f38874b;
                unVar.getClass();
                unVar.presentFragment(un.ma(this.f38875c.f19943id));
                return;
            default:
                this.f38874b.Ha(this.f38875c);
                return;
        }
    }
}
