package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class if0 extends TimerTask {
    public final jf0 f37876a;

    public if0(jf0 jf0Var) {
        this.f37876a = jf0Var;
    }

    @Override
    public final void run() {
        if (this.f37876a.R == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new fz(this, 25));
    }
}
