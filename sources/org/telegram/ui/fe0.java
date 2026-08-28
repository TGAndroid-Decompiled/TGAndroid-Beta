package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class fe0 extends TimerTask {
    public final ge0 f38244a;

    public fe0(ge0 ge0Var) {
        this.f38244a = ge0Var;
    }

    @Override
    public final void run() {
        if (this.f38244a.J == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new o00(this, 22));
    }
}
