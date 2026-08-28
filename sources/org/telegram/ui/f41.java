package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;
public final class f41 implements Runnable {
    public final int f38134a;
    public final b61 f38135b;

    public f41(b61 b61Var, int i9) {
        this.f38134a = i9;
        this.f38135b = b61Var;
    }

    @Override
    public final void run() {
        switch (this.f38134a) {
            case 0:
                b61 b61Var = this.f38135b;
                b61Var.getClass();
                HashSet hashSet = hg.h0.f10608a;
                me.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.f17684b == null) {
                    cacheOutQueue.f17684b = new CountDownLatch(1);
                }
                hg.h0.f10609b = true;
                hg.h0.f10611e = false;
                hg.h0.f10613g = false;
                AndroidUtilities.runOnUIThread(new f41(b61Var, 2), 0L);
                return;
            case 1:
                b61 b61Var2 = this.f38135b;
                ArrayList arrayList = b61Var2.f36712w1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = b61Var2.f36715x1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = b61Var2.f36720z1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                b61Var2.m0.E(true);
                return;
            case 2:
                this.f38135b.Q1.start();
                return;
            case 3:
                this.f38135b.B(true, true, true);
                return;
            default:
                b61 b61Var3 = this.f38135b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                f41 f41Var = b61Var3.N1;
                globalInstance.removeDelayed(f41Var);
                NotificationCenter.getGlobalInstance().doOnIdle(f41Var);
                return;
        }
    }
}
