package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;
public final class l51 implements Runnable {
    public final int f39549a;
    public final j71 f39550b;

    public l51(j71 j71Var, int i10) {
        this.f39549a = i10;
        this.f39550b = j71Var;
    }

    @Override
    public final void run() {
        switch (this.f39549a) {
            case 0:
                j71 j71Var = this.f39550b;
                j71Var.getClass();
                HashSet hashSet = zg.d0.f54622a;
                gf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.f10518b == null) {
                    cacheOutQueue.f10518b = new CountDownLatch(1);
                }
                zg.d0.f54623b = true;
                zg.d0.f54625e = false;
                zg.d0.f54627g = false;
                AndroidUtilities.runOnUIThread(new l51(j71Var, 2), 0L);
                return;
            case 1:
                j71 j71Var2 = this.f39550b;
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
                j71Var2.f38945q0.E(true);
                return;
            case 2:
                this.f39550b.U1.start();
                return;
            case 3:
                this.f39550b.B(true, true, true);
                return;
            default:
                j71 j71Var3 = this.f39550b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                l51 l51Var = j71Var3.R1;
                globalInstance.removeDelayed(l51Var);
                NotificationCenter.getGlobalInstance().doOnIdle(l51Var);
                return;
        }
    }
}
