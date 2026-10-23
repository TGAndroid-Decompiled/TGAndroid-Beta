package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class m70 extends TimerTask {
    public final String f39135a;
    public final n70 f39136b;

    public m70(n70 n70Var, String str) {
        this.f39136b = n70Var;
        this.f39135a = str;
    }

    @Override
    public final void run() {
        n70 n70Var = this.f39136b;
        try {
            n70Var.f39448f.cancel();
            n70Var.f39448f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new l70(this, this.f39135a, 0));
    }
}
