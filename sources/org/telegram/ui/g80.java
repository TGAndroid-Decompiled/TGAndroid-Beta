package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class g80 extends TimerTask {
    public final String f33781a;
    public final h80 f33782b;

    public g80(h80 h80Var, String str) {
        this.f33782b = h80Var;
        this.f33781a = str;
    }

    @Override
    public final void run() {
        h80 h80Var = this.f33782b;
        try {
            h80Var.f34099f.cancel();
            h80Var.f34099f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new f80(this, this.f33781a, 0));
    }
}
