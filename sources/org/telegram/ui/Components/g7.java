package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class g7 implements Runnable {
    public final int f24099a;
    public final h8 f24100b;
    public final TLRPC.TL_error f24101c;

    public g7(h8 h8Var, TLRPC.TL_error tL_error, int i10) {
        this.f24099a = i10;
        this.f24100b = h8Var;
        this.f24101c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f24099a) {
            case 0:
                h8.s(this.f24100b, this.f24101c);
                return;
            case 1:
                h8.w(this.f24100b, this.f24101c);
                return;
            case 2:
                h8.H(this.f24100b, this.f24101c);
                return;
            default:
                h8.I(this.f24100b, this.f24101c);
                return;
        }
    }
}
