package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class i80 implements Runnable {
    public final int f24866a;
    public final k80 f24867b;
    public final boolean f24868c;

    public i80(k80 k80Var, boolean z10, int i10) {
        this.f24866a = i10;
        this.f24867b = k80Var;
        this.f24868c = z10;
    }

    @Override
    public final void run() {
        switch (this.f24866a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i80(this.f24867b, this.f24868c, 1));
                return;
            default:
                this.f24867b.setJoinRequest(this.f24868c);
                return;
        }
    }
}
