package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class b90 implements Runnable {
    public final int f24938a;
    public final d90 f24939b;
    public final boolean f24940c;

    public b90(d90 d90Var, boolean z10, int i10) {
        this.f24938a = i10;
        this.f24939b = d90Var;
        this.f24940c = z10;
    }

    @Override
    public final void run() {
        switch (this.f24938a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b90(this.f24939b, this.f24940c, 1));
                return;
            default:
                this.f24939b.setJoinRequest(this.f24940c);
                return;
        }
    }
}
