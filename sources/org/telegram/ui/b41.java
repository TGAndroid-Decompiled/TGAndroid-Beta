package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;
public final class b41 implements Runnable {
    public final int f35563a;
    public final z51 f35564b;

    public b41(z51 z51Var, int i10) {
        this.f35563a = i10;
        this.f35564b = z51Var;
    }

    @Override
    public final void run() {
        switch (this.f35563a) {
            case 0:
                z51 z51Var = this.f35564b;
                z51Var.getClass();
                HashSet hashSet = ah.x0.f902a;
                hf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.f11786b == null) {
                    cacheOutQueue.f11786b = new CountDownLatch(1);
                }
                ah.x0.f903b = true;
                ah.x0.e = false;
                ah.x0.f906g = false;
                AndroidUtilities.runOnUIThread(new b41(z51Var, 2), 0L);
                return;
            case 1:
                z51 z51Var2 = this.f35564b;
                ArrayList arrayList = z51Var2.A1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = z51Var2.B1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = z51Var2.D1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                z51Var2.f43613q0.E(true);
                return;
            case 2:
                this.f35564b.U1.start();
                return;
            case 3:
                this.f35564b.B(true, true, true);
                return;
            default:
                z51 z51Var3 = this.f35564b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                b41 b41Var = z51Var3.R1;
                globalInstance.removeDelayed(b41Var);
                NotificationCenter.getGlobalInstance().doOnIdle(b41Var);
                return;
        }
    }
}
