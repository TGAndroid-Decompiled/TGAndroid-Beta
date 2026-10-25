package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class fe0 extends TimerTask {
    public final ge0 f39349a;

    public fe0(ge0 ge0Var) {
        this.f39349a = ge0Var;
    }

    @Override
    public final void run() {
        if (this.f39349a.N == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new p00(this, 24));
    }
}
