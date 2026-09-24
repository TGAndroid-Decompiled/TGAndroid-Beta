package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class t80 implements Runnable {
    public final int f28439a;
    public final v80 f28440b;
    public final boolean f28441c;

    public t80(v80 v80Var, boolean z10, int i10) {
        this.f28439a = i10;
        this.f28440b = v80Var;
        this.f28441c = z10;
    }

    @Override
    public final void run() {
        switch (this.f28439a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t80(this.f28440b, this.f28441c, 1));
                return;
            default:
                this.f28440b.setJoinRequest(this.f28441c);
                return;
        }
    }
}
