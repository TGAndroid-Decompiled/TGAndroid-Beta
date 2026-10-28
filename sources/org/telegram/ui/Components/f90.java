package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class f90 implements Runnable {
    public final int f28060a;
    public final h90 f28061b;
    public final boolean f28062c;

    public f90(h90 h90Var, boolean z10, int i10) {
        this.f28060a = i10;
        this.f28061b = h90Var;
        this.f28062c = z10;
    }

    @Override
    public final void run() {
        switch (this.f28060a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f90(this.f28061b, this.f28062c, 1));
                return;
            default:
                this.f28061b.setJoinRequest(this.f28062c);
                return;
        }
    }
}
