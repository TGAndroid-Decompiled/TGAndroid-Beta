package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class s80 implements Runnable {
    public final int f28088a;
    public final t80 f28089b;
    public final boolean f28090c;
    public final boolean d;

    public s80(t80 t80Var, boolean z10, boolean z11, int i10) {
        this.f28088a = i10;
        this.f28089b = t80Var;
        this.f28090c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f28088a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s80(this.f28089b, this.f28090c, this.d, 1));
                return;
            default:
                t80 t80Var = this.f28089b;
                t80Var.setJoinRequest(this.f28090c);
                t80Var.setJoinToSend(this.d);
                return;
        }
    }
}
