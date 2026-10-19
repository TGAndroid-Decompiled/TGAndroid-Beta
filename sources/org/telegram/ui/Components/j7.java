package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class j7 implements Runnable {
    public final int f27438a;
    public final k8 f27439b;
    public final TLRPC.TL_error f27440c;

    public j7(k8 k8Var, TLRPC.TL_error tL_error, int i10) {
        this.f27438a = i10;
        this.f27439b = k8Var;
        this.f27440c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27438a) {
            case 0:
                k8.u(this.f27439b, this.f27440c);
                return;
            case 1:
                k8.y(this.f27439b, this.f27440c);
                return;
            case 2:
                k8.I(this.f27439b, this.f27440c);
                return;
            default:
                k8.J(this.f27439b, this.f27440c);
                return;
        }
    }
}
