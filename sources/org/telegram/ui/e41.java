package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;
public final class e41 implements Runnable {
    public final int f38988a;
    public final c61 f38989b;

    public e41(c61 c61Var, int i10) {
        this.f38988a = i10;
        this.f38989b = c61Var;
    }

    @Override
    public final void run() {
        switch (this.f38988a) {
            case 0:
                c61 c61Var = this.f38989b;
                c61Var.getClass();
                HashSet hashSet = bh.m0.f4081a;
                jf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.f15617b == null) {
                    cacheOutQueue.f15617b = new CountDownLatch(1);
                }
                bh.m0.f4082b = true;
                bh.m0.e = false;
                bh.m0.f4085g = false;
                AndroidUtilities.runOnUIThread(new e41(c61Var, 2), 0L);
                return;
            case 1:
                c61 c61Var2 = this.f38989b;
                ArrayList arrayList = c61Var2.B1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = c61Var2.C1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = c61Var2.E1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                c61Var2.f38316q0.E(true);
                return;
            case 2:
                this.f38989b.V1.start();
                return;
            case 3:
                this.f38989b.B(true, true, true);
                return;
            default:
                c61 c61Var3 = this.f38989b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                e41 e41Var = c61Var3.S1;
                globalInstance.removeDelayed(e41Var);
                NotificationCenter.getGlobalInstance().doOnIdle(e41Var);
                return;
        }
    }
}
