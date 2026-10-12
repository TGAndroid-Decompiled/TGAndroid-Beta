package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class o5 implements Runnable {
    public final int f40560a;
    public final y5 f40561b;

    public o5(y5 y5Var, int i10) {
        this.f40560a = i10;
        this.f40561b = y5Var;
    }

    @Override
    public final void run() {
        switch (this.f40560a) {
            case 0:
                y5 y5Var = this.f40561b;
                y5Var.f44304e0 = false;
                y5Var.H0(true);
                return;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                y5 y5Var2 = this.f40561b;
                y5Var2.D0(countDownLatch, null);
                y5Var2.E0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                NotificationCenter.getInstance(y5Var2.Q).doOnIdle(new o5(y5Var2, 4));
                return;
            case 2:
                y5 y5Var3 = this.f40561b;
                y5Var3.f44304e0 = false;
                y5Var3.H0(true);
                return;
            case 3:
                y5 y5Var4 = this.f40561b;
                y5Var4.f44304e0 = false;
                y5Var4.H0(true);
                return;
            default:
                AndroidUtilities.runOnUIThread(new o5(this.f40561b, 0));
                return;
        }
    }
}
