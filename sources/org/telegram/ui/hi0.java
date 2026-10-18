package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class hi0 implements Runnable {
    public final int f37543a;
    public final ii0 f37544b;

    public hi0(ii0 ii0Var, int i10) {
        this.f37543a = i10;
        this.f37544b = ii0Var;
    }

    @Override
    public final void run() {
        switch (this.f37543a) {
            case 0:
                this.f37544b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f37544b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
