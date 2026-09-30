package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class pi0 implements Runnable {
    public final int f36555a;
    public final qi0 f36556b;

    public pi0(qi0 qi0Var, int i10) {
        this.f36555a = i10;
        this.f36556b = qi0Var;
    }

    @Override
    public final void run() {
        switch (this.f36555a) {
            case 0:
                this.f36556b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f36556b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
