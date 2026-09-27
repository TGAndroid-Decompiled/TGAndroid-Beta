package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class v80 implements Runnable {
    public final int f29071a;
    public final x80 f29072b;
    public final boolean f29073c;

    public v80(x80 x80Var, boolean z10, int i10) {
        this.f29071a = i10;
        this.f29072b = x80Var;
        this.f29073c = z10;
    }

    @Override
    public final void run() {
        switch (this.f29071a) {
            case 0:
                AndroidUtilities.runOnUIThread(new v80(this.f29072b, this.f29073c, 1));
                return;
            default:
                this.f29072b.setJoinRequest(this.f29073c);
                return;
        }
    }
}
