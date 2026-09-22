package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class t80 implements Runnable {
    public final int f28420a;
    public final v80 f28421b;
    public final boolean f28422c;

    public t80(v80 v80Var, boolean z10, int i10) {
        this.f28420a = i10;
        this.f28421b = v80Var;
        this.f28422c = z10;
    }

    @Override
    public final void run() {
        switch (this.f28420a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t80(this.f28421b, this.f28422c, 1));
                return;
            default:
                this.f28421b.setJoinRequest(this.f28422c);
                return;
        }
    }
}
