package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class j7 implements Runnable {
    public final int f27394a;
    public final k8 f27395b;
    public final TLRPC.TL_error f27396c;

    public j7(k8 k8Var, TLRPC.TL_error tL_error, int i10) {
        this.f27394a = i10;
        this.f27395b = k8Var;
        this.f27396c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27394a) {
            case 0:
                k8.s(this.f27395b, this.f27396c);
                return;
            case 1:
                k8.w(this.f27395b, this.f27396c);
                return;
            case 2:
                k8.H(this.f27395b, this.f27396c);
                return;
            default:
                k8.I(this.f27395b, this.f27396c);
                return;
        }
    }
}
