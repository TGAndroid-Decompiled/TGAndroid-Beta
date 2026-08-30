package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class d7 implements Runnable {
    public final int f24180a;
    public final c8 f24181b;
    public final TLRPC.TL_error f24182c;

    public d7(c8 c8Var, TLRPC.TL_error tL_error, int i10) {
        this.f24180a = i10;
        this.f24181b = c8Var;
        this.f24182c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f24180a) {
            case 0:
                c8.s(this.f24181b, this.f24182c);
                return;
            case 1:
                c8.w(this.f24181b, this.f24182c);
                return;
            case 2:
                c8.G(this.f24181b, this.f24182c);
                return;
            default:
                c8.H(this.f24181b, this.f24182c);
                return;
        }
    }
}
