package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class m70 extends TimerTask {
    public final String f39134a;
    public final n70 f39135b;

    public m70(n70 n70Var, String str) {
        this.f39135b = n70Var;
        this.f39134a = str;
    }

    @Override
    public final void run() {
        n70 n70Var = this.f39135b;
        try {
            n70Var.f39447f.cancel();
            n70Var.f39447f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new l70(this, this.f39134a, 0));
    }
}
