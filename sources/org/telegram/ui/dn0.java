package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class dn0 extends TimerTask {
    public final en0 f38911a;

    public dn0(en0 en0Var) {
        this.f38911a = en0Var;
    }

    @Override
    public final void run() {
        en0 en0Var = this.f38911a;
        if (en0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        en0Var.f39147y = (int) (en0Var.f39147y - (currentTimeMillis - en0Var.F));
        en0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new lj0(this, 8));
    }
}
