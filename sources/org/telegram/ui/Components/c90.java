package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class c90 implements Runnable {
    public final int f25158a;
    public final e90 f25159b;
    public final boolean f25160c;

    public c90(e90 e90Var, boolean z10, int i10) {
        this.f25158a = i10;
        this.f25159b = e90Var;
        this.f25160c = z10;
    }

    @Override
    public final void run() {
        switch (this.f25158a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c90(this.f25159b, this.f25160c, 1));
                return;
            default:
                this.f25159b.setJoinRequest(this.f25160c);
                return;
        }
    }
}
