package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ig implements Runnable {
    public final int f38256a;
    public final un f38257b;
    public final TLRPC.User f38258c;

    public ig(un unVar, TLRPC.User user, int i10) {
        this.f38256a = i10;
        this.f38257b = unVar;
        this.f38258c = user;
    }

    @Override
    public final void run() {
        switch (this.f38256a) {
            case 0:
                un unVar = this.f38257b;
                unVar.getClass();
                unVar.presentFragment(un.ha(this.f38258c.f19942id));
                return;
            default:
                this.f38257b.Ca(this.f38258c);
                return;
        }
    }
}
