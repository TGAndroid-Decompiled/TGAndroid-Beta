package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class e80 extends TimerTask {
    public final String f33168a;
    public final f80 f33169b;

    public e80(f80 f80Var, String str) {
        this.f33169b = f80Var;
        this.f33168a = str;
    }

    @Override
    public final void run() {
        f80 f80Var = this.f33169b;
        try {
            f80Var.f33454f.cancel();
            f80Var.f33454f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new d80(this, this.f33168a, 0));
    }
}
