package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class ce0 extends TimerTask {
    public final de0 f35943a;

    public ce0(de0 de0Var) {
        this.f35943a = de0Var;
    }

    @Override
    public final void run() {
        if (this.f35943a.N == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new dz(this, 23));
    }
}
