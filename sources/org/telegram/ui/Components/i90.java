package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class i90 implements Runnable {
    public final int f25914a;
    public final l90 f25915b;
    public final boolean f25916c;

    public i90(l90 l90Var, boolean z10, int i10) {
        this.f25914a = i10;
        this.f25915b = l90Var;
        this.f25916c = z10;
    }

    @Override
    public final void run() {
        switch (this.f25914a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i90(this.f25915b, this.f25916c, 1));
                return;
            default:
                this.f25915b.setJoinRequest(this.f25916c);
                return;
        }
    }
}
