package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class k80 extends TimerTask {
    public final String f37603a;
    public final l80 f37604b;

    public k80(l80 l80Var, String str) {
        this.f37604b = l80Var;
        this.f37603a = str;
    }

    @Override
    public final void run() {
        l80 l80Var = this.f37604b;
        try {
            l80Var.f37889f.cancel();
            l80Var.f37889f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new j80(this, this.f37603a, 0));
    }
}
