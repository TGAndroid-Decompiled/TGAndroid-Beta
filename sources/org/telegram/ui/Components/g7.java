package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class g7 implements Runnable {
    public final int f24218a;
    public final h8 f24219b;
    public final TLRPC.TL_error f24220c;

    public g7(h8 h8Var, TLRPC.TL_error tL_error, int i10) {
        this.f24218a = i10;
        this.f24219b = h8Var;
        this.f24220c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f24218a) {
            case 0:
                h8.s(this.f24219b, this.f24220c);
                return;
            case 1:
                h8.w(this.f24219b, this.f24220c);
                return;
            case 2:
                h8.H(this.f24219b, this.f24220c);
                return;
            default:
                h8.I(this.f24219b, this.f24220c);
                return;
        }
    }
}
