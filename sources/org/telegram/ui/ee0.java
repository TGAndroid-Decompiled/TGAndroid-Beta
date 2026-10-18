package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class ee0 extends TimerTask {
    public final fe0 f36512a;

    public ee0(fe0 fe0Var) {
        this.f36512a = fe0Var;
    }

    @Override
    public final void run() {
        if (this.f36512a.N == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new fz(this, 23));
    }
}
