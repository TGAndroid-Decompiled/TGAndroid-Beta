package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class i80 extends TimerTask {
    public final String f34506a;
    public final j80 f34507b;

    public i80(j80 j80Var, String str) {
        this.f34507b = j80Var;
        this.f34506a = str;
    }

    @Override
    public final void run() {
        j80 j80Var = this.f34507b;
        try {
            j80Var.f34814f.cancel();
            j80Var.f34814f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new h80(this, this.f34506a, 0));
    }
}
