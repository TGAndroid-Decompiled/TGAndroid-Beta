package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class pe0 extends TimerTask {
    public final qe0 f40025a;

    public pe0(qe0 qe0Var) {
        this.f40025a = qe0Var;
    }

    @Override
    public final void run() {
        if (this.f40025a.K == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new c10(this, 22));
    }
}
