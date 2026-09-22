package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;
public final class n51 implements Runnable {
    public final int f35913a;
    public final j71 f35914b;

    public n51(j71 j71Var, int i10) {
        this.f35913a = i10;
        this.f35914b = j71Var;
    }

    @Override
    public final void run() {
        switch (this.f35913a) {
            case 0:
                j71 j71Var = this.f35914b;
                j71Var.getClass();
                HashSet hashSet = zg.f0.f49342a;
                ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.f9065b == null) {
                    cacheOutQueue.f9065b = new CountDownLatch(1);
                }
                zg.f0.f49343b = true;
                zg.f0.e = false;
                zg.f0.f49346g = false;
                AndroidUtilities.runOnUIThread(new n51(j71Var, 2), 0L);
                return;
            case 1:
                j71 j71Var2 = this.f35914b;
                ArrayList arrayList = j71Var2.A1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = j71Var2.B1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = j71Var2.D1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                j71Var2.f34834q0.E(true);
                return;
            case 2:
                this.f35914b.U1.start();
                return;
            case 3:
                this.f35914b.B(true, true, true);
                return;
            default:
                j71 j71Var3 = this.f35914b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                n51 n51Var = j71Var3.R1;
                globalInstance.removeDelayed(n51Var);
                NotificationCenter.getGlobalInstance().doOnIdle(n51Var);
                return;
        }
    }
}
