package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class l7 implements Runnable {
    public final int f30092a;
    public final m8 f30093b;
    public final TLRPC.TL_error f30094c;

    public l7(m8 m8Var, TLRPC.TL_error tL_error, int i10) {
        this.f30092a = i10;
        this.f30093b = m8Var;
        this.f30094c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f30092a) {
            case 0:
                m8.t(this.f30093b, this.f30094c);
                return;
            case 1:
                m8.w(this.f30093b, this.f30094c);
                return;
            case 2:
                m8.C(this.f30093b, this.f30094c);
                return;
            default:
                m8.y(this.f30093b, this.f30094c);
                return;
        }
    }
}
