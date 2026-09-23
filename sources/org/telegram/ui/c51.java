package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;
public final class c51 implements Runnable {
    public final int f32260a;
    public final z61 f32261b;

    public c51(z61 z61Var, int i10) {
        this.f32260a = i10;
        this.f32261b = z61Var;
    }

    @Override
    public final void run() {
        switch (this.f32260a) {
            case 0:
                z61 z61Var = this.f32261b;
                z61Var.getClass();
                HashSet hashSet = zg.f0.f48966a;
                ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.f9048b == null) {
                    cacheOutQueue.f9048b = new CountDownLatch(1);
                }
                zg.f0.f48967b = true;
                zg.f0.e = false;
                zg.f0.f48970g = false;
                AndroidUtilities.runOnUIThread(new c51(z61Var, 2), 0L);
                return;
            case 1:
                z61 z61Var2 = this.f32261b;
                ArrayList arrayList = z61Var2.A1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = z61Var2.B1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = z61Var2.D1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                z61Var2.f40038q0.E(true);
                return;
            case 2:
                this.f32261b.U1.start();
                return;
            case 3:
                this.f32261b.B(true, true, true);
                return;
            default:
                z61 z61Var3 = this.f32261b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                c51 c51Var = z61Var3.R1;
                globalInstance.removeDelayed(c51Var);
                NotificationCenter.getGlobalInstance().doOnIdle(c51Var);
                return;
        }
    }
}
