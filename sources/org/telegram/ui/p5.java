package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class p5 implements Runnable {
    public final int f39120a;
    public final z5 f39121b;

    public p5(z5 z5Var, int i10) {
        this.f39120a = i10;
        this.f39121b = z5Var;
    }

    @Override
    public final void run() {
        switch (this.f39120a) {
            case 0:
                z5 z5Var = this.f39121b;
                z5Var.f42483e0 = false;
                z5Var.H0(true);
                return;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                z5 z5Var2 = this.f39121b;
                z5Var2.D0(countDownLatch, null);
                z5Var2.E0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                NotificationCenter.getInstance(z5Var2.Q).doOnIdle(new p5(z5Var2, 4));
                return;
            case 2:
                z5 z5Var3 = this.f39121b;
                z5Var3.f42483e0 = false;
                z5Var3.H0(true);
                return;
            case 3:
                z5 z5Var4 = this.f39121b;
                z5Var4.f42483e0 = false;
                z5Var4.H0(true);
                return;
            default:
                AndroidUtilities.runOnUIThread(new p5(this.f39121b, 0));
                return;
        }
    }
}
