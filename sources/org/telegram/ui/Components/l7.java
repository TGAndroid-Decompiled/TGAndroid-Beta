package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class l7 implements Runnable {
    public final int f26968a;
    public final m8 f26969b;
    public final TLRPC.TL_error f26970c;

    public l7(m8 m8Var, TLRPC.TL_error tL_error, int i10) {
        this.f26968a = i10;
        this.f26969b = m8Var;
        this.f26970c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f26968a) {
            case 0:
                m8.u(this.f26969b, this.f26970c);
                return;
            case 1:
                m8.y(this.f26969b, this.f26970c);
                return;
            case 2:
                m8.I(this.f26969b, this.f26970c);
                return;
            default:
                m8.J(this.f26969b, this.f26970c);
                return;
        }
    }
}
