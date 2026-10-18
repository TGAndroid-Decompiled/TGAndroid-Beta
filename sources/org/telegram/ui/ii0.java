package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class ii0 implements Runnable {
    public final int f37915a;
    public final ji0 f37916b;

    public ii0(ji0 ji0Var, int i10) {
        this.f37915a = i10;
        this.f37916b = ji0Var;
    }

    @Override
    public final void run() {
        switch (this.f37915a) {
            case 0:
                this.f37916b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f37916b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
