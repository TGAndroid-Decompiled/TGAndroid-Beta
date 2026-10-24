package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class he0 extends TimerTask {
    public final ie0 f37822a;

    public he0(ie0 ie0Var) {
        this.f37822a = ie0Var;
    }

    @Override
    public final void run() {
        if (this.f37822a.N == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new fz(this, 24));
    }
}
