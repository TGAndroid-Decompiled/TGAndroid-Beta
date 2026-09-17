package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class i80 implements Runnable {
    public final int f27012a;
    public final k80 f27013b;
    public final boolean f27014c;

    public i80(k80 k80Var, boolean z10, int i10) {
        this.f27012a = i10;
        this.f27013b = k80Var;
        this.f27014c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27012a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i80(this.f27013b, this.f27014c, 1));
                return;
            default:
                this.f27013b.setJoinRequest(this.f27014c);
                return;
        }
    }
}
