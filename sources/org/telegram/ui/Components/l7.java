package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class l7 implements Runnable {
    public final int f26628a;
    public final m8 f26629b;
    public final TLRPC.TL_error f26630c;

    public l7(m8 m8Var, TLRPC.TL_error tL_error, int i10) {
        this.f26628a = i10;
        this.f26629b = m8Var;
        this.f26630c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f26628a) {
            case 0:
                m8.u(this.f26629b, this.f26630c);
                return;
            case 1:
                m8.y(this.f26629b, this.f26630c);
                return;
            case 2:
                m8.I(this.f26629b, this.f26630c);
                return;
            default:
                m8.J(this.f26629b, this.f26630c);
                return;
        }
    }
}
