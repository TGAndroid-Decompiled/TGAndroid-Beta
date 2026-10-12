package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class bk implements Runnable {
    public final int f34590a;
    public final ck f34591b;

    public bk(ck ckVar, int i10) {
        this.f34590a = i10;
        this.f34591b = ckVar;
    }

    @Override
    public final void run() {
        switch (this.f34590a) {
            case 0:
                ck ckVar = this.f34591b;
                ckVar.W = null;
                fo foVar = ckVar.X;
                if (foVar.H9 != -1) {
                    foVar.getNotificationCenter().onAnimationFinish(foVar.H9);
                    foVar.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                ck ckVar2 = this.f34591b;
                ckVar2.W = null;
                fo foVar2 = ckVar2.X;
                if (foVar2.H9 != -1) {
                    foVar2.getNotificationCenter().onAnimationFinish(foVar2.H9);
                    foVar2.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
