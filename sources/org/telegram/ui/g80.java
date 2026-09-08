package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class g80 extends TimerTask {
    public final String f36622a;
    public final h80 f36623b;

    public g80(h80 h80Var, String str) {
        this.f36623b = h80Var;
        this.f36622a = str;
    }

    @Override
    public final void run() {
        h80 h80Var = this.f36623b;
        try {
            h80Var.f36948f.cancel();
            h80Var.f36948f = null;
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        AndroidUtilities.runOnUIThread(new f80(this, this.f36622a, 0));
    }
}
