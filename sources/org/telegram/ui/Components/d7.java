package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class d7 implements Runnable {
    public final int f24185a;
    public final c8 f24186b;
    public final TLRPC.TL_error f24187c;

    public d7(c8 c8Var, TLRPC.TL_error tL_error, int i10) {
        this.f24185a = i10;
        this.f24186b = c8Var;
        this.f24187c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f24185a) {
            case 0:
                c8.s(this.f24186b, this.f24187c);
                return;
            case 1:
                c8.w(this.f24186b, this.f24187c);
                return;
            case 2:
                c8.G(this.f24186b, this.f24187c);
                return;
            default:
                c8.H(this.f24186b, this.f24187c);
                return;
        }
    }
}
