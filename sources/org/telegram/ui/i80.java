package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class i80 extends TimerTask {
    public final String f38799a;
    public final j80 f38800b;

    public i80(j80 j80Var, String str) {
        this.f38800b = j80Var;
        this.f38799a = str;
    }

    @Override
    public final void run() {
        j80 j80Var = this.f38800b;
        try {
            j80Var.f39149f.cancel();
            j80Var.f39149f = null;
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        AndroidUtilities.runOnUIThread(new h80(this, this.f38799a, 0));
    }
}
