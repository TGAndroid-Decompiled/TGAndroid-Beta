package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class i80 implements Runnable {
    public final int f24869a;
    public final k80 f24870b;
    public final boolean f24871c;

    public i80(k80 k80Var, boolean z10, int i10) {
        this.f24869a = i10;
        this.f24870b = k80Var;
        this.f24871c = z10;
    }

    @Override
    public final void run() {
        switch (this.f24869a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i80(this.f24870b, this.f24871c, 1));
                return;
            default:
                this.f24870b.setJoinRequest(this.f24871c);
                return;
        }
    }
}
