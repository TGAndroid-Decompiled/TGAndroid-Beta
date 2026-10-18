package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class hf0 extends TimerTask {
    public final if0 f37517a;

    public hf0(if0 if0Var) {
        this.f37517a = if0Var;
    }

    @Override
    public final void run() {
        if (this.f37517a.R == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new fz(this, 25));
    }
}
