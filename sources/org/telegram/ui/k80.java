package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class k80 extends TimerTask {
    public final String f37324a;
    public final l80 f37325b;

    public k80(l80 l80Var, String str) {
        this.f37325b = l80Var;
        this.f37324a = str;
    }

    @Override
    public final void run() {
        l80 l80Var = this.f37325b;
        try {
            l80Var.f37655f.cancel();
            l80Var.f37655f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new j80(this, this.f37324a, 0));
    }
}
