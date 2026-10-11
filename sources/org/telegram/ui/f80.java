package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class f80 extends TimerTask {
    public final String f37598a;
    public final g80 f37599b;

    public f80(g80 g80Var, String str) {
        this.f37599b = g80Var;
        this.f37598a = str;
    }

    @Override
    public final void run() {
        g80 g80Var = this.f37599b;
        try {
            g80Var.f37986f.cancel();
            g80Var.f37986f = null;
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        AndroidUtilities.runOnUIThread(new e80(this, this.f37598a, 0));
    }
}
