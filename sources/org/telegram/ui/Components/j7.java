package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class j7 implements Runnable {
    public final int f27533a;
    public final k8 f27534b;
    public final TLRPC.TL_error f27535c;

    public j7(k8 k8Var, TLRPC.TL_error tL_error, int i10) {
        this.f27533a = i10;
        this.f27534b = k8Var;
        this.f27535c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27533a) {
            case 0:
                k8.u(this.f27534b, this.f27535c);
                return;
            case 1:
                k8.x(this.f27534b, this.f27535c);
                return;
            case 2:
                k8.C(this.f27534b, this.f27535c);
                return;
            default:
                k8.z(this.f27534b, this.f27535c);
                return;
        }
    }
}
