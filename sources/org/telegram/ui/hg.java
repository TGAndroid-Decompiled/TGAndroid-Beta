package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class hg implements Runnable {
    public final int f38775a;
    public final qn f38776b;
    public final TLRPC.User f38777c;

    public hg(qn qnVar, TLRPC.User user, int i9) {
        this.f38775a = i9;
        this.f38776b = qnVar;
        this.f38777c = user;
    }

    @Override
    public final void run() {
        switch (this.f38775a) {
            case 0:
                qn qnVar = this.f38776b;
                qnVar.getClass();
                qnVar.presentFragment(qn.R9(this.f38777c.f22527id));
                return;
            default:
                this.f38776b.ma(this.f38777c);
                return;
        }
    }
}
