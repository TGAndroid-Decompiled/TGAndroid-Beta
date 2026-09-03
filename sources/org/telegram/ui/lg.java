package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class lg implements Runnable {
    public final int f38632a;
    public final xn f38633b;
    public final TLRPC.User f38634c;

    public lg(xn xnVar, TLRPC.User user, int i10) {
        this.f38632a = i10;
        this.f38633b = xnVar;
        this.f38634c = user;
    }

    @Override
    public final void run() {
        switch (this.f38632a) {
            case 0:
                xn xnVar = this.f38633b;
                xnVar.getClass();
                xnVar.presentFragment(xn.R9(this.f38634c.f20992id));
                return;
            default:
                this.f38633b.ma(this.f38634c);
                return;
        }
    }
}
