package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class e90 implements Runnable {
    public final int f25937a;
    public final f90 f25938b;
    public final boolean f25939c;
    public final boolean d;

    public e90(f90 f90Var, boolean z10, boolean z11, int i10) {
        this.f25937a = i10;
        this.f25938b = f90Var;
        this.f25939c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f25937a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e90(this.f25938b, this.f25939c, this.d, 1));
                return;
            default:
                f90 f90Var = this.f25938b;
                f90Var.setJoinRequest(this.f25939c);
                f90Var.setJoinToSend(this.d);
                return;
        }
    }
}
