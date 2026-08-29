package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class mj implements Runnable {
    public final int f40578a;
    public final nj f40579b;

    public mj(nj njVar, int i10) {
        this.f40578a = i10;
        this.f40579b = njVar;
    }

    @Override
    public final void run() {
        switch (this.f40578a) {
            case 0:
                nj njVar = this.f40579b;
                njVar.W = null;
                tn tnVar = njVar.X;
                if (tnVar.D9 != -1) {
                    tnVar.getNotificationCenter().onAnimationFinish(tnVar.D9);
                    tnVar.D9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                nj njVar2 = this.f40579b;
                njVar2.W = null;
                tn tnVar2 = njVar2.X;
                if (tnVar2.D9 != -1) {
                    tnVar2.getNotificationCenter().onAnimationFinish(tnVar2.D9);
                    tnVar2.D9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
