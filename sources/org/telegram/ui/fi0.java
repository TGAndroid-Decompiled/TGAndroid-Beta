package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class fi0 implements Runnable {
    public final int f38296a;
    public final gi0 f38297b;

    public fi0(gi0 gi0Var, int i9) {
        this.f38296a = i9;
        this.f38297b = gi0Var;
    }

    @Override
    public final void run() {
        switch (this.f38296a) {
            case 0:
                this.f38297b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f38297b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
