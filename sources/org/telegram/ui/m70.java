package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class m70 extends TimerTask {
    public final String f39124a;
    public final n70 f39125b;

    public m70(n70 n70Var, String str) {
        this.f39125b = n70Var;
        this.f39124a = str;
    }

    @Override
    public final void run() {
        n70 n70Var = this.f39125b;
        try {
            n70Var.f39438f.cancel();
            n70Var.f39438f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new l70(this, this.f39124a, 0));
    }
}
