package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class l5 implements Runnable {
    public final int f39480a;
    public final v5 f39481b;

    public l5(v5 v5Var, int i10) {
        this.f39480a = i10;
        this.f39481b = v5Var;
    }

    @Override
    public final void run() {
        switch (this.f39480a) {
            case 0:
                v5 v5Var = this.f39481b;
                v5Var.f42690e0 = false;
                v5Var.H0(true);
                return;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                v5 v5Var2 = this.f39481b;
                v5Var2.D0(countDownLatch, null);
                v5Var2.E0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                NotificationCenter.getInstance(v5Var2.Q).doOnIdle(new l5(v5Var2, 4));
                return;
            case 2:
                v5 v5Var3 = this.f39481b;
                v5Var3.f42690e0 = false;
                v5Var3.H0(true);
                return;
            case 3:
                v5 v5Var4 = this.f39481b;
                v5Var4.f42690e0 = false;
                v5Var4.H0(true);
                return;
            default:
                AndroidUtilities.runOnUIThread(new l5(this.f39481b, 0));
                return;
        }
    }
}
