package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class j80 implements Runnable {
    public final int f25250a;
    public final k80 f25251b;
    public final boolean f25252c;
    public final boolean d;

    public j80(k80 k80Var, boolean z10, boolean z11, int i10) {
        this.f25250a = i10;
        this.f25251b = k80Var;
        this.f25252c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f25250a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j80(this.f25251b, this.f25252c, this.d, 1));
                return;
            default:
                k80 k80Var = this.f25251b;
                k80Var.setJoinRequest(this.f25252c);
                k80Var.setJoinToSend(this.d);
                return;
        }
    }
}
