package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class i7 implements Runnable {
    public final int f25026a;
    public final j8 f25027b;
    public final TLRPC.TL_error f25028c;

    public i7(j8 j8Var, TLRPC.TL_error tL_error, int i10) {
        this.f25026a = i10;
        this.f25027b = j8Var;
        this.f25028c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f25026a) {
            case 0:
                j8.s(this.f25027b, this.f25028c);
                return;
            case 1:
                j8.w(this.f25027b, this.f25028c);
                return;
            case 2:
                j8.H(this.f25027b, this.f25028c);
                return;
            default:
                j8.I(this.f25027b, this.f25028c);
                return;
        }
    }
}
