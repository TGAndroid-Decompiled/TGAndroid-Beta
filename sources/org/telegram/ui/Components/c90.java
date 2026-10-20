package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class c90 implements Runnable {
    public final int f25154a;
    public final e90 f25155b;
    public final boolean f25156c;

    public c90(e90 e90Var, boolean z10, int i10) {
        this.f25154a = i10;
        this.f25155b = e90Var;
        this.f25156c = z10;
    }

    @Override
    public final void run() {
        switch (this.f25154a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c90(this.f25155b, this.f25156c, 1));
                return;
            default:
                this.f25155b.setJoinRequest(this.f25156c);
                return;
        }
    }
}
