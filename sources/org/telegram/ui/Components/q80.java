package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class q80 implements Runnable {
    public final int f27536a;
    public final s80 f27537b;
    public final boolean f27538c;

    public q80(s80 s80Var, boolean z10, int i10) {
        this.f27536a = i10;
        this.f27537b = s80Var;
        this.f27538c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27536a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q80(this.f27537b, this.f27538c, 1));
                return;
            default:
                this.f27537b.setJoinRequest(this.f27538c);
                return;
        }
    }
}
