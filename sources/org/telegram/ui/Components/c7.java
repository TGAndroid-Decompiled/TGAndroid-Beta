package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

public final class c7 implements Runnable {

    public final int f27345a;

    public final b8 f27346b;

    public final TLRPC.TL_error f27347c;

    public c7(b8 b8Var, TLRPC.TL_error tL_error, int i10) {
        this.f27345a = i10;
        this.f27346b = b8Var;
        this.f27347c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27345a) {
            case 0:
                b8.t(this.f27346b, this.f27347c);
                break;
            case 1:
                b8.x(this.f27346b, this.f27347c);
                break;
            case 2:
                b8.H(this.f27346b, this.f27347c);
                break;
            default:
                b8.I(this.f27346b, this.f27347c);
                break;
        }
    }
}
