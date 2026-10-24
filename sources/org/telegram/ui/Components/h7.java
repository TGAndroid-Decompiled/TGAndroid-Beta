package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class h7 implements Runnable {
    public final int f26888a;
    public final i8 f26889b;
    public final TLRPC.TL_error f26890c;

    public h7(i8 i8Var, TLRPC.TL_error tL_error, int i10) {
        this.f26888a = i10;
        this.f26889b = i8Var;
        this.f26890c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f26888a) {
            case 0:
                i8.u(this.f26889b, this.f26890c);
                return;
            case 1:
                i8.x(this.f26889b, this.f26890c);
                return;
            case 2:
                i8.C(this.f26889b, this.f26890c);
                return;
            default:
                i8.z(this.f26889b, this.f26890c);
                return;
        }
    }
}
