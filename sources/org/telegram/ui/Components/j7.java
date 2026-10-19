package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class j7 implements Runnable {
    public final int f27436a;
    public final k8 f27437b;
    public final TLRPC.TL_error f27438c;

    public j7(k8 k8Var, TLRPC.TL_error tL_error, int i10) {
        this.f27436a = i10;
        this.f27437b = k8Var;
        this.f27438c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27436a) {
            case 0:
                k8.u(this.f27437b, this.f27438c);
                return;
            case 1:
                k8.y(this.f27437b, this.f27438c);
                return;
            case 2:
                k8.I(this.f27437b, this.f27438c);
                return;
            default:
                k8.J(this.f27437b, this.f27438c);
                return;
        }
    }
}
