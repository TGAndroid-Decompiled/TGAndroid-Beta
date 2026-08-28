package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class l5 implements Runnable {
    public final int f40040a;
    public final u5 f40041b;

    public l5(u5 u5Var, int i9) {
        this.f40040a = i9;
        this.f40041b = u5Var;
    }

    @Override
    public final void run() {
        switch (this.f40040a) {
            case 0:
                u5 u5Var = this.f40041b;
                u5Var.f43128a0 = false;
                u5Var.F0(true);
                return;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                u5 u5Var2 = this.f40041b;
                u5Var2.B0(countDownLatch, null);
                u5Var2.C0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                NotificationCenter.getInstance(u5Var2.M).doOnIdle(new l5(u5Var2, 4));
                return;
            case 2:
                u5 u5Var3 = this.f40041b;
                u5Var3.f43128a0 = false;
                u5Var3.F0(true);
                return;
            case 3:
                u5 u5Var4 = this.f40041b;
                u5Var4.f43128a0 = false;
                u5Var4.F0(true);
                return;
            default:
                AndroidUtilities.runOnUIThread(new l5(this.f40041b, 0));
                return;
        }
    }
}
