package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

public final class lj implements Runnable {

    public final int f40140a;

    public final mj f40141b;

    public lj(mj mjVar, int i10) {
        this.f40140a = i10;
        this.f40141b = mjVar;
    }

    @Override
    public final void run() {
        switch (this.f40140a) {
            case 0:
                mj mjVar = this.f40141b;
                mjVar.W = null;
                rn rnVar = mjVar.X;
                if (rnVar.D9 != -1) {
                    rnVar.getNotificationCenter().onAnimationFinish(rnVar.D9);
                    rnVar.D9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                }
                break;
            default:
                mj mjVar2 = this.f40141b;
                mjVar2.W = null;
                rn rnVar2 = mjVar2.X;
                if (rnVar2.D9 != -1) {
                    rnVar2.getNotificationCenter().onAnimationFinish(rnVar2.D9);
                    rnVar2.D9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                }
                break;
        }
    }
}
