package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class i7 implements Runnable {
    public final int f25015a;
    public final j8 f25016b;
    public final TLRPC.TL_error f25017c;

    public i7(j8 j8Var, TLRPC.TL_error tL_error, int i10) {
        this.f25015a = i10;
        this.f25016b = j8Var;
        this.f25017c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f25015a) {
            case 0:
                j8.s(this.f25016b, this.f25017c);
                return;
            case 1:
                j8.w(this.f25016b, this.f25017c);
                return;
            case 2:
                j8.H(this.f25016b, this.f25017c);
                return;
            default:
                j8.I(this.f25016b, this.f25017c);
                return;
        }
    }
}
