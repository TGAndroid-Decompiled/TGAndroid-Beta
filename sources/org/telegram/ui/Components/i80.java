package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class i80 implements Runnable {
    public final int f24959a;
    public final k80 f24960b;
    public final boolean f24961c;

    public i80(k80 k80Var, boolean z10, int i10) {
        this.f24959a = i10;
        this.f24960b = k80Var;
        this.f24961c = z10;
    }

    @Override
    public final void run() {
        switch (this.f24959a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i80(this.f24960b, this.f24961c, 1));
                return;
            default:
                this.f24960b.setJoinRequest(this.f24961c);
                return;
        }
    }
}
