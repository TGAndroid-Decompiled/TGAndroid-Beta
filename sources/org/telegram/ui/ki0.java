package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class ki0 implements Runnable {
    public final int f38954a;
    public final li0 f38955b;

    public ki0(li0 li0Var, int i10) {
        this.f38954a = i10;
        this.f38955b = li0Var;
    }

    @Override
    public final void run() {
        switch (this.f38954a) {
            case 0:
                this.f38955b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f38955b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
