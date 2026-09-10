package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class l5 implements Runnable {
    public final int f34538a;
    public final w5 f34539b;

    public l5(w5 w5Var, int i10) {
        this.f34538a = i10;
        this.f34539b = w5Var;
    }

    @Override
    public final void run() {
        switch (this.f34538a) {
            case 0:
                w5 w5Var = this.f34539b;
                w5Var.f37707e0 = false;
                w5Var.G0(true);
                return;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                w5 w5Var2 = this.f34539b;
                w5Var2.C0(countDownLatch, null);
                w5Var2.D0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                NotificationCenter.getInstance(w5Var2.Q).doOnIdle(new l5(w5Var2, 4));
                return;
            case 2:
                w5 w5Var3 = this.f34539b;
                w5Var3.f37707e0 = false;
                w5Var3.G0(true);
                return;
            case 3:
                w5 w5Var4 = this.f34539b;
                w5Var4.f37707e0 = false;
                w5Var4.G0(true);
                return;
            default:
                AndroidUtilities.runOnUIThread(new l5(this.f34539b, 0));
                return;
        }
    }
}
