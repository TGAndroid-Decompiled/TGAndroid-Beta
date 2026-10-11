package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;
public final class l51 implements Runnable {
    public final int f39515a;
    public final j71 f39516b;

    public l51(j71 j71Var, int i10) {
        this.f39515a = i10;
        this.f39516b = j71Var;
    }

    @Override
    public final void run() {
        switch (this.f39515a) {
            case 0:
                j71 j71Var = this.f39516b;
                j71Var.getClass();
                HashSet hashSet = zg.d0.f54588a;
                gf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.f10518b == null) {
                    cacheOutQueue.f10518b = new CountDownLatch(1);
                }
                zg.d0.f54589b = true;
                zg.d0.f54591e = false;
                zg.d0.f54593g = false;
                AndroidUtilities.runOnUIThread(new l51(j71Var, 2), 0L);
                return;
            case 1:
                j71 j71Var2 = this.f39516b;
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
                j71Var2.f38911q0.E(true);
                return;
            case 2:
                this.f39516b.U1.start();
                return;
            case 3:
                this.f39516b.B(true, true, true);
                return;
            default:
                j71 j71Var3 = this.f39516b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                l51 l51Var = j71Var3.R1;
                globalInstance.removeDelayed(l51Var);
                NotificationCenter.getGlobalInstance().doOnIdle(l51Var);
                return;
        }
    }
}
