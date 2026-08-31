package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class l80 implements Runnable {
    public final int f28643a;
    public final n80 f28644b;
    public final boolean f28645c;

    public l80(n80 n80Var, boolean z4, int i10) {
        this.f28643a = i10;
        this.f28644b = n80Var;
        this.f28645c = z4;
    }

    @Override
    public final void run() {
        switch (this.f28643a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l80(this.f28644b, this.f28645c, 1));
                return;
            default:
                this.f28644b.setJoinRequest(this.f28645c);
                return;
        }
    }
}
