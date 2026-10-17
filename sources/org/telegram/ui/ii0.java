package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class ii0 implements Runnable {
    public final int f37901a;
    public final ji0 f37902b;

    public ii0(ji0 ji0Var, int i10) {
        this.f37901a = i10;
        this.f37902b = ji0Var;
    }

    @Override
    public final void run() {
        switch (this.f37901a) {
            case 0:
                this.f37902b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f37902b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
