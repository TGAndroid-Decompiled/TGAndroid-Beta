package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class o5 implements Runnable {
    public final int f40557a;
    public final y5 f40558b;

    public o5(y5 y5Var, int i10) {
        this.f40557a = i10;
        this.f40558b = y5Var;
    }

    @Override
    public final void run() {
        switch (this.f40557a) {
            case 0:
                y5 y5Var = this.f40558b;
                y5Var.f44299e0 = false;
                y5Var.H0(true);
                return;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                y5 y5Var2 = this.f40558b;
                y5Var2.D0(countDownLatch, null);
                y5Var2.E0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                NotificationCenter.getInstance(y5Var2.Q).doOnIdle(new o5(y5Var2, 4));
                return;
            case 2:
                y5 y5Var3 = this.f40558b;
                y5Var3.f44299e0 = false;
                y5Var3.H0(true);
                return;
            case 3:
                y5 y5Var4 = this.f40558b;
                y5Var4.f44299e0 = false;
                y5Var4.H0(true);
                return;
            default:
                AndroidUtilities.runOnUIThread(new o5(this.f40558b, 0));
                return;
        }
    }
}
