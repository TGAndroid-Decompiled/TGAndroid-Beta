package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class f80 extends TimerTask {
    public final String f36218a;
    public final g80 f36219b;

    public f80(g80 g80Var, String str) {
        this.f36219b = g80Var;
        this.f36218a = str;
    }

    @Override
    public final void run() {
        g80 g80Var = this.f36219b;
        try {
            g80Var.f36534f.cancel();
            g80Var.f36534f = null;
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        AndroidUtilities.runOnUIThread(new e80(this, this.f36218a, 0));
    }
}
