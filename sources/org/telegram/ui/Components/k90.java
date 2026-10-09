package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class k90 implements Runnable {
    public final int f27906a;
    public final m90 f27907b;
    public final boolean f27908c;

    public k90(m90 m90Var, boolean z10, int i10) {
        this.f27906a = i10;
        this.f27907b = m90Var;
        this.f27908c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27906a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k90(this.f27907b, this.f27908c, 1));
                return;
            default:
                this.f27907b.setJoinRequest(this.f27908c);
                return;
        }
    }
}
