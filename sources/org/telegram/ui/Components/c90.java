package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class c90 implements Runnable {
    public final int f25163a;
    public final e90 f25164b;
    public final boolean f25165c;

    public c90(e90 e90Var, boolean z10, int i10) {
        this.f25163a = i10;
        this.f25164b = e90Var;
        this.f25165c = z10;
    }

    @Override
    public final void run() {
        switch (this.f25163a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c90(this.f25164b, this.f25165c, 1));
                return;
            default:
                this.f25164b.setJoinRequest(this.f25165c);
                return;
        }
    }
}
