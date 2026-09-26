package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class b80 extends TimerTask {
    public final String f32348a;
    public final c80 f32349b;

    public b80(c80 c80Var, String str) {
        this.f32349b = c80Var;
        this.f32348a = str;
    }

    @Override
    public final void run() {
        c80 c80Var = this.f32349b;
        try {
            c80Var.f32595f.cancel();
            c80Var.f32595f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new a80(this, this.f32348a, 0));
    }
}
