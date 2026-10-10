package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class g80 extends TimerTask {
    public final String f37980a;
    public final h80 f37981b;

    public g80(h80 h80Var, String str) {
        this.f37981b = h80Var;
        this.f37980a = str;
    }

    @Override
    public final void run() {
        h80 h80Var = this.f37981b;
        try {
            h80Var.f38272f.cancel();
            h80Var.f38272f = null;
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        AndroidUtilities.runOnUIThread(new f80(this, this.f37980a, 0));
    }
}
