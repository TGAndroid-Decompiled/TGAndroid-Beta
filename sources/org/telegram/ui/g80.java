package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class g80 extends TimerTask {
    public final String f33841a;
    public final h80 f33842b;

    public g80(h80 h80Var, String str) {
        this.f33842b = h80Var;
        this.f33841a = str;
    }

    @Override
    public final void run() {
        h80 h80Var = this.f33842b;
        try {
            h80Var.f34210f.cancel();
            h80Var.f34210f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new f80(this, this.f33841a, 0));
    }
}
