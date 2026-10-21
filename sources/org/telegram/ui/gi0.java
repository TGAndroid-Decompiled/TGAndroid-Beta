package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class gi0 implements Runnable {
    public final int f37336a;
    public final hi0 f37337b;

    public gi0(hi0 hi0Var, int i10) {
        this.f37336a = i10;
        this.f37337b = hi0Var;
    }

    @Override
    public final void run() {
        switch (this.f37336a) {
            case 0:
                this.f37337b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f37337b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
