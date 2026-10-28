package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class kf0 extends TimerTask {
    public final lf0 f40791a;

    public kf0(lf0 lf0Var) {
        this.f40791a = lf0Var;
    }

    @Override
    public final void run() {
        if (this.f40791a.T == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new r00(this, 26));
    }
}
