package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class i90 implements Runnable {
    public final int f25603a;
    public final l90 f25604b;
    public final boolean f25605c;

    public i90(l90 l90Var, boolean z10, int i10) {
        this.f25603a = i10;
        this.f25604b = l90Var;
        this.f25605c = z10;
    }

    @Override
    public final void run() {
        switch (this.f25603a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i90(this.f25604b, this.f25605c, 1));
                return;
            default:
                this.f25604b.setJoinRequest(this.f25605c);
                return;
        }
    }
}
