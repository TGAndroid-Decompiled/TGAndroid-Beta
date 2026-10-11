package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class f80 extends TimerTask {
    public final String f37632a;
    public final g80 f37633b;

    public f80(g80 g80Var, String str) {
        this.f37633b = g80Var;
        this.f37632a = str;
    }

    @Override
    public final void run() {
        g80 g80Var = this.f37633b;
        try {
            g80Var.f38020f.cancel();
            g80Var.f38020f = null;
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        AndroidUtilities.runOnUIThread(new e80(this, this.f37632a, 0));
    }
}
