package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;
public final class k51 implements Runnable {
    public final int f35053a;
    public final h71 f35054b;

    public k51(h71 h71Var, int i10) {
        this.f35053a = i10;
        this.f35054b = h71Var;
    }

    @Override
    public final void run() {
        switch (this.f35053a) {
            case 0:
                h71 h71Var = this.f35054b;
                h71Var.getClass();
                HashSet hashSet = zg.f0.f49015a;
                ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.f9062b == null) {
                    cacheOutQueue.f9062b = new CountDownLatch(1);
                }
                zg.f0.f49016b = true;
                zg.f0.e = false;
                zg.f0.f49019g = false;
                AndroidUtilities.runOnUIThread(new k51(h71Var, 2), 0L);
                return;
            case 1:
                h71 h71Var2 = this.f35054b;
                ArrayList arrayList = h71Var2.A1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = h71Var2.B1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = h71Var2.D1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                h71Var2.f34149q0.E(true);
                return;
            case 2:
                this.f35054b.U1.start();
                return;
            case 3:
                this.f35054b.B(true, true, true);
                return;
            default:
                h71 h71Var3 = this.f35054b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                k51 k51Var = h71Var3.R1;
                globalInstance.removeDelayed(k51Var);
                NotificationCenter.getGlobalInstance().doOnIdle(k51Var);
                return;
        }
    }
}
