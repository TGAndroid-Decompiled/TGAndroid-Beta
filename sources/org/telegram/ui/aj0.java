package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class aj0 implements Runnable {
    public final int f33954a;
    public final bj0 f33955b;

    public aj0(bj0 bj0Var, int i10) {
        this.f33954a = i10;
        this.f33955b = bj0Var;
    }

    @Override
    public final void run() {
        switch (this.f33954a) {
            case 0:
                this.f33955b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f33955b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
