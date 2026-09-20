package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class ag0 extends TimerTask {
    public final bg0 f32053a;

    public ag0(bg0 bg0Var) {
        this.f32053a = bg0Var;
    }

    @Override
    public final void run() {
        if (this.f32053a.R == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new g10(this, 24));
    }
}
