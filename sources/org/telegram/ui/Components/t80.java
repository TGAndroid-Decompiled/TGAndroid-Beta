package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class t80 implements Runnable {
    public final int f28446a;
    public final v80 f28447b;
    public final boolean f28448c;

    public t80(v80 v80Var, boolean z10, int i10) {
        this.f28446a = i10;
        this.f28447b = v80Var;
        this.f28448c = z10;
    }

    @Override
    public final void run() {
        switch (this.f28446a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t80(this.f28447b, this.f28448c, 1));
                return;
            default:
                this.f28447b.setJoinRequest(this.f28448c);
                return;
        }
    }
}
