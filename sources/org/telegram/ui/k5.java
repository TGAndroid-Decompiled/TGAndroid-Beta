package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class k5 implements Runnable {
    public final int f39237a;
    public final u5 f39238b;

    public k5(u5 u5Var, int i10) {
        this.f39237a = i10;
        this.f39238b = u5Var;
    }

    @Override
    public final void run() {
        switch (this.f39237a) {
            case 0:
                u5 u5Var = this.f39238b;
                u5Var.f42391e0 = false;
                u5Var.H0(true);
                return;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                u5 u5Var2 = this.f39238b;
                u5Var2.D0(countDownLatch, null);
                u5Var2.E0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                NotificationCenter.getInstance(u5Var2.Q).doOnIdle(new k5(u5Var2, 4));
                return;
            case 2:
                u5 u5Var3 = this.f39238b;
                u5Var3.f42391e0 = false;
                u5Var3.H0(true);
                return;
            case 3:
                u5 u5Var4 = this.f39238b;
                u5Var4.f42391e0 = false;
                u5Var4.H0(true);
                return;
            default:
                AndroidUtilities.runOnUIThread(new k5(this.f39238b, 0));
                return;
        }
    }
}
