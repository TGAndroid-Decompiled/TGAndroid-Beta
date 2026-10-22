package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class gf0 extends TimerTask {
    public final hf0 f37314a;

    public gf0(hf0 hf0Var) {
        this.f37314a = hf0Var;
    }

    @Override
    public final void run() {
        if (this.f37314a.R == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new dz(this, 25));
    }
}
