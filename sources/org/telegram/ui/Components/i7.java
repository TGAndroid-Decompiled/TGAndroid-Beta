package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class i7 implements Runnable {
    public final int f24929a;
    public final j8 f24930b;
    public final TLRPC.TL_error f24931c;

    public i7(j8 j8Var, TLRPC.TL_error tL_error, int i10) {
        this.f24929a = i10;
        this.f24930b = j8Var;
        this.f24931c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f24929a) {
            case 0:
                j8.s(this.f24930b, this.f24931c);
                return;
            case 1:
                j8.w(this.f24930b, this.f24931c);
                return;
            case 2:
                j8.H(this.f24930b, this.f24931c);
                return;
            default:
                j8.I(this.f24930b, this.f24931c);
                return;
        }
    }
}
