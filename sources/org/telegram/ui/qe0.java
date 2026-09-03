package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class qe0 extends TimerTask {
    public final re0 f37399a;

    public qe0(re0 re0Var) {
        this.f37399a = re0Var;
    }

    @Override
    public final void run() {
        if (this.f37399a.K == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new d10(this, 22));
    }
}
