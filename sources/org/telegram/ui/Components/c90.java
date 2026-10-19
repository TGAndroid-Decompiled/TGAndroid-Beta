package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class c90 implements Runnable {
    public final int f25121a;
    public final e90 f25122b;
    public final boolean f25123c;

    public c90(e90 e90Var, boolean z10, int i10) {
        this.f25121a = i10;
        this.f25122b = e90Var;
        this.f25123c = z10;
    }

    @Override
    public final void run() {
        switch (this.f25121a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c90(this.f25122b, this.f25123c, 1));
                return;
            default:
                this.f25122b.setJoinRequest(this.f25123c);
                return;
        }
    }
}
