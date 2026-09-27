package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class i7 implements Runnable {
    public final int f25030a;
    public final j8 f25031b;
    public final TLRPC.TL_error f25032c;

    public i7(j8 j8Var, TLRPC.TL_error tL_error, int i10) {
        this.f25030a = i10;
        this.f25031b = j8Var;
        this.f25032c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f25030a) {
            case 0:
                j8.s(this.f25031b, this.f25032c);
                return;
            case 1:
                j8.w(this.f25031b, this.f25032c);
                return;
            case 2:
                j8.H(this.f25031b, this.f25032c);
                return;
            default:
                j8.I(this.f25031b, this.f25032c);
                return;
        }
    }
}
