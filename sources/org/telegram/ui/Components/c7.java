package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class c7 implements Runnable {
    public final int f27374a;
    public final c8 f27375b;
    public final TLRPC.TL_error f27376c;

    public c7(c8 c8Var, TLRPC.TL_error tL_error, int i9) {
        this.f27374a = i9;
        this.f27375b = c8Var;
        this.f27376c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27374a) {
            case 0:
                c8.s(this.f27375b, this.f27376c);
                return;
            case 1:
                c8.w(this.f27375b, this.f27376c);
                return;
            case 2:
                c8.G(this.f27375b, this.f27376c);
                return;
            default:
                c8.H(this.f27375b, this.f27376c);
                return;
        }
    }
}
