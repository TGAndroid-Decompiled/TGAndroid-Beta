package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class k90 implements Runnable {
    public final int f27997a;
    public final m90 f27998b;
    public final boolean f27999c;

    public k90(m90 m90Var, boolean z10, int i10) {
        this.f27997a = i10;
        this.f27998b = m90Var;
        this.f27999c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27997a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k90(this.f27998b, this.f27999c, 1));
                return;
            default:
                this.f27998b.setJoinRequest(this.f27999c);
                return;
        }
    }
}
