package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class m5 implements Runnable {
    public final int f35151a;
    public final w5 f35152b;

    public m5(w5 w5Var, int i10) {
        this.f35151a = i10;
        this.f35152b = w5Var;
    }

    @Override
    public final void run() {
        switch (this.f35151a) {
            case 0:
                w5 w5Var = this.f35152b;
                w5Var.f38536e0 = false;
                w5Var.G0(true);
                return;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                w5 w5Var2 = this.f35152b;
                w5Var2.C0(countDownLatch, null);
                w5Var2.D0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                NotificationCenter.getInstance(w5Var2.Q).doOnIdle(new m5(w5Var2, 4));
                return;
            case 2:
                w5 w5Var3 = this.f35152b;
                w5Var3.f38536e0 = false;
                w5Var3.G0(true);
                return;
            case 3:
                w5 w5Var4 = this.f35152b;
                w5Var4.f38536e0 = false;
                w5Var4.G0(true);
                return;
            default:
                AndroidUtilities.runOnUIThread(new m5(this.f35152b, 0));
                return;
        }
    }
}
