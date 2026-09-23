package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class qi0 implements Runnable {
    public final int f36455a;
    public final ri0 f36456b;

    public qi0(ri0 ri0Var, int i10) {
        this.f36455a = i10;
        this.f36456b = ri0Var;
    }

    @Override
    public final void run() {
        switch (this.f36455a) {
            case 0:
                this.f36456b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f36456b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
