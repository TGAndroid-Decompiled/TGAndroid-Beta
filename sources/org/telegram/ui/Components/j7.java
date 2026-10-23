package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class j7 implements Runnable {
    public final int f27418a;
    public final k8 f27419b;
    public final TLRPC.TL_error f27420c;

    public j7(k8 k8Var, TLRPC.TL_error tL_error, int i10) {
        this.f27418a = i10;
        this.f27419b = k8Var;
        this.f27420c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27418a) {
            case 0:
                k8.u(this.f27419b, this.f27420c);
                return;
            case 1:
                k8.y(this.f27419b, this.f27420c);
                return;
            case 2:
                k8.I(this.f27419b, this.f27420c);
                return;
            default:
                k8.J(this.f27419b, this.f27420c);
                return;
        }
    }
}
