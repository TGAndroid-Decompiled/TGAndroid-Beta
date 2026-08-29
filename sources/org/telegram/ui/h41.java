package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;
public final class h41 implements Runnable {
    public final int f38770a;
    public final d61 f38771b;

    public h41(d61 d61Var, int i10) {
        this.f38770a = i10;
        this.f38771b = d61Var;
    }

    @Override
    public final void run() {
        switch (this.f38770a) {
            case 0:
                d61 d61Var = this.f38771b;
                d61Var.getClass();
                HashSet hashSet = kg.g0.f13715a;
                pe.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.f45722b == null) {
                    cacheOutQueue.f45722b = new CountDownLatch(1);
                }
                kg.g0.f13716b = true;
                kg.g0.f13718e = false;
                kg.g0.f13720g = false;
                AndroidUtilities.runOnUIThread(new h41(d61Var, 2), 0L);
                return;
            case 1:
                d61 d61Var2 = this.f38771b;
                ArrayList arrayList = d61Var2.f37369w1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = d61Var2.f37372x1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = d61Var2.f37377z1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                d61Var2.m0.E(true);
                return;
            case 2:
                this.f38771b.Q1.start();
                return;
            case 3:
                this.f38771b.B(true, true, true);
                return;
            default:
                d61 d61Var3 = this.f38771b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                h41 h41Var = d61Var3.N1;
                globalInstance.removeDelayed(h41Var);
                NotificationCenter.getGlobalInstance().doOnIdle(h41Var);
                return;
        }
    }
}
