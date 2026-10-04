package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class m5 implements Runnable {
    public final int f38417a;
    public final w5 f38418b;

    public m5(w5 w5Var, int i10) {
        this.f38417a = i10;
        this.f38418b = w5Var;
    }

    @Override
    public final void run() {
        switch (this.f38417a) {
            case 0:
                w5 w5Var = this.f38418b;
                w5Var.f41914e0 = false;
                w5Var.L0(true);
                return;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                w5 w5Var2 = this.f38418b;
                w5Var2.H0(countDownLatch, null);
                w5Var2.I0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                NotificationCenter.getInstance(w5Var2.Q).doOnIdle(new m5(w5Var2, 4));
                return;
            case 2:
                w5 w5Var3 = this.f38418b;
                w5Var3.f41914e0 = false;
                w5Var3.L0(true);
                return;
            case 3:
                w5 w5Var4 = this.f38418b;
                w5Var4.f41914e0 = false;
                w5Var4.L0(true);
                return;
            default:
                AndroidUtilities.runOnUIThread(new m5(this.f38418b, 0));
                return;
        }
    }
}
