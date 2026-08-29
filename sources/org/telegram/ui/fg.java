package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class fg implements Runnable {
    public final int f38147a;
    public final tn f38148b;
    public final TLRPC.User f38149c;

    public fg(tn tnVar, TLRPC.User user, int i10) {
        this.f38147a = i10;
        this.f38148b = tnVar;
        this.f38149c = user;
    }

    @Override
    public final void run() {
        switch (this.f38147a) {
            case 0:
                tn tnVar = this.f38148b;
                tnVar.getClass();
                tnVar.presentFragment(tn.R9(this.f38149c.f22539id));
                return;
            default:
                this.f38148b.ma(this.f38149c);
                return;
        }
    }
}
