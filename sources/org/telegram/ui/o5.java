package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class o5 implements Runnable {
    public final int f41971a;
    public final x5 f41972b;

    public o5(x5 x5Var, int i10) {
        this.f41971a = i10;
        this.f41972b = x5Var;
    }

    @Override
    public final void run() {
        switch (this.f41971a) {
            case 0:
                x5 x5Var = this.f41972b;
                x5Var.f45482g0 = false;
                x5Var.F0(true);
                return;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                x5 x5Var2 = this.f41972b;
                x5Var2.B0(countDownLatch, null);
                x5Var2.C0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                NotificationCenter.getInstance(x5Var2.S).doOnIdle(new o5(x5Var2, 4));
                return;
            case 2:
                x5 x5Var3 = this.f41972b;
                x5Var3.f45482g0 = false;
                x5Var3.F0(true);
                return;
            case 3:
                x5 x5Var4 = this.f41972b;
                x5Var4.f45482g0 = false;
                x5Var4.F0(true);
                return;
            default:
                AndroidUtilities.runOnUIThread(new o5(this.f41972b, 0));
                return;
        }
    }
}
