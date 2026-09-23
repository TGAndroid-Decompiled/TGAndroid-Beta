package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class i7 implements Runnable {
    public final int f24889a;
    public final j8 f24890b;
    public final TLRPC.TL_error f24891c;

    public i7(j8 j8Var, TLRPC.TL_error tL_error, int i10) {
        this.f24889a = i10;
        this.f24890b = j8Var;
        this.f24891c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f24889a) {
            case 0:
                j8.s(this.f24890b, this.f24891c);
                return;
            case 1:
                j8.w(this.f24890b, this.f24891c);
                return;
            case 2:
                j8.H(this.f24890b, this.f24891c);
                return;
            default:
                j8.I(this.f24890b, this.f24891c);
                return;
        }
    }
}
