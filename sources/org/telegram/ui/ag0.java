package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class ag0 extends TimerTask {
    public final bg0 f32074a;

    public ag0(bg0 bg0Var) {
        this.f32074a = bg0Var;
    }

    @Override
    public final void run() {
        if (this.f32074a.R == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new g10(this, 24));
    }
}
