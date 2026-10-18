package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class o70 extends TimerTask {
    public final String f39690a;
    public final p70 f39691b;

    public o70(p70 p70Var, String str) {
        this.f39691b = p70Var;
        this.f39690a = str;
    }

    @Override
    public final void run() {
        p70 p70Var = this.f39691b;
        try {
            p70Var.f39962f.cancel();
            p70Var.f39962f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new n70(this, this.f39690a, 0));
    }
}
