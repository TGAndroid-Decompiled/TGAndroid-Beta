package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class i80 implements Runnable {
    public final int f27038a;
    public final k80 f27039b;
    public final boolean f27040c;

    public i80(k80 k80Var, boolean z10, int i10) {
        this.f27038a = i10;
        this.f27039b = k80Var;
        this.f27040c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27038a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i80(this.f27039b, this.f27040c, 1));
                return;
            default:
                this.f27039b.setJoinRequest(this.f27040c);
                return;
        }
    }
}
