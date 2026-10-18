package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class j7 implements Runnable {
    public final int f27424a;
    public final k8 f27425b;
    public final TLRPC.TL_error f27426c;

    public j7(k8 k8Var, TLRPC.TL_error tL_error, int i10) {
        this.f27424a = i10;
        this.f27425b = k8Var;
        this.f27426c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27424a) {
            case 0:
                k8.t(this.f27425b, this.f27426c);
                return;
            case 1:
                k8.y(this.f27425b, this.f27426c);
                return;
            case 2:
                k8.I(this.f27425b, this.f27426c);
                return;
            default:
                k8.J(this.f27425b, this.f27426c);
                return;
        }
    }
}
