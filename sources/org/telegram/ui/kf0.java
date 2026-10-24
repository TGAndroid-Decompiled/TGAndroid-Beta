package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class kf0 extends TimerTask {
    public final lf0 f38908a;

    public kf0(lf0 lf0Var) {
        this.f38908a = lf0Var;
    }

    @Override
    public final void run() {
        if (this.f38908a.T == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new fz(this, 26));
    }
}
