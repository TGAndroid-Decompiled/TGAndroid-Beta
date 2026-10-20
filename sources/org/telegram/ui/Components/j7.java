package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class j7 implements Runnable {
    public final int f27414a;
    public final k8 f27415b;
    public final TLRPC.TL_error f27416c;

    public j7(k8 k8Var, TLRPC.TL_error tL_error, int i10) {
        this.f27414a = i10;
        this.f27415b = k8Var;
        this.f27416c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27414a) {
            case 0:
                k8.u(this.f27415b, this.f27416c);
                return;
            case 1:
                k8.y(this.f27415b, this.f27416c);
                return;
            case 2:
                k8.I(this.f27415b, this.f27416c);
                return;
            default:
                k8.J(this.f27415b, this.f27416c);
                return;
        }
    }
}
