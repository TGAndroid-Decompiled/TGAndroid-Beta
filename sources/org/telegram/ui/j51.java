package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;
public final class j51 implements Runnable {
    public final int f34813a;
    public final g71 f34814b;

    public j51(g71 g71Var, int i10) {
        this.f34813a = i10;
        this.f34814b = g71Var;
    }

    @Override
    public final void run() {
        switch (this.f34813a) {
            case 0:
                g71 g71Var = this.f34814b;
                g71Var.getClass();
                HashSet hashSet = zg.f0.f49022a;
                ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.f9060b == null) {
                    cacheOutQueue.f9060b = new CountDownLatch(1);
                }
                zg.f0.f49023b = true;
                zg.f0.e = false;
                zg.f0.f49026g = false;
                AndroidUtilities.runOnUIThread(new j51(g71Var, 2), 0L);
                return;
            case 1:
                g71 g71Var2 = this.f34814b;
                ArrayList arrayList = g71Var2.A1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = g71Var2.B1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = g71Var2.D1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                g71Var2.f33813q0.E(true);
                return;
            case 2:
                this.f34814b.U1.start();
                return;
            case 3:
                this.f34814b.B(true, true, true);
                return;
            default:
                g71 g71Var3 = this.f34814b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                j51 j51Var = g71Var3.R1;
                globalInstance.removeDelayed(j51Var);
                NotificationCenter.getGlobalInstance().doOnIdle(j51Var);
                return;
        }
    }
}
