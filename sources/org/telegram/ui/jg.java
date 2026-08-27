package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

public final class jg implements Runnable {

    public final int f39364a;

    public final rn f39365b;

    public final TLRPC.User f39366c;

    public jg(rn rnVar, TLRPC.User user, int i10) {
        this.f39364a = i10;
        this.f39365b = rnVar;
        this.f39366c = user;
    }

    @Override
    public final void run() {
        switch (this.f39364a) {
            case 0:
                rn rnVar = this.f39365b;
                rnVar.getClass();
                rnVar.presentFragment(rn.R9(this.f39366c.f22527id));
                break;
            default:
                this.f39365b.ma(this.f39366c);
                break;
        }
    }
}
