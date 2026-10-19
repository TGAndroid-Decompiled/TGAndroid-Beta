package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class c90 implements Runnable {
    public final int f25123a;
    public final e90 f25124b;
    public final boolean f25125c;

    public c90(e90 e90Var, boolean z10, int i10) {
        this.f25123a = i10;
        this.f25124b = e90Var;
        this.f25125c = z10;
    }

    @Override
    public final void run() {
        switch (this.f25123a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c90(this.f25124b, this.f25125c, 1));
                return;
            default:
                this.f25124b.setJoinRequest(this.f25125c);
                return;
        }
    }
}
