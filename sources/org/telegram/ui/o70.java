package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class o70 extends TimerTask {
    public final String f39677a;
    public final p70 f39678b;

    public o70(p70 p70Var, String str) {
        this.f39678b = p70Var;
        this.f39677a = str;
    }

    @Override
    public final void run() {
        p70 p70Var = this.f39678b;
        try {
            p70Var.f39982f.cancel();
            p70Var.f39982f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new n70(this, this.f39677a, 0));
    }
}
