package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class oe0 extends TimerTask {
    public final pe0 f39675a;

    public oe0(pe0 pe0Var) {
        this.f39675a = pe0Var;
    }

    @Override
    public final void run() {
        if (this.f39675a.K == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new c10(this, 22));
    }
}
