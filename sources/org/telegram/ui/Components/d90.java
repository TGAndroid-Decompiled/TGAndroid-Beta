package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class d90 implements Runnable {
    public final int f25531a;
    public final f90 f25532b;
    public final boolean f25533c;

    public d90(f90 f90Var, boolean z10, int i10) {
        this.f25531a = i10;
        this.f25532b = f90Var;
        this.f25533c = z10;
    }

    @Override
    public final void run() {
        switch (this.f25531a) {
            case 0:
                AndroidUtilities.runOnUIThread(new d90(this.f25532b, this.f25533c, 1));
                return;
            default:
                this.f25532b.setJoinRequest(this.f25533c);
                return;
        }
    }
}
