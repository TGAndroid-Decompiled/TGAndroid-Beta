package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class j80 implements Runnable {
    public final int f25196a;
    public final l80 f25197b;
    public final boolean f25198c;

    public j80(l80 l80Var, boolean z10, int i10) {
        this.f25196a = i10;
        this.f25197b = l80Var;
        this.f25198c = z10;
    }

    @Override
    public final void run() {
        switch (this.f25196a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j80(this.f25197b, this.f25198c, 1));
                return;
            default:
                this.f25197b.setJoinRequest(this.f25198c);
                return;
        }
    }
}
