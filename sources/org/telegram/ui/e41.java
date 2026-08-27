package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;

public final class e41 implements Runnable {

    public final int f37622a;

    public final a61 f37623b;

    public e41(a61 a61Var, int i10) {
        this.f37622a = i10;
        this.f37623b = a61Var;
    }

    @Override
    public final void run() {
        switch (this.f37622a) {
            case 0:
                a61 a61Var = this.f37623b;
                a61Var.getClass();
                HashSet hashSet = ig.g0.f11302a;
                ne.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.f18520b == null) {
                    cacheOutQueue.f18520b = new CountDownLatch(1);
                }
                ig.g0.f11303b = true;
                ig.g0.f11305e = false;
                ig.g0.f11307g = false;
                AndroidUtilities.runOnUIThread(new e41(a61Var, 2), 0L);
                break;
            case 1:
                a61 a61Var2 = this.f37623b;
                ArrayList arrayList = a61Var2.f36435w1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = a61Var2.f36438x1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = a61Var2.f36443z1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                a61Var2.m0.E(true);
                break;
            case 2:
                this.f37623b.Q1.start();
                break;
            case 3:
                this.f37623b.B(true, true, true);
                break;
            default:
                a61 a61Var3 = this.f37623b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                e41 e41Var = a61Var3.N1;
                globalInstance.removeDelayed(e41Var);
                NotificationCenter.getGlobalInstance().doOnIdle(e41Var);
                break;
        }
    }
}
