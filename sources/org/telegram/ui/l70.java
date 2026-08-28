package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class l70 extends TimerTask {
    public final String f40071a;
    public final m70 f40072b;

    public l70(m70 m70Var, String str) {
        this.f40072b = m70Var;
        this.f40071a = str;
    }

    @Override
    public final void run() {
        m70 m70Var = this.f40072b;
        try {
            m70Var.f40343f.cancel();
            m70Var.f40343f = null;
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        AndroidUtilities.runOnUIThread(new k70(this, this.f40071a, 0));
    }
}
