package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class pg implements Runnable {
    public final int f36472a;
    public final xn f36473b;
    public final TLRPC.User f36474c;

    public pg(xn xnVar, TLRPC.User user, int i10) {
        this.f36472a = i10;
        this.f36473b = xnVar;
        this.f36474c = user;
    }

    @Override
    public final void run() {
        switch (this.f36472a) {
            case 0:
                xn xnVar = this.f36473b;
                xnVar.getClass();
                xnVar.presentFragment(xn.R9(this.f36474c.f18476id));
                return;
            default:
                this.f36473b.ma(this.f36474c);
                return;
        }
    }
}
