package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class jj implements Runnable {
    public final int f39516a;
    public final kj f39517b;

    public jj(kj kjVar, int i9) {
        this.f39516a = i9;
        this.f39517b = kjVar;
    }

    @Override
    public final void run() {
        switch (this.f39516a) {
            case 0:
                kj kjVar = this.f39517b;
                kjVar.W = null;
                qn qnVar = kjVar.X;
                if (qnVar.D9 != -1) {
                    qnVar.getNotificationCenter().onAnimationFinish(qnVar.D9);
                    qnVar.D9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                kj kjVar2 = this.f39517b;
                kjVar2.W = null;
                qn qnVar2 = kjVar2.X;
                if (qnVar2.D9 != -1) {
                    qnVar2.getNotificationCenter().onAnimationFinish(qnVar2.D9);
                    qnVar2.D9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
