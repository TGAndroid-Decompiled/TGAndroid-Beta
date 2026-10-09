package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class g80 extends TimerTask {
    public final String f37936a;
    public final h80 f37937b;

    public g80(h80 h80Var, String str) {
        this.f37937b = h80Var;
        this.f37936a = str;
    }

    @Override
    public final void run() {
        h80 h80Var = this.f37937b;
        try {
            h80Var.f38228f.cancel();
            h80Var.f38228f = null;
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        AndroidUtilities.runOnUIThread(new f80(this, this.f37936a, 0));
    }
}
