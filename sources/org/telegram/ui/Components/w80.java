package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class w80 implements Runnable {
    public final int f29860a;
    public final y80 f29861b;
    public final boolean f29862c;

    public w80(y80 y80Var, boolean z10, int i10) {
        this.f29860a = i10;
        this.f29861b = y80Var;
        this.f29862c = z10;
    }

    @Override
    public final void run() {
        switch (this.f29860a) {
            case 0:
                AndroidUtilities.runOnUIThread(new w80(this.f29861b, this.f29862c, 1));
                return;
            default:
                this.f29861b.setJoinRequest(this.f29862c);
                return;
        }
    }
}
