package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class gi0 implements Runnable {
    public final int f37340a;
    public final hi0 f37341b;

    public gi0(hi0 hi0Var, int i10) {
        this.f37340a = i10;
        this.f37341b = hi0Var;
    }

    @Override
    public final void run() {
        switch (this.f37340a) {
            case 0:
                this.f37341b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f37341b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
