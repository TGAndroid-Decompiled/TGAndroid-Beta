package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class bk implements Runnable {
    public final int f36192a;
    public final ck f36193b;

    public bk(ck ckVar, int i10) {
        this.f36192a = i10;
        this.f36193b = ckVar;
    }

    @Override
    public final void run() {
        switch (this.f36192a) {
            case 0:
                ck ckVar = this.f36193b;
                ckVar.W = null;
                eo eoVar = ckVar.X;
                if (eoVar.H9 != -1) {
                    eoVar.getNotificationCenter().onAnimationFinish(eoVar.H9);
                    eoVar.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                ck ckVar2 = this.f36193b;
                ckVar2.W = null;
                eo eoVar2 = ckVar2.X;
                if (eoVar2.H9 != -1) {
                    eoVar2.getNotificationCenter().onAnimationFinish(eoVar2.H9);
                    eoVar2.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
