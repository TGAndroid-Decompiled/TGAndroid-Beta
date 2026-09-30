package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class b80 extends TimerTask {
    public final String f32351a;
    public final c80 f32352b;

    public b80(c80 c80Var, String str) {
        this.f32352b = c80Var;
        this.f32351a = str;
    }

    @Override
    public final void run() {
        c80 c80Var = this.f32352b;
        try {
            c80Var.f32597f.cancel();
            c80Var.f32597f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new a80(this, this.f32351a, 0));
    }
}
