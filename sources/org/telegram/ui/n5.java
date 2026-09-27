package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class n5 implements Runnable {
    public final int f35813a;
    public final x5 f35814b;

    public n5(x5 x5Var, int i10) {
        this.f35813a = i10;
        this.f35814b = x5Var;
    }

    @Override
    public final void run() {
        switch (this.f35813a) {
            case 0:
                x5 x5Var = this.f35814b;
                x5Var.f39529e0 = false;
                x5Var.G0(true);
                return;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                x5 x5Var2 = this.f35814b;
                x5Var2.C0(countDownLatch, null);
                x5Var2.D0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                NotificationCenter.getInstance(x5Var2.Q).doOnIdle(new n5(x5Var2, 4));
                return;
            case 2:
                x5 x5Var3 = this.f35814b;
                x5Var3.f39529e0 = false;
                x5Var3.G0(true);
                return;
            case 3:
                x5 x5Var4 = this.f35814b;
                x5Var4.f39529e0 = false;
                x5Var4.G0(true);
                return;
            default:
                AndroidUtilities.runOnUIThread(new n5(this.f35814b, 0));
                return;
        }
    }
}
