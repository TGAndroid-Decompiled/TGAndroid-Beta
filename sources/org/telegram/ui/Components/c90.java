package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class c90 implements Runnable {
    public final int f25157a;
    public final e90 f25158b;
    public final boolean f25159c;

    public c90(e90 e90Var, boolean z10, int i10) {
        this.f25157a = i10;
        this.f25158b = e90Var;
        this.f25159c = z10;
    }

    @Override
    public final void run() {
        switch (this.f25157a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c90(this.f25158b, this.f25159c, 1));
                return;
            default:
                this.f25158b.setJoinRequest(this.f25159c);
                return;
        }
    }
}
