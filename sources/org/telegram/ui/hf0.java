package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class hf0 extends TimerTask {
    public final if0 f38893a;

    public hf0(if0 if0Var) {
        this.f38893a = if0Var;
    }

    @Override
    public final void run() {
        if (this.f38893a.N == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new q00(this, 24));
    }
}
