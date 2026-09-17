package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;
public final class m51 implements Runnable {
    public final int f35688a;
    public final i71 f35689b;

    public m51(i71 i71Var, int i10) {
        this.f35688a = i10;
        this.f35689b = i71Var;
    }

    @Override
    public final void run() {
        switch (this.f35688a) {
            case 0:
                i71 i71Var = this.f35689b;
                i71Var.getClass();
                HashSet hashSet = zg.f0.f49045a;
                ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.f9065b == null) {
                    cacheOutQueue.f9065b = new CountDownLatch(1);
                }
                zg.f0.f49046b = true;
                zg.f0.e = false;
                zg.f0.f49049g = false;
                AndroidUtilities.runOnUIThread(new m51(i71Var, 2), 0L);
                return;
            case 1:
                i71 i71Var2 = this.f35689b;
                ArrayList arrayList = i71Var2.A1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = i71Var2.B1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = i71Var2.D1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                i71Var2.f34478q0.E(true);
                return;
            case 2:
                this.f35689b.U1.start();
                return;
            case 3:
                this.f35689b.B(true, true, true);
                return;
            default:
                i71 i71Var3 = this.f35689b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                m51 m51Var = i71Var3.R1;
                globalInstance.removeDelayed(m51Var);
                NotificationCenter.getGlobalInstance().doOnIdle(m51Var);
                return;
        }
    }
}
