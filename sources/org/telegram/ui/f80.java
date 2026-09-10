package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class f80 extends TimerTask {
    public final String f32714a;
    public final g80 f32715b;

    public f80(g80 g80Var, String str) {
        this.f32715b = g80Var;
        this.f32714a = str;
    }

    @Override
    public final void run() {
        g80 g80Var = this.f32715b;
        try {
            g80Var.f33039f.cancel();
            g80Var.f33039f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new e80(this, this.f32714a, 0));
    }
}
