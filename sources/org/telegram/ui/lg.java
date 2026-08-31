package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class lg implements Runnable {
    public final int f38729a;
    public final xn f38730b;
    public final TLRPC.User f38731c;

    public lg(xn xnVar, TLRPC.User user, int i10) {
        this.f38729a = i10;
        this.f38730b = xnVar;
        this.f38731c = user;
    }

    @Override
    public final void run() {
        switch (this.f38729a) {
            case 0:
                xn xnVar = this.f38730b;
                xnVar.getClass();
                xnVar.presentFragment(xn.R9(this.f38731c.f20990id));
                return;
            default:
                this.f38730b.ma(this.f38731c);
                return;
        }
    }
}
