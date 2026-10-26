package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class l7 implements Runnable {
    public final int f30094a;
    public final m8 f30095b;
    public final TLRPC.TL_error f30096c;

    public l7(m8 m8Var, TLRPC.TL_error tL_error, int i10) {
        this.f30094a = i10;
        this.f30095b = m8Var;
        this.f30096c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f30094a) {
            case 0:
                m8.t(this.f30095b, this.f30096c);
                return;
            case 1:
                m8.w(this.f30095b, this.f30096c);
                return;
            case 2:
                m8.C(this.f30095b, this.f30096c);
                return;
            default:
                m8.y(this.f30095b, this.f30096c);
                return;
        }
    }
}
