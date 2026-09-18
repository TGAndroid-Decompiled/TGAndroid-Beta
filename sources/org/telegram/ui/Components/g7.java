package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class g7 implements Runnable {
    public final int f24102a;
    public final h8 f24103b;
    public final TLRPC.TL_error f24104c;

    public g7(h8 h8Var, TLRPC.TL_error tL_error, int i10) {
        this.f24102a = i10;
        this.f24103b = h8Var;
        this.f24104c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f24102a) {
            case 0:
                h8.s(this.f24103b, this.f24104c);
                return;
            case 1:
                h8.w(this.f24103b, this.f24104c);
                return;
            case 2:
                h8.H(this.f24103b, this.f24104c);
                return;
            default:
                h8.I(this.f24103b, this.f24104c);
                return;
        }
    }
}
