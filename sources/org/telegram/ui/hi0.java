package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class hi0 implements Runnable {
    public final int f40013a;
    public final ii0 f40014b;

    public hi0(ii0 ii0Var, int i10) {
        this.f40013a = i10;
        this.f40014b = ii0Var;
    }

    @Override
    public final void run() {
        switch (this.f40013a) {
            case 0:
                this.f40014b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f40014b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
