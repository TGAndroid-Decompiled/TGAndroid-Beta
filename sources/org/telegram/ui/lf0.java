package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

public final class lf0 extends TimerTask {

    public final mf0 f40074a;

    public lf0(mf0 mf0Var) {
        this.f40074a = mf0Var;
    }

    @Override
    public final void run() {
        if (this.f40074a.N == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new r00(this, 24));
    }
}
