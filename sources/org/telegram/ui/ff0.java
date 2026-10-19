package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class ff0 extends TimerTask {
    public final gf0 f36990a;

    public ff0(gf0 gf0Var) {
        this.f36990a = gf0Var;
    }

    @Override
    public final void run() {
        if (this.f36990a.R == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new dz(this, 25));
    }
}
