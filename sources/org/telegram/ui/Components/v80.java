package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class v80 implements Runnable {
    public final int f29006a;
    public final x80 f29007b;
    public final boolean f29008c;

    public v80(x80 x80Var, boolean z10, int i10) {
        this.f29006a = i10;
        this.f29007b = x80Var;
        this.f29008c = z10;
    }

    @Override
    public final void run() {
        switch (this.f29006a) {
            case 0:
                AndroidUtilities.runOnUIThread(new v80(this.f29007b, this.f29008c, 1));
                return;
            default:
                this.f29007b.setJoinRequest(this.f29008c);
                return;
        }
    }
}
