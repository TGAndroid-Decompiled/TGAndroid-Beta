package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class d7 implements Runnable {
    public final int f26201a;
    public final c8 f26202b;
    public final TLRPC.TL_error f26203c;

    public d7(c8 c8Var, TLRPC.TL_error tL_error, int i10) {
        this.f26201a = i10;
        this.f26202b = c8Var;
        this.f26203c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f26201a) {
            case 0:
                c8.s(this.f26202b, this.f26203c);
                return;
            case 1:
                c8.w(this.f26202b, this.f26203c);
                return;
            case 2:
                c8.G(this.f26202b, this.f26203c);
                return;
            default:
                c8.H(this.f26202b, this.f26203c);
                return;
        }
    }
}
