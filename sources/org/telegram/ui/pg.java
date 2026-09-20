package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class pg implements Runnable {
    public final int f36559a;
    public final zn f36560b;
    public final TLRPC.User f36561c;

    public pg(zn znVar, TLRPC.User user, int i10) {
        this.f36559a = i10;
        this.f36560b = znVar;
        this.f36561c = user;
    }

    @Override
    public final void run() {
        switch (this.f36559a) {
            case 0:
                zn znVar = this.f36560b;
                znVar.getClass();
                znVar.presentFragment(zn.R9(this.f36561c.f18475id));
                return;
            default:
                this.f36560b.ma(this.f36561c);
                return;
        }
    }
}
