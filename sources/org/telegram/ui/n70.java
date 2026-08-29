package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class n70 extends TimerTask {
    public final String f40734a;
    public final o70 f40735b;

    public n70(o70 o70Var, String str) {
        this.f40735b = o70Var;
        this.f40734a = str;
    }

    @Override
    public final void run() {
        o70 o70Var = this.f40735b;
        try {
            o70Var.f40996f.cancel();
            o70Var.f40996f = null;
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        AndroidUtilities.runOnUIThread(new m70(this, this.f40734a, 0));
    }
}
