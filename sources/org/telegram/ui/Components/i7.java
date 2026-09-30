package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class i7 implements Runnable {
    public final int f24995a;
    public final j8 f24996b;
    public final TLRPC.TL_error f24997c;

    public i7(j8 j8Var, TLRPC.TL_error tL_error, int i10) {
        this.f24995a = i10;
        this.f24996b = j8Var;
        this.f24997c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f24995a) {
            case 0:
                j8.s(this.f24996b, this.f24997c);
                return;
            case 1:
                j8.w(this.f24996b, this.f24997c);
                return;
            case 2:
                j8.H(this.f24996b, this.f24997c);
                return;
            default:
                j8.I(this.f24996b, this.f24997c);
                return;
        }
    }
}
