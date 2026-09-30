package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;
public final class d51 implements Runnable {
    public final int f33006a;
    public final a71 f33007b;

    public d51(a71 a71Var, int i10) {
        this.f33006a = i10;
        this.f33007b = a71Var;
    }

    @Override
    public final void run() {
        switch (this.f33006a) {
            case 0:
                a71 a71Var = this.f33007b;
                a71Var.getClass();
                HashSet hashSet = zg.e0.f49398a;
                ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.f9059b == null) {
                    cacheOutQueue.f9059b = new CountDownLatch(1);
                }
                zg.e0.f49399b = true;
                zg.e0.e = false;
                zg.e0.f49402g = false;
                AndroidUtilities.runOnUIThread(new d51(a71Var, 2), 0L);
                return;
            case 1:
                a71 a71Var2 = this.f33007b;
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
                a71Var2.f32118q0.E(true);
                return;
            case 2:
                this.f33007b.U1.start();
                return;
            case 3:
                this.f33007b.B(true, true, true);
                return;
            default:
                a71 a71Var3 = this.f33007b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                d51 d51Var = a71Var3.R1;
                globalInstance.removeDelayed(d51Var);
                NotificationCenter.getGlobalInstance().doOnIdle(d51Var);
                return;
        }
    }
}
