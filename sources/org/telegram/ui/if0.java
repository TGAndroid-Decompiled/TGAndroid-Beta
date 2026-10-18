package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class if0 extends TimerTask {
    public final jf0 f37890a;

    public if0(jf0 jf0Var) {
        this.f37890a = jf0Var;
    }

    @Override
    public final void run() {
        if (this.f37890a.R == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new fz(this, 25));
    }
}
