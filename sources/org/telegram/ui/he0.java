package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class he0 extends TimerTask {
    public final ie0 f39868a;

    public he0(ie0 ie0Var) {
        this.f39868a = ie0Var;
    }

    @Override
    public final void run() {
        if (this.f39868a.N == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new r00(this, 24));
    }
}
