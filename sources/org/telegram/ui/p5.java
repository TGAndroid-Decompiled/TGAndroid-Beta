package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class p5 implements Runnable {
    public final int f40346a;
    public final y5 f40347b;

    public p5(y5 y5Var, int i10) {
        this.f40346a = i10;
        this.f40347b = y5Var;
    }

    @Override
    public final void run() {
        switch (this.f40346a) {
            case 0:
                y5 y5Var = this.f40347b;
                y5Var.f43720g0 = false;
                y5Var.H0(true);
                return;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                y5 y5Var2 = this.f40347b;
                y5Var2.D0(countDownLatch, null);
                y5Var2.E0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                NotificationCenter.getInstance(y5Var2.S).doOnIdle(new p5(y5Var2, 4));
                return;
            case 2:
                y5 y5Var3 = this.f40347b;
                y5Var3.f43720g0 = false;
                y5Var3.H0(true);
                return;
            case 3:
                y5 y5Var4 = this.f40347b;
                y5Var4.f43720g0 = false;
                y5Var4.H0(true);
                return;
            default:
                AndroidUtilities.runOnUIThread(new p5(this.f40347b, 0));
                return;
        }
    }
}
