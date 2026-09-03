package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class o5 implements Runnable {
    public final int f39529a;
    public final y5 f39530b;

    public o5(y5 y5Var, int i10) {
        this.f39529a = i10;
        this.f39530b = y5Var;
    }

    @Override
    public final void run() {
        switch (this.f39529a) {
            case 0:
                y5 y5Var = this.f39530b;
                y5Var.f43541b0 = false;
                y5Var.G0(true);
                return;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                y5 y5Var2 = this.f39530b;
                y5Var2.C0(countDownLatch, null);
                y5Var2.D0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                NotificationCenter.getInstance(y5Var2.N).doOnIdle(new o5(y5Var2, 4));
                return;
            case 2:
                y5 y5Var3 = this.f39530b;
                y5Var3.f43541b0 = false;
                y5Var3.G0(true);
                return;
            case 3:
                y5 y5Var4 = this.f39530b;
                y5Var4.f43541b0 = false;
                y5Var4.G0(true);
                return;
            default:
                AndroidUtilities.runOnUIThread(new o5(this.f39530b, 0));
                return;
        }
    }
}
