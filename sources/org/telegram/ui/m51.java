package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;
public final class m51 implements Runnable {
    public final int f39770a;
    public final k71 f39771b;

    public m51(k71 k71Var, int i10) {
        this.f39770a = i10;
        this.f39771b = k71Var;
    }

    @Override
    public final void run() {
        switch (this.f39770a) {
            case 0:
                k71 k71Var = this.f39771b;
                k71Var.getClass();
                HashSet hashSet = zg.d0.f54501a;
                gf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.f10519b == null) {
                    cacheOutQueue.f10519b = new CountDownLatch(1);
                }
                zg.d0.f54502b = true;
                zg.d0.f54504e = false;
                zg.d0.f54506g = false;
                AndroidUtilities.runOnUIThread(new m51(k71Var, 2), 0L);
                return;
            case 1:
                k71 k71Var2 = this.f39771b;
                ArrayList arrayList = k71Var2.A1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = k71Var2.B1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = k71Var2.D1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                k71Var2.f39149q0.E(true);
                return;
            case 2:
                this.f39771b.U1.start();
                return;
            case 3:
                this.f39771b.B(true, true, true);
                return;
            default:
                k71 k71Var3 = this.f39771b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                m51 m51Var = k71Var3.R1;
                globalInstance.removeDelayed(m51Var);
                NotificationCenter.getGlobalInstance().doOnIdle(m51Var);
                return;
        }
    }
}
