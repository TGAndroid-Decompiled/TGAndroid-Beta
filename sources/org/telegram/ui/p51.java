package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;
public final class p51 implements Runnable {
    public final int f40855a;
    public final n71 f40856b;

    public p51(n71 n71Var, int i10) {
        this.f40855a = i10;
        this.f40856b = n71Var;
    }

    @Override
    public final void run() {
        switch (this.f40855a) {
            case 0:
                n71 n71Var = this.f40856b;
                n71Var.getClass();
                HashSet hashSet = zg.d0.f54725a;
                gf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.f10517b == null) {
                    cacheOutQueue.f10517b = new CountDownLatch(1);
                }
                zg.d0.f54726b = true;
                zg.d0.f54728e = false;
                zg.d0.f54730g = false;
                AndroidUtilities.runOnUIThread(new p51(n71Var, 2), 0L);
                return;
            case 1:
                n71 n71Var2 = this.f40856b;
                ArrayList arrayList = n71Var2.A1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = n71Var2.B1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = n71Var2.D1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                n71Var2.f40289q0.E(true);
                return;
            case 2:
                this.f40856b.U1.start();
                return;
            case 3:
                this.f40856b.B(true, true, true);
                return;
            default:
                n71 n71Var3 = this.f40856b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                p51 p51Var = n71Var3.R1;
                globalInstance.removeDelayed(p51Var);
                NotificationCenter.getGlobalInstance().doOnIdle(p51Var);
                return;
        }
    }
}
