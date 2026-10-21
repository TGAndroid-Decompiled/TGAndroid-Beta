package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class m70 extends TimerTask {
    public final String f39131a;
    public final n70 f39132b;

    public m70(n70 n70Var, String str) {
        this.f39132b = n70Var;
        this.f39131a = str;
    }

    @Override
    public final void run() {
        n70 n70Var = this.f39132b;
        try {
            n70Var.f39444f.cancel();
            n70Var.f39444f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new l70(this, this.f39131a, 0));
    }
}
