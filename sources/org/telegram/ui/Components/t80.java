package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class t80 implements Runnable {
    public final int f28445a;
    public final v80 f28446b;
    public final boolean f28447c;

    public t80(v80 v80Var, boolean z10, int i10) {
        this.f28445a = i10;
        this.f28446b = v80Var;
        this.f28447c = z10;
    }

    @Override
    public final void run() {
        switch (this.f28445a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t80(this.f28446b, this.f28447c, 1));
                return;
            default:
                this.f28446b.setJoinRequest(this.f28447c);
                return;
        }
    }
}
