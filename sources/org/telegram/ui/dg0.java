package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class dg0 extends TimerTask {
    public final eg0 f35255a;

    public dg0(eg0 eg0Var) {
        this.f35255a = eg0Var;
    }

    @Override
    public final void run() {
        if (this.f35255a.R == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new zz(this, 25));
    }
}
