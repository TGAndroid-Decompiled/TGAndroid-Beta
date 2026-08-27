package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

public final class o70 extends TimerTask {

    public final String f41024a;

    public final p70 f41025b;

    public o70(p70 p70Var, String str) {
        this.f41025b = p70Var;
        this.f41024a = str;
    }

    @Override
    public final void run() {
        p70 p70Var = this.f41025b;
        try {
            p70Var.f41291f.cancel();
            p70Var.f41291f = null;
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        AndroidUtilities.runOnUIThread(new n70(this, this.f41024a, 0));
    }
}
