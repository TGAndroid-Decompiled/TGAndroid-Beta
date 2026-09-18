package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class i7 implements Runnable {
    public final int f24860a;
    public final j8 f24861b;
    public final TLRPC.TL_error f24862c;

    public i7(j8 j8Var, TLRPC.TL_error tL_error, int i10) {
        this.f24860a = i10;
        this.f24861b = j8Var;
        this.f24862c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f24860a) {
            case 0:
                j8.s(this.f24861b, this.f24862c);
                return;
            case 1:
                j8.w(this.f24861b, this.f24862c);
                return;
            case 2:
                j8.H(this.f24861b, this.f24862c);
                return;
            default:
                j8.I(this.f24861b, this.f24862c);
                return;
        }
    }
}
