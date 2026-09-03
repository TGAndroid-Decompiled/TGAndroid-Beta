package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class q5 implements Runnable {
    public final int f37305a;
    public final a6 f37306b;

    public q5(a6 a6Var, int i10) {
        this.f37305a = i10;
        this.f37306b = a6Var;
    }

    @Override
    public final void run() {
        switch (this.f37305a) {
            case 0:
                a6 a6Var = this.f37306b;
                a6Var.f32468b0 = false;
                a6Var.G0(true);
                return;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                a6 a6Var2 = this.f37306b;
                a6Var2.C0(countDownLatch, null);
                a6Var2.D0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                NotificationCenter.getInstance(a6Var2.N).doOnIdle(new q5(a6Var2, 4));
                return;
            case 2:
                a6 a6Var3 = this.f37306b;
                a6Var3.f32468b0 = false;
                a6Var3.G0(true);
                return;
            case 3:
                a6 a6Var4 = this.f37306b;
                a6Var4.f32468b0 = false;
                a6Var4.G0(true);
                return;
            default:
                AndroidUtilities.runOnUIThread(new q5(this.f37306b, 0));
                return;
        }
    }
}
