package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class b80 extends TimerTask {
    public final String f32423a;
    public final c80 f32424b;

    public b80(c80 c80Var, String str) {
        this.f32424b = c80Var;
        this.f32423a = str;
    }

    @Override
    public final void run() {
        c80 c80Var = this.f32424b;
        try {
            c80Var.f32683f.cancel();
            c80Var.f32683f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new a80(this, this.f32423a, 0));
    }
}
