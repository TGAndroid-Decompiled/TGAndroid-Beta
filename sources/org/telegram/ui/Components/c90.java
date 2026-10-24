package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class c90 implements Runnable {
    public final int f25268a;
    public final d90 f25269b;
    public final boolean f25270c;
    public final boolean d;

    public c90(d90 d90Var, boolean z10, boolean z11, int i10) {
        this.f25268a = i10;
        this.f25269b = d90Var;
        this.f25270c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f25268a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c90(this.f25269b, this.f25270c, this.d, 1));
                return;
            default:
                d90 d90Var = this.f25269b;
                d90Var.setJoinRequest(this.f25270c);
                d90Var.setJoinToSend(this.d);
                return;
        }
    }
}
