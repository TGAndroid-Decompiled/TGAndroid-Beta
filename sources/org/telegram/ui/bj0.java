package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class bj0 implements Runnable {
    public final int f34587a;
    public final cj0 f34588b;

    public bj0(cj0 cj0Var, int i10) {
        this.f34587a = i10;
        this.f34588b = cj0Var;
    }

    @Override
    public final void run() {
        switch (this.f34587a) {
            case 0:
                this.f34588b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f34588b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
