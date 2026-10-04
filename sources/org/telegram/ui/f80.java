package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class f80 extends TimerTask {
    public final String f36212a;
    public final g80 f36213b;

    public f80(g80 g80Var, String str) {
        this.f36213b = g80Var;
        this.f36212a = str;
    }

    @Override
    public final void run() {
        g80 g80Var = this.f36213b;
        try {
            g80Var.f36528f.cancel();
            g80Var.f36528f = null;
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        AndroidUtilities.runOnUIThread(new e80(this, this.f36212a, 0));
    }
}
