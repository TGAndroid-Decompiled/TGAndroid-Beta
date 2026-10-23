package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class lf0 extends TimerTask {
    public final mf0 f39237a;

    public lf0(mf0 mf0Var) {
        this.f39237a = mf0Var;
    }

    @Override
    public final void run() {
        if (this.f39237a.T == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new fz(this, 26));
    }
}
