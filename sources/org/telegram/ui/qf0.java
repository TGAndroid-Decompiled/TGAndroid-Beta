package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class qf0 extends TimerTask {
    public final rf0 f37746a;

    public qf0(rf0 rf0Var) {
        this.f37746a = rf0Var;
    }

    @Override
    public final void run() {
        if (this.f37746a.O == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new c10(this, 24));
    }
}
