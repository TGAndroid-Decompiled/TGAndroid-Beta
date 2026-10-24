package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class ji0 implements Runnable {
    public final int f38570a;
    public final ki0 f38571b;

    public ji0(ki0 ki0Var, int i10) {
        this.f38570a = i10;
        this.f38571b = ki0Var;
    }

    @Override
    public final void run() {
        switch (this.f38570a) {
            case 0:
                this.f38571b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f38571b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
