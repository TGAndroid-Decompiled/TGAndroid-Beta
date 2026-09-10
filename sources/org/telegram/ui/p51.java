package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;
public final class p51 implements Runnable {
    public final int f35684a;
    public final l71 f35685b;

    public p51(l71 l71Var, int i10) {
        this.f35684a = i10;
        this.f35685b = l71Var;
    }

    @Override
    public final void run() {
        switch (this.f35684a) {
            case 0:
                l71 l71Var = this.f35685b;
                l71Var.getClass();
                HashSet hashSet = yg.f0.f46995a;
                ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.f7947b == null) {
                    cacheOutQueue.f7947b = new CountDownLatch(1);
                }
                yg.f0.f46996b = true;
                yg.f0.e = false;
                yg.f0.f46999g = false;
                AndroidUtilities.runOnUIThread(new p51(l71Var, 2), 0L);
                return;
            case 1:
                l71 l71Var2 = this.f35685b;
                ArrayList arrayList = l71Var2.A1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = l71Var2.B1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = l71Var2.D1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                l71Var2.f34587q0.E(true);
                return;
            case 2:
                this.f35685b.U1.start();
                return;
            case 3:
                this.f35685b.B(true, true, true);
                return;
            default:
                l71 l71Var3 = this.f35685b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                p51 p51Var = l71Var3.R1;
                globalInstance.removeDelayed(p51Var);
                NotificationCenter.getGlobalInstance().doOnIdle(p51Var);
                return;
        }
    }
}
