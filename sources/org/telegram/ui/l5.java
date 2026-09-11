package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class l5 implements Runnable {
    public final int f38188a;
    public final v5 f38189b;

    public l5(v5 v5Var, int i10) {
        this.f38188a = i10;
        this.f38189b = v5Var;
    }

    @Override
    public final void run() {
        switch (this.f38188a) {
            case 0:
                v5 v5Var = this.f38189b;
                v5Var.f41416e0 = false;
                v5Var.G0(true);
                return;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                v5 v5Var2 = this.f38189b;
                v5Var2.C0(countDownLatch, null);
                v5Var2.D0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                NotificationCenter.getInstance(v5Var2.Q).doOnIdle(new l5(v5Var2, 4));
                return;
            case 2:
                v5 v5Var3 = this.f38189b;
                v5Var3.f41416e0 = false;
                v5Var3.G0(true);
                return;
            case 3:
                v5 v5Var4 = this.f38189b;
                v5Var4.f41416e0 = false;
                v5Var4.G0(true);
                return;
            default:
                AndroidUtilities.runOnUIThread(new l5(this.f38189b, 0));
                return;
        }
    }
}
