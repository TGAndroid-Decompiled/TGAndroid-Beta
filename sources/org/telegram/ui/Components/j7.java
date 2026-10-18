package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class j7 implements Runnable {
    public final int f27431a;
    public final k8 f27432b;
    public final TLRPC.TL_error f27433c;

    public j7(k8 k8Var, TLRPC.TL_error tL_error, int i10) {
        this.f27431a = i10;
        this.f27432b = k8Var;
        this.f27433c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27431a) {
            case 0:
                k8.t(this.f27432b, this.f27433c);
                return;
            case 1:
                k8.y(this.f27432b, this.f27433c);
                return;
            case 2:
                k8.I(this.f27432b, this.f27433c);
                return;
            default:
                k8.J(this.f27432b, this.f27433c);
                return;
        }
    }
}
