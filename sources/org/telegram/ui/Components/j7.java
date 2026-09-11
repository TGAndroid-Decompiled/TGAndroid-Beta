package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class j7 implements Runnable {
    public final int f27366a;
    public final k8 f27367b;
    public final TLRPC.TL_error f27368c;

    public j7(k8 k8Var, TLRPC.TL_error tL_error, int i10) {
        this.f27366a = i10;
        this.f27367b = k8Var;
        this.f27368c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27366a) {
            case 0:
                k8.s(this.f27367b, this.f27368c);
                return;
            case 1:
                k8.w(this.f27367b, this.f27368c);
                return;
            case 2:
                k8.H(this.f27367b, this.f27368c);
                return;
            default:
                k8.I(this.f27367b, this.f27368c);
                return;
        }
    }
}
