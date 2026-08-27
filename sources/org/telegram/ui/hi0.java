package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

public final class hi0 implements Runnable {

    public final int f38839a;

    public final ii0 f38840b;

    public hi0(ii0 ii0Var, int i10) {
        this.f38839a = i10;
        this.f38840b = ii0Var;
    }

    @Override
    public final void run() {
        switch (this.f38839a) {
            case 0:
                this.f38840b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                }
                break;
            default:
                this.f38840b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                }
                break;
        }
    }
}
