package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class h7 implements Runnable {
    public final int f24699a;
    public final i8 f24700b;
    public final TLRPC.TL_error f24701c;

    public h7(i8 i8Var, TLRPC.TL_error tL_error, int i10) {
        this.f24699a = i10;
        this.f24700b = i8Var;
        this.f24701c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f24699a) {
            case 0:
                i8.s(this.f24700b, this.f24701c);
                return;
            case 1:
                i8.w(this.f24700b, this.f24701c);
                return;
            case 2:
                i8.G(this.f24700b, this.f24701c);
                return;
            default:
                i8.I(this.f24700b, this.f24701c);
                return;
        }
    }
}
