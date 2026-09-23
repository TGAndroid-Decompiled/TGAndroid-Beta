package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class d80 extends TimerTask {
    public final String f32533a;
    public final e80 f32534b;

    public d80(e80 e80Var, String str) {
        this.f32534b = e80Var;
        this.f32533a = str;
    }

    @Override
    public final void run() {
        e80 e80Var = this.f32534b;
        try {
            e80Var.f32846f.cancel();
            e80Var.f32846f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new c80(this, this.f32533a, 0));
    }
}
