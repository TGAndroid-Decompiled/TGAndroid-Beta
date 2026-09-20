package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class h7 implements Runnable {
    public final int f24558a;
    public final i8 f24559b;
    public final TLRPC.TL_error f24560c;

    public h7(i8 i8Var, TLRPC.TL_error tL_error, int i10) {
        this.f24558a = i10;
        this.f24559b = i8Var;
        this.f24560c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f24558a) {
            case 0:
                i8.s(this.f24559b, this.f24560c);
                return;
            case 1:
                i8.w(this.f24559b, this.f24560c);
                return;
            case 2:
                i8.H(this.f24559b, this.f24560c);
                return;
            default:
                i8.I(this.f24559b, this.f24560c);
                return;
        }
    }
}
