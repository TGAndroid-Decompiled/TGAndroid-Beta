package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class gg implements Runnable {
    public final int f39644a;
    public final un f39645b;
    public final TLRPC.User f39646c;

    public gg(un unVar, TLRPC.User user, int i10) {
        this.f39644a = i10;
        this.f39645b = unVar;
        this.f39646c = user;
    }

    @Override
    public final void run() {
        switch (this.f39644a) {
            case 0:
                un unVar = this.f39645b;
                unVar.getClass();
                unVar.presentFragment(un.ba(this.f39646c.f22174id));
                return;
            default:
                this.f39645b.wa(this.f39646c);
                return;
        }
    }
}
