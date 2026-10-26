package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class if0 extends TimerTask {
    public final jf0 f40236a;

    public if0(jf0 jf0Var) {
        this.f40236a = jf0Var;
    }

    @Override
    public final void run() {
        if (this.f40236a.T == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new p00(this, 26));
    }
}
