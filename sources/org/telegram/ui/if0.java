package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class if0 extends TimerTask {
    public final jf0 f39142a;

    public if0(jf0 jf0Var) {
        this.f39142a = jf0Var;
    }

    @Override
    public final void run() {
        if (this.f39142a.N == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new o00(this, 24));
    }
}
