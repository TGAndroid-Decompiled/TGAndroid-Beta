package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class l7 implements Runnable {
    public final int f30126a;
    public final m8 f30127b;
    public final TLRPC.TL_error f30128c;

    public l7(m8 m8Var, TLRPC.TL_error tL_error, int i10) {
        this.f30126a = i10;
        this.f30127b = m8Var;
        this.f30128c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f30126a) {
            case 0:
                m8.t(this.f30127b, this.f30128c);
                return;
            case 1:
                m8.w(this.f30127b, this.f30128c);
                return;
            case 2:
                m8.C(this.f30127b, this.f30128c);
                return;
            default:
                m8.y(this.f30127b, this.f30128c);
                return;
        }
    }
}
