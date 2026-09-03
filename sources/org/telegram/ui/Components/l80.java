package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class l80 implements Runnable {
    public final int f28681a;
    public final n80 f28682b;
    public final boolean f28683c;

    public l80(n80 n80Var, boolean z4, int i10) {
        this.f28681a = i10;
        this.f28682b = n80Var;
        this.f28683c = z4;
    }

    @Override
    public final void run() {
        switch (this.f28681a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l80(this.f28682b, this.f28683c, 1));
                return;
            default:
                this.f28682b.setJoinRequest(this.f28683c);
                return;
        }
    }
}
