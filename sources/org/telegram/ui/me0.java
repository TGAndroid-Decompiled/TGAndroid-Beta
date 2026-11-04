package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class me0 implements Runnable {
    public final int f47666a;
    public final xe0 f47667b;
    public final TLRPC.TL_error f47668c;
    public final TLObject d;

    public me0(xe0 xe0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i3) {
        this.f47666a = i3;
        this.f47667b = xe0Var;
        this.f47668c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f47666a) {
            case 0:
                xe0 xe0Var = this.f47667b;
                xe0Var.getNotificationCenter().d(new me0(xe0Var, this.f47668c, this.d, 1));
                return;
            default:
                xe0.a0(this.f47667b, this.f47668c, this.d);
                return;
        }
    }
}
