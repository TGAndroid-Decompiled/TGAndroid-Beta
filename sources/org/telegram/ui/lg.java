package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class lg implements Runnable {
    public final int f36078a;
    public final xn f36079b;
    public final TLRPC.User f36080c;

    public lg(xn xnVar, TLRPC.User user, int i10) {
        this.f36078a = i10;
        this.f36079b = xnVar;
        this.f36080c = user;
    }

    @Override
    public final void run() {
        switch (this.f36078a) {
            case 0:
                xn xnVar = this.f36079b;
                xnVar.getClass();
                xnVar.presentFragment(xn.R9(this.f36080c.f19331id));
                return;
            default:
                this.f36079b.ma(this.f36080c);
                return;
        }
    }
}
