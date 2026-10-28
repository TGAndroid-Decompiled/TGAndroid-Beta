package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;
public final class h41 implements Runnable {
    public final int f39773a;
    public final f61 f39774b;

    public h41(f61 f61Var, int i10) {
        this.f39773a = i10;
        this.f39774b = f61Var;
    }

    @Override
    public final void run() {
        switch (this.f39773a) {
            case 0:
                f61 f61Var = this.f39774b;
                f61Var.getClass();
                HashSet hashSet = bh.m0.f4081a;
                jf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.f15616b == null) {
                    cacheOutQueue.f15616b = new CountDownLatch(1);
                }
                bh.m0.f4082b = true;
                bh.m0.e = false;
                bh.m0.f4085g = false;
                AndroidUtilities.runOnUIThread(new h41(f61Var, 2), 0L);
                return;
            case 1:
                f61 f61Var2 = this.f39774b;
                ArrayList arrayList = f61Var2.B1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = f61Var2.C1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = f61Var2.E1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                f61Var2.f39219q0.E(true);
                return;
            case 2:
                this.f39774b.V1.start();
                return;
            case 3:
                this.f39774b.B(true, true, true);
                return;
            default:
                f61 f61Var3 = this.f39774b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                h41 h41Var = f61Var3.S1;
                globalInstance.removeDelayed(h41Var);
                NotificationCenter.getGlobalInstance().doOnIdle(h41Var);
                return;
        }
    }
}
