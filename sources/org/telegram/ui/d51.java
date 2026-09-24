package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;
public final class d51 implements Runnable {
    public final int f32912a;
    public final a71 f32913b;

    public d51(a71 a71Var, int i10) {
        this.f32912a = i10;
        this.f32913b = a71Var;
    }

    @Override
    public final void run() {
        switch (this.f32912a) {
            case 0:
                a71 a71Var = this.f32913b;
                a71Var.getClass();
                HashSet hashSet = zg.e0.f49279a;
                ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.f9047b == null) {
                    cacheOutQueue.f9047b = new CountDownLatch(1);
                }
                zg.e0.f49280b = true;
                zg.e0.e = false;
                zg.e0.f49283g = false;
                AndroidUtilities.runOnUIThread(new d51(a71Var, 2), 0L);
                return;
            case 1:
                a71 a71Var2 = this.f32913b;
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
                a71Var2.f32030q0.E(true);
                return;
            case 2:
                this.f32913b.U1.start();
                return;
            case 3:
                this.f32913b.B(true, true, true);
                return;
            default:
                a71 a71Var3 = this.f32913b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                d51 d51Var = a71Var3.R1;
                globalInstance.removeDelayed(d51Var);
                NotificationCenter.getGlobalInstance().doOnIdle(d51Var);
                return;
        }
    }
}
