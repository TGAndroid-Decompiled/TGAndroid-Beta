package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class ag0 extends TimerTask {
    public final bg0 f31853a;

    public ag0(bg0 bg0Var) {
        this.f31853a = bg0Var;
    }

    @Override
    public final void run() {
        if (this.f31853a.R == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new i10(this, 24));
    }
}
