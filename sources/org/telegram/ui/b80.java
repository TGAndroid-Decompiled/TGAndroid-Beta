package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class b80 extends TimerTask {
    public final String f32347a;
    public final c80 f32348b;

    public b80(c80 c80Var, String str) {
        this.f32348b = c80Var;
        this.f32347a = str;
    }

    @Override
    public final void run() {
        c80 c80Var = this.f32348b;
        try {
            c80Var.f32594f.cancel();
            c80Var.f32594f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new a80(this, this.f32347a, 0));
    }
}
