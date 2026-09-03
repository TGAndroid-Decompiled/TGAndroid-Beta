package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class d7 implements Runnable {
    public final int f26204a;
    public final c8 f26205b;
    public final TLRPC.TL_error f26206c;

    public d7(c8 c8Var, TLRPC.TL_error tL_error, int i10) {
        this.f26204a = i10;
        this.f26205b = c8Var;
        this.f26206c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f26204a) {
            case 0:
                c8.s(this.f26205b, this.f26206c);
                return;
            case 1:
                c8.w(this.f26205b, this.f26206c);
                return;
            case 2:
                c8.G(this.f26205b, this.f26206c);
                return;
            default:
                c8.H(this.f26205b, this.f26206c);
                return;
        }
    }
}
