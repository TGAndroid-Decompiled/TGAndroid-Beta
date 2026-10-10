package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class l90 implements Runnable {
    public final int f28272a;
    public final n90 f28273b;
    public final boolean f28274c;

    public l90(n90 n90Var, boolean z10, int i10) {
        this.f28272a = i10;
        this.f28273b = n90Var;
        this.f28274c = z10;
    }

    @Override
    public final void run() {
        switch (this.f28272a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l90(this.f28273b, this.f28274c, 1));
                return;
            default:
                this.f28273b.setJoinRequest(this.f28274c);
                return;
        }
    }
}
