package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class cg0 extends TimerTask {
    public final dg0 f34660a;

    public cg0(dg0 dg0Var) {
        this.f34660a = dg0Var;
    }

    @Override
    public final void run() {
        if (this.f34660a.R == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new zz(this, 25));
    }
}
