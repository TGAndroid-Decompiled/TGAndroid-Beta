package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class bf0 extends TimerTask {
    public final cf0 f34529a;

    public bf0(cf0 cf0Var) {
        this.f34529a = cf0Var;
    }

    @Override
    public final void run() {
        if (this.f34529a.N == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new zz(this, 23));
    }
}
