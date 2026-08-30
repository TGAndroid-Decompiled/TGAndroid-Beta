package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class mi0 implements Runnable {
    public final int f36323a;
    public final ni0 f36324b;

    public mi0(ni0 ni0Var, int i10) {
        this.f36323a = i10;
        this.f36324b = ni0Var;
    }

    @Override
    public final void run() {
        switch (this.f36323a) {
            case 0:
                this.f36324b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f36324b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
