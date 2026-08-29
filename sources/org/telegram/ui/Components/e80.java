package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class e80 implements Runnable {
    public final int f27947a;
    public final g80 f27948b;
    public final boolean f27949c;

    public e80(g80 g80Var, boolean z10, int i10) {
        this.f27947a = i10;
        this.f27948b = g80Var;
        this.f27949c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27947a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e80(this.f27948b, this.f27949c, 1));
                return;
            default:
                this.f27948b.setJoinRequest(this.f27949c);
                return;
        }
    }
}
