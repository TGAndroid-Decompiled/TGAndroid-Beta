package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class g7 implements Runnable {
    public final int f24215a;
    public final h8 f24216b;
    public final TLRPC.TL_error f24217c;

    public g7(h8 h8Var, TLRPC.TL_error tL_error, int i10) {
        this.f24215a = i10;
        this.f24216b = h8Var;
        this.f24217c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f24215a) {
            case 0:
                h8.s(this.f24216b, this.f24217c);
                return;
            case 1:
                h8.w(this.f24216b, this.f24217c);
                return;
            case 2:
                h8.H(this.f24216b, this.f24217c);
                return;
            default:
                h8.I(this.f24216b, this.f24217c);
                return;
        }
    }
}
