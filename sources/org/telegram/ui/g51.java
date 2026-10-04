package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;
public final class g51 implements Runnable {
    public final int f36507a;
    public final c71 f36508b;

    public g51(c71 c71Var, int i10) {
        this.f36507a = i10;
        this.f36508b = c71Var;
    }

    @Override
    public final void run() {
        switch (this.f36507a) {
            case 0:
                c71 c71Var = this.f36508b;
                c71Var.getClass();
                HashSet hashSet = zg.e0.f53371a;
                ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.f9848b == null) {
                    cacheOutQueue.f9848b = new CountDownLatch(1);
                }
                zg.e0.f53372b = true;
                zg.e0.f53374e = false;
                zg.e0.f53376g = false;
                AndroidUtilities.runOnUIThread(new g51(c71Var, 2), 0L);
                return;
            case 1:
                c71 c71Var2 = this.f36508b;
                ArrayList arrayList = c71Var2.A1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = c71Var2.B1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = c71Var2.D1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                c71Var2.f35337q0.E(true);
                return;
            case 2:
                this.f36508b.U1.start();
                return;
            case 3:
                this.f36508b.B(true, true, true);
                return;
            default:
                c71 c71Var3 = this.f36508b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                g51 g51Var = c71Var3.R1;
                globalInstance.removeDelayed(g51Var);
                NotificationCenter.getGlobalInstance().doOnIdle(g51Var);
                return;
        }
    }
}
