package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class gg implements Runnable {
    public final int f39647a;
    public final un f39648b;
    public final TLRPC.User f39649c;

    public gg(un unVar, TLRPC.User user, int i10) {
        this.f39647a = i10;
        this.f39648b = unVar;
        this.f39649c = user;
    }

    @Override
    public final void run() {
        switch (this.f39647a) {
            case 0:
                un unVar = this.f39648b;
                unVar.getClass();
                unVar.presentFragment(un.ba(this.f39649c.f22176id));
                return;
            default:
                this.f39648b.wa(this.f39649c);
                return;
        }
    }
}
