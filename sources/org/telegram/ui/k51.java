package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;
public final class k51 implements Runnable {
    public final int f34996a;
    public final g71 f34997b;

    public k51(g71 g71Var, int i10) {
        this.f34996a = i10;
        this.f34997b = g71Var;
    }

    @Override
    public final void run() {
        switch (this.f34996a) {
            case 0:
                g71 g71Var = this.f34997b;
                g71Var.getClass();
                HashSet hashSet = zg.e0.f49271a;
                ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.f9064b == null) {
                    cacheOutQueue.f9064b = new CountDownLatch(1);
                }
                zg.e0.f49272b = true;
                zg.e0.e = false;
                zg.e0.f49275g = false;
                AndroidUtilities.runOnUIThread(new k51(g71Var, 2), 0L);
                return;
            case 1:
                g71 g71Var2 = this.f34997b;
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
                g71Var2.f33745q0.E(true);
                return;
            case 2:
                this.f34997b.U1.start();
                return;
            case 3:
                this.f34997b.B(true, true, true);
                return;
            default:
                g71 g71Var3 = this.f34997b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                k51 k51Var = g71Var3.R1;
                globalInstance.removeDelayed(k51Var);
                NotificationCenter.getGlobalInstance().doOnIdle(k51Var);
                return;
        }
    }
}
