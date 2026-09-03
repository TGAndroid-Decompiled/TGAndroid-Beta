package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class oi0 implements Runnable {
    public final int f36824a;
    public final pi0 f36825b;

    public oi0(pi0 pi0Var, int i10) {
        this.f36824a = i10;
        this.f36825b = pi0Var;
    }

    @Override
    public final void run() {
        switch (this.f36824a) {
            case 0:
                this.f36825b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f36825b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
