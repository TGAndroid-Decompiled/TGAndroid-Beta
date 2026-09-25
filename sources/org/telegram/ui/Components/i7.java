package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class i7 implements Runnable {
    public final int f24955a;
    public final j8 f24956b;
    public final TLRPC.TL_error f24957c;

    public i7(j8 j8Var, TLRPC.TL_error tL_error, int i10) {
        this.f24955a = i10;
        this.f24956b = j8Var;
        this.f24957c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f24955a) {
            case 0:
                j8.s(this.f24956b, this.f24957c);
                return;
            case 1:
                j8.w(this.f24956b, this.f24957c);
                return;
            case 2:
                j8.H(this.f24956b, this.f24957c);
                return;
            default:
                j8.I(this.f24956b, this.f24957c);
                return;
        }
    }
}
