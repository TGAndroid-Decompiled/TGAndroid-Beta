package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;
public final class d41 implements Runnable {
    public final int f36498a;
    public final b61 f36499b;

    public d41(b61 b61Var, int i10) {
        this.f36498a = i10;
        this.f36499b = b61Var;
    }

    @Override
    public final void run() {
        switch (this.f36498a) {
            case 0:
                b61 b61Var = this.f36499b;
                b61Var.getClass();
                HashSet hashSet = ah.x0.f901a;
                hf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.f11812b == null) {
                    cacheOutQueue.f11812b = new CountDownLatch(1);
                }
                ah.x0.f902b = true;
                ah.x0.e = false;
                ah.x0.f905g = false;
                AndroidUtilities.runOnUIThread(new d41(b61Var, 2), 0L);
                return;
            case 1:
                b61 b61Var2 = this.f36499b;
                ArrayList arrayList = b61Var2.B1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = b61Var2.C1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = b61Var2.E1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                b61Var2.f35922q0.E(true);
                return;
            case 2:
                this.f36499b.V1.start();
                return;
            case 3:
                this.f36499b.B(true, true, true);
                return;
            default:
                b61 b61Var3 = this.f36499b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                d41 d41Var = b61Var3.S1;
                globalInstance.removeDelayed(d41Var);
                NotificationCenter.getGlobalInstance().doOnIdle(d41Var);
                return;
        }
    }
}
