package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class o70 extends TimerTask {
    public final String f39698a;
    public final p70 f39699b;

    public o70(p70 p70Var, String str) {
        this.f39699b = p70Var;
        this.f39698a = str;
    }

    @Override
    public final void run() {
        p70 p70Var = this.f39699b;
        try {
            p70Var.f40001f.cancel();
            p70Var.f40001f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new n70(this, this.f39698a, 0));
    }
}
