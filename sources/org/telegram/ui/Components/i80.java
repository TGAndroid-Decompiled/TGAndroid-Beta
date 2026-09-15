package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class i80 implements Runnable {
    public final int f24953a;
    public final k80 f24954b;
    public final boolean f24955c;

    public i80(k80 k80Var, boolean z10, int i10) {
        this.f24953a = i10;
        this.f24954b = k80Var;
        this.f24955c = z10;
    }

    @Override
    public final void run() {
        switch (this.f24953a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i80(this.f24954b, this.f24955c, 1));
                return;
            default:
                this.f24954b.setJoinRequest(this.f24955c);
                return;
        }
    }
}
