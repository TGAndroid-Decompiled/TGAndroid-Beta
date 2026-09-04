package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;
public final class m51 implements Runnable {
    public final int f38575a;
    public final j71 f38576b;

    public m51(j71 j71Var, int i10) {
        this.f38575a = i10;
        this.f38576b = j71Var;
    }

    @Override
    public final void run() {
        switch (this.f38575a) {
            case 0:
                j71 j71Var = this.f38576b;
                j71Var.getClass();
                HashSet hashSet = ah.y0.f719a;
                ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.f9471b == null) {
                    cacheOutQueue.f9471b = new CountDownLatch(1);
                }
                ah.y0.f720b = true;
                ah.y0.f722e = false;
                ah.y0.f724g = false;
                AndroidUtilities.runOnUIThread(new m51(j71Var, 2), 0L);
                return;
            case 1:
                j71 j71Var2 = this.f38576b;
                ArrayList arrayList = j71Var2.A1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = j71Var2.B1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = j71Var2.D1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                j71Var2.f37663q0.E(true);
                return;
            case 2:
                this.f38576b.U1.start();
                return;
            case 3:
                this.f38576b.B(true, true, true);
                return;
            default:
                j71 j71Var3 = this.f38576b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                m51 m51Var = j71Var3.R1;
                globalInstance.removeDelayed(m51Var);
                NotificationCenter.getGlobalInstance().doOnIdle(m51Var);
                return;
        }
    }
}
