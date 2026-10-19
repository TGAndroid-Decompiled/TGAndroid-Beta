package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class gi0 implements Runnable {
    public final int f37329a;
    public final hi0 f37330b;

    public gi0(hi0 hi0Var, int i10) {
        this.f37329a = i10;
        this.f37330b = hi0Var;
    }

    @Override
    public final void run() {
        switch (this.f37329a) {
            case 0:
                this.f37330b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f37330b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
