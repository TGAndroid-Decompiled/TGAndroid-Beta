package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class c90 implements Runnable {
    public final int f25170a;
    public final e90 f25171b;
    public final boolean f25172c;

    public c90(e90 e90Var, boolean z10, int i10) {
        this.f25170a = i10;
        this.f25171b = e90Var;
        this.f25172c = z10;
    }

    @Override
    public final void run() {
        switch (this.f25170a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c90(this.f25171b, this.f25172c, 1));
                return;
            default:
                this.f25171b.setJoinRequest(this.f25172c);
                return;
        }
    }
}
