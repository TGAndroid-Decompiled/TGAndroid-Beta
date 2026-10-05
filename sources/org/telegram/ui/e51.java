package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;
public final class e51 implements Runnable {
    public final int f35957a;
    public final a71 f35958b;

    public e51(a71 a71Var, int i10) {
        this.f35957a = i10;
        this.f35958b = a71Var;
    }

    @Override
    public final void run() {
        switch (this.f35957a) {
            case 0:
                a71 a71Var = this.f35958b;
                a71Var.getClass();
                HashSet hashSet = zg.c0.f53347a;
                ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.f9848b == null) {
                    cacheOutQueue.f9848b = new CountDownLatch(1);
                }
                zg.c0.f53348b = true;
                zg.c0.f53350e = false;
                zg.c0.f53352g = false;
                AndroidUtilities.runOnUIThread(new e51(a71Var, 2), 0L);
                return;
            case 1:
                a71 a71Var2 = this.f35958b;
                ArrayList arrayList = a71Var2.A1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = a71Var2.B1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = a71Var2.D1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                a71Var2.f34756q0.E(true);
                return;
            case 2:
                this.f35958b.U1.start();
                return;
            case 3:
                this.f35958b.B(true, true, true);
                return;
            default:
                a71 a71Var3 = this.f35958b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                e51 e51Var = a71Var3.R1;
                globalInstance.removeDelayed(e51Var);
                NotificationCenter.getGlobalInstance().doOnIdle(e51Var);
                return;
        }
    }
}
