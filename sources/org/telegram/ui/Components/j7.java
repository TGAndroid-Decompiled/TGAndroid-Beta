package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class j7 implements Runnable {
    public final int f27393a;
    public final k8 f27394b;
    public final TLRPC.TL_error f27395c;

    public j7(k8 k8Var, TLRPC.TL_error tL_error, int i10) {
        this.f27393a = i10;
        this.f27394b = k8Var;
        this.f27395c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27393a) {
            case 0:
                k8.s(this.f27394b, this.f27395c);
                return;
            case 1:
                k8.w(this.f27394b, this.f27395c);
                return;
            case 2:
                k8.H(this.f27394b, this.f27395c);
                return;
            default:
                k8.I(this.f27394b, this.f27395c);
                return;
        }
    }
}
