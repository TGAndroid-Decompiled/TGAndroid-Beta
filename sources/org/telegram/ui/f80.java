package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class f80 extends TimerTask {
    public final String f36213a;
    public final g80 f36214b;

    public f80(g80 g80Var, String str) {
        this.f36214b = g80Var;
        this.f36213a = str;
    }

    @Override
    public final void run() {
        g80 g80Var = this.f36214b;
        try {
            g80Var.f36529f.cancel();
            g80Var.f36529f = null;
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        AndroidUtilities.runOnUIThread(new e80(this, this.f36213a, 0));
    }
}
