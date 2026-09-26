package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class i7 implements Runnable {
    public final int f24954a;
    public final j8 f24955b;
    public final TLRPC.TL_error f24956c;

    public i7(j8 j8Var, TLRPC.TL_error tL_error, int i10) {
        this.f24954a = i10;
        this.f24955b = j8Var;
        this.f24956c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f24954a) {
            case 0:
                j8.s(this.f24955b, this.f24956c);
                return;
            case 1:
                j8.w(this.f24955b, this.f24956c);
                return;
            case 2:
                j8.H(this.f24955b, this.f24956c);
                return;
            default:
                j8.I(this.f24955b, this.f24956c);
                return;
        }
    }
}
