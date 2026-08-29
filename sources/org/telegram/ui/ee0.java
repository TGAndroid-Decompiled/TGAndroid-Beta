package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class ee0 extends TimerTask {
    public final fe0 f37798a;

    public ee0(fe0 fe0Var) {
        this.f37798a = fe0Var;
    }

    @Override
    public final void run() {
        if (this.f37798a.J == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new q00(this, 22));
    }
}
