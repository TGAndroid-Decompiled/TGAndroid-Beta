package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class qe0 extends TimerTask {
    public final re0 f36872a;

    public qe0(re0 re0Var) {
        this.f36872a = re0Var;
    }

    @Override
    public final void run() {
        if (this.f36872a.N == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new c10(this, 22));
    }
}
