package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class i80 extends TimerTask {
    public final String f38802a;
    public final j80 f38803b;

    public i80(j80 j80Var, String str) {
        this.f38803b = j80Var;
        this.f38802a = str;
    }

    @Override
    public final void run() {
        j80 j80Var = this.f38803b;
        try {
            j80Var.f39151f.cancel();
            j80Var.f39151f = null;
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        AndroidUtilities.runOnUIThread(new h80(this, this.f38802a, 0));
    }
}
