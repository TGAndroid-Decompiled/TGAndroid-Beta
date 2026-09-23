package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class qg implements Runnable {
    public final int f36419a;
    public final xn f36420b;
    public final TLRPC.User f36421c;

    public qg(xn xnVar, TLRPC.User user, int i10) {
        this.f36419a = i10;
        this.f36420b = xnVar;
        this.f36421c = user;
    }

    @Override
    public final void run() {
        switch (this.f36419a) {
            case 0:
                xn xnVar = this.f36420b;
                xnVar.getClass();
                xnVar.presentFragment(xn.R9(this.f36421c.f18230id));
                return;
            default:
                this.f36420b.ma(this.f36421c);
                return;
        }
    }
}
