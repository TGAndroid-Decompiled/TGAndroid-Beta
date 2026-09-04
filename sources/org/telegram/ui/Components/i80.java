package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class i80 implements Runnable {
    public final int f27011a;
    public final k80 f27012b;
    public final boolean f27013c;

    public i80(k80 k80Var, boolean z10, int i10) {
        this.f27011a = i10;
        this.f27012b = k80Var;
        this.f27013c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27011a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i80(this.f27012b, this.f27013c, 1));
                return;
            default:
                this.f27012b.setJoinRequest(this.f27013c);
                return;
        }
    }
}
