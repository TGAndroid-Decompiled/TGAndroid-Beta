package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class pi0 implements Runnable {
    public final int f36553a;
    public final qi0 f36554b;

    public pi0(qi0 qi0Var, int i10) {
        this.f36553a = i10;
        this.f36554b = qi0Var;
    }

    @Override
    public final void run() {
        switch (this.f36553a) {
            case 0:
                this.f36554b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f36554b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
