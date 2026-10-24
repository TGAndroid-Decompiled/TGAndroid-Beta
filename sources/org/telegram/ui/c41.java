package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;
public final class c41 implements Runnable {
    public final int f36217a;
    public final a61 f36218b;

    public c41(a61 a61Var, int i10) {
        this.f36217a = i10;
        this.f36218b = a61Var;
    }

    @Override
    public final void run() {
        switch (this.f36217a) {
            case 0:
                a61 a61Var = this.f36218b;
                a61Var.getClass();
                HashSet hashSet = ah.x0.f901a;
                hf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.f11812b == null) {
                    cacheOutQueue.f11812b = new CountDownLatch(1);
                }
                ah.x0.f902b = true;
                ah.x0.e = false;
                ah.x0.f905g = false;
                AndroidUtilities.runOnUIThread(new c41(a61Var, 2), 0L);
                return;
            case 1:
                a61 a61Var2 = this.f36218b;
                ArrayList arrayList = a61Var2.B1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = a61Var2.C1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = a61Var2.E1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                a61Var2.f35639q0.E(true);
                return;
            case 2:
                this.f36218b.V1.start();
                return;
            case 3:
                this.f36218b.B(true, true, true);
                return;
            default:
                a61 a61Var3 = this.f36218b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                c41 c41Var = a61Var3.S1;
                globalInstance.removeDelayed(c41Var);
                NotificationCenter.getGlobalInstance().doOnIdle(c41Var);
                return;
        }
    }
}
