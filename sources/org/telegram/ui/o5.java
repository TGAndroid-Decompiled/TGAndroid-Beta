package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class o5 implements Runnable {
    public final int f42091a;
    public final x5 f42092b;

    public o5(x5 x5Var, int i10) {
        this.f42091a = i10;
        this.f42092b = x5Var;
    }

    @Override
    public final void run() {
        switch (this.f42091a) {
            case 0:
                x5 x5Var = this.f42092b;
                x5Var.f45649g0 = false;
                x5Var.F0(true);
                return;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                x5 x5Var2 = this.f42092b;
                x5Var2.B0(countDownLatch, null);
                x5Var2.C0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                NotificationCenter.getInstance(x5Var2.S).doOnIdle(new o5(x5Var2, 4));
                return;
            case 2:
                x5 x5Var3 = this.f42092b;
                x5Var3.f45649g0 = false;
                x5Var3.F0(true);
                return;
            case 3:
                x5 x5Var4 = this.f42092b;
                x5Var4.f45649g0 = false;
                x5Var4.F0(true);
                return;
            default:
                AndroidUtilities.runOnUIThread(new o5(this.f42092b, 0));
                return;
        }
    }
}
